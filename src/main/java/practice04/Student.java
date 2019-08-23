package practice04;

import practice04.Person;

public class Student extends Person{
	
	private int klass;
	
	private int name;
	
	private int age;
		

	public Student(String name, int age,int klass) {
		super(name, age);
		this.klass = klass;
		// TODO Auto-generated constructor stub
	}
	
	public int getKlass() {
		return this.klass;
	}
	//My name is Tom. I am 21 years old. I am a Student. I am at Class 2.
	public String introduce() {
		return super.introduce()+" I am a Student. I am at Class "+this.klass+".";
		
	}
}
