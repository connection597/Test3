package test;
//숫자개수 구하기 0~9범윈 내 벼열에 들어 있는 숫자들이 각 각 몇개인지 세기
public class Count {

	public static void main(String[] args) {
		int [] num = new int[30];
		for(int i=0; i<num.length; i++) {
			num[i] = (int)(Math.random()*10); //0부터 9범위내 숫자
			System.out.println(num[i] +",");
		}
		System.out.println();
		
		//배열에 들어있는 숫자 각각 몇개 들어있는지 세기
		int [] count = new int[10];
		for(int i=0; i<num.length; i++) {
			count[num[i]]++;
		}
		for(int i =0; i<count.length; i++) {
			System.out.println(i +"번"+count[i]);
		}

	}

}
