class Book
{
	int price;
	String title;
	
	Book(String t, int p)
	{
		title = t;
		price = p;
	}
	
	//복제생성자
	Book(Book copy)
	{
		title = copy.title;
		price = copy.price;
	}
	
	void print()
	{
		System.out.println("제   목 : " + title);
		System.out.println("가   격 : " + price);
	}
	
}

//-------------------------------------------------------

public class Mybook
{
	public static void main(String[] args)
	{
		Book book1 = new Book("자바 프로그래밍", 10000);
		book1.print();
		
		//복제 생성자 이용
		Book book2 = new Book(book1);
		book2.print();
	}
}
