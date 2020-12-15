package test;
// 문자열 자르기
public class StringTest {

	public static void main(String[] args) {
		String mail ="absed@google.com";
		int idx = mail.indexOf("@"); // 인덱스 값을 찾기
		
		String mail1 = mail.substring(0,idx);//@앞부분 추출
		String mail2 = mail.substring(idx+1); // 뒷부분 추출
		
		System.out.println("mail1:"+mail1);
		System.out.println("mail2:"+mail2);
	}

}
