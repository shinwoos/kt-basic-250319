package exam11;

public class Exam11 {
	public static void main(String[] args) {
		System.out.println(StringUtils.greet("Alice"));
	}
}

class StringUtils {
	public static String greet(String name) {
		return "Hello, " + name + "!";
	}
}
