package com.huaxia.java1;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

/**
 * log the message to a file.
 * 
 * @author John
 *
 */
public class LoggerExample2 {
	static Logger logger = Logger.getLogger("JWang");// by default, the log message will go to console
	
	static Book createBook(String id, String title, double price){
		Book book = null;
		logger.fine("Creating a Book...");

		try {
			book = new Book(id, title, price);
			logger.info("a book is created successfully: " + book);
		}catch(RuntimeException ex) {
			logger.severe(ex.toString());
		}
		return book;
	}
	
	public static void main(String[] args) {
		FileHandler fh = null;
		try {
			fh = new FileHandler("C:\\Users\\12818\\workspace\\java1\\MyLogFile.log");
			logger.addHandler(fh); // now the message will go to a file
			XMLFormatter formatter = new XMLFormatter();
			fh.setFormatter(formatter);
			fh.setLevel(Level.WARNING);
		}catch(IOException ioex) {
			ioex.printStackTrace();
		}catch(SecurityException securex) {
			securex.printStackTrace();
		}
		Book book = createBook("12345","Introduction of Java", 12.99);
		System.out.println(book);
		try {
			book = createBook("12345","Introduction of Pytho", (Double) null);
			System.out.println(book);
		}catch(NullPointerException npex) {
			logger.severe(npex.toString());
		}
	}

}

class Book{
	String id;
	String title;
	double price;
	
	// constructor of Book class
	Book(String id, String title, double price){
		this.id = id;
		this.title = title;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + "]";
	}
	
	
}