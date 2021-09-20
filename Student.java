package org.college.student;

import org.college.department.Department;

public class Student extends Department {

	public void studentName(String name) {
		System.out.println('\n' + "Student Name is : " + name);
	}

	public void studentDep(String department) {
		System.out.println("Student Department is : " + department);
	}

	public int studentId(int id) {
		System.out.println("Student ID is : " + id);
		return 0;
	}

	public static void main(String[] args) {

		Department d = new Department();
		d.collegeName();
		d.collegeCode();
		d.collegeRank();
		d.deptName();
		d.newDepartment();

		Student s = new Student();
		s.studentName("Ganesh Muthukumaran");
		s.studentDep("Automobile Engineering");
		s.studentId(554477);
		s.studentName("Kabilan Ashok");
		s.studentDep("Mechatronics Engineering");
		s.studentId(22551);
		s.studentName("Janani Sri");
		s.studentDep("AI and Machine Learning Engineering");
		s.studentId(554412);
	}
}
