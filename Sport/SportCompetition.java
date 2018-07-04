package Sport;

import Event.Event;
import Festival.Festival;
//------------------------------------------------------- 
//Assignment 2
//Written by: (Mengyi Yang, 40048192) 
//For COMP 249 Section (U) ¨C Winter 2018
//by one student
//-------------------------------------------------------
public class SportCompetition extends Event{
 private int activity;
 Season time;
 enum Season{FALL, WINTER, SPRING, SUMMER};
 public SportCompetition() {
	 super();
	 activity=0;
 }
 public SportCompetition(int year, int month, int city,int num,String a) {
	 super( year,month,city);
	 activity=num;
	 time=Season.valueOf(a.toUpperCase());
 }
 public SportCompetition(SportCompetition a) {
	 super(a.getYear(),a.getMonth(),a.getNumCity());
	 activity=a.activity;
 }
 public void setActivity(int num) {
	 activity=num;
 }
 public int getActivity() {
	 return activity;
 }
 public String toString() {
	 return("This sport competition will be held in "+time.toString()+" of "+getYear()+", "+this.getMonth()+" in "+this.getNumCity()+" cities"+", and has "
                      +activity+" activities");
 }
 public boolean equals(Object otherObject) {
 	if(otherObject==null)
 		return false;
 	else if(getClass()!=otherObject.getClass())
 		return false;
 	else
 	{
 		SportCompetition otherCompetition=(SportCompetition)otherObject;
 		return(super.equals(otherCompetition)&&activity==otherCompetition.activity);
 	}
 }
 }
