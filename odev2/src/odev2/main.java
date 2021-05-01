package odev2;

public class main {

	public static void main(String[] args) {
	
		Student ahmet = new Student(14, "ahmet", "f", "asdaasdasd", 15,"13");
		Instructor memet = new Instructor(17, "memt", "f", "asdaasdasd", 15,"16");
		

		UserManager userManager = new UserManager();
		userManager.add(new StudentManager(),ahmet);
		userManager.add(new InstructorManager(),memet);
		
	}

}
