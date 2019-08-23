package practice03;

import practice02.Person;

//写一个Person类，要有name，age属性，要有一个introduce方法， introduce方法返回一个字符串形如：
//
//
//My name is Tom. I am 21 years old.
//
//再写一个Student类继承Person类，除了name，age属性，还有要有klass属性。也有一个introduce方法， introduce方法返回一个字符串形如：
//
//
//I am a Student. I am at Class 2.
//
//再写一个Worker类继承Person类，只有name，age属性。也有一个introduce方法， introduce方法返回一个字符串形如：
//
//
//I am a Worker. I have a job.


public class Worker extends Person{

	public Worker(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	
	public String introduce() {
		return "I am a Worker. I have a job.";
		
	}
}
