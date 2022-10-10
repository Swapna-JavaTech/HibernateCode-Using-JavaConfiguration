package com.hexaware.hibernatewithjavaconfiguration.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;


import com.hexaware.hibernatewithjavaconfiguration.entity.Book;
import com.hexaware.hibernatewithjavaconfiguration.util.HibernateUtil;

public class BookDao {
	
	public void saveBook(Book book) {
		Transaction transaction = null;
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			//start transaction
			transaction = session.beginTransaction();
			//save the book objects
			session.save(book);
			//commit the transaction
			transaction.commit();
		}catch (Exception e) {
			e.printStackTrace();
			if(transaction!=null) {
				transaction.rollback();
			}
	     }//catch
	}//method
	
	
	public List<Book> getAllBooks(){
		Transaction transaction = null;
		List<Book> listOfBooks = null;
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			//start transaction
			transaction = session.beginTransaction();
			listOfBooks= session.createQuery("from Book",Book.class).list();
		}catch (Exception e) {
			e.printStackTrace();
			if(transaction!=null) {
				transaction.rollback();
			}
		}
		return listOfBooks;
		
	}
}//class
