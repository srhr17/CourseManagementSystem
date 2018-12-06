package GEMS;

public class GEMS_Date {
	

	
	
	void calcDate(int givenDay, int givenMonth, int givenYear, int d, int m, int y)
	{
		
		int noD=0,noM=0,noY=0;
		if(d<givenDay)
		{
			noD=givenDay-d;
			noM=givenMonth-m;
		}
			
		else if(d==givenDay)
		{
			noM=givenMonth-m;
		}
			
		else if(d>givenDay)
		{
			if(m>=1 && m<=7)
			{
				if(m%2!=0)
				{
					noD=(31-d)+givenDay;
				}
				
				else if(m%2==0)
				{
					if(y%400==0 || y%4==0)
					{
						if(m==2)
						{
							noD=(29-d)+givenDay;
						}	
					}
						
					else
					{
						if(m==2)
						{
							noD=(28-d)+givenDay;
						}
							
						else
						{
							noD=(30-d)+givenDay;
						}
					}
				}
			}
				
			else if(m>=8 && m<=12)
			{
				if(m%2==0)
				{
					noD=(31-d)+givenDay;
				}
					
				else
				{
					noD=(30-d)+givenDay;
				}
			}
				
			noM=givenMonth-m-1;
		}
		
		if(y<=givenYear)
		{
			noY=givenYear-y;
		}
		
		else if((d>givenDay && m==givenMonth && y==givenYear) || (m>givenMonth && y==givenYear) || (y>givenYear))
		{
			System.out.println("Course is over. ");
			return;
		}
	
		if(noD==30)
		{
			noD=0;
			noM++;
		}
		System.out.println(noY+" years, "+noM+" months, "+noD+" days.");
	}
}



