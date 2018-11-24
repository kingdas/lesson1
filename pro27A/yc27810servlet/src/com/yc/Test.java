package com.yc;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import sun.net.www.protocol.http.Handler;

public class Test {

	/**
	 * @param args
	 * @throws MalformedURLException
	 */
	public static void main(String[] args) throws Exception {
		/*
		 * String szUrl = "http://localhost:8060/yc27810servlet/ms1"; URL url =
		 * new URL(szUrl); HttpURLConnection urlCon = (HttpURLConnection)
		 * url.openConnection(); // urlCon.setConnectTimeout(30000); //
		 * urlCon.setReadTimeout(30000);
		 * 
		 * urlCon.setDoInput(true); urlCon.setDoOutput(true);
		 * urlCon.setRequestMethod("POST"); urlCon.setConnectTimeout(5*1000);
		 * urlCon.setRequestProperty("Content-Type", "text/xml;charset=UTF-8");
		 * urlCon.setRequestProperty("SOAPAction",szUrl);
		 * 
		 * 
		 * InputStream is = urlCon.getInputStream(); File f = new
		 * File("d:/ttt.txt"); if (!f.exists()) { f.createNewFile(); }
		 * OutputStream os = new FileOutputStream(f); int t; while ((t =
		 * is.read()) != -1) { os.write(t); } os.close(); is.close();
		 * urlCon.disconnect();
		 */
		String wsUrl = "http://localhost:8060/yc27810servlet/ms1";
		URL wsUrl2 = new URL(null,wsUrl,new Handler());//(wsUrl);
		HttpURLConnection conn = (HttpURLConnection) wsUrl2.openConnection();
		conn.setDoInput(true);
		conn.setDoOutput(true);
		conn.setRequestMethod("GET");
		conn.setConnectTimeout(5 * 1000);
		conn.setRequestProperty("Content-Type", "text/xml;charset=UTF-8");
		conn.setRequestProperty("SOAPAction", wsUrl);

		System.out.println("conn.getInputStream()====" + conn);
		InputStream is = conn.getInputStream();

		File f = new File("d:/ttt.txt");
		if (!f.exists()) {
			f.createNewFile();
		}
		OutputStream os = new FileOutputStream(f);
		int t;
		while ((t = is.read()) != -1) {
			os.write(t);
		}

		is.close();
		os.close();
		conn.disconnect();
	}

}
