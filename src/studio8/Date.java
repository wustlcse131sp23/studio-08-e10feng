package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {
	private int month;
	private int day;
	private int year;
	private boolean isHoliday;
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && month == other.month && year == other.year;
	}

	/**
	 * 
	 * @param month
	 * @param day
	 * @param year
	 * @param isHoliday
	 */
	public Date(int month, int day, int year, boolean isHoliday) {
		this.month = month;
		this.day = day;
		this.year = year;
		this.isHoliday = isHoliday;
	}
	
	public String toString() {
		return month + "/" + day + "/" + year;
	}

    public static void main(String[] args) {
    	Date independenceDay = new Date(7,4,1776,true);
    	Date birthday = new Date(7,8,2003,false);
    	Date birthday2 = new Date(7,8,2003,false);
    	Date lastChristmas = new Date(12,25,2022, true);
    	Date patsDay = new Date(3,17,2023, true);
    	Date goingHome = new Date(5,11,2023, false);
    	
    	LinkedList<Date> list = new LinkedList<Date>();
    	list.add(independenceDay);
    	list.add(birthday);
    	list.add(birthday2);
    	list.add(birthday);
    	list.add(lastChristmas);
    	list.add(patsDay);
    	list.add(goingHome);
    	
    	HashSet<Date> set = new HashSet<Date>();
    	set.add(birthday);
    	set.add(birthday2);
    	set.add(birthday);
    	
    	System.out.println(list);
    	System.out.println(set);
    	
    }

}
