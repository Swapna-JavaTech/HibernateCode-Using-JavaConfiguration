package com.hexaware.hibernatewithjavaconfiguration;

import java.util.List;

import com.hexaware.hibernatewithjavaconfiguration.dao.BookDao;
import com.hexaware.hibernatewithjavaconfiguration.entity.Book;

public class MainHibernateCls {

	public static void main(String[] args) {
		Book bk1 = new Book("Half a girl friend", "Chetan Bhagat", 450);

		BookDao bookDao = new BookDao();
		bookDao.saveBook(bk1);
		
		List<Book> listOfBooks = bookDao.getAllBooks();
		System.out.println("List of books are.....");
		listOfBooks.forEach(b -> System.out.println(b.getBookName()));
	}

}
