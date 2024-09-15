package Ass_5_mam;

/*
 * 
 *  Build a class Student which contains details about the Student and compile and run its 
instance. 
 * 
 * 
 */



class Student {
    private int studId;	
    private String name;
    private int age;
    private String Institute;

    public Student(int studId, String name, int age,String Institute) {
        this.studId = studId;
        this.name = name;
        this.age = age;	
        this.Institute=Institute;
    }

    public void showDetails() {
        System.out.println("Student ID: " + studId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);	
        System.out.println("Institute: " + Institute);
    }
}



public class StudQue4 {

	public static void main(String[] args) {
	     Student stud = new Student(102, "Mrs.Shraddha Sakhare-Mitkari", 24,"CDAC-MUMBAI");
	        stud.showDetails();
	}

}
