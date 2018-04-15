package chat.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;


public class MemberListManager extends UnicastRemoteObject implements MemberListManagerIF{
	private static final long serialVersionUID = 1L;
	private ArrayList<Member> memberList;
	private int id = 0;
	
	protected MemberListManager() throws RemoteException {
		memberList= new ArrayList<Member>();
	}
	
	public void add(String name, String clientIP) throws RemoteException{
		memberList.add(new Member(id,clientIP,name));
	}

	public void remove(int id) throws RemoteException{
		int i=0;
		Member member;
		while (i < memberList.size()) {
			member=memberList.get(i++);
			if(member.getId()==id) {
				memberList.remove(member);
			}
		}
		
	}
	public ArrayList<Member> getList() throws RemoteException{
		return memberList;
	}

	@Override
	public void broadcast() throws RemoteException{
		// TODO Auto-generated method stub
		
	}
	
	

}
