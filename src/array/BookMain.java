package array;
//같은패키지에 있는 클래스는 자동 import됨
public class BookMain {
	//기본생성자
	public static void main(String[] args) {
		System.out.println("책가격="+Book.PRICEBOOK);
		System.out.println("책가격="+Book.getPricebook());
		
		Book b1 = new Book("뽀로로", "유신재", 11);
		Book b2 = new Book("아기상어", "전용준", 22);
		
		
	}

}
