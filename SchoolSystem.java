package Final;

import java.util.Scanner;

public class SchoolSystem {

	public static void main(String[] args) {
		
		// Create a Person, Student, Faculty, and Course objects
		Person person = new Person("Jenny", "123-45-6789", "456 Main St", "female", 23);

		Student student = getStudentByPrompt();

		Faculty faculty = new Faculty("Mike", "987-65-4321", "34 West street", "male", 49,
			"Professor", "Science", 60000, 3);

		Course course = new Course("Marketing 101", "Business", "MAK1011", faculty);

		// Invoke toString of Person, Student, Faculty and Course
		System.out.println(person.toString());
		System.out.println(student.toString());
		System.out.println(faculty.toString());
		System.out.println(course.toString());
	}

	private static Student getStudentByPrompt(){
		
		//Define Local Variables
		String name, ssn, address, gender, vid, major, classStanding;
		double gpa;
		int age;
		Scanner scanner = new Scanner(System.in);
		
		//Prompt user for Student's Information and retrieve info from user input
		//Get user input string for name
		System.out.println("Enter the Student's Name: ");
		name = scanner.nextLine();	

		//Get user input string for social security
		System.out.println("Enter the Student's Social Security Number: ");
		ssn = scanner.nextLine();
		
		//Get user input string for address
		System.out.println("Enter the Student's Address: ");
		address = scanner.nextLine();	
		
		//Get user input string for gender
		System.out.println("Enter the Student's Gender: ");
		gender = scanner.nextLine();	

		//Get user input string for age
		System.out.println("Enter the Student's Age: ");
		age = scanner.nextInt();	
		scanner.nextLine();  // This is necessary to read new line character, prevents skipping

		//Get user input string for VID
		System.out.println("Enter the Student's Valencia ID: ");
		vid = scanner.nextLine();	

		//Get user input string for Major
		System.out.println("Enter the Student's Major: ");
		major = scanner.nextLine();	

		//Get user input string for Class Standing
		System.out.println("Enter the Student's Class Standing: ");
		classStanding = scanner.nextLine();	

		//Get user input string for GPA
		System.out.println("Enter the Student's GPA: ");
		gpa = scanner.nextDouble();	
		scanner.nextLine();  // This is necessary to read new line character, prevents skipping

		
		//Return Student Object
		return new Student(name, ssn, address, gender, age, vid, major, classStanding, gpa);
	}
}
