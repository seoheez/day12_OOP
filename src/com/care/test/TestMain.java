package com.care.test;


import java.util.Date;
import com.care.ZZZ.*; // ZZZ에 있는 모든 파일을 가져다 쓰겠다고 명시.


public class TestMain {

	public static void main(String[] args) {
		Test t = new Test();
		t.test();
		
		TestClass tx = new TestClass();
		tx.testClass(); //같은 패키지 안에서만 default로 접근이 가능함. 
		
		TestClass02 tx02 = new TestClass02();
		tx02.testClass02();
		
 		a.a.a.TestClass tt = new a.a.a.TestClass();
		Date d = new Date();
		java.sql.Date ddd = new java.sql.Date(0);
		
	}

}
