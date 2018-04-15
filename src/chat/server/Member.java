package chat.server;

public class Member {
	private int id;
	private Connexion login;
	private String namechat;
	
	public Member(int id, String IP, String namechat) {
		this.id = id;
		this.login = new Connexion(IP);
		this.namechat = namechat;
	}
	
	public int getId() {
		return id;
	}
}
