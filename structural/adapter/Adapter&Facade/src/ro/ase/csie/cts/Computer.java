package ro.ase.csie.cts;

public final class Computer implements Conectabil {

	@Override
	public boolean connect2Internet(String gatewayIP) {
		System.out.println("Computerul s-a conectat la " + gatewayIP);
		return false;
	}

	@Override
	public void sendSMS(String message, String destination) {
		System.out.println("SMS trimis catre " + destination);
	}

	@Override
	public void getData() {
		System.out.println("Computerul a primit date");
	}

}
