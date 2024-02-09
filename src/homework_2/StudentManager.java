package homework_2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManager {
	List<Student> students = new ArrayList<Student>();
	public boolean readFromFile(String fileName) {
		FileInputStream studentData;
		try {
			studentData = new FileInputStream("files/" + fileName);
			Scanner sc = new Scanner(studentData);
			while (sc.hasNext()) {
				Student stew = new Student();
				stew.setId(sc.nextInt());
				stew.setName(sc.next() + " " + sc.next());
				stew.setGrade(sc.nextDouble());
				students.add(stew);
				System.out.println(stew.toString());
			}
			studentData.close();
			sc.close();
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	public void displayStudents() {
		if(students == null)
    {
        System.out.println("No students to display.");
    }
    else
    {
        System.out.println(Arrays.toString(students));
    }
		
	}
	public boolean searchStudentById(int id) {
		for (Student student: students) {
			if (student.getId()==id) {
				System.out.println(student.toString());
	            return true;
			}
		}
		System.out.println("Student with id" + id + "could not be found. Please ensure the id is correct.");
		return false;
	}
	public boolean updateStudentGradeById(int id, double grade) {
		return true;
	}
	
}
