package GEMS;
import java.util.*;
import java.io.*;

public class GEMS_Main {	
	
	static int num = 1006;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		GEMS_Student[] s =  new GEMS_Student[20];
		GEMS_Tutor[] t =  new GEMS_Tutor[20];
		GEMS_Student a =  new GEMS_Student();
		GEMS_Tutor b =  new GEMS_Tutor();
		GEMS_Member student = new GEMS_Member();
		GEMS_Member tutor = new GEMS_Member();
		
		
		for(int w = 0; w<20; w++) {
			 s[w] = new GEMS_Student();
			 t[w] = new GEMS_Tutor();
		}
		
		s[0].reg_no = 1001;
		s[0].password = "sarah";
		s[0].name = "Sarah";
		s[0].dob.date = 23;
		s[0].dob.month = 3;
		s[0].dob.year = 1999;
		s[0].gender = "F";
		s[0].mobile = "9840903240";
		s[0].email = "sarah@gmail.com";
		s[0].country = "I";
		s[0].noOfCourses = 1;
		s[0].type = "1";
		s[0].addtoCourseArray(2, 0);
		student.addArray(1001, 2);
		
		s[1].reg_no = 1002;
		s[1].password = "peter";
		s[1].name = "Peter";
		s[1].dob.date = 12;
		s[1].dob.month = 8;
		s[1].dob.year = 1998;
		s[1].gender = "M";
		s[1].mobile = "8056407841";
		s[1].email = "peter@gmail.com";
		s[1].country = "O";
		s[1].noOfCourses = 2;
		s[1].type = "1";
		s[1].addtoCourseArray(1, 0);
		s[1].addtoCourseArray(3, 1);
		student.addArray(1002, 1);
		student.addArray(1002, 3);
		
		s[2].reg_no = 1003;
		s[2].password = "tina";
		s[2].name = "Tina";
		s[2].dob.date = 7;
		s[2].dob.month = 12;
		s[2].dob.year = 1999;
		s[2].gender = "F";
		s[2].mobile = "9840957240";
		s[2].email = "tina@gmail.com";
		s[2].country = "I";
		s[2].noOfCourses = 4;
		s[2].addtoCourseArray(1, 0);
		s[2].addtoCourseArray(2, 1);
		s[2].addtoCourseArray(3, 2);
		s[2].addtoCourseArray(4, 3);
		s[2].type = "1";
		student.addArray(1003, 1);
		student.addArray(1003, 2);
		student.addArray(1003, 3);
		student.addArray(1003, 4);
		
		t[0].reg_no = 1004;
		t[0].password = "brookes";
		t[0].name = "Brookes";
		t[0].dob.date = 13;
		t[0].dob.month = 5;
		t[0].dob.year = 1989;
		t[0].gender = "F";
		t[0].mobile = "9962141970";
		t[0].email = "brookes@gmail.com";
		t[0].country = "I";
		t[0].noOfCourses = 1;
		t[0].addtoCourseArray(4, 0);
		t[0].type = "2";
		t[0].major = "4";
		t[0].experience = 2;
		tutor.addArray(1004, 4);
		
		t[1].reg_no = 1005;
		t[1].password = "sherwood";
		t[1].name = "Sherwood";
		t[1].dob.date = 27;
		t[1].dob.month = 2;
		t[1].dob.year = 1980;
		t[1].gender = "M";
		t[1].mobile = "9600951050";
		t[1].email = "swood@gmail.com";
		t[1].country = "O";
		t[1].noOfCourses = 1;
		t[1].addtoCourseArray(2, 0);
		t[1].type = "2";
		t[1].major = "2";
		t[1].experience = 1;
		tutor.addArray(1005, 2);
		
		
		int flag1 = 0, flag2 = 0, flag3 = 0, flag4 = 0, flag7 = 0, course_no, index, temp_no;
		int i = 3, j = 2, reg, n, who =0, check=0, red = 0;
		String pass;
		
		while (flag1 == 0) {
			
		
			System.out.println("\n\t\tWELCOME TO GEMS TUTION PLATFORM");
			System.out.println("\n\n1.Already a member? Login.\n2.New to GEMS? Register.\n3.Exit site.");
			String choice1 = input.next();
			
			flag2 = 0;
			flag3 = 0;
			
			switch (choice1) {
			
			case "1" :{
				
				while (flag2 == 0) {
				
				System.out.println("\n\nLogin as:\n1.GEMS Student\n2.GEMS Tutor\n\t\t[Press any other key to head back to main page]");
				String choice3 = input.next();
				
				switch(choice3) {
				
				case "1" : {
					System.out.println("\n\n\tLOGIN");
					System.out.println("\nRegistration number: ");
					reg = input.nextInt();
					check = a.checkLogin(s, i, reg);
					if(check == 21) {
						System.out.println("\nNo such user. Try again.");
						break;
					}
					System.out.println("Password: ");
					pass = input.next();
					
					if (pass.equals(s[check].password)) {
						System.out.println("\nLogin Successful!");
						who = 1;
						flag2 = 1;
						flag3 = 1;
					}
					
					else {
						System.out.println("\nLogin failed. Try again.");
					}
					
					break;
					
				}
				
				case "2" :{
					
					System.out.println("\n\n\tLOGIN");
					System.out.println("\nRegistration number: ");
					reg = input.nextInt();
					check = b.checkLogin(t, j, reg);
					if(check == 21) {
						System.out.println("\nNo such user. Try again.");
						break;
					}
					System.out.println("Password: ");
					pass = input.next();
					
					if (pass.equals(t[check].password)) {
						System.out.println("\nLogin Successful!");
						who = 2;
						flag2 = 1;
						flag3 = 1;
					}
					
					else {
						System.out.println("\nLogin failed. Try again.");
					}
					break;
				}
				
				default : {
					flag2 = 1;
					break;
				}
				
				}
				
				}
				
				break;
						
			}
			
			case "2" :{
					
					System.out.println("\n\nRegister as:\n1.GEMS Student\n2.GEMS Tutor\n\t\t[Press any other key to head back to main page]");
					String choice2 = input.next();
							
					switch(choice2) {
					
					case "1": {
						s[i].reg_no = num++;
						s[i].type = "1";
						s[i].getDetails();
						System.out.println("\nYour registration number is: " + s[i].reg_no);
						s[i].setPassword();
						System.out.println("\n\nSuccessfully registered. You are now a member!");
						i++;
						break;
					}
					
					case "2" :{
						t[j].reg_no = num++;
						t[j].type = "2";
						t[j].getDetails();
						System.out.println("\nYour registration number is: " + t[j].reg_no);
						t[j].setPassword();
						System.out.println("\n\nSuccessfully registered. You are now a member!");
						j++;
						break;
					}
					
					default: {
						break;
					}
					
					}
				

				break;
			}
			
			
			case "3" :{
				
				System.out.println("Thank you for visiting our site!");
				flag1 = 1;
				break;
			}
			
			default :{
				System.out.println("Invalid input choice. Please Try Again.");
				break;
			}

			
			}
			
			
			
			while (flag3 == 1 && who == 1) {
				System.out.println("\n\n\t\t"+s[check].name.toUpperCase()+"'S HOMEPAGE");
				a.displayHomepage();
				int c = input.nextInt();
				
				flag4 = 0;
				
				switch(c) {
				
				
				case 1 :{
					
					while (flag4 == 0) {
					a.displayCourse();
					System.out.println("\n\n1.Apply for a course.\n2.View Course Details\n\t\t\t[Press any other key to head back to home page]");
					String choice4 = input.next();
					
					int flag5 = 0;
					
					switch(choice4) {
								
					case "1" :{
						while(flag5 == 0) {
							System.out.println("\nEnter the selected course's number: ");
							course_no = input.nextInt();
							int dir = a.checkCourselist(s, check, course_no);
							
							if (dir == 1) {
								System.out.println("Course is already taken.");
								flag5 = 1;
							}
							else if (dir == 0) {
							if (course_no > 0 && course_no < 5 ) {
								index = s[check].noOfCourses;
								s[check].noOfCourses++;
								s[check].addtoCourseArray(course_no, index);
								temp_no = s[check].reg_no;
								student.addArray(temp_no, course_no);
								System.out.println("Enter date: ");
								s[check].courseDate[course_no][0] = input.nextInt();
								s[check].courseDate[course_no][1] = input.nextInt();
								s[check].courseDate[course_no][2] = input.nextInt();
								System.out.println("You have been applied to Course "+course_no);
								flag5 = 1;
							}
							
							else {
								System.out.println("\nInvalid input. Try again.");
							}
							}
						}
						break;
					}
					
					case "2": {
						a.displayCourseDetails();
						break;
					}
					
					default: {
						flag4 = 1;
						break;
					}
					
					}
					
					}
					
					break;
					
				}
			
				case 2 :{
					
					int flag6 = 0;
					
					while (flag6 == 0) {
					
					System.out.println("\n\n1.Courses Taken\n2.Time left for completion of course\n\t\t[Press any other key to head back to home page]");
					String choice5 = input.next();
					
					switch (choice5) {
					
					case "1" : {
						a.displayCourseTaken(s, check);
						break;
					}
					
					case "2" : {
						
						System.out.println("\nCourse number: ");
						int cnum = input.nextInt();
						if(cnum>0 && cnum<5) {
							int d = a.checkCourselist(s, check, cnum);
							if(d==1) {
								
							/*System.out.println("Enter end date: ");
							int givenDay = input.nextInt();
							int givenMonth = input.nextInt();
							int givenYear = input.nextInt();*/
							System.out.println("Enter current date: ");
							int d1 = input.nextInt();
							int m = input.nextInt();
							int y = input.nextInt();
							GEMS_Date h = new GEMS_Date();
							h.calcDate(s[check].courseDate[cnum][0], s[check].courseDate[cnum][1] +6, s[check].courseDate[cnum][2], d1, m, y);
								
								
							}
							if(d==0) {
								System.out.println("You have not taken this course.");
							}
							
						}
						else {
							System.out.println("Invalid input. Try again.");
						}
						
						
						break;
					}
					
					default :{
						flag6 = 1;
					}
	
					}
					
				}
						
					break;
				}
				
				case 3 :{
					//
					//
					break;
				}
				
				case 4 :{

					flag7 = 0;
					
					while (flag7 == 0) {
					
					System.out.println("\n\n1.User Details\n2.Classroom Details\n\t\t[Press any other key to head back to home page]");
					String choice6 = input.next();
					
					switch (choice6) {
					
					case "1" : {
						
						int flag8 = 0;
						
						while (flag8 == 0) {
						
						System.out.println("\n1.My details\n\t\t[Press any other key to head back to member details page]");
						String choice7= input.next();
						
						switch (choice7) {
						
						case "1" : {
							s[check].printDetails();
							break;
						}
						
						
						default :{
							flag8 = 1;
						}
		
						} 
						
						}
						
						break;
					}
					
					case "2" : {
						
						int flag9 = 0;
						
						while (flag9 == 0) {
						
							System.out.println("\n1.Students taking same course\n2.Tutors handeling same course\n\t\t[Press any other key to head back to member details page]");
							String choice8 = input.next();
							
							switch(choice8) {
							
							case "1" :{
								System.out.println("\nCourse number: ");
								int cnum = input.nextInt();
								if(cnum>0 && cnum<5) {
									int d = a.checkCourselist(s, check, cnum);
									if(d==1) {
										System.out.println();
										student.printArray(cnum);
									}
									if(d==0) {
										System.out.println("You have not taken this course.");
									}
									
								}
								else {
									System.out.println("Invalid input. Try again.");
								}
								break;
							}
							
							case "2" : {
								System.out.println("\nCourse number: ");
								int cnum = input.nextInt();
								if(cnum>0 && cnum<5) {
									int d = a.checkCourselist(s, check, cnum);
									if(d==1) {
										System.out.println();
										tutor.printArray(cnum);
									}
									if(d==0) {
										System.out.println("You have not taken this course.");
									}
									
								}
								else {
									System.out.println("Invalid input. Try again.");
								}
								break;
							}
							
							default :{
								flag9 = 1;
							}
							
							}
								
						}
						
						break;
					}
					
					default :{
						flag7 = 1;
					}
	
					}
					
				}
					
					break;
				}
				
				case 5 :{
					flag3 = 2;
					break;
				}
				
				default :{
					System.out.println("Invalid input. Try again.");
				}
				
				
				}
				
				

			}
			
			while (flag3 == 1 && who == 2) {
				System.out.println("\n\n\t\t"+t[check].name.toUpperCase()+"'S HOMEPAGE");
				b.displayHomepage();
				int c = input.nextInt();
				
				switch(c) {
				
				
				case 1 :{
					flag4 = 0;
					
					while (flag4 == 0) {
						b.displayCourse();
						System.out.println("\n1.Apply for a course.\n2.View Course Details\n\t\t\t[Press any other key to head back to home page]");
						String choice4 = input.next();
						
						
						
						switch(choice4) {
						
						case "1" :{
							
							int flag5 = 0;
							
							while(flag5 == 0) {
								System.out.println("\nEnter the selected course's number: ");
								course_no = input.nextInt();
								int dir = b.checkCourselist(t, check, course_no);
								
								if (dir == 1) {
									System.out.println("Course is already taken.");
									flag5 = 1;
								}
								else if (dir == 0) {
								String cn = String.valueOf(course_no);
								red = 2;
								if (course_no > 0 && course_no < 5) {
									red = 1;
									if ((t[check].major.equals(cn)) && (t[check].experience>=1)) {
									index = t[check].noOfCourses;
									t[check].noOfCourses++;
									t[check].addtoCourseArray(course_no, index);
									temp_no = t[check].reg_no;
									tutor.addArray(temp_no, course_no);
									/*System.out.println("Enter date: ");
									t[check].courseDate[course_no].date = input.nextInt();
									t[check].courseDate[course_no].month = input.nextInt();
									t[check].courseDate[course_no].year = input.nextInt();*/
									System.out.println("You have been applied to Course "+course_no);
									red = 3;
									flag5 = 1;}
								}
								
								if (red == 2) {
									System.out.println("\nInvalid input. Try again.");}
									if (red == 1){
									System.out.println("Not eligible for course.");
									flag5 = 1;}
								
								
								}
							}
							break;
						}
						
						case "2": {
							b.displayCourseDetails();
							break;
						}
						
						default: {
							flag4 = 1;
							break;
						}
						
						}
						
						}
						
					
					break;
				}
				
				case 2 :{
					
					int flag6 = 0;
					
					while (flag6 == 0) {
					
					System.out.println("\n\n1.Courses Taken\n2.Time left for completion of course\n\t\t[Press any other key to head back to home page]");
					String choice5 = input.next();
					
					switch (choice5) {
					
					case "1" : {
						b.displayCourseTaken(t, check);
						break;
					}
					
					case "2" : {
						System.out.println("\nCourse number: ");
						int cnum = input.nextInt();
						if(cnum>0 && cnum<5) {
							int d = b.checkCourselist(t, check, cnum);
							if(d==1) {
								
								System.out.println("Enter end date: ");
								int givenDay = input.nextInt();
								int givenMonth = input.nextInt();
								int givenYear = input.nextInt();
								System.out.println("Enter current date: ");
								int d1 = input.nextInt();
								int m = input.nextInt();
								int y = input.nextInt();
								GEMS_Date h = new GEMS_Date();
								h.calcDate(givenDay, givenMonth, givenYear, d1, m, y);
								
								
							}
							if(d==0) {
								System.out.println("You have not taken this course.");
							}
							
						}
						else {
							System.out.println("Invalid input. Try again.");
						}
						
						break;
					}
					
					default :{
						flag6 = 1;
					}
	
					}
					
				}
						
					
					break;
				}
				
				case 3 :{
					break;
				}
				
				case 4 :{
					
					flag7 = 0;
					
					while (flag7 == 0) {
					
					System.out.println("\n\n1.User Details\n2.Classroom Details\n\t\t[Press any other key to head back to home page]");
					String choice6 = input.next();
					
					switch (choice6) {
					
					case "1" : {
						
						int flag8 = 0;
						
						while (flag8 == 0) {
						
						System.out.println("\n1.My details\n2.Student details\n3.Tutor details\n\t\t[Press any other key to head back to member details page]");
						String choice7= input.next();
						
						switch (choice7) {
						
						case "1" : {
							t[check].printDetails();
							break;
						}
						
						case "2" : {
							System.out.println("\nRegistration number: ");
							int yo = input.nextInt();
							int yo1 = a.checkLogin(s, i, yo);
							if(yo1 == 21) {
								System.out.println("\nNo such user. Try again.");
								break;
							}
							else {
								s[yo1].printDetails();
							}
							break;
						}
						
						case "3" : {
							System.out.println("\nRegistration number: ");
							int yo = input.nextInt();
							int yo1 = b.checkLogin(t, i, yo);
							if(yo1 == 21) {
								System.out.println("\nNo such user. Try again.");
								break;
							}
							else {
								t[yo1].printDetails();
							}
							
							break;
						}
						
						default :{
							flag8 = 1;
						}
		
						} 
						
						}
						
						break;
					}
					
					case "2" : {
						
						int flag9 = 0;
						
						while (flag9 == 0) {
						
							System.out.println("\n1.Students taking same course\n2.Tutors handeling same course\n\t\t[Press any other key to head back to member details page]");
							String choice8 = input.next();
							
							switch(choice8) {
							
							case "1" :{
								System.out.println("\nCourse number: ");
								int cnum = input.nextInt();
								if(cnum>0 && cnum<5) {
									int d = b.checkCourselist(t, check, cnum);
									if(d==1) {
										System.out.println();
										student.printArray(cnum);
									}
									if(d==0) {
										System.out.println("You have not taken this course.");
									}
									
								}
								else {
									System.out.println("Invalid input. Try again.");
								}
								break;
							}
							
							case "2" : {
								System.out.println("\nCourse number: ");
								int cnum = input.nextInt();
								if(cnum>0 && cnum<5) {
									int d = b.checkCourselist(t, check, cnum);
									if(d==1) {
										System.out.println();
										tutor.printArray(cnum);
									}
									if(d==0) {
										System.out.println("You have not taken this course.");
									}
									
								}
								else {
									System.out.println("Invalid input. Try again.");
								}
								break;
							}
							
							default :{
								flag9 = 1;
							}
							
							}
								
						}
						break;
					}
					
					default :{
						flag7 = 1;
					}
	
					}
					
				}
					break;
				}
				
				case 5 :{
					flag3 = 2;
					break;
				}
				
				default :{
					System.out.println("Invalid input. Try again.");
				}
				
				
				}

				
			}
			
			
			
			
		}

	}



}
