package video4.ders.interfaces;

public class DatabaseLogger implements Logger {

	@Override
	public void log(String message) {
	System.out.println("Database logged : "+message);

	}

}
