import java.util.Arrays;
import java.util.Scanner;

public class 배열과제 {

	public static void main(String[] args) {
		
		//과제1 배열에서 문 a,b,c, 마지막에,없이 출력
		int i;
		char[] ch = {'a','b','c'};
		for(i=0;i<ch.length;i++) {
			if(i==2)System.out.println(ch[i]);
			else System.out.print(ch[i]+",");
		}
		System.out.println();
		
		

		/**과제2
		 * 위 내용을 응용하여 문제 풀기
		 * 키보드로부터 ㅈ점수를 입력받아 sco2이 참조한느 배열객체 저장
		 * ->합계와 평균 구하기
		 */
		Scanner sc = new Scanner(System.in);
		int ss ;
		int[] sco2 = null;
		int u = 0; int j = 0;
		System.out.print("배열 크기 입력:");
		
		ss=sc.nextInt();
		sco2=new int[ss];
		for(i=0;i<sco2.length;i++) {
			System.out.print("입력>");
			sco2[i]=sc.nextInt();
					u+=sco2[i];								//정수를 입력받아
					j=(u/ss);								//배열에 차례대로 대입
		}
		System.out.println("합="+u);
		System.out.println("평균="+j);
		
		//합계와 평균 구하기
		
	}

}
