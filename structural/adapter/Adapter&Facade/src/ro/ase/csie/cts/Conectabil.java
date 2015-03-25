package ro.ase.csie.cts;

public interface Conectabil {
	public boolean connect2Internet(String gatewayIP);

	public void sendSMS(String message, String destination);

	public void getData();
}
