package java8qa;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;


public interface UPIPayment {
	
	//abstract method
	String doPayment(String source,String dest);
	
	//default methods
	default double getScratchCard() {
		System.out.println("this is the default method of a functional interface");
		
		return new Random().nextDouble();
	}
	
	//static methods
	
	static String datePatterns(String patterns) {
		SimpleDateFormat dateFormat=new SimpleDateFormat(patterns);
		
		return dateFormat.format(new Date());
	}

}
