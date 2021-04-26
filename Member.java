package main;

public class Member {
	
	int id, age;
	String name;
	
	public Member() {
		System.out.println("Üye olusturuldu");
	}
	public Member(int id, String name, int age) {
		this();
		this.id = id;
		this.age = age;
		this.name = name;
	}

}
