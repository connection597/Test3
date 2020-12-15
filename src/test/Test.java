package test;

public class Test {
//주어진 문자열의 알파벳세기
	public static void main(String[] args) {
		 String s ="hey boys hey girl hey anybody who will listen to me";
		 char alpa[] = new char[26];
		 int count[] = new int[26];
		 
		 for(int i=0; i<alpa.length; i++) {
			 alpa[i] =(char)(i+97); //알파벳 소문자 생성
		 }
		 for(int i =0; i<alpa.length; i++) {
			 for (int j =0; j<s.length(); j++) {
				 if(alpa[i] == s.charAt(j)) { //String 한글자씩 소분자 배열비교
					 count[i]++;
				 }
			 }
		 }
		 for(int i=0; i<count.length; i++) {
			 System.out.println(alpa[i]+"의 개수"+count[i]);
		 }

	}

}
