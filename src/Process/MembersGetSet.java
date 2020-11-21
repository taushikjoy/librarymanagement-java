package Process;

public class MembersGetSet {

	private String type;
	private String id;
	private String password;
	
	public MembersGetSet(String type, String id, String password) {
		
		this.type = type;
		this.id = id;
		this.password = password;
	}
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String toString(){
		return type +" , "+ id +" , "+ password;
	}
	
	
	
	
	
}
