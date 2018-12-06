package GEMS;

public class GEMS_Student extends GEMS_Member {
	
	int checkLogin( GEMS_Student s[], int num, int reg) {
		
		int i = 0;
		int flag = 0;
		
		for(i=0; i< num; i++) {
			
			if (s[i].reg_no == reg ) {
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

}
