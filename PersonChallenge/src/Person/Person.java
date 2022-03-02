package Person;

public class Person {

	private String name;
	private int age;
	private String JobTitle;
	
public Person() {}
	
	public Person(String name, int age, String JobTitle) {
		this.name = name;
		this.age = age;
		this.JobTitle = JobTitle;
		
		
}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJobTitle() {
		return JobTitle;
	}

	public void setJobTitle(String jobTitle) {
		JobTitle = jobTitle;
	}
	
	@Override
	public String toString(){
	    return "The name of the person is " + this.name + ", the age of the person is " 
	+ this.age + "the Job title of the person is " +this.JobTitle;
	
	}
}
