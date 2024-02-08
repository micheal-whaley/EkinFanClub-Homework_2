package homework_2;

public class Student {
	public Student(int newId, String newName, double newGrade) {
		id = newId;
		Name = newName;
		grade = newGrade;
	}
	public Student() {

	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}
	
	public String toString() {
		return ("Id: "+id+" Name: "+Name+" Grade: "+grade);
	}

	private int id;
	private String Name;
	private double grade;
}
