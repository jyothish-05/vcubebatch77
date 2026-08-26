package vcubeprojects;

public class StudentDetails {
	Integer studentid;
	String studentName;
	Character gender;
	String BranchName;
	String clgName;
	
	void display() {
		System.out.println("StudentId: "+studentid);
		System.out.println("StudentName: "+studentName);
		System.out.println("Gender: "+gender);
		System.out.println("BranchName: "+BranchName);
		System.out.println("clgName: "+clgName);
		System.out.println();
	}

	public static void main(String[] args) {
		StudentDetails s1 = new StudentDetails();
		s1.studentid = 1169;
		s1.studentName = "JPR";
		s1.gender = 'M';
		s1.BranchName = "AI&DS";
		s1.clgName = "DSU";
		
		StudentDetails s2 = new StudentDetails();
		s2.studentid = 1080;
		s2.studentName = "JC";
		s2.gender = 'M';
		s2.BranchName = "AI&DS";
		s2.clgName = "DSU";
		
		s1.display();
		s2.display();
		
		

	}

}
