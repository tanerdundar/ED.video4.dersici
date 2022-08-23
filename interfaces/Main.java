package video4.ders.interfaces;

public class Main {

	public static void main(String[] args) {
		
		Logger[] logger = {new SmsLogger(),new EmailLogger(), new DatabaseLogger(),new FileLogger()};
	
		CustomerManager customerManager = new CustomerManager(logger);
		
		Customer taner = new Customer(1,"Taner","Dundar");
		
		customerManager.add(taner);

	}

}
