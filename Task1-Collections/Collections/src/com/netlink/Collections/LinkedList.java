package com.netlink.Collections;

public class LinkedList 
{

	public static void main(String[] args) 
	{
		java.util.LinkedList <String> ls=new java.util.LinkedList<String>();
		ls.add("Hello");
		ls.add("User");
		for(String s:ls)
		System.out.println(s);
		System.out.println(ls.equals(ls));

	}

}
