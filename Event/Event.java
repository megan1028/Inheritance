package Event;
//------------------------------------------------------- 
//Assignment 2
//Written by: (Mengyi Yang, 40048192) 
//For COMP 249 Section (U) ¨C Winter 2018
//by one student
//-------------------------------------------------------
public class Event {
	private int year;
	private int month;
	private int num_city;
	
	public Event() {
		year=0;
		month=0;
		num_city=0;
	}
	public Event(int year, int month, int city) {
		this.year=year;
		this.month=month;
		this.num_city=city;
	}
   public Event(Event a) {
	   year=a.year;
	   month=a.month;
	   num_city=a.num_city;
   }
	public void setYear(int year) {
		this.year=year;
	}
	public int getYear() {
	 return year;
	}
	public void setMonth(int month) {
		this.month=month;
	}
	public int getMonth() {
	 return month;
	}
	public void setNumCity(int city) {
		this.num_city=city;
	}
	public int getNumCity() {
	 return num_city;
	}
	
	public String toString() {
		return ("This event will be held in "+year+", "+month+" in "+num_city+" cities");
	}
	public boolean equals(Object otherObject) {
		if (otherObject==null)  //If otherObject is null, definitely it is not equal to the calling object
			return false;
		else if(getClass()!=otherObject.getClass())// If the two objects are not from same class, they are not the same.
			return false;
		else {
			Event otherEvent=(Event)otherObject; //cast
			return(year==otherEvent.year && month==otherEvent.month && num_city==otherEvent.num_city);
		}
			
	}



}
