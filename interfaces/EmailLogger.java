package video4.ders.interfaces;

public class EmailLogger implements Logger {

	@Override
	public void log(String message) {
		System.out.println("EMail logged : " + message);

	}

}
