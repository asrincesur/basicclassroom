package odev2;

public class User {

	int ID;
	String UserName;
	String UserSex;
	String UserPhone;
	
	
	public User(int iD, String userName, String userSex, String userPhone) {		
		ID = iD;
		UserName = userName;
		UserSex = userSex;
		UserPhone = userPhone;
	}

	
	public int getID() {
		return ID;
	}


	public void setID(int iD) {
		ID = iD;
	}


	public String getUserName() {
		return UserName;
	}


	public void setUserName(String userName) {
		UserName = userName;
	}


	public String getUserSex() {
		return UserSex;
	}


	public void setUserSex(String userSex) {
		UserSex = userSex;
	}


	public String getUserPhone() {
		return UserPhone;
	}


	public void setUserPhone(String userPhone) {
		UserPhone = userPhone;
	} 
	
	
	
	
	
}
