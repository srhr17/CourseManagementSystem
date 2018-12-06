package GEMS;
import java.util.*;

public class GEMS_Member {
	
	int y1 = 0;
	int y2 = 0;
	int y3 = 0;
	int y4 = 0;	
	
	Scanner input = new Scanner(System.in);

	int reg_no;
	int noOfCourses = 0;
	String name;
	GEMS_DOB dob = new GEMS_DOB();
	String gender;
	String mobile;
	String email;
	String country;
	String type;
	String password;
	int [][] courseDate = new int [5][3];
	int [] courseList = new int [4];
	int [] course1 = new int [20];
	int [] course2 = new int [20];
	int [] course3 = new int [20];
	int [] course4 = new int [20];

	
	void getDetails() {
		System.out.println("\nTo register enter the following details:");
		System.out.println("\nName:");
		name = input.next();
		System.out.println("Date of birth:");
		dob.date = input.nextInt();
		dob.month = input.nextInt();
		dob.year = input.nextInt();
		System.out.println("Gender [M/F]:"); 
		gender = input.next();
		System.out.println("Mobile:");
		mobile = input.next();
		System.out.println("Country [In India(I)/ Off India(O)]:");
		country = input.next();
		
	}
	
	void setPassword() {
		System.out.println("Set Password: ");
		password = input.next();
	}
	
	
	void printDetails() {
		System.out.println("\nDetails:");
		System.out.println("\nName: "+name);
		System.out.println("Reg.No: "+ reg_no);
		System.out.println("Date of birth: " + dob.date + "." +dob.month + "." +dob.year);
		System.out.println("Gender [M/F]: " + gender);
		System.out.println("Mobile: " +mobile);
		System.out.println("Country [In India(I)/ Off India(O)]: " +country);
		if(type == "1") {
			System.out.println("Type: Student");
		}
		else if (type == "2"){
			System.out.println("Type: Tutor");
		}	
	}
	
	void addtoCourseArray (int course_no, int index) {
		courseList[index] = course_no;	
	}
	
	void addArray (int reg_no, int course_no) {
		
		if (course_no == 1) {
			course1[y1++] = reg_no;
		}
		
		if (course_no == 2) {
			course2[y2++] = reg_no;
		}
		
		if (course_no == 3) {
			course3[y3++] = reg_no;
		}

		if (course_no == 4) {
			course4[y4++] = reg_no;
		}
	
	}
	
	void printArray(int course_no) {
		if (course_no == 1) {
			for(int i = 0; i<y1; i++) {
				System.out.println(course1[i]);
			}
		}
		
		if (course_no == 2) {
			for(int i = 0; i<y2; i++) {
				System.out.println(course2[i]);
			}
		}
		
		if (course_no == 3) {
			for(int i = 0; i<y3; i++) {
				System.out.println(course3[i]);
			}
		}

		if (course_no == 4) {
			for(int i = 0; i<y4; i++) {
				System.out.println(course4[i]);
			}
		}
	}
	
	void displayHomepage() {
		System.out.println("\n\n1.Select Course\n2.Current Course Details\n3.Payment Details\n4.Member Details\n5.Logout");			
	}
	
	int checkCourselist (GEMS_Student s[], int check, int course_no) {
		
		int i = 0;
		int flag = 0;
		
		for(i= 0; i< 4; i++) {
		
			if( s[check].courseList[i] == course_no) {
				flag = 1;
			}	
		}
		if (flag == 1) {
			return 1;
		}
		else {
		return 0;}
	}
	
	int checkCourselist (GEMS_Tutor t[], int check, int course_no) {
		
		int i = 0;
		int flag = 0;
		
		for(i= 0; i< 4; i++) {
		
			if( t[check].courseList[i] == course_no) {
				flag = 1;
			}	
		}
		if (flag == 1) {
			return 1;
		}
		else {
		return 0;}
	}
		
	
	void displayCourse() {
		System.out.println("\n\nSelect a course:");
		System.out.println("\nCourse 1 - Arts and Humanities");
		System.out.println("Course 2 -  Computer Science");
		System.out.println("Course 3 -  Zoology and Living Beings");
		System.out.println("Course 4 -  Electrical and Electronics");
		
	}
	
	
	void displayCourseTaken(GEMS_Student s[], int check) {
		
		int i = 0;
		
		for(i = 0; i<s[check].noOfCourses; i++) {
			System.out.println("Course "+s[check].courseList[i]);
		}
		
	}
	

	void displayCourseDetails() {
		
		int flag = 0;
		
		while (flag == 0) {
		System.out.println("\nEnter course number to view details: ");
		int n = input.nextInt();
		switch (n) {
		
		case 1 :{
			System.out.println("\nARTS AND HUMANITIES");
			System.out.println(" * History (Egyptian History, World War I, French Revolution, World War II, British Conquer India)");
			System.out.println(" * Music and Arts (Musical History, Music Production, Photography, Graphic Design, Creative Writing, Modern Art)");
			System.out.println(" * Philosphy (Itroduction to Phylosphy, Greek and Roman Mythology, Ancient Philosphers)");
			System.out.println("\nDuration of course: 6 months ");
			flag = 1;
			break;
		}
		
		case 2: {
			System.out.println("\nCOMPUTER SCIENCE");
			System.out.println(" * Data Structures (Stacks, Queues, Linked Lists, Trees, Graphs, Hash Tables)");
			System.out.println(" * Discrete Math (Logic and Propotions, Recurrsion, Recurrence, Sets)");
			System.out.println(" * Computer Networks (Introduction to Networks, Designing using HTML, Security and Management)");
			System.out.println(" * Data Science (Introduction to Data Science, Robotics, Applied Data Science using Python)");
			System.out.println("\nDuration of course: 8 months ");
			flag = 1;
			break;
		}
		
		case 3: {
			System.out.println("\nZOOLOGY AND LIVING BEINGS");
			System.out.println(" * Human Anatomy (Cell Biology, Bones and Tissues, Nervous System, Sensory Organs)");
			System.out.println(" * Genetics (Fundamentals on Gene and DNA, Mutation, Biogenesis, Bio Computation, Bio-informatics)");
			System.out.println(" * Animal Physiology (Digestion, Circulatory and Respiratory System, Reproduction, Excretion)");
			System.out.println("\nDuration of course: 7 months ");
			flag = 1;
			break;
		}
		
		case 4 : {
			System.out.println("\nELECTRICAL AND ELECTRONICS");
			System.out.println(" * DC Circuits (Logic gates, MUX, deMUX, Encoders, FlipFlops)");
			System.out.println(" * Fundamentals of Power Electronics (Introduction, Triggering Circuits, AC to DC convertors, Multipulse Rectifiers)");
			System.out.println(" * DC Machines and Transformers (Introduction, Electrochemical Energy Converters, DC gererator, Polyohase Transformers)");
			System.out.println("\nDuration of course: 6 months ");
			flag = 1;
			break;
		}
		
		
		default : {
			System.out.println("Invalid input. Try again.");
		}
		
		
		}
		
		
		}
		
	}
	
	
	
	
}
