package com.huaxia.java1;

import java.util.logging.Logger;

public class LoggerExample1 {

	public static Logger logger = Logger.getLogger(LoggerExample1.class.getName());
	
	public static void main(String[] args) {
		System.out.println("-- main method start ---");
		logger.fine("this is fine message.");
		logger.info("this is info message."); // by default, logger only log message on INFO level
		logger.warning("this is warning message.");
		logger.severe("this is severe message.");

	}

}
