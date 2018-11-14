package com.designpattern.behavioral.chainofresponsibility;

public class ChainOfResponsibility {


	public static AbstractLogger getChainOfLoggers() {

		  AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);

	      AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
	      AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

	      errorLogger.setNextLogger(fileLogger);
	      fileLogger.setNextLogger(consoleLogger);
		
		return errorLogger;
	}

}
