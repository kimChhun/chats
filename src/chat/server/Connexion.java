package chat.server;

import java.rmi.RemoteException;

public class Connexion {
	String clientIP;
	protected Connexion(String name) {
		this.clientIP=name;
	}
	
	public String getClientIP() {
		return clientIP;
	}
	
	
	
}
