package ua.com.qalight.exceptions;

import java.util.logging.Logger;

public class AppRunner {
	
	private static Logger logger = Logger.getLogger(AppRunner.class.getName());

	public static void main(String[] args) {
		int num = 1234;
		int div = 0;
		
		Integer result = getDivResult(num,div);
		logger.info("Resalt of division " + result);
		
		logger.info("The and!");
		
	}

	private static Integer getDivResult(int num, int div) {

		try {
			return num/div;
		} catch (Exception e) {
		
			logger.severe("Very very wrong code!!!");
		}
		
		return null;
	}
	

}
