package Execute;

import java.util.ArrayList;

public class Person {
	
	String name;
	ArrayList<Person> follows;
	
	public Person(String name) {
		
		this.name = name;
		follows = new ArrayList<Person>();
	}
	
	public String getName() {
		return name;
	}
	
	public ArrayList<Person> getFollower() {
		return follows;
	}
	
	public void setFollower(Person person) {
		follows.add(person);
	}
	public String followersString() {
		
		StringBuilder sb = new StringBuilder();
		for (Person person : this.follows)
		{
			sb.append(person.getName());
		    sb.append("\t");
		}

		return sb.toString();
	}
	
}
