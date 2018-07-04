package Fair;

import Event.Event;
import Festival.Culturalfiesta;
//------------------------------------------------------- 
//Assignment 2
//Written by: (Mengyi Yang, 40048192) 
//For COMP 249 Section (U) ¨C Winter 2018
//by one student
//-------------------------------------------------------
public class Fair extends Event{
 private int exhibitor;
 private Type type;
 enum Type{CAREER, SCIENCE, TRADE, TRAVEL};
 
 public Fair() {
	 super();
	 exhibitor=0;
 }
public Fair(int year, int month, int city,int num,String a) {
	 super( year,month,city);
	 exhibitor=num;
	type=Type.valueOf(a.toUpperCase());
 }
public Fair(Fair a ) {
	 super(a.getYear(),a.getMonth(),a.getNumCity());
	 exhibitor=a.exhibitor; 
}
public void setExhibitor(int num) {
	exhibitor=num;
}
public int getExhibitor() {
	return exhibitor;
	}
public String toString() {
	 return("There will be "+type.toString()+" "+exhibitor+" exhibitors in "+getYear()+", "+this.getMonth()+" in "+this.getNumCity()+" cities");
}
public boolean equals(Object otherObject) {
	if(otherObject==null)
		return false;
	else if(getClass()!=otherObject.getClass())
		return false;
	else
	{
		Fair otherFair=(Fair)otherObject;
		return(super.equals(otherFair)&& exhibitor== otherFair. exhibitor);
	}
}
}
