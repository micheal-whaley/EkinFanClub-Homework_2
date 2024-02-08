package homework_2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManager {
	public void studentManagerThing() {
			
		}
	List<Student> students = new ArrayList<Student>();
	public boolean readFromFile(String fileName) throws IOException {
		FileInputStream studentData = new FileInputStream("files/" + fileName);
		Scanner sc = new Scanner(studentData);
		while (sc.hasNext()) {
			Student stew = new Student();
			stew.setId(sc.nextInt());
			stew.setName(sc.next() + " " + sc.next());
			stew.setGrade(sc.nextDouble());
			students.add(stew);
			System.out.println(stew.toString());
		}
		sc.close();
        studentData.close(); 
		return true;
	}
	public void displayStudents() {
		
	}
	public boolean searchStudentById(int id) {
		return true;
	}
	public boolean updateStudentGradeById(int id, double grade) {
		return true;
	}
	
}
