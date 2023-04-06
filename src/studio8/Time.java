package studio8;

import java.util.Objects;

public class Time {
	private int hours;
	private int minutes;
	private boolean is12hr;
	
	@Override
	public int hashCode() {
		return Objects.hash(hours, minutes);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hours == other.hours && minutes == other.minutes;
	}

	/**
	 * 
	 * @param hours
	 * @param minutes
	 * @param is12hr
	 */
	public Time(int hours, int minutes, boolean is12hr) {
		this.hours = hours;
		this.minutes = minutes;
		this.is12hr = is12hr;
	}

	public String toString() {
		return "The time is: " + hours + ":" + minutes;
	}
	
	public static void main(String[] args) {
		Time meetingA = new Time(14,30,false);
		Time meetingB = new Time(14,30,true);
		Time meetingC = new Time(2,30,true);
		System.out.println(meetingA.equals(meetingC));
		System.out.println(meetingA.equals(meetingB));

	}

}