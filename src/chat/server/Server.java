package chat.server;

import java.rmi.RemoteException;

public class Server {

	public static void main(String[] args) throws RemoteException {
		ConnexionManagerIF connList = new ConnexionManager(); // liste des logins
		connList.connexionStart("ClientIP_1");
		connList.connexionStart("ClientIP_2");
		connList.connexionStart("ClientIP_3");
		int i=1;
		while (i<connList.getList().size()){
			System.out.println(connList.getList().get(i++).getClientIP());
		}
	}

}
