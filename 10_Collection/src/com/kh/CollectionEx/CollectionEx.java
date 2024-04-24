package com.kh.CollectionEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
Collection 인터페이스 : 파일들을 연결시켜주는
List, Set의 부모클래스
순차적으로 회전하면서 코드를 조회하거나 코드안에 작성한 내용을 순회하고
추가 삭제 검색 등 기본작업 제공

sort : 리스트를 기본 정렬 순서에 따라 정렬
	1.숫자 : 오름차순
	2.문자열 : 문자열의 사전 순서에 따라 정렬
	3.우리가 파일을 만들면서 정한 기준 : compareTo()메서드를 활용해서 정렬 기준을 작성할 수 있음
min,max
binarySearch : 이진탐색을 사용하여 리스트에서 지정된 요소 찾기
	이진 탐색 : 정렬된 배열이나 리스트에서 특정한 값의 위치를 찾는 알고리즘
			배열 또는 리스트를 반으로 나눠서 탐색 범위를 좁혀가면서 값을 찾아내는 것

addAll : 내가 추가하고자 하는 모든 값을 추가

*/
public class CollectionEx {
	
	public static void main(String[] args) {
		//정렬
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(3);
		nums.add(5);
		nums.add(4);
		nums.add(1);
		System.out.println(nums);
		
		//Collection이용해서 오름차순 정렬
		Collections.sort(nums);
		System.out.println(nums);
		
		// ArrayList에서 add로 하나씩 추가하는 것이 아니라
		//한번에 값을 추가하기
		//											()에 Arrays.asList()넣고싶은만큼추가가능
		ArrayList<String> colors = new ArrayList<>( Arrays.asList("black","white") );
		System.out.println(colors);
	}

}
