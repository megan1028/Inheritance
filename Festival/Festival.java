package Festival;

import Event.Event;
//------------------------------------------------------- 
//Assignment 2
//Written by: (Mengyi Yang, 40048192) 
//For COMP 249 Section (U) ¨C Winter 2018
//by one student
//-------------------------------------------------------

public class Festival extends Event{
	private String name;
	private double price;
	private int duration;
	
	public Festival() {
		super();
		name=null;
		price=0;
		duration=0;
	}
	public Festival(int year, int month, int city, String name, double price, int time) {
		super( year,month,city);
		this.name=name;
		this.price=price;
		this.duration=time;
	}
	public Festival(Festival a) {
		super(a.getYear(),a.getMonth(),a.getNumCity());
		name=a.name;
		price=a.price;
		duration=a.duration;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	public double getPrice() {
		return price;
	}
    public void setDuration(int time) {
    	duration=time;
    }
    public int getDuration() {
    	return duration;
    }
    public String toString() {
    	return ("This "+name+" festival wil be held in "+this.getYear()+", "+this.getMonth()+" in "+this.getNumCity()+
    			" cities, for "+duration+" days, the ticket will cost "+price+"$");
    }
    public boolean equals(Object otherObject) {
    	if(otherObject==null)
    		return false;
    	else if(getClass()!=otherObject.getClass())
    		return false;
    	else
    	{
    		Festival otherFestival=(Festival)otherObject;
    		return(super.equals(otherFestival)&& name.equals(otherFestival.name)&& duration==otherFestival.duration&& price==otherFestival.price);
    	}
    }
    
}
