关键字编
abstract assert boolean break
byte case catch char class const
continue	default	do	double	else
enum	extends	final	finally	float
for	goto	if	implements	import
instanceof	int	interface	long	native
new	package	private	protected	public
return	strictfp	short	static	super
switch	synchronized	this	throw	throws
transient	try	void	volatile	while
true	false	null	


抽象类:
//abstract修饰 的类是抽象类；
//抽象类不能实例化
//一个java源文件中可以有多个类，但只能有一个公共类，且这个公共类要和文件同名
//没有方法体的方法是“抽象方法”
//含有抽象方法的类必然是抽象类
// 抽象类不一定含有抽象方法
//一个类继承于一个抽象类，这个类要么变成抽象的，要么“实现抽象父类的抽象方法”

接口:
//接口中的方法必须是抽象方法
//接口不能实例化
//接口中抽象方法默认修饰符是public abstract
//接口中可以有属性；属性的修饰符默认是public static final
////接口可以继承接;且能多继承接口
//类只能单继承类，但多实现接口
//父类引用指向子类对象时，不能调用子类扩展
//final修饰的变量，称为常量。修饰引用类型时是引用不能变；

异常：
//异常：exception--ArithmeticException，
//出现异常时不加以处理的话---程序终止
//处理方式：把可能产生异常的代码放入try语句块中
//产生异常时，会抛出对应的异常对象，
//抛出的此异常对象会被catch中的变量接收到
//catch捕获(处理)异常
//一个try可以有多个catch;
//多个catch顺序要从子到父（否则子在后永不会被执行，也就无意思了），平级可不分顺序
//try-catch不会把一大段代码放入一try中
//finally不管是否产生异常，finally语句块都会被执行（就算遇到return，  正常退出应用程序（System.exit(0)））--一般用作释放资源
//return ;方法无返回值时，结束方法调用的方式
//try可以没有catch;try-finally
//NullPointerException,ArithmeticException,IndexOutOfBoundsException
//注意避免空指针异常：如果是字符串比较，常量放在前面
//当throw一个异常对象时，当前方法throws把异常对象抛给调用处去处理
//RuntimeException，运行时异常不会被强型要求处理

集合：
Collection
List:有序，可重复
	ArrayList：内部实现是对象数组（读写效率高）
	LinkedList：内部实现是链表（插入，删除效率高）
Set:无序，不重复

Map
键值对
Map的key不能重复
通过key取得value

final
修饰类不能被继承，修饰方法不能被重写，修饰变量为常量


数据库MySql：(oracle,sqlserver,sqlite)关系型数据库

drop database db_gw;

create database db_gw;#注释，创建数据库
show databases;#查看数据库
select database();#查看当前所在数据库
use db_gw;#切换数据库
create table  t_user(id int primary key auto_increment,name varchar(50),tel varchar(20));#建表
#主键，自增,类型

desc t_user;#查看表结构
set names gbk;#设置编码
insert into t_user(id,name,tel)values( 1,'张三' ,'112'),( 5,'李四' ,'122');#增加
select * from t_user; #查询,*表示所有列
insert into t_user(name,tel)values( '王五' ,'132');
insert into t_user(name)values( '王小五');
update t_user set name='张四' where id=5;#记得加条件
delete from t_user where id=6;#记得加条件
#delete from t_user where name='王五';
#CRUD增删改查：insert,select,update,delete
select name,tel from t_user;
select * from t_user where id=2;#>,<,>=,<=,!=(<>),=,
select * from t_user where id>2 and tel=122;#and,or,
select * from t_user where name like '_四';_代表一个任意字符
select * from t_user where name like '张_';
select * from t_user where name like '张%';#%表示任意个任意字符
select * from t_user where name like '%张%';#模糊查询
select * from t_user where id in(1,5,9);#集合
select * from t_user where id not in(1,5,9);
select * from t_user where id between 1 and 5;#[1,5]
select * from t_user where tel is null;
select * from t_user where tel is not null;
select count(id), avg(id), sum(id)/count(id) ,max(id),min(id),sum(id) from t_user;
select  concat(avg(id),'<==>',sum(id)/count(id))  from t_user;
select  concat('123','abc','...');
create table  t_group(id int primary key auto_increment,name varchar(50),remark varchar(100));#建表

alter table t_user add column group_id int;#增加列
alter table t_user add constraint fk_ug foreign key t_user(group_id) references t_group(id);


create table  t_tmp(id int primary key auto_increment,name varchar(50),tel varchar(20),gid int,foreign key (gid) references t_group(id));#建表
drop table if exists t_tmp;#非常危险
insert into t_group(name)values('技术部'),('市场部');

update t_user set group_id=1 where id=1 or id=7;
update t_user set group_id=2 where id=5;
#查询各部门人数
select count(*) from t_user where group_id=1;
select count(*) from t_user where group_id=2;
select group_id,count(id) from t_user group by group_id;#group by 分组
select u.name,g.name from t_user as u,t_group g where u.group_id=g.id; #as 取别名；u.group_id=g.id联（连）表条件
select g.name,count(u.id) from t_user u,t_group g where u.group_id=g.id group by group_id;#group by 分组
select g.name,count(u.id) from t_user u,t_group g where u.group_id=g.id group by group_id having count(u.id)>1;#分组条件having
select g.name,count(u.id) from t_user u,t_group g where u.group_id=g.id group by group_id order by count(u.id) desc;#排序 asc默认升序 ,desc 降序

select * from t_user order by id desc;

select * from t_user order by group_id;

select * from t_user order by group_id,name desc;

select * from t_user limit 1,2;#分页
select * from t_user limit 0,1;

select * from t_user limit 2;


select g.name,tmp.c 
from 
t_group g,
(select group_id,count(id) c from t_user group by group_id) tmp
where g.id=tmp.group_id;#查询结果可当表用。


JDBC:
0.导入包
1.注册驱动
2.获取连接对象
3.获取命令对象
4.执行SQL语句
5.处理结果
6.释放资源


反射：看透类，使用之

DAO(Data Access Object)是一个数据访问接口，数据访问：顾名思义就是与数据库打交道

HTML:“超”文本“标记”语言
A|href,html,head,body,title,hr,br,h(n:1-6)
&lt; &gt; &nbsp;&amp; &#65;&#97;&#48;
img|src,table|tr|td
form


JSP:全名为Java Server Pages，中文名叫java服务器页面，其根本是一个简化的Servlet设计，它是一种动态网页技术标准。
页面传值：表单，url?xx=2


form action指定处理页，method提交方式：get（默认）|post
EL表达式：${ }
---
get&post：
get:参数接在URL后，设置编号无效；不安全；提交数据量比较小
post:参数是在请求体中发送的；安全；提交的数据大小不限
---
重定向&转发:
重定向：地址变，数据丢
转  发：地址不变，数据保持
---
request属性设置
---
JSTL:jsp标签库
1.导入标签库包
2.在JSP中加入标签库指令
---
动作：jsp:forward转发动作
---
指令：page,taglib
---
servlet
---
MVC：Model(javabean)-View(jsp)-Controller(servlet);
---
mybatis:ORM框架，对象--关系映射
1.导包
2.写配置文件--环境（事务：）
3.映射文件：namespace="com.yc.userSys.UserDao"命名空间要求和dao同名
4.使用：SqlSessionFactory，SqlSession--commit|rollback
--
spring
IOC控制反转|DI依赖注入
注入三种方式：属性、构造方法、接口（spring不支持）
自动装配：default-autowire="byType"（类型）
--
springMvc
1.DispatcherServlet前端控制器
配置文件：springMvc-servlet.xml，以前端控制器的名字开头加-servlet.xml
2.InternalResourceViewResolver视图解析器
		<property name="prefix" value="/WEB-INF/jsp/" /><!-- 前缀 -->
		<property name="suffix" value=".jsp" /><!-- 后缀 -->
3.	<mvc:annotation-driven /><!-- 打开注解驱动 -->
	<context:component-scan base-package="com.yc" /><!-- 扫描包 -->
---
ssm:
web.xml
	<!-- 用参数方式配置spring配置文件位置 -->
	<context-param>
		<param-name>contextConfigLocation</param-name>
		<param-value>classpath:spring-mybatis.xml</param-value>
	</context-param>

	<!-- 监听器 :容器启动时，加载 spring（IOC） -->
	<listener>
		<listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
	</listener>
spring-mybatis.xml
	<!-- 数据源 -->
	<bean id="dataSource" class="org.apache.commons.dbcp.BasicDataSource">
		<property name="driverClassName" value="com.mysql.jdbc.Driver" />
		<property name="url" value="jdbc:mysql://localhost:3306/db_gw" />
		<property name="username" value="root" />
		<property name="password" value="root" />
	</bean>
	<!-- session工厂 -->
	<bean id="sessionFactory" class="org.mybatis.spring.SqlSessionFactoryBean">
		<property name="dataSource" ref="dataSource" />
		<property name="mapperLocations" value="classpath*:com/yc/userSys/dao/*.xml" />
	</bean>
	<!-- 动态生成DAO实现“类” -->
	<bean class="org.mybatis.spring.mapper.MapperScannerConfigurer">
		<property name="basePackage" value="com.yc.userSys.dao" />
		<property name="sqlSessionFactoryBeanName" value="sessionFactory" />
	</bean>
------------------
ContextLoaderListener:context-param<->contextConfigLocation(classpath:spring-mybatis.xml)
BasicDataSource:driverClassName
SqlSessionFactoryBean:mapperLocations(classpath*:com/yc/userSys/dao/*.xml)
MapperScannerConfigurer:basePackage(com.yc.userSys.dao);sqlSessionFactoryBeanName
------------------

JSON(JavaScript Object Notation, JS 对象简谱) 是一种轻量级的数据交换格式。它基于 ECMAScript (欧洲计算机协会制定的js规范)的一个子集，采用完全独立于编程语言的文本格式来存储和表示数据。简洁和清晰的层次结构使得 JSON 成为理想的数据交换语言。 易于人阅读和编写，同时也易于机器解析和生成，并有效地提升网络传输效率。

--
冒泡排序
--
递归
--
单例---是最简单的设计模式
--
比较器
--
IO:
InputStream|OutputStream 
BufferedInputStream|BufferedOutputStream
DataInputStream|DataOutputStream
ObjectOutputStream|ObjectInputStream 序列化：保存对象到文件；反序列化
Serializable标识接口
transient瞬时--不参与序列化
Reader|Writer字符流
InputStreamReader字节流转字符流
FilenameFilter通过文件名过滤文件
--
thread:并发；时间片轮换
Runnable
synchronized
死锁
生产者消费者模型

---
javascript(JS)
JavaScript是"介于Java与HTML之间、"基于对象""事件驱动"的编程语言;可以在浏览器中直接运行
---
AJAX
XMLHttpRequest:open(),send(),readyState,onreadystatechange,responseText


---
正则表达式
^[1-9]\d{0,9}$
\d<==>[0-9]


\,^,$,*{0,},+{1,},?{0,1},{n,m} ,x|y,[xyz],[^xyz],[a-z],[^a-z],\d [0-9],\D[^0-9],\w[A-Za-z0-9_],\W 
email:"^\\w+((-\\w+)|(\\.\\w+))*\\@[A-Za-z0-9]+((\\.|-)[A-Za-z0-9]+)*\\.[A-Za-z0-9]+$" 邮件

gu-wei@1.com
gu.wei@w1.cc
gu@As.org
gu.wei-xx@ss
---
 spirng : default-autowire="byName|byType"  根据名字|类型自动装配
---
jsp组成(%,!,@,--,=)
scope
el表达式取Scope范围值时：先找page范围，如果找到就显示，如果找不到会再找request范围
page<request<session<application
---
jq:
jQuery是一个快速、简洁的JavaScript框架，是一个优秀的JavaScript代码库（或JavaScript框架）。
jQuery设计的宗旨是“write Less，Do More”，即倡导写更少的代码，做更多的事情。
它封装JavaScript常用的功能代码，提供一种简便的JavaScript设计模式，优化HTML文档操作、事件处理、动画设计和Ajax交互。
---
过滤器
---
监听器
---
css:层叠样式表:定义如何显示HTML元素
语法：selector {property: value}-->h1 {color:red; font-size:14px;}

---


---
target:
_blank -- 在新窗口中打开链接
_parent -- 在父窗体中打开链接
_self -- 在当前窗体打开链接,此为默认值
_top -- 在当前窗体打开链接，并替换当前的整个窗体(框架页)
名称指定在框架页的位置显示
---
frameset(rows,cols),frame(src,name)
---
upload
enctype="multipart/form-data"

DiskFileItemFactory
ServletFileUpload---isMultipartContent,parseRequest
FileItem---isFormField,write
--
oa
---
验证码
---
防止重复提交
---
enum


































