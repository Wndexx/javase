package com.wndexx.java1;

/*
	可变个数形参的方法
	
		1. jdk 5.0 新增的内容
		
			- JavaSE 5.0 中提供了Varargs(variable number of arguments)机制，允许直接定义能和多个实参相匹配的形参。从而，可以用一种更简单的方式，来传递个数可变的实参
		
		2. 具体使用
		
			(1) 可变个数形参的格式：数据类型... 变量名
			
			(2) 当调用可变个数形参的方法时，传入的参数个数可以是：0个， 1个， 2个，...
			
			(3) 可变个数形参的方法与本类中方法名相同，形参不同的方法之间构成重载
			
			(4) 可变个数形参的方法与本类中方法名相同，形参类型也相同的数组之间不构成重载。
			
				换句话说，二者不能共存
				
			(5) 可变个数形参在方法的形参中，必须声明在末尾
			
				The variable argument type String of the method show must be the last parameter
				
			(6) 可变个数形参在方法的形参中，最多只能声明一个可变形参
			
			
*/
public class MethodArgsTest {
	
	public static void main(String[] args) {
		
		MethodArgsTest test = new MethodArgsTest();
		
		test.show(12);
		
		// test.show("hello");
		// test.show("hello","world");
		// test.show();
		
		// 以下两种写法都可以调用 可变个数形参的方法
		test.show(new String[] {"AA","BB","CC"});
		test.show("AA","BB","CC");
		
	}
	
	public void show(int i) {
		
	}
	
	//public void show(String s) {
	//	System.out.println("show(String)");
	//}
	
	// 以下两个方法视为同一个方法
	public void show(String... strs) {
		System.out.println("show(String... strs)");
		
		for(int i = 0;i < strs.length;i++) {
			System.out.println(strs[i]);
		}
	}
	
	// public void show(String[] strs) {
	//	
	// }
	
	public void show(int i,String... strs) {
		
	}
}






