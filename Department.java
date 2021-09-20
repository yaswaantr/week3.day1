package org.college.department;

import org.college.College;

public class Department extends College {

	public void deptName() {
		System.out.println("List of Department Available is: " + '\n' + "1. Civil Engineering" + '\n'
				+ "2. Mechanical Engineering" + '\n' + "3. Mechatronics Engineering" + '\n'
				+ "4. Automobile Engineering" + '\n' + "5. Chemical Engineering" + '\n' + "6. Food Technology" + '\n'
				+ "7. Computer Science Engineering" + '\n' + "8. Information Technology Engineering" + '\n'
				+ "9. Electronics and Communicaiton Engineering" + '\n'
				+ "10. Electronics and Instrumentation Engineering" + '\n'
				+ "11. Electrical and Electronics Engineering" + '\n');
	}

	public void newDepartment() {
		System.out.println(
				"New Departments included for this year:" + '\n' + "1. Computer Science and Design Engineering" + '\n'
						+ "2. AI and Machine Learning Engineering" + '\n' + "3. AI and Data Science Engineering");

	}
}
