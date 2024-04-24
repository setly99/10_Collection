package com.kh.IteratorEx;

import java.util.ArrayList;
import java.util.Iterator;

/*
Collection(List, Set, Map)반복하는데 사용
Enumeration : 더이상 권장x Vector와 같은 오래된 버전 클래스에서만 사용됨

Iterator : 반복하는데 사용(순차적으로 회전)
	읽기만 가능, 추가하거나 삭제할 수 없음

ListIterator : Iterator 업그레이드버전
	List(Vector,ArrayList,LinkedList)컬렉션에서만 사용
	양방향으로 순차적으로 회전할 수 있음
	(앞뒤로 이동가능)
	추가하거나 삭제할 수 있음

Iterator 밑에 있는 메서드
	hasNext() : 다음이 있는지 없는지 확인 true false
		만약에 존재한다면 true 존재하지 않는다면 false
		
	next() : 다음 것을 가지고 오는데 사용
		next()는 사용하기 전에 hasNext()를 사용해서 그 다음이 있는지 없는지를 확인하고
		사용하는 것이 안전함(익셉션에러)



*/
public class IteratorEx {
	
	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("사과");
		fruits.add("블루베리");
		fruits.add("패션후르츠");
		fruits.add("망고");
		
		//Iterator 생성
		Iterator<String> rpt = fruits.iterator();// import java.util.Iterator 
		
		//hasNext() 다음 값이 있는지 확인
		while(rpt.hasNext()) {
			//next()로 다음 값 가지고오기
			String f1 = rpt.next();
			System.out.println(f1);
		}
		//next()다음 값 가지고 오기
		
	}

}
