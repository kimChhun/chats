package chat.server;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface MemberListManagerIF extends Remote{
	void add (String name, String clientIP) throws RemoteException;
	void remove(int id) throws RemoteException;
	ArrayList<Member> getList() throws RemoteException;
	void broadcast()throws RemoteException ;

}
