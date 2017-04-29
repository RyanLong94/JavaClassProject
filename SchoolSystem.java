package Final;

import java.util.Scanner;

public class SchoolSystem {

	
	public static void main(String[] args) {
		
		// Create a Person, Student, Faculty, and Course objects
		Person person = new Person("Jenny", "123-45-6789", "456 Main St", "female", 23);

		Student student = new Student("Mary", "123-45-6789", "123 Main St", 
			"female", 22, "V123456789", "Business", "Junior", 3.4);

		Faculty faculty = new Faculty("Mike", "987-65-4321", "34 West street", "male", 49,
			"Professor", "Science", 60000, 3);

		Course course = new Course("Marketing 101", "Business", "MAK1011", faculty);

		// Invoke toString of Person, Student, Faculty and Course
		System.out.println(person.toString());
		System.out.println(student.toString());
		System.out.println(faculty.toString());
		System.out.println(course.toString());
	}
}
