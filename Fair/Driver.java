package Fair;

import Event.Event;
import Festival.Culturalfiesta;
import Festival.Festival;
import Festival.Musicfiesta;
import Sport.SportCompetition;
//------------------------------------------------------- 
//Assignment 2
//Written by: (Mengyi Yang, 40048192) 
//For COMP 249 Section (U) ¨C Winter 2018
//by one student
//-------------------------------------------------------
public class Driver {
    public static Event[] copyFestival(Event[] a) {
    	Event []temp=new Event[a.length];
        //It is not successful, because the copy constructor is shallow copy, no element is an instance of child.
    	//Polymorphism has nothing to do with methods of different names.
    	for(int i=0;i<a.length;i++)
    	{
    		temp[i]=new Event(a[i]);
    	}
    	return temp;
    }
	public static void main(String[] args) {
		System.out.println("------------------------------\n"
				         + "  Welcom to Nancy's program"+
				           "\n-------------------------------\n");
		Event E1=new Event(2020,8,2);
		System.out.println(E1);
		Event E2=new Event(2020,8,2);
		System.out.println(E2);
		Event E3=new Event(2019,5,23);
		System.out.println(E3);
		Festival F1=new Festival(2023,10,3,"art",35,7);
		System.out.println(F1);
		Festival F2=new Festival(2021,10,3,"film",34,5);
		System.out.println(F2);
		Festival F3=new Festival(2019,1,33,"beer",25,7);
		System.out.println(F3);
		Fair fair1=new Fair(2018,2,2,3,"science");
		System.out.println(fair1);
		Culturalfiesta C1=new Culturalfiesta(2019,1,5,"art",25,3,2);
		System.out.println(C1);
		Musicfiesta M1=new  Musicfiesta(2019,2,2,"art",24,4,3);
		System.out.println(M1);
		SportCompetition S1=new SportCompetition(2020,3,4,6,"summer");
		System.out.println(S1);
		System.out.println("\n\nTest of equals method:\n"+
		         "---------------------------------------------------------");
		if(E1.equals(E2))
			System.out.println("Same event");
		else
			System.out.println("\nNot same event");
		if(E1.equals(F1))
			System.out.println("Same event");
		else
			System.out.println("Not same event");
		
		Event[] E=new Event[10];
		E[0]=E1;
        E[1]=E2;
        E[2]=E3;
        E[3]=F1;
        E[4]=F2;
        E[5]=F3;
        E[6]=fair1;
        E[7]=C1;
        E[8]=M1;
        E[9]=S1;
       int temp1=0;
       int temp2=0;
        int  least=E[0].getNumCity();
        int most=E[0].getNumCity();
        for(int i=1;i<E.length;i++) {
        	if(least>E[i].getNumCity())
        		{
        		least=E[i].getNumCity();
        		temp1=i;
        		}
        	if(most<E[i].getNumCity())
        		{
        		most=E[i].getNumCity();
        		temp2=i;
        		}
        }
        System.out.println("\n\n\nObject has the least cities is: "+
        		"\n--------------------------------------------------------");
        System.out.println(E[temp1]+" and the location in the array is "+temp1);
        System.out.println("\nObject has the most cities is: "+
        		"\n---------------------------------------------------------");
        System.out.println(E[temp2]+" and the location in the array is "+temp2+"\n\n\n");
        System.out.println("These events are happening in the same year: "+
        		"\n---------------------------------------------------------");
        int l=10;
        int k=10;
        Event[] temp=new Event[l];
        Event[] t=new Event[k];
        temp=E;
     
        	for(int n=0;l>1&&n<l;n++) {
        		 int m=0;
        		 int d=0;
        	    int y=E[0].getYear();
        	 
        	for(int j=0;j<l;j++) {
           		if(y==temp[j].getYear())
           		{
           			t[d]=temp[j];
           			d++;
           		}
    		else {
        			    	temp[m]=temp[j];
        			    	m++;
        			}       		
        	}
        	l=m;
        	k=d;
        	for(int x=0;x<k&&k>1;x++)
        		System.out.println(t[x]);	
        	
        	}
        	
        	
        	Event [] last=new Event[12];
        	last[0]=new Event(2020,8,2);
    		last[1]=new Event(2020,7,2);
    		last[2]=new Event(2019,5,23);
    		last[3]=new Event(2019,5,23);
    		last[4]=new Festival(2023,10,3,"art",35,7);
    		last[5]=new Festival(2021,10,3,"film",34,5);
    		last[6]=new Festival(2019,1,33,"beer",25,7);
    		last[7]=new Festival(2019,1,33,"beer",25,7);
    	    last[8]=new Fair(2018,2,2,3,"travel");
    	   last[9]=new Culturalfiesta(2019,1,5,"art",25,3,2);
    	    last[10]=new  Musicfiesta(2019,2,2,"art",24,4,3);
    		last[11]=new SportCompetition(2020,3,4,6,"summer");
    		System.out.println("\nAn array of 12 objects:"+"\n---------------------------------------------------------");
    		for(int i=0;i<last.length;i++)
    			System.out.println(last[i]);
    		System.out.println("\nCopy:"+
    				"\n---------------------------------------------------------");
    		for(int i=0;i<Driver.copyFestival(last).length;i++)
    		System.out.println(Driver.copyFestival(last)[i]); 
    		 System.out.println("\nThank you!");	
	}	
                
	}


