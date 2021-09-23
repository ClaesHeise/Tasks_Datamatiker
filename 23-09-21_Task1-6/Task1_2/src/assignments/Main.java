package assignments;

public class Main {
	// 1.b
	static void emptyLine() {
		System.out.println("");
	}
	// 1.c
	static void stringPrint(String output) {
		System.out.println(output);
	}
	// 1.d
	static void nameAndAge(String name, int age) {
		System.out.println("My name is " + name+ ", I am " + age + " years old");
	}
	
	// 2.a
	public static boolean happy = true;
	public static boolean iAmHappy() {
		if(happy) {
			return true;
		}
		else {
			return false;
		}
	}
	
	// 2.b
	public static int sum(int a, int b) {
		return a+b;
	}
	
	// 2.c
	public static String bigLetters(String smallString) {
		return smallString.toUpperCase();
	}
	
	// 2.d
	public static boolean isUppercase(String firstLetter) {
		if(Character.isUpperCase(firstLetter.charAt(0))) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		// 1.b
		System.out.println("1.b");
		emptyLine();
		// 1.c
		System.out.println();
		System.out.println("1.c");
		stringPrint("I feel like a frog today");
		// 1.d
		System.out.println();
		System.out.println("1.d");
		nameAndAge("Claes", 23);
		
		// 2.a
		System.out.println();
		System.out.println("2.a");
		if (iAmHappy()) {
			System.out.println("I clap my hands");
		}
		else{
			System.out.println("I don't clap my hands"); 
		}
		// 2.b
		System.out.println();
		System.out.println("2.b");
		System.out.println(sum(5, 32));
		// 2.c
		System.out.println();
		System.out.println("2.c");
		System.out.println(bigLetters("something written with small text, now big?"));
		// 2.d
		System.out.println();
		System.out.println("2.d");
		System.out.println(isUppercase("Hello"));
		System.out.println(isUppercase("hello"));
		
	}

}
