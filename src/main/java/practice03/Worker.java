package practice03;

import practice03.Person;

public class Worker extends Person{

	public Worker(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	
	public String introduce() {
		return "I am a Worker. I have a job.";
		
	}
}
