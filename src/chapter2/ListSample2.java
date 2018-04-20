package chapter2;

import java.util.ArrayList;
import java.util.List;

public class ListSample2 {
	public static void main(String[] args) {

		List<Book> list = new ArrayList<Book>();
		Book book1 = new Book("Java Basic",1000);
		list.add(book1);

		for(Book b : list)
		System.out.println(b.getTitle() + b.getPrice());
	}
}


class Book {
	String title;
	int price;

	Book(String title,int price){
		this.title = title;
		this.price = price;
	}

	// setter/getter
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}


}