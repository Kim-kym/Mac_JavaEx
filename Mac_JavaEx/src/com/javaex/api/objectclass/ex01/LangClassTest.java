package com.javaex.api.objectclass.ex01;

public class LangClassTest {

	public static void main(String[] args) {
		Point p = new Point(10, 20);
		
		// 	객체의 최상위 클래스는 Object 
		//	-> 기본적으 Object의 모든 기능을 상속 
		
		System.out.println(p.getClass().getName());
		System.out.println(p.hashCode());	//	객체 식별
		System.out.println(p.toString());	//	객체내부 데이터를 문자열로 반ㅏㄴ
		System.out.println(p);	//	문자열 정보가 필요할 때, toString()을 호출
		
		//	p의 부모 객체를 받아와서 확인 
		System.out.println(p.getClass().getSuperclass().getName());
		
		
	

	}

}
