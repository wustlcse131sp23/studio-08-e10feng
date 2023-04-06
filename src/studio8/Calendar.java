package studio8;

import java.util.LinkedList;

public class Calendar {
	private Time time;
	private Date date;
	private Appointment appt;
	private LinkedList<Appointment> schedule = new LinkedList<Appointment>();

	public Calendar() {
	}

	public boolean addEvent(Appointment appt) {
		int matches = 0;
		for (int i = 0; i < schedule.size(); i++) {
			if (appt.equals(schedule.get(i))) {
				matches++;
			}
		}
		if (matches == 0) {
			schedule.add(appt);
			return true;
		}
		else {
			return false;
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar health = new Calendar();
		
		Appointment doctor = new Appointment(new Date(4,6,2023,false), new Time(14,30,false), 60);
		System.out.println(health.addEvent(doctor));
		
		Appointment dentist = new Appointment(new Date(4,6,2023,false), new Time(14,30,false), 60);
		System.out.println(health.addEvent(dentist));
	}

}
