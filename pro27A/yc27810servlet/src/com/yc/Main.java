package com.yc;

import java.io.File;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File f = new File(
				"C:/Users/Administrator/AppData/Local/Microsoft/Windows/Temporary Internet Files/C2LB7OYM.txt");
		System.out.println(f.exists());
	}

}
