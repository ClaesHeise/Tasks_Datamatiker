package assignmentClasses;

public class Student {
	public String name;
	public int age;
	public boolean isFemale;
	public char datamatikerTeam;
	
	public	Student(String tmpName, int tmpAge, boolean tmpIsFemale, char tmpDatamatikerTeam) {
		this.name = tmpName;
		this.age = tmpAge;
		this.isFemale = tmpIsFemale;
		this.datamatikerTeam = tmpDatamatikerTeam;
	}
}