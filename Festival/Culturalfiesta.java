package Festival;
//------------------------------------------------------- 
//Assignment 2
//Written by: (Mengyi Yang, 40048192) 
//For COMP 249 Section (U) ¨C Winter 2018
//by one student
//-------------------------------------------------------

public class Culturalfiesta  extends Festival{
	private int language;
   
	public Culturalfiesta() {
		super();
		language=0;
	}
	public Culturalfiesta(int year, int month, int city, String name, double price, int time, int num) {
		super(year,month, city,name, price,time);
		language=num;
	}
	public Culturalfiesta(Culturalfiesta a) {
		super(a.getYear(),a.getMonth(),a.getNumCity(),a.getName(),a.getPrice(),a.getDuration());
		language=a.language;
	}
	public void setLanguage(int num) {
		language=num;
	}
	public int getLanguage() {
		return language;
	}
	public String toString() {
		return ("This "+getName()+" Culturalfiesta wil be held in "+this.getYear()+", "+this.getMonth()+" in "+this.getNumCity()+
    			" cities, for "+getDuration()+" days, the ticket will cost "+getPrice()+"$, and has "+language+" spoken languages.");
	}
	 public boolean equals(Object otherObject) {
	    	if(otherObject==null)
	    		return false;
	    	else if(getClass()!=otherObject.getClass())
	    		return false;
	    	else
	    	{
	    		Culturalfiesta otherCulturalfiesta=(Culturalfiesta)otherObject;
	    		return(super.equals( otherCulturalfiesta)&& language== otherCulturalfiesta.language);
	    	}
	    }
	    
}
