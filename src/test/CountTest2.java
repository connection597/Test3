package test;

import java.util.Scanner;

//원본 문자열에 특정 단어가 몇개있는지 확인 하기
public class CountTest2 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String origin ="";
		System.out.println("원본 문자열 입력");
		origin =sc.nextLine();
		
		String word ="";
		System.out.println("검색할 단어 입력");
		word =sc.next();
		
		System.out.println("원본"+origin);
		System.out.println("검색할 단어"+word);
		
		String [] sarr = origin.split("");
		
		int len = sarr.length;
		int count =0;
		for(int i =0; i<len; i++) {
			if(word.equals(sarr[i])) {
				count++;
			}
		}
		System.out.println("빈도수"+count);
		
	}

}
