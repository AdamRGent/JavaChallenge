package PersonRunner;

import java.util.ArrayList;
import java.util.stream.Collectors;

import Person.Person;

public class PersonRunner {

	public static void main(String[] args) {
		
	Person personOne = new Person ("Adam", 31, "Gym Coach");
	Person personTwo = new Person ("Becky", 28, "Piano Teacher");

	//System.out.println(personOne);
	
    ArrayList<Person> PeopleList = new ArrayList<Person>();
    PeopleList.add(personOne);
    PeopleList.add(personTwo);
    
    PeopleList.stream()
	//.filter ( Person -> Person.getName()== "Becky")
    .collect(Collectors.toList())
    .forEach(x -> System.out.println(x));
	}
}
