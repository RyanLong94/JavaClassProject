package Final;

public class Student extends Person{
	private String vid;
	private String major;
	private String classLevel;
	private Double gpa;
	
	public Student(){
		super();
	}
	
	public Student(String name){
		super(name);
		setClassLevel("Sophomore");
	}
	
	public Student(String name, int age){
		super(name, age);
	}
	
	public Student(String ssn, String name, int age){
		super(ssn, name, age);
	}
	
	public String getVid(){
		return vid;
	}
	
	public void setVid(String vid){
	
}
	
