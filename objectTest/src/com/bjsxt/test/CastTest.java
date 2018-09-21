package com.bjsxt.test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CastTest {
	public static void main(String[] args) {
		short a = 128;
		byte b = (byte)a;
		//当short为小写时，即为基本数据类型的时候会 short转为int再转为byte
		Short aa = 128; 
		//byte bb = (byte)aa;
		//出现编译错误
		 Map<String, String> map = Collections.synchronizedMap(new HashMap<String,String>());
	}
}
