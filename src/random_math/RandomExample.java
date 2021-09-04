package random_math;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		//선택번호
		int[] sn = new int[6]; //[0,0,0,0,0,0] 선택번호가 6개가 0으로 채워짐
		
		Random r = new Random(); //
		System.out.print("선택번호:");
		int i;
		for(i=0;i<sn.length;i++) {
			sn[i] = r.nextInt(45)+1;   //1부터 시작해서 45개 (정수1~45 중 랜덤으로 얻어서 배열에 저장) 
		System.out.print(sn[i]+" ");
		}
		System.out.println(); //구분을 위한 빈줄
		
		/* Random 클래스
		 * 0   <= nextInt(n)    < n
		 * 0   <= nextInt(45)   < 45 (정수값 0~44사이의 정수)
		 * 0+1 <= nextInt(45)+1 < 45+1 (정수값 0~44사이의 정수)
		 */
		
		
		//당첨번호
		
		int[] wn = new int[6]; //[0,0,0,0,0,0] 당첨번호가 6개가 0으로 채워짐
		
		r = new Random(3); //(정수)값을 주면 랜덤으로 같은 값들이 생성
		System.out.print("당첨번호:");
		
		
		for(i=0;i<sn.length;i++) {
			wn[i] = r.nextInt(45)+1;   //1부터 시작해서 45개 (정수1~45 중 랜덤으로 얻어서 배열에 저장) 
			System.out.print(wn[i]+" ");
		}
		System.out.println();
		
		//당첨여부
		System.out.print("당첨 여부:");
		
		if(Arrays.equals(sn, wn)) System.out.println("1등에 당첨되었습니다!!!");
		else System.out.println("당첨되지 않았습니다...");
		
		
		/*
		 * 이진탐색 : 반드시 정렬-> 정렬된 데이터를 대상으로 탐색하는 알고리즘
		 */
		//1.정렬
		Arrays.sort(wn);
		System.out.println(Arrays.toString(wn));
		//2.binarySearch(배열, 찾을 값)
		int idx = Arrays.binarySearch(wn, 28);//정렬된 배열에서 28을 찾아 index번호를 리턴해줌
		System.out.println("28은"+(idx+1)+"번째로 작은 값이다.");
		
		
	}

}
