package exam10;

import java.util.Objects;

public class Exam10 {
	private String name;
	private int age;

	public Exam10(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Exam10 person = (Exam10)o;
		return age == person.age && Objects.equals(name, person.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, age);
	}

	@Override
	public String toString() {
		return "Exam10{name='" + name + "', age=" + age + "}";
	}
}
