package com.mingate.time;

public class Time {
	private int hours;
	private int minutes;
	
	public Time() {
		
	}
	public Time(int hours, int minutes) {
		this.hours = hours;
		this.minutes = minutes;
	}
	
	public void setTime(int hours,int minutes) {
		this.hours = hours;
		this.minutes = minutes;
	}
	
	public void showTime() {
		System.out.println(hours +":"+ "Hours"+ "   "+ minutes +":"+ "Minutes");
	}
	
	public Time sum(Time time) {
		Time t = new Time();
		int totalHours = this.hours + time.hours;
		int totalMinutes = this.minutes + time.minutes;
		t.setTime(totalHours, totalMinutes);
		return t;
	}
	
/*	public static void main(String[] args) {
		Time t1 = new Time(1,20);
		Time t2 = new Time(1,30);
		Time t3 = t1.sum(t2);
		t3.showTime();
	} */

}
