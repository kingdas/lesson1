package com.yc.framework;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class Test {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		List<String> ms = new ArrayList<String>();
		ms.add("Employee");
		ms.add("Loan");
		Writer w = null;
		File fp = new File("d:/com/yc/oa/dao/");
		if (!fp.exists()) {
			fp.mkdirs();
		}
		for (String m : ms) {
			String s = "package com.yc.oa.dao;\r\n";
			s += "import com.yc.framework.BaseDao;\r\n";
			s += "import com.yc.oa.model." + m + ";\r\n";
			s += "public interface " + m + "Dao extends BaseDao<" + m
					+ "> {\r\n";
			s += "}\r\n";
			File f = new File(fp, m + "Dao.java");
			w = new FileWriter(f);
			w.write(s);
			w.flush();
		}
		w.close();

	}

}
