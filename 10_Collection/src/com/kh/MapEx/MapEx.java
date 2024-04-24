package com.kh.MapEx;

import java.util.HashMap;
import java.util.Map;

/*
 

		HashMap
Map		TreeMap
		LinkdedHashMap


Map : 특정 (키)를 입력하면 해당되는 (값)을 얻을 수 있는 Collection 객체
	키 - key
	값 - value
	
	key : value 로 구성
	
메서드
	put(key, value) - 지정된 key와 지정된 value 쌍 추가
	get(key) - 지정된 key에 저장된 값을 보여줌
	containsKey(key) - 지정된 key가 존재하는지 확인
	containsValue(value) - 지정된 value가 존재하는지 확인
	remove(key) - 지정된 key와 key에 저장된 value 제거
	keySet() - key를 포함하는 집합을 반환
	values() - 모든value를 포함하는 컬렉션 반환
	entrySet() - 모든 key쌍을 포함하는 집합 반환
	

*/

public class MapEx {
	public static void main(String[] args) {
		//Map생성
		Map<String, Integer> students = new HashMap<>();
		
		//put활용해서 값추가
		students.put("철수", 90);
		students.put("영희", 85);
		students.put("민수", 88);
		
		//전체보기
		System.out.println(students);
		
		//get사용해서 조회하기
		System.out.println("철수의 성적 : " + students.get("철수"));
		
		//remove 사용해서 삭제
		students.remove("영희");
		System.out.println(students);
		
		//students 성적출력
		//for-each 학생들에들어있는 key를 모두 가지고와서 배열해놓는 keySet활용
		for(String name : students.keySet()) {//{"철수","민수"}
			int score = students.get(name);
			System.out.println(name + "의 성적은 " + score);
		}
		
	}

}
