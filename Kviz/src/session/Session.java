package session;

public class Session {
	
	public String username;
	
	private static Session instance;
	
	private Session() {}
	
	public static Session getInstance() {
		if(instance == null) 
			instance = new Session();
		
		return instance;
	}
}
