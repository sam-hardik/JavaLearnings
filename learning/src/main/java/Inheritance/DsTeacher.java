package Inheritance;

public class DsTeacher extends Teacher{
	String mainSubject = "Data Structure";
	   public static void main(String args[]){
		DsTeacher obj = new DsTeacher();
		System.out.println(obj.collegeName);
		System.out.println(obj.designation);
		System.out.println(obj.mainSubject);
		obj.does();
	   }
}
