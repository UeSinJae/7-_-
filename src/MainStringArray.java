import java.util.Scanner;

public class MainStringArray {
	//1.멤버변수	
	
	//2.기본생성자- 생성자 반드시 존재
	
	//3.메서드

	// JVM이 main()을 호출할 때 length가 0인 String[]배열객체 생성하여 호출
	public static void main(String[] args) {

		if (args.length != 4) {// 0 != 4
			System.out.println("실행할 때 4개의 숫자를 입력해주세요.(정수2개, 실수2개)");
			return;// 해당 메서드(mian) 종료 -> 프로그램의 종료
			// System.exit(0);//프로그램 강제 종료
		}
		
		String s1=args[0];//문자열 "10" "'1''0'+ 메서드들"
		String s2=args[1];//문자열 "20" 
		String s3=args[2];//문자열 "1.23"
		String s4=args[3];//문자열 "2.3"
		
		//int i1 = Integer.parseInt(s1);//"20"->20
		int i1 = Integer.parseInt(args[0]);//"20"->20
		int i2 = Integer.parseInt(s2);//"20"->20
		
		double d3 = Double.parseDouble(s3);//"1.23" ->1.23
		double d4 = Double.parseDouble(s4);//"2.3" ->2.3
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1.연산자 입력(+-*/)");
		String opr = sc.next();
		
		switch(opr) {
		case "+":add(i1,i2);break;
		case "-":sub(i1,i2);break;
		case "*":multi(i1,i2);break;
		case "/":div(i1,i2);break;
		default :System.out.println("잘못된 연산자입니다.");
		}
		
		System.out.println("2.연산자 입력(+-*/)");
		String opr1 = sc.next();
		
		switch(opr) {
		case "+":System.out.println(d3+"+"+d4+"="+add(d3,d4));break;
		case "-":System.out.println(d3+"-"+d4+"="+sub(d3,d4));break;
		case "*":System.out.println(d3+"*"+d4+"="+multi(d3,d4));break;
		case "/":System.out.println(d3+"/"+d4+"="+div(d3,d4));break;
		default :System.out.println("잘못된 연산자입니다.");
		}
		
		/*
		System.out.print("10+20=");// 돌려받는 값이 없으면 호출한 측
		add(10, 20);// 반환되는 값으로 더이상 실행하지 않을 때

		//MainStringArray msa = new MainStringArray();
		double result = add(1.23, 2.3);
		System.out.println("1.23+2.3=" + result);// 3.53
		*/
	}// 프로그램 끝
	static void add(int i1, int i2) {
		System.out.println(i1+"+"+i2+"="+(i1+i2));// 결과가 출력
	}
	static void sub(int i1, int i2) {
		System.out.println(i1+"-"+i2+"="+(i1-i2));// 결과가 출력
	}
	static void multi(int i1, int i2) {
		System.out.println(i1+"*"+i2+"="+(i1*i2));// 결과가 출력
	}
	static void div(int i1, int i2) {
		System.out.println(i1+"/"+i2+"="+((double)i1/i2));// 결과가 출력
	}
	
	

	static double add(double d1, double d2) { 
		return d1 + d2;
	}
	static double sub(double d1, double d2) { 
		return d1 - d2;
	}
	static double multi(double d1, double d2) {
		return d1 + d2;
	}
	static double div(double d1, double d2) {
		return d1 + d2;
	}
	
	

}
