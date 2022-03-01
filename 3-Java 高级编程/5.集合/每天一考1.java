/*
	1. 什么是枚举类？枚举类的对象声明的修饰符有哪些？

		类的对象只有有限个、确定个，称此类为枚举类
		
		public static final
		
	2. 什么是元注解？说说 Retention 和 Target 元注解的作用
	
		元注解：对现有的注解进行解释说明的注解
		
		Retention：指定所修饰的 Annotation 的生命周期：SOURCE\CLASS(默认行为)\RUNTIME
		
		Target：用于指定被修饰的 Annotation 能用于修饰哪些程序元素
		
	3. 说说你所理解的集合框架都有哪些接口，存储数据的特点是什么？
	
		Collection 单列集合，用来存储一个一个的对象
		
			List 存储有序的、可重复的数据
			
			Set 存储无序的、不可重复的数据
			
		Map 双列集合，用来存储一对(key-value)一对的数据
		
	4. 比较 throw 和 throws 的异同
	
		throw 表示手动抛出一个异常类的对象，生成异常对象的过程。声明在方法体内 <---> 自动抛出异常对象
		
		throws 属于异常处理的一种方式，声明在方法的声明处 <---> try-catch-finally
		
		"上游排污，下游治污"
		
	5. 谈谈你对同步代码块中同步监视器和共享数据的理解以及各自要求
	
		- 操作共享数据的代码，即为需要被同步的代码 
		
		     - 共享数据：多个线程共同操作的数据
		
		     - 同步监视器，俗称：锁。任何一个类的对象，都可以充当锁
		
		        - 要求：多个线程必须要共用同一把锁
		
		        - 补充：在实现 Runnable 接口创建多线程的方式中，我们可以考虑使用 this 充当同步监视器
		
		               在继承 Thread 类创建多线程的方式中，慎用 this 充当同步监视器，考虑使用当前类充当同步监视器
		
*/