package com.bayamp.team.userdefined.types;

public class Book extends Object {

	// Has a
	private String name; // null is occupies size of 4 bytes
	private String title; // 4 bytes
	private String author; // 4 bytes
	private int numberOfPages; // 4 bytes
	private String publisher; // 4 bytes
	static private int totalBookCount;
	private double price;

	public static int getTotalBookCount() {

		return totalBookCount;
	}

	public Book(String name, String title, String author, int numberOfPages, String publisher) {
		// super(); // call the parent constructor
		//super();
		this.name = name;
		this.title = title;
		this.author = author;
		this.numberOfPages = numberOfPages;
		this.publisher = publisher;
	}

	public String getName() {
		return name;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public String getPublisher() {
		return publisher;
	}

	public Book(String name, String title, String author, int numberOfPages, String publisher, double price) {
		this(name, title, author, numberOfPages, publisher);
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}


	

	@Override
	public String toString() {
		return "Book [name=" + name + ", title=" + title + ", author=" + author + ", numberOfPages=" + numberOfPages
				+ ", publisher=" + publisher + ", price=" + price + "]";
	}
	
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		if (getClass() != obj.getClass())
			return false;
		
		
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (numberOfPages != other.numberOfPages)
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (publisher == null) {
			if (other.publisher != null)
				return false;
		} else if (!publisher.equals(other.publisher))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	

}
