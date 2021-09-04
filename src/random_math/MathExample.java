package random_math;

public class MathExample {

	public static void main(String[] args) {
		//절대값
		int v1 = Math.abs(-5);// |-5|= 5
		double v2 = Math.abs(-3.14);// |-5|= 5
		System.out.println("v1="+v1);
		System.out.println("v2="+v2);
		
		//보다 큰 정수를 double형으로
		System.out.println(Math.ceil(5.3));//6.0
		System.out.println(Math.ceil(-5.3));//-5.0

		//보다 작은 정수를 double형으로
		System.out.println(Math.floor(5.3));//5.0
		System.out.println(Math.floor(-5.3));//-6.0
		
		//가까운 정수의 실수값
		System.out.println(Math.rint(5.3));//5.0
		System.out.println(Math.rint(5.7));//6.0
		
		//반올림
		System.out.println(Math.round(5.3));//5
		System.out.println(Math.round(5.7));//6
		
		//최대값
		System.out.println(Math.max(5, 9));//
		System.out.println(Math.max(5.3, 2.9));//

		//최소값
		System.out.println(Math.min(5, 9));//
		System.out.println(Math.min(5.3, 2.9));//

		//난수생성    0.0 <= Math.random() < 1.0
		System.out.println(Math.random());//

		//88~110 난수생성   0.0 <= Math.random() < 1.0
		System.out.println((int)(Math.random()*(110-88+1))+88);//
		
		
		
		
		
	}//main 끝

}
