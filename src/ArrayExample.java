import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {
		/**배열 사용하지 않았을 때**/
		int s1=83;
		int s2=88;
		int s3=95;
		int s4=21;
		
		//더한 합?
		int sum=s1+s2+s3+s4;
		System.out.println("합="+sum);
		/* 점수 사이에 일정한 규칙이 없어서 반복문 사용 불가
		int i;
		sum=0;//반드시 초기화
		for(i=1;i<=4;i++) {
			sum+=si;
		}
		*/
		
		/****배열선언, 생성(heap메모리)과 동시에 값 목록 대입****/
		System.out.println("**배열 사용**");
		int[] scores = {83, 88, 95, 21}; //반드시 같은 타입만 저장
			 //index     0   1   2   3   배열객체에는 length==4(마지막 index+1), 읽기전용
		
		scores[0]=93;
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		System.out.println(scores[3]);
		
		
		sum=scores[0]+scores[1]+scores[2]+scores[3];
		System.out.println("합="+sum);
		
		int i;//index, 반복횟수, 반복하는 실행문
		sum=0;
		for(i=0;i<scores.length;i++) {
			sum+=scores[i];
		}
		System.out.println("합="+sum);
		
		
		//평균?
		System.out.println("평균="+sum/scores.length);//결과가 정수만 나옴
		
		System.out.println("평균="+(double)sum/scores.length);//실수/자동으로 실수 = 결과가 실수
		
		System.out.println(scores);//int타입 배열객체의 주소
		
		/***char타입 배열***/
		char[] ch = {'a','b','c'};
		//반복문을 사용하여 옆으로 출력
		for(i=0;i<ch.length;i++) {
			System.out.print(ch[i]+"\t");
		}
		System.out.println();//커서를 아래로 
		System.out.println(ch);//ch:char타입 배열의 주소
		
		System.out.println("char 배열"+ch);// ch : 주소 C@7852e922 
		System.out.println("char 배열"+ch.toString());//
		
		
		System.out.println((int)'A');
		System.out.println((int)'a');
		
		for(i=0;i<ch.length;i++) {
			ch[i]-=32;
		}
		System.out.println(Arrays.toString(ch));
		
		
		for(i=0;i<ch.length;i++) {
			System.out.print(ch[i]+32+" ");
		}
		System.out.println();//커서를 아래로
		
		for(i=0;i<ch.length;i++) {
			System.out.print((char)(ch[i]+32)+" ");
		}
		System.out.println();//커서를 아래로
		//System.out.println(Arrays.toString(ch));
		
		/*
		 * ArrayIndexOutOfBoundsException, NullPointerException
		 * :예외처리(try~catch)로 처리하지 않고 프로그래머가 알아서 논리적으로 처리함(잘못된 코드 삭제)
		 */
		try {
			System.out.println(ch[3]);//예외처리로 처리하지 않고 
		} catch (Exception e1) {//Exception:모든 자식예외객체의부모
			// 예외가 발생했을 때만 실행
			//e1.printStackTrace();
			System.out.println("해당배열값은없습니다.");
		}
		
		
		
		
		/***과제1 배열에서 문 a,b,c, 마지막에,없이 출력***/
		char [] ch2 = {'a','b','c'};
		System.out.println("과제1 방법1=");
		for(i=0;i<ch2.length;i++) {
			if(i !=ch2.length-1)System.out.print(ch2[i]+",");
			else System.out.print(ch2[i]);
			
		}
		System.out.println();
		
		/***과제1 배열에서 문 a,b,c, 마지막에,없이 출력 방법2
		 * 조건연산자 (조건문)? 참:거짓***/
		System.out.println("과제1 방법2=");
		for(i=0;i<ch2.length;i++) {
			System.out.print(ch2[i]+((i !=ch2.length-1)?",":""));
			
		}
		System.out.println();
		
		
		
		/**과제1 방법3**/
		System.out.println("과제1 방법3=");
		String charjoin="";
		for(i=0;i<ch2.length;i++) {
			charjoin=charjoin+ch2[i]+",";
			
		}
		charjoin=charjoin.substring(0,charjoin.length()-1);
		System.out.println(charjoin);
		System.out.println(charjoin.substring(0,charjoin.length()-1));
		System.out.println(charjoin);
		
		
		
		System.out.println(Arrays.toString(ch));
		System.out.println(Arrays.toString(scores));
		Arrays.sort(scores);
		System.out.println(Arrays.toString(scores));
		
		/**배열 선언 후 배열목록 생성 방법-1**/
		int[] sco1=null;//배열 선언.null : 참조한느 배열 객체 없음
		/*
		 * try{예외가 발생할 가능성이 있는 부분} 만약 예외가 발생하면
		 * catch(Exception e){예외객체를 잡아서 처리}
		 */
		try {
			System.out.println(sco1[0]);
		} catch (Exception e) {//Exception:예외의 부모
			//e.printStackTrace();
			System.out.println("해당배열값은없습니다.");

		}
		/*
		 * 기본값
		 * int : 0, double : 0.0, char : 널문자'\0', boolean : false, String : null
		 */
		sco1=new int[3];//[0,0,0] 
		System.out.println(Arrays.toString(sco1));
		sco1[0]=10;
		for(i=1;i<sco1.length;i++) {
			sco1[i]=sco1[i-1]+10;
		}
		System.out.println(Arrays.toString(sco1));
		
		
		//지금부터 90 85 99를 대입
		sco1[0]=90;
		sco1[1]=85;
		sco1[2]=99;
		System.out.println(Arrays.toString(sco1));
		System.out.println("int 배열"+sco1.toString());//I@70dea4e
		
		
		
		
		String[] s= {"양영석","윤호섭","이수광","전상호"};
		
		
		
		
		
		
		
		
		
		
		/**과제2
		 * 위 내용을 응용하여 문제 풀기
		 * 키보드로부터 ㅈ점수를 입력받아 sco2이 참조한느 배열객체 저장
		 * ->합계와 평균 구하기
		 */
		
		  Scanner sc = new Scanner(System.in);
		  
		  int[] sco2 = null;
		  System.out.print("배열 크기 입력:");
		  int size = sc.nextInt();
		  sco2 = new int[size];
		  
		  sum=0;
		  //for(i=0;i<sco2.length;i++)
		  for(i=0;i<sco1.length;i++) {
			  System.out.print((i+1)+"번쨰 정수 입력:");
			  sco1[i]=sc.nextInt();//정수를 입력받아
			  sum+=sco1[i];//입력받은 값을 합계에 누적
		  }
		  System.out.println("합="+sum+",평균은="+(double)sum/sco1.length);
		
		
		  /**배열 선언 후 배열목록 생성 방법-2**/
		  int[] sco3 = new int[3];//[0,0,0]
		  sco3[0] = 3;
		  sco3[1] = 4;
		  sco3[2] = 5;
		
		  int[] sco4 = new int[] {10,20,30};//초기값.
		  int[] sco5 =  {10,20,30};// new int[] 생략
		  
		  int[]sco6 = null;
		  sco6=new int[] {10,20,30};//new int[] 생략불가
		
		
		
		
		  /**
	         * 향상된 for문 정리 : index로 접군하지 않기 떄문에
	         * 				   index로 접근하여 값을 변경하는 실행문에는 사용불가
	         */
	        int[] arr = new int[5];//[0, 0, 0, 0, 0] -> [0, 10, 20, 30, 40]
	        
	        //-> [0, 10, 20, 30, 40]변경 후
	        for(i=0;i<arr.length-1;i++) {
	        	arr[i+1]=arr[i]+10;
	        }
	        System.out.println(Arrays.toString(arr));
	        //-> [0, 20, 40, 60, 80]변경 후
	        for(i=1;i<arr.length;i++) {
	        	arr[i]=arr[i-1]+20;
	        }
	        System.out.println(Arrays.toString(arr));
	        
	        
	        //for문 사용하여 출력
	       
	        for(i=0;i<arr.length;i++) {//(i==arr.length-1)?"":",")
	        	System.out.print(arr[i]+((i!=arr.length-1)?",":""));
	        }
	        System.out.println("");
	        //향상된 for문 사용하여 출력
	        String str = "";
	        for(int value:arr) {
	        	str = str+value+",";//i 사용못함
	        }
	        str = str.substring(0, str.length()-1);
	        System.out.println(str);
		
		
		
		
		
	}//main끝

}
