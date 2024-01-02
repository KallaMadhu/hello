package com.hexaware;
public class MathUtil 
{
	public static int add(int a,int b)
	{
		return a*b;
	}
	public static void main(String[] args) throws Exception
	{
		System.out.println("add="+MathUtil.add(2, 2));
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Loaded");
	}
}
