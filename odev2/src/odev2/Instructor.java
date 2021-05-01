package odev2;

public class Instructor extends User{

	
	int InstID;
	String Lecture;
	
	
	public Instructor(int iD, String userName, String userSex, String userPhone, int instID, String lecture) {
		super(iD, userName, userSex, userPhone);
		InstID = instID;
		Lecture = lecture;
	}


	public int getInstID() {
		return InstID;
	}


	public void setInstID(int instID) {
		InstID = instID;
	}


	public String getLecture() {
		return Lecture;
	}


	public void setLecture(String lecture) {
		Lecture = lecture;
	}
	
	
	
	
	
}
