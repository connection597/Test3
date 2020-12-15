package test;
// split() 문자열 자르기
public class SplitTest {

	public static void main(String[] args) {
		String birthday ="2020-10-20";
		
		String date[] = birthday.split("-"); 
		//split이용해 '-'기준으로 문자열잘라 배열로 반환한다
		for(int i =0; i<date.length; i++) {
			System.out.println("date[+i+]:" + date[i]);
		}

	}

}
