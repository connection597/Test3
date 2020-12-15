package test;

public class Test3 {

	public static void main(String[] args) {
		int score[] = new int[] {85,56,98,88,65,20,50};
		int i =0, j=0, rank=1;
		for( i =0; i<score.length; i++) {
			for(j =0; j<score.length; j++) {
				if(score[i]<score[j]) {
					rank++;
				}
			}
			System.out.println(score[i]+"점:"+rank+"등");
			rank=1;
		}

	}

}
