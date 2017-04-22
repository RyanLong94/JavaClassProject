package Final;

public class Person {
	private String ssn;
	private String name;
	private String gender;
	private String phoneNumber;
	private String address;
	private int age;
	
	public static int numPersons;
	
	public Person(){
		numPersons++;
	}
	
	public Person(String name){
		this();
		setName(name);
	}
	
	public Person(String name, int age){
		this(name);
		setAge(age);
		}
	
	public Person(String ssn, String name, int age){
		this(name, age);
		setSsn(ssn);
	}
	
	public int getAge(){
		return age;
	}
	
	public void setAge(int age){
		if(age > 0){
			this.age = age;
		}
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		if (!name.trim().isEmpty()){
			this.name = name;
		}
	}
	
	public int getNumPersons(){
		return numPersons;
	}
	
	public String getSsn(){
		return ssn;
	}
	
	public void setSsn(String ssn){
		if (!ssn.trim().isEmpty()){
			this.ssn = ssn;
		}
	}
	
	public static String status(){
		return "I am a person.";
	}
	
	@Override
	public boolean equals(Object obj){
		boolean result = false;
		if (obj instanceof Person){
			if (getSsn() == ((Person) obj).getSsn()){
				result = true;
			}
		}
		return result;
	}
	
	@Override
	public String toString(){
		return "Person [Name=" + getName() + ", Age=" +getAge() + "]";
	}
}
