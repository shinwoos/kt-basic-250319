package exam5;

class Person {
	String name;

	// 생성자
	public Person(String name) {
		this.name = name;
	}

	public void greet() {
		System.out.println("Hello, my name is " + name);
	}
}

public class Exam5 {
	public static void main(String[] args) {
		Person person = new Person("Alice");
		person.greet();
	}
}
