package com.wndexx.java2;

import org.junit.Test;

/*
	包装类(Wrapper)的使用：
	
	1. Java 提供了 8 种基本数据类型对应的包装类，使得基本数据类型的变量具有类的特征
	
		基本数据类型	包装类
		
		byte		Byte
		
		short		Short
		
		int			Integer
		
		long		Long
		
		float		Float
		
		double		Double
		
		boolean		Boolean
		
		char		Character
	
	2. 掌握的：基本数据类型、包装类、String 三者之间的相互转换
	
	

*/
public class WrapperTest {
	


	// (1) 基本数据类型 ---> 包装类：调用包装类的构造器
	@Test
	public void test1() {

		int num1 = 10;
		// System.out.println(num1.toString());

		Integer in1 = new Integer(num1);
		System.out.println(in1.toString());

		Integer in2 = new Integer("123");
		System.out.println(in2.toString());

		// 报异常：java.lang.NumberFormatException: For input string: "123abc"
		// Integer in3 = new Integer("123abc");
		// System.out.println(in3.toString());

		Float f1 = new Float(12.3f);
		Float f2 = new Float(12.3);
		Float f3 = new Float("12.3");
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);

		Boolean b1 = new Boolean(true);
		Boolean b2 = new Boolean("true");
		Boolean b3 = new Boolean("true123");
		Boolean b4 = new Boolean("TrUe");
		System.out.println(b3); // false
		System.out.println(b4); // true

		Order order = new Order();
		System.out.println(order.isMale); // false
		System.out.println(order.isFemale); // null

	}

	// (2) 包装类 ---> 基本包装类型:调用包装类的xxxValue()
	@Test
	public void test2() {
		Integer in1 = new Integer(12);
		int i1 = in1.intValue();
		System.out.println(i1 + 1); // 13
		
		Float f1 = new Float(12.3);
		float f2 = f1.floatValue();
		System.out.println(f2 + 1); // 13.3
	}
	
	/*
	 * JDK 5.0 新特性：自动装箱与自动拆箱
	 * 
	 * 
	 */

	@Test
	public void test3() {
		// int num1 = 10;
		// // 基本数据类型 --> 包装类的对象
		// method(new Integer(num1)); // 10 
		// method(num1); // 10  
		
		// 自动装箱：基本数据类型 --> 包装类的对象
		int num2 = 10;
		Integer in1 = num2; // 自动装箱
		
		boolean b1 = true;
		Boolean b2 = b1; // 自动装箱
		
		// 自动拆箱：包装类 ---> 基本包装类型
		System.out.println(in1.toString());
		
		int num3 = in1; // 自动拆箱
		
		Integer in2 = 3;
		Integer in3 = 3;
		Integer in4 = in2 + in3;
		System.out.println(in4); // 6
		
	}
	
	public void method(Object obj) {
		System.out.println(obj);
	}
	
	// (3) 基本数据类型、包装类 ---> String 类型：调用 String 重载的 valueOf(Xxx xxx)
	@Test
	public void test4() {
		
		int num1 = 10;
		// 方式1：连接运算
		String str1 = num1 + "";
		
		// 方式2：调用 String 的 valueOf(Xxx xxx)
		float f1 = 12.3f;
		String str2 = String.valueOf(f1); // "12.3"
		
		Double d1 = new Double(12.4);
		String str3 = String.valueOf(d1);
		System.out.println(str2); // "12.3"
		System.out.println(str3); // "12.4"
	}
	
	// (4) String 类型 ---> 基本数据类型、包装类：调用包装类的 parseXxx(String s)
	@Test
	public void test5() {
		String str1 = "123";
		// 错误的情况：
		// int num1 = (int)str1;
		// Integer in1 = (Integer)str1;
		
		// 可能会报 NumberFormatException
		int num2 = Integer.parseInt(str1);
		System.out.println(num2 + 1); // 124
		
		int num3 = new Integer(str1);
		System.out.println(num3 + 1); // 124
		
		String str2 = "true1";
		boolean b1 = Boolean.parseBoolean(str2);
		System.out.println(b1); // false
	}
}

class Order {
	boolean isMale;
	Boolean isFemale;
}
