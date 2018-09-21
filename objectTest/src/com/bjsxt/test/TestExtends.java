package com.bjsxt.test;

public class TestExtends {
	public static void main(String[] args) {
		new A();
		TestStrictfp testStrictfp = new TestStrictfp();
		testStrictfp.main();
		System.out.println("nihao git");
	}
	
}
class B extends Object{
	static {
		System.out.println("LoadB");
	}
	public B() {
		System.out.println("create B");
	}
}
class A extends B{
	static {
		System.out.println("loadA");
	}
	public A() {
		System.out.println("create A");
	}
}
//静态代码块只加载一次，并且是运行程序，就会加载的，有限于构造器的创建