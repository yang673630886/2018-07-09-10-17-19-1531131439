package practice04;

import practice04.Person;

public class Worker extends Person{

	public Worker(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	
	public String introduce() {
		return super.introduce()+" I am a Worker. I have a job.";
		
	}
}
