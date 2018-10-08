package com.netlink.Collections;
public class ArrayList
{

	public static void main(String[] args)
	{
		java.util.ArrayList list=new java.util.ArrayList();
		
		//Adding Elements in ArrayList
		String s="Sahu";
		list.add("Shivam");
		list.add(s);
		list.add(new Integer(10));
		
		System.out.println("Displaying elements using Getter Method");
		
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
		
		System.out.println("Displaying Elements Using toString()");		
		System.out.println(list);	
		
		System.out.println("Enter element to be searvhed for");
		
		java.util.Scanner kb=new java.util.Scanner(System.in);
		try
		{
			String p=kb.next();
		if(list.contains(p))
			System.out.println("Element present at:"+list.indexOf(p));
		else
			System.out.println("Element not present");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println("Do you wish to remove any entry (y/n)?");
		if(kb.next().equals("y"))
			System.out.println("Enter name of Element:");
		kb.next();
		
	}
}
