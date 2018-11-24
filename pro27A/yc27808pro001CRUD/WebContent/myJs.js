function openPage(url, title) {
	width = 460;
	height = 300;
	t = (window.screen.height - height) / 2;
	l = (window.screen.width - width) / 2;
	open(url, title, "top=" + t + ",left=" + l + ",width=" + width + ",height="
			+ height);
}
function del(id, name) {
	if (window.confirm("确认要删除：" + name)) {
		location.href = 'UserController?m=del&operator_id=' + id;
	}
}
function checkId(id) {
	if (!/^[1-9]\d{0,9}$/.test(id)) {
		alert("ID是正整数，且不能太长");
	}
}
function nameExists(name) {
	var xhr = new XMLHttpRequest();
	xhr.onreadystatechange = function() {
		if (xhr.readyState == 4 && xhr.status == 200) {
			if (xhr.responseText == 1) {
				document.getElementById("err").innerHTML = "用户名已存";
			} else {
				document.getElementById("err").innerHTML = " ";
			}
		}
	};

	var url = "http://localhost:8088/yc27808pro001CRUD/UserController?m=nameExists&t="
			+ Math.random() + "&name=" + name;
	// alert(url);
	xhr.open("get", url, true);
	xhr.send(null);

}
function checkNameAndPwd() {
	var s = "";
	var name = document.getElementById("name").value;
	var pwd = document.getElementById("password").value;
	if (!(name != null && name.trim().length > 0)) {
		s += "用户名";
	}
	if (!(pwd != null && pwd.trim().length > 0)) {
		s += "密码";
	}
	if (s.length > 0) {
		s += "必填";
		alert(s);
		return false;
	}
	return true;

}
