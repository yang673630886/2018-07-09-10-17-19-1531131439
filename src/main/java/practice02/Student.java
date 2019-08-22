package practice02;

public class Student extends Person{
	
	private Integer klass;

	public Student(String name, int age,Integer klass) {
		super(name, age);
		this.klass = klass;
		// TODO Auto-generated constructor stub
	}
	
	public int getKlass() {
		return this.klass;
	}
	
	public String introduce() {
		return "I am a Student. I am at Class "+this.klass+".";
		
	}
}
