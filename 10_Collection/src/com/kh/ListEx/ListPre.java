package com.kh.ListEx;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

/*
 	┌ Vector : Java1 버전 대에서 제일 먼저 등장해서 사용된 것
List├ ArrayList : 검색에 좋음 데이터 삽입과 삭제가 빈번한 경우 부적합
	└ LinkedList : 검색엔 부적합 데이터 삽입과 삭제에는 좋음
	

*/

public class ListPre {
//생성자 : 기본 ctrl space enter
	public ListPre() {
	}
	
//void : 벡터	
	public void VectorEx() {
		
		//List<String> vctr = new Vector<>(); 이렇게 사용해도 되지만 아래 사용 권장
		Vector<String> vctr = new Vector<>();
		vctr.add("자바");
		vctr.add("파이썬");
		vctr.add("C");
		System.out.println(vctr);
	}
	
	public void LinkedEx() {
		//List<String> lnkdlst = new LinkedList<>();
		LinkedList<String> lnkdlst = new LinkedList<>();
		lnkdlst.add("말");
		lnkdlst.add("호랑이");
		lnkdlst.add("송아지");
		System.out.println(lnkdlst);
	}
	
	public void ArrayEx() {
		ArrayList<String> arrLst = new ArrayList<>();
		
		arrLst.add("사과");
		arrLst.add("바나나");
		arrLst.add("포도");
		System.out.println(arrLst);
	}
//main
	public static void main(String[] args) {
		ListPre li = new ListPre();
		li.VectorEx();
		li.LinkedEx();
		li.ArrayEx();
	}
	

}
