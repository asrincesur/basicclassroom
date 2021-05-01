package odev2;

public class Student extends User{

	int StundID;
	String Class1;
	
	
	
	public Student(int iD, String userName, String userSex, String userPhone, int stundID, String class1) {
		super(iD, userName, userSex, userPhone);
		StundID = stundID;
		Class1 = class1;
	}


	
	

	public int getStundID() {
		return StundID;
	}



	public void setStundID(int stundID) {
		StundID = stundID;
	}



	public String getClass1() {
		return Class1;
	}



	public void setClass1(String class1) {
		Class1 = class1;
	}
	
	

	
	
	
	
	
	
}
