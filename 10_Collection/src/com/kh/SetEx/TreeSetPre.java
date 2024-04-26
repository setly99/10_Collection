package com.kh.SetEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetPre {
	// main
	public static void main(String[] args) {

		
		//TreeSet<String> fruits = new TreeSet<>();
		String[] fruitArr = {"키위","복숭아","참외","수박","딸기"};
		List<String> fruitAL = Arrays.asList(fruitArr);
		
		// fruits과일들 String "키위 복숭아 참외 수박 딸기"
				//						Set.of()
		TreeSet<String> fruits = new TreeSet<>(Set.of("키위","복숭아","참외","수박","딸기"));
		
		fruits.add("키위");
		fruits.add("복숭아");
		
		fruits.add("수박");
		
		// 복숭아 제거
		fruits.remove("복숭아");
		
		// 수박이 포함되어있는지 확인
		System.out.println(fruits.contains("수박"));
		
		// fruits 비어있는지 확인
		System.out.println(fruits.isEmpty());
		
		// fruits개수
		System.out.println(fruits.size());
		
		// 가장 작은 값
		System.out.println("가장작은값:" + fruits.first());
		
		// 가장 큰 값
		System.out.println("가장큰값:" + fruits.last());
		
		// 모든 값 제거
		//fruits.clear();
		
		// 모두제거됐는지 확인
		System.out.println(fruits);
		
	}

}
