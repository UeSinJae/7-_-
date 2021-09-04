import java.util.Arrays;


public class ArrayInArray {

	public static void main(String[] args) {
		/***2차원 배열 선언하는 방법-1***/
		int[][] m = new int[2][3];  //[2행][3열]
		
		System.out.println(m[0]);//m[0] :0행 int[] 주소
		System.out.println(m[1]);
		
		
		System.out.println(Arrays.toString(m[0]));//m[0] :0행 int[] 주소
		System.out.println(Arrays.toString(m[1]));
		
		System.out.println("");
		
		int i;
		for(i=0;i<m.length;i++) {
			System.out.println(Arrays.toString(m[i]));
		}
		System.out.println("");
		
		
		//향상된 for : index로 접근해야만 하는 것은 사용못함 // 데이터를 볼때만사용가능
		System.out.println("향상된 for");
		for(int[] arr:m) {
			System.out.println(Arrays.toString(arr));
		}
		System.out.println();
		//향상된 for---------------------------------
		
		
		System.out.print("[");
		System.out.print(m[0][0]+", ");//기본값 출력
		System.out.print(m[0][1]+", ");
		System.out.print(m[0][2]);
		System.out.print("]");
		System.out.println();
		
		System.out.print("[");
		System.out.print(m[1][0]+", ");
		System.out.print(m[1][1]+", ");
		System.out.print(m[1][2]);
		System.out.println("]");
		System.out.println();
		
		
		m[0][0]=95; m[0][1]=10; m[0][2]=20;
		m[1][0]=50; m[1][1]=40; m[1][2]=30;
		/**
		 * 5월 27일 과제-1
		 * 중첩된 for문 이용하여 아래 내용 출력
		 * [95,10,20]
		 * [50,40,30]
		 */
		System.out.println("과제1");
		int u=0;
		int[][] s1 = new int [2][3];
		s1[0][0]= 95; s1[0][1]= 10; s1[0][2]= 20;
		s1[1][0]= 50; s1[1][1]= 40; s1[1][2]= 30;
		
		for(i=0;i<s1.length;i++) {
			for(u=0;u<s1.length;u++) {
				
			}
			System.out.println(Arrays.toString(s1[i]));
		}
		System.out.println("========================");
		
		
		
		
		/***2차원 배열 선언하는 방법-2***/
		int[][] e = new int[2][];
		System.out.println(Arrays.toString(e));//[null, null]
		
		e[0] = new int[2];//1반 학생이 2명 [0, 0]
		e[1] = new int[3];//2반 학생이 3명
		//초기화
		try {//예외가 발생할 가능성이 있는 부분
			e[0][0]=63; e[0][1]=32; 
			e[0][2]=42;//예외 객체 생성 -> JVM이 예외객체를 던져서      
			//e[1][0]=24; e[1][1]=62; e[1][2]=73;//샐행되지 않고      			
		} catch (Exception e1) { //잡아서                                  	 	
			e1.printStackTrace(); // 처리
		}finally {//예외 발생 여부에 관계없이 무조선 실행
			e[1][0]=24; e[1][1]=62; e[1][2]=73;
		}
		//e[1][0]=24; e[1][1]=62; e[1][2]=73;
		System.out.println(Arrays.toString(e[0]));
		System.out.println(Arrays.toString(e[1]));
		System.out.println("**과제로 처리**");
		
		/**
		 * 5월 27일 과제-1
		 * 중첩된 for문 이용하여 아래 내용 출력
		 * [63, 32]
		 * [24, 62, 73]
		 */
		
		System.out.println("과제1");
		int[][] s2 = new int [2][];
		s2[0] = new int[] {63, 32}; 
		s2[1] = new int[] {24, 62, 73};
		
		for(i=0;i<s2.length;i++) {
			for(u=0;u<s2.length;u++) {
				
			}
			System.out.println(Arrays.toString(s2[i]));
		}
		System.out.println("========================");
		
		
		
		
		
		
		/***2차원 배열 선언하는 방법-3***/
		int[][] s = new int[2][];
		
		s[0] = new int[] {75, 62};// 초기값 배열
		s[1] = new int[] {12, 32, 80};
		
		/**
		 * 5월 27일 과제-1
		 * 중첩된 for문 이용하여 아래 내용 출력
		 * [78, 62]
		 * [10, 19, 80]
		 */
		System.out.println("과제1");
		int[][] s3 = new int [2][];
		s3[0] = new int[] {78, 62}; 
		s3[1] = new int[] {10, 19, 80};
		
		for(i=0;i<s3.length;i++) {
			for(u=0;u<s3.length;u++) {
				
			}
			System.out.println(Arrays.toString(s3[i]));
		}
		System.out.println("========================");
		//int[][] java2 = {{11, 65},{10, 24, 23, 21},{35, 55, 77} };
		/***2차원 배열 선언하는 방법-3***/
		System.out.println("과제2");
		int[][] java = {
						{11, 65}, //1반 2명
						{10, 24, 23, 21},//2반 4명
						{35, 55, 77} //3반 3명
						};
		int len=0;
		int j=0;
		double avg=0,avg1=0,avg2=0,avg3=0;
		int hap=0,hap1=0,hap2=0,hap3=0;
		for(i=0;i<java.length;i++) {
			for(j=0;j<java[i].length;j++) {
				hap+=java[i][j];
				len++;
				if(i==0) {
					hap1+=java[0][j];
					avg1 =(double)hap1/java[i].length;
				}
				if(i==1) {
					hap2+=java[1][j];
					avg2 = (double)hap2/java[i].length;
				}
				if(i==2) {
					hap3+=java[2][j];
					avg3 = (double)hap3/java[i].length;
				}
			}//for2
			
		}//for1
		System.out.println("*******************************");
		System.out.println("1반 총합은="+hap1+"평균은="+avg1);
		System.out.println("2반 총합은="+hap2+"평균은="+avg2);
		System.out.println("3반 총합은="+hap3+"평균은="+avg3);
		avg=(double)hap/len;
		System.out.println("java총합은="+hap+"평균은="+avg);
		/**
		 * 과제-2 각반의 java 성적의 합과 평군 구하고
		 * 		java 성적의 총 합과 총 평균 구하기
		 */
		
		
		
		
		
		
		
		
		
		
		
		
	}//main 끝

}
