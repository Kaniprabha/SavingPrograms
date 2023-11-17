package week1day1;

public class Student {
	public void abtstudent() {
		String name = "Ragul";
		int rollno = 22142137;
		String college = "VELS-Chennai";
		float markscored = 97.5f;
		float cgpa = 97.5f;
		System.out.println("Student Name: "+ name);
		System.out.println("Roll-No: "+ rollno);
		System.out.println("College Name: "+ college);
		System.out.println("Mark Scored: "+ markscored);
		System.out.println("Cgpa: "+ cgpa);
		
	}

	public static void main(String[] args) {
		Student obj = new Student();
		obj.abtstudent();

	}
}
