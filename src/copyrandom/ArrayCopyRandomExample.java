package copyrandom;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCopyRandomExample {

	public static void main(String[] args) {
		/**정수형 배열**/
		int[] a1 = new int[5]; //[0,0,0,0,0] 기본값으로 채워짐
		Arrays.fill(a1, 2);//초기값 2로 채워짐
		System.out.println(Arrays.toString(a1));
		
		//for문을 이용하여 항목값을 모두 3으로 변경 후 출력
		int i;
		for(i=0;i<a1.length;i++) {
			a1[i]=3;
		}
		System.out.println(Arrays.toString(a1));
		
		for(i=0;i<a1.length;i++) {
			a1[i] = (int)(Math.random()*10)+1;//1~10사이의 정수값을 랜덤으로
		}
		System.out.println(Arrays.toString(a1));
		/*
		0.0 <= Math.random() < 1.0 실수값(예:.0.000123)
	 0.0*10 <= Math.random()*10 < 1.0*01
		0.0 <= Math.random()*10 < 10.0 실수값(예:7.235678)
   (int)0.0 <= (int)(Math.random()*10) < (int)10.0
		  0 <= (int)(Math.random()*10) < 10           정수값 : 0~9사이의 정수
		0+1 <= (int)(Math.random()*10)+1 < 10+1    정수값 : 1~10사이의 정수
		
		공식
		   (int)(Math.random()*몇개)+시작정수;
		
		 */
		
		for(i=0;i<a1.length;i++) { //몇개=마지막수-처음수+1=29-11+1
			a1[i] = (int)(Math.random()*(29-11+1))+11;//11~29사이의 정수값을 랜덤으로
		}
		System.out.println(Arrays.toString(a1));
		
		//88~101사이의 정수값을 랜덤으로 채우기
		for(i=0;i<a1.length;i++) { //몇개=마지막수-처음수+1=29-11+1
			a1[i] = (int)(Math.random()*(101-88+1))+88;//11~29사이의 정수값을 랜덤으로
		}
		System.out.println(Arrays.toString(a1));
		
		
		/**문자형 배열**/
		char[] ch = new char[3];//
		System.out.println(Arrays.toString(ch));
		
		Arrays.fill(ch, 'A');
		System.out.println(Arrays.toString(ch));
		
		//for문을 이용하여 항목값을 모두'a'으로 변경 후 출력
		for(i=0;i<ch.length;i++) {
			//ch[i]=(char) (ch[i]+32);
			ch[i]+=32; //복합대입연산자는 강제형변환을 자동으로 한다
		}
		System.out.println(Arrays.toString(ch));
		
		
		
		/**
		 *배열 복사 방법
		 */
		char[] arr = {'J','A','V','A'};//arr.length==4
		
		//배열 복사 방법 -1
		char[] arr1 = new char[arr.length+2];//[null문자로 채워짐]
		for(i=0;i<arr.length;i++) {
			arr1[i] = arr[i];
		}
		System.out.println("배열 복사 방법-1>"+Arrays.toString(arr1));
		
		//배열 복사 방법 -2
		char[] arr2 = new char[arr.length+2];//[null문자로 채워짐]
		
		//arraycopy(원본,원복의 시작index,도착지,도착지의 시작index,복사할 개수)
		System.arraycopy(arr, 1, arr2, 2, 3);
		
		System.out.println("배열 복사 방법-2>"+Arrays.toString(arr2));
		
		/**
		 * 5월 28일 과제 -1
		 * 키보드로 입력 받아 arr3의 null문자 있는 곳에 채우기
		 * for문을 사용하여 출력 'J','A','V','A', !,~
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("늘릴 배열의 크기>"); int size = sc.n
				extInt();
		
		for(i=0;i<arr.length;i++) {
			
		}
		
		
		//★★배열 복사 방법 -3
		char[] arr3 = Arrays.copyOf(arr, arr.length+size);
		System.out.println("배열 복사 방법-3>"+Arrays.toString(arr3));
		
		
		//★★배열 복사 방법 -4
		char[] arr4 = Arrays.copyOfRange(arr, 1, 3+1);//J,A,V,A -> A,V,A
		//자바 메서드는 인덱스 2개 나오면 (시작index, 마지막index+1)
		System.out.println("배열 복사 방법-4>"+Arrays.toString(arr4));

		
		
		
		
		
		
		
	}//main 끝

}
