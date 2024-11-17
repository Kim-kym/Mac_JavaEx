package com.javaex.api.objectclass.book.tostring;

public class BookEx {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		Car car2 = new Car();
		
		System.out.println(car1);
		System.out.println(car2);
		
		
		Car c1 = new Car();
		Car c2 = new Car();
//		Object 클래스에 정의되어 있는 equals()메소드는 참조 값 비교 결과를 반환 
			System.out.println("두 객체를 equals() 비교");
			c1.equals(c2);
			
			//	두 참조변수의 참조 값을 동일하게 변경
			c1 = c2; 
			
			System.out.println("두 참조변수의 참조 값을 동일하게 변경");
			System.out.println("두 객체를 equals()비교");
			c1.equals(c2);
	}

}

	class Car {
		//	Object 클래스의 toSring() 메소드를 오버라이딩 
		@Override
		public String toString() {
			return "Car Class 기반의 안스턴스 입니다."; 
			
		}
		
}