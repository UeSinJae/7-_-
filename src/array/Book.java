package array;
//라이브러리용 : main()없는 클래스

/*
 * class앞에 public 있으면 어디서든지 import할 수 있다.
 * 				     없으면 같은 패키지에서만 import할 수 있다.
 * [멤버변수, 메서드]
 * static 있는 것 : Book 클래스가 메모리에 로딩될 때 초기화되어 올라감
 * 				  멤버변수는 초기화를 안하면 기본값이 저장된다
 * 				  그러나, final : 반드시 최초의 1번은 초기화시켜줘야 함
 * 
 * 			  	클래스이름으로 접근가능(권장)
 * 				객체주소로도 접근가능(경고)
 * 
 * 
 * static 없는 것 : 생성자를 통해 객체 생성되면 객체 안에 존재
 * 			          반드시 객체의 주소로만 접근가능
 */

public class Book {
		//1.멤버변수 = 필드 : 속성
		//final : 반드시 최초의 1번은 초기화시켜 주고 -> 값 변경 불가
		static final int PRICEBOOK=10000;//static멤버변수 : Book 클래스가 메모리에 로딩할 때 초기화되어 올라감
		String bookName;
		String author;
		//final int bacode = 1234;//모든 책에서 같은 값으로
		final int bacode; //모든책의 바코드 값을 다른 값으로 하고 싶을 때
		
		/*
		 * 2.생성자 반드시 존재
		 * 생성자 역할 : 멤버변수에 값을 주어 객체 생성
		 * 생성자 없으면 컴파일러가 자동으로 기본생성자 삽입
		 * 생성자의 {}안에 super();가 없으면 컴파일러가 자동으로 삽입
		 * 
		 * 기본생성자 public Book(){super();}
		 * 기본생성자는 기본값으로 채워 객체 생성
		 * 기본값 : int(0), double(0.0), char('\0'널문자), boolean(false) 
		 *  	  클래스타입 : String(null)
		 */
		
		public Book(String bookName, String author, int bacode) {
			super();//반드시 생성자의 맨첫줄에.  1.부모(Object) 생성자 호출-> 부모객체 생성
			//this : 자기 자신의 객체 주소(객체 안에만 존재) 
			//this.priceBook = 10000;//0->10000->20000->-10000
			this.bookName = bookName;//2.자식의 멤버변수에 값을 주어 자식객체 생성
			this.author = author;
			//this 사용하는 이유 : 멤버변수와 매개변수를 구분하기 위해
			this.bacode = bacode;
		}

		//3.메서드
		String getBookName() {
			return bookName;
		}


		void setBookName(String bookName) {
			this.bookName = bookName;
		}


		String getAuthor() {
			return author;
		}


		void setAuthor(String author) {
			this.author = author;
		}


		 static int getPricebook() {
			return PRICEBOOK;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}
