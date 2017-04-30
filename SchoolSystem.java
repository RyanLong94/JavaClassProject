package Final;

import java.util.Scanner;

public class SchoolSystem {

	public static void main(String[] args) {
		
		// Create a Person, Student, Faculty, and Course objects
		//Person person = new Person("Jenny", "123-45-6789", "456 Main St", "female", 23);

		//Create Student variable
		Student student = getStudentByPrompt();

		//Create Faculty variable
		Faculty faculty = getFacultyByPrompt();

		//Create course
		Course course = new Course("Marketing 101", "Business", "MAK1011", faculty);
		
		//Add student to course
		course.addStudent(student);

		// Invoke toString of Person, Student, Faculty and Course
		//System.out.println(person.toString());
		System.out.println(student.toString());
		System.out.println(faculty.toString());
		System.out.println(course.toString());
	}

	private static Student getStudentByPrompt(){
		
		//Define Local Variables
		String vid, major, classStanding;
		double gpa;
		Person person = getPersonByPrompt();
		Scanner scanner = new Scanner(System.in);
		
		//Prompt user for Student's Information and retrieve info from user input
		
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
		return new Student(person, vid, major, classStanding, gpa);
	}

	private static Faculty getFacultyByPrompt(){
		
		//Define Local Variables
		String jobTitle, department;
		int numberOfClasses;
		double salary;
		Person person = getPersonByPrompt();
		Scanner scanner = new Scanner(System.in);
		
		//Prompt user for Student's Information and retrieve info from user input
		
		//Get user input string for Job Title
		System.out.println("Enter the Faculty's Job Title: ");
		jobTitle = scanner.nextLine();	

		//Get user input string for Major
		System.out.println("Enter the Faculty's Department: ");
		department = scanner.nextLine();	

		//Get user input string for Class Standing
		System.out.println("Enter the Faculty's Salary: ");
		salary = scanner.nextDouble();	
		scanner.nextLine();  // This is necessary to read new line character, prevents skipping

		//Get user input string for Number of Classes being taught
		System.out.println("Enter the Faculty's Number of Classes being Taught: ");
		numberOfClasses = scanner.nextInt();	
		scanner.nextLine();  // This is necessary to read new line character, prevents skipping

		//Return Student Object
		return new Faculty(person, jobTitle, department, salary, numberOfClasses);
	}

	private static Person getPersonByPrompt(){
		
		//Define Local Variables
		String name, ssn, address, gender;
		int age;
		Scanner scanner = new Scanner(System.in);
		
		//Prompt user for Person's Information and retrieve info from user input
		//Get user input string for name
		System.out.println("Enter the Person's Name: ");
		name = scanner.nextLine();	

		//Get user input string for social security
		System.out.println("Enter the Person's Social Security Number: ");
		ssn = scanner.nextLine();
		
		//Get user input string for address
		System.out.println("Enter the Person's Address: ");
		address = scanner.nextLine();	
		
		//Get user input string for gender
		System.out.println("Enter the Person's Gender: ");
		gender = scanner.nextLine();	

		//Get user input string for age
		System.out.println("Enter the Person's Age: ");
		age = scanner.nextInt();	
		scanner.nextLine();  // This is necessary to read new line character, prevents skipping

		//Return Person Object
		return new Person(name, ssn, address, gender, age);
	}

}
