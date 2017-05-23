package com.itheima;

public class Book {
	private String bookNumber;
	private String bookName;
	private String author;
	private String press;
	private double price;
	private String publicationDate;

	/**
	 * 将bookNumber模拟为国际标准书号，当且仅当bookNumber相同时，视为同一本书
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (bookNumber == null) {
			if (other.bookNumber != null)
				return false;
		} else if (!bookNumber.equals(other.bookNumber))
			return false;
		return true;
	}

	/****** get set ********/
	public String getBookNumber() {
		return bookNumber;
	}

	public void setBookNumber(String bookNumber) {
		this.bookNumber = bookNumber;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPress() {
		return press;
	}

	public void setPress(String press) {
		this.press = press;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(String publicationDate) {
		this.publicationDate = publicationDate;
	}

}
