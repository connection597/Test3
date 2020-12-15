package test;

import java.util.Scanner;

// 문자열에서 단어 몇개인지 세기 공백 포함
public class CountTest {

	public static void main(String[] args) {
		String str;
		int cut =0; int i;
		System.out.println("문자를 입력하세요:");
		Scanner sc = new Scanner (System.in);
		str = sc.nextLine();
		
		//연속된 공백을 하나의 공백으로 치환
		str = str.replaceAll("+","");
		//trim으로 앞뒤 공백 제거
		str = str.trim();
		
		for(i =0; i<str.length(); i++) {
			if(' ' == str.charAt(i))
				cut++;
		}
		if(i != 0 )cut++;
		System.out.println(cut);

	}

}
