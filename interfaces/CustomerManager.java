package video4.ders.interfaces;

public class CustomerManager {
	
	private Logger[] loggers;     											// INEED THIS BCS I COUPLED THIS CLASS (Logger)
	
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}
	
	public void add(Customer customer) {
		System.out.println("Customer added: " + customer.getFirstName());
//		DatabaseLogger logger = new DatabaseLogger();					WRONG CODE  BCS IT IS TIGHTLY COUPLED
//		logger.log(customer.getFirstName()+" logged to database.");		WRONG CODE	BCS IT IS TIGHTLY COUPLED

//		Utils util = new Utils();										WE DONT NEED "NEW" BCS UTIL CLASS IS STATIC
//		util.runLogger(loggers, customer.getFirstName());				WE DONT NEED "NEW" BCS UTIL CLASS IS STATIC
		
		Utils.runLogger(loggers, customer.getFirstName());
		}
	
	public void delete(Customer customer) {
		System.out.println("Customer deleted: " + customer.getFirstName());
//		DatabaseLogger logger = new DatabaseLogger();					WRONG CODE  BCS IT IS TIGHTLY COUPLED
//		logger.log(customer.getFirstName()+" logged to database.");		WRONG CODE	BCS IT IS TIGHTLY COUPLED

//		Utils util = new Utils();										WE DONT NEED "NEW" BCS UTIL CLASS IS STATIC
//		util.runLogger(loggers, customer.getFirstName());				WE DONT NEED "NEW" BCS UTIL CLASS IS STATIC

		Utils.runLogger(loggers, customer.getFirstName());
		
	}

}
