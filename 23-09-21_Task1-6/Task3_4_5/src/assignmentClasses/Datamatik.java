package assignmentClasses;
import java.util.ArrayList;
import java.util.Arrays;

public class Datamatik {
	static Teacher teacher1 = new Teacher("Jesper", 12, false);
	static Student student1 = new Student("Claes", 23, false, 'A');
	static Student student2 = new Student("Niklas", 22, false, 'A');
	
	// 4.a
	public static int arrayLengths = 10;
	public static int[] numberArray = new int[arrayLengths];
	public static String[] wordArray = {"Hello", "my", "name",
			"is", "claes", "and", "this", "is", "10", "words"};
	public static boolean[] isArray = new boolean[arrayLengths];
	
	// 4.b
	public static void printStrings(String[] stringArray) {
		for(int i = 0; i < stringArray.length; i++) {
			System.out.print(stringArray[i]+" ");
		}
	}
	
	// 4.c
	public static int sumNumbers(int[] intArray){
		int sum = 0;
		for(int i = 0; i < intArray.length; i++) {
			sum += intArray[i];
		}
		return sum;
	}
	
	// 4.d
	public static float averageNumber(int[] intArray){
		int average = 0;
		for(int i = 0; i < intArray.length; i++) {
			average += intArray[i];
		}
		return (float) average/intArray.length;
	}
	
	// 4.e
	public static int[] sortedArray(int[] intArray) {
		Arrays.sort(intArray);
		return intArray;
	}
	
	// 5.a
	static Student[] students = {new Student("Claes", 23, false, 'A'), new Student("John", 39, false, 'A'),
			new Student("Elsebeth", 20, true, 'B'), new Student("Poul", 25, false, 'B'), new Student("Louise", 27, true, 'A'),
			new Student("Tine", 15, true, 'A'), new Student("Hedvig", 24, false, 'B'), new Student("Katrine", 22, true, 'A'),
			new Student("Troels", 32, false, 'B'), new Student("Claes", 5, false, 'A')};
	
	// 5.b
	public static String[] studentArray(Student[] studentNames, int index) {
		/* There can't be a higher index, than students - this makes it so, if the
		 * index is bigger than the amount of students, the index will just be set equal
		 * to the amount of students */
		if(index > studentNames.length) {
			index = studentNames.length;
		}
		String[] studentNameList = new String[index];
		for(int i = 0; i < index; i++) {
			studentNameList[i] = "Student "+(i+1)+": "+studentNames[i].name;
		}
		return studentNameList;
	}
	
	// 5.c
	public static String studentIndex(Student[] studentNames, String name) {
		/* Made a list, so if more people is called the same name, it won't just
		 return one name and index, but all names*/
		ArrayList<String> studentNameList = new ArrayList<String>();
		String output = "";
		for(int i = 0; i < studentNames.length; i++) {
			if(studentNames[i].name == name) {
				studentNameList.add("Student "+(i+1)+": "+name);
			}
		}
		if(studentNameList.isEmpty()) {
			output = "No students with this name, was found";
		}
		else {
			for(int j = 0; j < (studentNameList.size()-1); j++) {
				output += studentNameList.get(j)+", ";
			}
			output += studentNameList.get(studentNameList.size()-1);
		}
		return output;
	}
	// Main
	public static void main(String[] args) {
		System.out.println("3.k");
		System.out.println(teacher1.name);
		System.out.println();
		System.out.println("3.l");
		System.out.println("Name student 1: "+student1.name+" team: "+student1.datamatikerTeam+", Name student 2: "+student2.name+" team: "+student2.datamatikerTeam);
		
		for(int i = 0; i < numberArray.length; i++) {
			numberArray[i] = (int) Math.floor(Math.random() * 10);
		}
		
		System.out.println();
		System.out.println("Task 4");
		System.out.print("Array of ints: ");
		for(int i = 0; i < numberArray.length; i++) {
			System.out.print(numberArray[i]+" ");
		}
		
		// 4.b
		System.out.println();
		System.out.println();
		System.out.println("4.b");
		printStrings(wordArray);
		
		// 4.c
		System.out.println();
		System.out.println();
		System.out.println("4.c");
		System.out.println("Sum of the array is: "+sumNumbers(numberArray));
		
		// 4.d
		System.out.println();
		System.out.println("4.d");
		System.out.println("The average number of the array is: "+averageNumber(numberArray));
		
		// 4.e
		System.out.println();
		System.out.println("4.e");
		sortedArray(numberArray);
		System.out.print("Sorted array: ");
		for(int i = 0; i < numberArray.length; i++) {
			System.out.print(numberArray[i]+" ");
		}
		
		// 5.b
		System.out.println();
		System.out.println();
		System.out.println("5.b");
		for(int i = 0; i < students.length-1; i++) {
			System.out.print(studentArray(students, 15)[i]+", ");
		}
		System.out.print(studentArray(students, 15)[students.length-1]);
		
		// 5.c
		System.out.println();
		System.out.println();
		System.out.println("5.c");
		System.out.println(studentIndex(students, "Claes"));
		System.out.println(studentIndex(students, "Hjort"));
		System.out.println(studentIndex(students, "Troels"));
		System.out.println(studentIndex(students, "Lily"));
		System.out.println(studentIndex(students, "Katrine"));
		
	}

}