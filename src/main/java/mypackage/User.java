package mypackage;

public class User {
private boolean status;
private String uname;
private String password;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public User() {
		this.status = false;
		this.uname = "name";
		this.password = "password";
		
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(String status) {
		

		this.status = Boolean.parseBoolean(status);
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}