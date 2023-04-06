package studio8;
import java.util.Objects;

public class Appointment {
	private Date date;
	private Time time;
	private double duration;
	
	public Appointment(Date date, Time time, double duration) {
		this.date = date;
		this.time = time;
		this.duration = duration;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(date, time);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(date, other.date) && Objects.equals(time, other.time);
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date doctorDate = new Date(4,6,2023,false);
		Time doctorTime = new Time(14,30,false);
		Appointment doctor = new Appointment(new Date(4,6,2023,false), new Time(14,30,false), 30);
		
		Date labMeetingDate = new Date(4,6,2023,false);
		Time labMeetingTime = new Time(14,30,false);
		Appointment labMeeting = new Appointment(labMeetingDate, labMeetingTime, 30);
		
		Date recruitingTripDate = new Date(4,6,2023,false);
		Time recruitingTripTime = new Time(15,30,false);
		Appointment recruitingTrip = new Appointment(recruitingTripDate, recruitingTripTime, 30);
		
		System.out.println(doctor.equals(recruitingTrip));
		System.out.println(doctor.equals(labMeeting));
	}

}
