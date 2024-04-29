//Collections_Comparator 24.04.24
//연습문제 : 99_09_01_list_Music 프로젝트의 model.compare/AscTitle.java
package com.kh.ComparatorEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//패키지명이나 파일명 한 번에 바꾸는 단축키 f2
/*
Comparator : 비교하는 객체
메서드
compare(변수명1, 변수명2) : 두 객체나 변수를 비교해서 정렬 순서를 결정
	변수명1 < 변수명2 음수 반환
	변수명1 == 변수명2 0 반환
	변수명1 > 변수명2 양수 반환
reversed() : 순서를 거꾸로 뒤집어서 순서를 매길 때 사용
comparing(클래스명 :: 참조할메서드명) : 클래스 밑에서 참조할 메서드를 가지고 와서 정렬 기준 결정 

*/
public class ComparatorEx {
	
	public static void main(String[] args) {
		List<String> words = new ArrayList<>(Arrays.asList("apple", "banana", "cherry"));
		
		//단어에서 단어의 길이를 기준으로 정렬하자
		//												클래스명 :: 참조할메서드명
		Comparator<String> lenComp = Comparator.comparing(String::length);
		
		//sort 사용해서 정렬
		words.sort(lenComp);
		
		//정렬된리스트 출력
		System.out.println("문자열 길이를 기준으로 정렬된 리스트 : " + words);
		
		
	}

}
