package GEMS;

public class GEMS_Tutor extends GEMS_Member {
	
	String major;
	int experience;
	
	void getDetails() {
		
		super.getDetails();
		System.out.println("Choose your major: 1.Humanities 2.Computer Science 3.Biology 4.Electical");
		major = input.next();
		System.out.println("Enter years of teaching experience:");
		experience = input.nextInt();
		
	}
	
	int checkLogin( GEMS_Tutor t[], int num, int reg) {
		
		int i = 0;
		int flag = 0;
		
		for(i=0; i< num; i++) {
			
			if (t[i].reg_no == reg ) {
				flag = 1;
				break;
			}
		}
		
		if (flag==1) {
		return i;
		}
		
		else {
			return 21;
		}
	}
	
	void displayCourseTaken(GEMS_Tutor t[], int check) {
		
		int i = 0;
		
		for(i = 0; i<t[check].noOfCourses; i++) {
			System.out.println("Course "+t[check].courseList[i]);
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
			System.out.println("\nDuration of course: 6 months\nEligibility: Humanities major & 1+ year teaching experience.");
			flag = 1;
			break;
		}
		
		case 2: {
			System.out.println("\nCOMPUTER SCIENCE");
			System.out.println(" * Data Structures (Stacks, Queues, Linked Lists, Trees, Graphs, Hash Tables)");
			System.out.println(" * Discrete Math (Logic and Propotions, Recurrsion, Recurrence, Sets)");
			System.out.println(" * Computer Networks (Introduction to Networks, Designing using HTML, Security and Management)");
			System.out.println(" * Data Science (Introduction to Data Science, Robotics, Applied Data Science using Python)");
			System.out.println("\nDuration of course: 8 months\nEligibility: CS major & 1+ year teaching experience.");
			flag = 1;
			break;
		}
		
		case 3: {
			System.out.println("\nZOOLOGY AND LIVING BEINGS");
			System.out.println(" * Human Anatomy (Cell Biology, Bones and Tissues, Nervous System, Sensory Organs)");
			System.out.println(" * Genetics (Fundamentals on Gene and DNA, Mutation, Biogenesis, Bio Computation, Bio-informatics)");
			System.out.println(" * Animal Physiology (Digestion, Circulatory and Respiratory System, Reproduction, Excretion)");
			System.out.println("\nDuration of course: 7 months\nEligibility: Biology major & 1+ year teaching experience.");
			flag = 1;
			break;
		}
		
		case 4 : {
			System.out.println("\nELECTRICAL AND ELECTRONICS");
			System.out.println(" * DC Circuits (Logic gates, MUX, deMUX, Encoders, FlipFlops)");
			System.out.println(" * Fundamentals of Power Electronics (Introduction, Triggering Circuits, AC to DC convertors, Multipulse Rectifiers)");
			System.out.println(" * DC Machines and Transformers (Introduction, Electrochemical Energy Converters, DC gererator, Polyohase Transformers)");
			System.out.println("\nDuration of course: 6 months\nEligibility: Electrical major & 1+ year teaching experience. ");
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
