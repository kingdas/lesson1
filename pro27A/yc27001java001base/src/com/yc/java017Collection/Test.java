package com.yc.java017Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		// Collection c = new ArrayList();
		// c.add(1);
		// c.add('c');
		// c.add(2.5);
		// c.add(true);
		// c.add("ab");
		//
		// System.out.println("size=" + c.size());
		// for (Iterator it = c.iterator(); it.hasNext();) {
		// System.out.println(it.next());
		// }
		// System.out.println("-----------------");
		// c.remove('c');
		// for (Iterator it = c.iterator(); it.hasNext();) {
		// System.out.println(it.next());
		// }
		// System.out.println("-----------------");
		// c.clear();
		// System.out.println(c.isEmpty());
		// // ////////////////////////////////////
		// List c = new ArrayList();
		// c.add(1);
		// c.add('c');
		// c.add(2.5);
		// c.add(true);
		// c.add("ab");
		//
		// System.out.println("size=" + c.size());
		// for (Iterator it = c.iterator(); it.hasNext();) {
		// System.out.println(it.next());
		// }
		// System.out.println("-----------------");
		// // c.remove('c');
		// c.remove(new Character('c'));
		// for (Iterator it = c.iterator(); it.hasNext();) {
		// System.out.println(it.next());
		// }
		// System.out.println("-----------------");
		// c.clear();
		// System.out.println(c.isEmpty());

		// ////////////////////////////////////
		// Set c = new HashSet();
		// c.add(1);
		// c.add('c');
		// c.add(2.5);
		// c.add(true);
		// c.add("ab");
		//
		// System.out.println("size=" + c.size());
		// for (Iterator it = c.iterator(); it.hasNext();) {
		// System.out.println(it.next());
		// }
		// System.out.println("-----------------");
		// // c.remove('c');
		// c.remove(new Character('c'));
		// for (Iterator it = c.iterator(); it.hasNext();) {
		// System.out.println(it.next());
		// }
		// System.out.println("-----------------");
		// c.clear();
		// System.out.println(c.isEmpty());
		// // ////////////////////////////////////
		//
		// List l = new ArrayList();
		// l.add(11);
		// l.add("ab");
		// l.add(11);
		//
		// System.out.println(l.get(1));
		//
		// System.out.println(l.indexOf(11));
		// System.out.println(l.lastIndexOf(11));
		// // ////////////////////////////////////
		//
		// List l = new ArrayList();
		// l.add(1);
		// l.add(2);
		// l.add(1);
		// l.add(1);
		// l.add(2);
		// System.out.println(l);// ArrayList重写了toString
		// for (int i = 0; i < l.size();) {
		// if (l.indexOf(l.get(i)) != l.lastIndexOf(l.get(i))) {
		// l.remove(l.lastIndexOf(l.get(i)));
		// continue;
		// }
		// i++;
		// }
		// System.out.println(l);

		// ////////////////////////////////////
		// Set s = new HashSet();
		// List l = new ArrayList();
		// l.add(1);
		// l.add(2);
		// l.add(1);
		// l.add(1);
		// l.add(2);
		// System.out.println(l);// ArrayList重写了toString
		// s.addAll(l);// Set中不能有重复元素
		// System.out.println(s);

		// ////////////////////////////////////

		// List c = new ArrayList();
		// c.add(1);
		// c.add('c');
		// int n = (Integer) c.get(0);
		// char ch = (Character) c.get(1);
		// System.out.println(n);
		// System.out.println(ch);
		// ////////////////////////////////////
		// 泛型<Integer>
		// List<Integer> c = new ArrayList<Integer>();
		// c.add(1);
		// int n = c.get(0);
		// System.out.println(n);
		// // /////////////////////////////
		// Map<String, Integer> m = new HashMap<String, Integer>();
		// m.put("zs", 22);
		// m.put("ls", 21);
		// m.put("zs", 33);
		// System.out.println(m.size());
		// int age = m.get("zs");
		// System.out.println(age);
		// Set<String> ks = m.keySet();// 获取map中所有的key,通过key很容易取到value
		// String k;
		// int v;
		// for (Iterator<String> it = ks.iterator(); it.hasNext();) {
		// k = it.next();
		// v = m.get(k);
		// System.out.println(k + ":" + v);
		// }
		// /////////////////////////////
		Map<String, Integer> m = new HashMap<String, Integer>();
		m.put("zs", 22);
		m.put("ls", 21);
		Set<Entry<String, Integer>> es = m.entrySet();
		for (Iterator<Entry<String, Integer>> it = es.iterator(); it.hasNext();) {
			Entry<String, Integer> s = it.next();
			System.out.println(s.getKey() + ":" + s.getValue());
		}
	}
}
