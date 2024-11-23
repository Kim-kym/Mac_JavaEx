package com.javaex.api.arrays;

import java.util.Arrays;

public class ArrayEx {

	public static void main(String[] args) {
		//	배열의 복사 
		arrayCopyEx();

	}
	
	private static void arrayCopyEx() {
		char[] src = "Java Programming".toCharArray();
		System.out.println(Arrays.toString(src));
		
		//	System을 이용한 카피 
		char[] target = new char[src.length];
		System.arraycopy(src, 0,	//	src의 0번부터의 요소를 
							target, 0,	//	target의 0번부터 복사 
							src.length); //	src.length 길이를 복사 
		System.out.println(Arrays.toString(target));
		System.out.println(Arrays.toString(target));
		
	}

}
