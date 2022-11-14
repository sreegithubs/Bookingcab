package details;

public class Cab {
	private int id;
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	private String username;
	private String phoneno;
	private String gender;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public String getgender() {
		return gender;
	}
	public void setgender(String gender) {
		this.gender = gender;
	}


	@Override
	public String toString() {
		return "Account [id : " + id +",  username : " + username + ", gender : " + gender +", phoneno: " + phoneno +"]";
	}
	
	

}
