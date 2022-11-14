package details;

public class cabdetails {
	private int id;
	private String username;
	private String phoneno;
	private String gender;
	

	public cabdetails(int id,String username, String phoneno, String gender) {
		super();
	    this.id = id;
		this.username = username;
		this.phoneno = phoneno;
		this.gender = gender;
		
	}
	
	public cabdetails() {
		
	}
	public int getid() {
		return id;
	}


	public void setid(int id) {
		this.id = id;
	}


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
		return "AccDetails [ id: "+ id +",username : " + username + ", phoneno : " + phoneno +",gender :"+ gender +"]";
}

	

}
