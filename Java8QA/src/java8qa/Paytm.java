package java8qa;

public class Paytm implements UPIPayment {

	@Override
	public String doPayment(String source, String dest) {
		String txDate=UPIPayment.datePatterns("yyyy-MM-dd");
		
		return null;
	}


}
