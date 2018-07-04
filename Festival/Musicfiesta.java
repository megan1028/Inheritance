package Festival;
//------------------------------------------------------- 
//Assignment 2
//Written by: (Mengyi Yang, 40048192) 
//For COMP 249 Section (U) ¨C Winter 2018
//by one student
//-------------------------------------------------------
public class Musicfiesta extends Festival{
	private int band;
	public Musicfiesta() {
		super();
		band=0;
	}
	public Musicfiesta(int year, int month, int city, String name, double price, int time, int num) {
		super(year,month, city,name, price,time);
		band=num;
	}
	public Musicfiesta(Musicfiesta b) {
	super(b.getYear(),b.getMonth(),b.getNumCity(),b.getName(),b.getPrice(),b.getDuration());
	band=b.band;
	}
	public void setBand(int num) {
		band=num;
	}
	public int getBand() {
		return band;
	}
	public String toString() {
		return ("This "+getName()+" Musicfiesta wil be held in "+this.getYear()+", "+this.getMonth()+" in "+this.getNumCity()+
    			" cities, for "+getDuration()+" days, the ticket will cost "+getPrice()+"$, and has "+band+" bands.");
	}
	 public boolean equals(Object otherObject) {
	    	if(otherObject==null)
	    		return false;
	    	else if(getClass()!=otherObject.getClass())
	    		return false;
	    	else
	    	{
	    		Musicfiesta otherMusicfiesta=(Musicfiesta)otherObject;
	    		return(super.equals( otherMusicfiesta)&& band== otherMusicfiesta.band);
	    	}
	    }
	 
	
}
