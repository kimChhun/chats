package chat.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ChatSessionManagerIF extends Remote{
	String chatSessionRequest() throws RemoteException;
    String chatSessionAccept() throws RemoteException;
    String chatSessionDecline() throws RemoteException;
    String chatSessionSendMessage() throws RemoteException;
    String chatSessionQuit() throws RemoteException;
}
