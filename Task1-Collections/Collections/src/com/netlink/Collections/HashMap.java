package com.netlink.Collections;
public class HashMap {

	public static void main(String[] args) {
		java.util.HashMap<Integer,Integer> hs=new java.util.HashMap<Integer,Integer>();
		hs.put(101,90);
		hs.put(102,70);
		hs.put(103,65);
		hs.put(104,50);
		for(int i=101;i<105;i++)
		System.out.println(hs.get(i));
	}

}
