package method.overloading;

public class Students {

	public int getstudentinfo(int id) {
		System.out.println("Student ID is : " + id + '\n');
		return 0;
	}

	public void getstudentinfo(int id, String name) {
		System.out.println("Student ID is : " + id + '\n');
		System.out.println("Student Name is : " + name + '\n') ;
	}

	public void getstudentinfo(String email, long phonenumer) {
			System.out.println("Student Email is :" + email + '\n');
			System.out.println("Student Phone No  is :" + phonenumer + '\n');
	}

	public static void main(String[] args) {
		Students s = new Students();
		s.getstudentinfo(500);
		s.getstudentinfo(500, "Karthick Raguramam");
		s.getstudentinfo("karthick.raguraman@testleaf.com", 9999999999l);

	}

}
//Method Overloading 
