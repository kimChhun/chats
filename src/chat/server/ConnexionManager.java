package chat.server;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;


public class ConnexionManager extends UnicastRemoteObject implements ConnexionManagerIF{
	private static final long serialVersionUID = 1L;
	private ArrayList<Connexion> connexionList;
	
	protected ConnexionManager() throws RemoteException {
		connexionList = new ArrayList<Connexion>();
	}

	@Override
	public String connexionStart(String ClientIP) throws RemoteException {
		this.connexionList.add(new Connexion(ClientIP));
		return null;
	}

	@Override
	public String connexionStop(String ClientIP) throws RemoteException {
		int i=0;
		Connexion conn;
		while (i < connexionList.size()) {
			conn=connexionList.get(i++);
			if(conn.getClientIP()==ClientIP) {
				connexionList.remove(conn);
			}
		}
		return null;
	}

	public ArrayList<Connexion> getList(){
		return connexionList;
	}
}
