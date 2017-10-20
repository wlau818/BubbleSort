import java.util.*;

public class StudentList {
	
	private Student[] list;
	
	public StudentList() {
		Scanner scnr = new Scanner(System.in);
		int numStudents;
		String last, first;
		int grade;
		double gpa;
		System.out.print("How many students? ");
		numStudents = scnr.nextInt();
		System.out.println();
		list = new Student[numStudents];
		for (int i = 0; i < numStudents; i++) {
			System.out.println();
			System.out.println("STUDENT " + i + "...");
			System.out.print("First Name: ");
			first = scnr.next();
			System.out.print("Last Name: ");
			last = scnr.next();
			System.out.print("Grade Level: ");
			grade = scnr.nextInt();
			System.out.print("GPA: ");
			gpa = scnr.nextDouble();
			list[i] = new Student(first, last, grade, gpa);
		}
		scnr.close();
	}
	
	public String toString() {
		String outString = "";
		for (Student stu : list) {
			outString += stu.toString() + "\n";
		}
		outString += "\n";
		return outString;
	}
	
	public void bubbleSort() {
		// Your implementation here
		// Bubble sort the array called 'list'
		Student one;
		for (int i = list.length - 1; i >= 0; i--) {
			for (int j = 0; j < i; j ++) {
				if (list[j].getLastName().compareTo(list[j+1].getLastName()) > 0) {
					one = new Student(list[j].getFirstName(), list[j].getLastName(), 
							list[j].getGradeLevel(), list[j].getGPA());
					list[j] = new Student(list[j + 1].getFirstName(), list[j + 1].getLastName(), 
							list[j + 1].getGradeLevel(), list[j + 1].getGPA());
					list[j + 1] = new Student(one.getFirstName(), one.getLastName(), 
							one.getGradeLevel(), one.getGPA());
				}
			}
		}
	}

}
