package com.yc;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Date;

public class MyWorrier extends Thread {

	private String urlStr;

	public MyWorrier(String urlStr) {
		super();
		this.urlStr = urlStr;
	}

	@Override
	public void run() {
		try {
			while (true) {
				HttpURLConnection conn = this.getHttpURLConnection();
				InputStream in = conn.getInputStream();
				byte[] buf = new byte[1024];

				String str = "";
				while (in.read(buf) != -1) {
					str = new String(buf);
					System.out.println("ME" + new Date() + str);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private HttpURLConnection getHttpURLConnection() {
		HttpURLConnection conn = null;
		String cookie = "o_cookie=1637043667; RK=Zwyjx8FP2u; ptisp=ctc; ptui_loginuin=123123123; pt2gguin=o033123123; uin=o0123123123; skey=@ziypO5omF; ied_rf=ui.ptlogin2.qq.com/cgi-bin/login; pgv_pvid=1473587356; pgv_info=pgvReferrer=&ssid=s3597135535";
		String referer = "http://qt.qq.com/client_act/detail.shtml?actid=581&r=0.5846301624551415";
		String r = "0.9060123066883534";

		try {
			URL url = new URL(urlStr);
			conn = (HttpURLConnection) url.openConnection();
			conn.setConnectTimeout(5 * 1000);
			conn.setDoOutput(true);
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "*/*");
			conn.setRequestProperty("Accept-Charset", "GBK,utf-8;q=0.7,*;q=0.3");
			conn.setRequestProperty("Accept-Encoding", "gzip,deflate,sdch");
			conn.setRequestProperty("Accept-Language", "zh-CN,zh;q=0.8");
			conn.setRequestProperty("Connection", "keep-alive");
			conn.setRequestProperty("Cookie", cookie);
			conn.setRequestProperty("Host", "ptlogin2.qq.com");
			conn.setRequestProperty("Referer", referer);
			conn.setRequestProperty(
					"User-Agent",
					"Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.31 (KHTML, like Gecko) Chrome/26.0.1410.43 Safari/537.31");
			conn.setRequestProperty("X-Requested-With", "XMLHttpRequest");

			String param = "";
			param += "actid=586&r=" + r;

			PrintWriter out = new PrintWriter(conn.getOutputStream());
			out.write(param);
			out.flush();
			conn.connect();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (ProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return conn;
	}
}