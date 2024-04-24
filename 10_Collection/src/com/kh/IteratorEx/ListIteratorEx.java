package com.kh.IteratorEx;

import java.util.*;

/*
ListIterator

hasNext() : 다음 값이 존재하는지 true false로 확인
next() : 다음 값 가져오기
hasPrevious() : 이전 값이 존재하는지 true false로 확인
previous() : 이전 값 가져오기

값을 추가하거나 삭제할 수 있음
add() : 추가
remove() : 삭제

*/

public class ListIteratorEx {
	
	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();
		colors.add("빨강");
		colors.add("화이트");
		colors.add("초록");
		
		//리스트 이터레이터 생성
		ListIterator<String> rp = colors.listIterator();
		/*
		System.out.println("앞에서부터 출력");
		while(rp.hasNext()) {
			String c1 = rp.next();
			System.out.println(c1);
		}
		*/
		
		System.out.println("뒤에서부터 출력");
		while(rp.hasPrevious()) {
			String c1 = rp.previous();
			System.out.println(c1);
		}
		System.out.println("add를 사용해서 추가하기");
		rp.add("파랑");
		
		System.out.println(colors);
		
		//previous()사용해서 현재위치를 파랑의 위치로 이동
		rp.previous();
		
		rp.remove();
		
		System.out.println("삭제됐는지 확인 : " + colors);
		/*
		System.out.println(colors);
		
		Exception in thread "main" java.lang.IllegalStateException
	at java.base/java.util.ArrayList$Itr.remove(ArrayList.java:980)
	at com.kh.IteratorEx.ListIteratorEx.main(ListIteratorEx.java:46)
	
		add 값을 추가하면서 앞으로 이동한 다음에는 리스트의 끝에 위치
		
		더이상 다음이 없기 때문에 삭제할 수 없음
		
		해결하는 방법
		next() 또는 previous()호출해서 현재위치 변경한 다음에 remove()호출
		
		
		*/
		
		
	}

}
