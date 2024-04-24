package com.kh.IteratorEx;
/*
파일 위치를 가져올 때
동일한 폴더 위치에서 많은 파일을 가져올 때는
(*)을 사용해서 모두 가져오기를 해준다
전체선택

*/
import java.util.*;
/*
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
*/

public class IteratorPre {
	
	public static void main(String[] args) {
		//100, 10, 20, 30, 50, 70
		ArrayList<Integer> nums = new ArrayList<>();
		//ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(100,10,20));
		
		//숫자추가방법1
		//	nums.add(70);
		//방법2
		//	Arrays.asList();
		nums.addAll(Arrays.asList(100,10,20,30,50));
		nums.add(70);

		
		/*
		ArrayList<String> colors = new ArrayList<>(Arrays.asList("black","white"));
		*/
				
		
		//Iterator 생성
		Iterator<Integer> rptg = nums.iterator();
		
		//while문사용해서 hasNext()로 다음요소가 있는지 확인하고
		while(rptg.hasNext()) {
			System.out.println(rptg.next());
		}
		//next()로 출력
	}

}
