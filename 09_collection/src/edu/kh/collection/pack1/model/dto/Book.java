package edu.kh.collection.pack1.model.dto;

public class Book {
	private String title;		// 제목
	private String writher; // 저자(글쓴이
	private int price;      // 가격
	
	public Book () {}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWrither() {
		return writher;
	}
	public void setWrither(String writher) {
		this.writher = writher;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Book(String title, String writher, int price) {
		super();
		this.title = title;
		this.writher = writher;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", writher=" + writher + ", price=" + price + "]";
	}

		
	
	
	
}
