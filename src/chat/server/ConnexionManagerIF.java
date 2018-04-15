package chat.server;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface ConnexionManagerIF extends Remote{
	ArrayList<Connexion> getList();
	String connexionStart(String ClientIP) throws RemoteException;
    String connexionStop(String ClientIP) throws RemoteException;
}
