package details;

import java.sql.Date;
import java.time.LocalDate;

public class bookingdetails {
	private String fromloc;
	private String toloc;
	private String date;
	

	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public bookingdetails() {
		
	}
	public String getFromloc() {
		return fromloc;
	}
	public void setFromloc(String fromloc) {
		this.fromloc = fromloc;
	}
	public String getToloc() {
		return toloc;
	}
	public void setToloc(String toloc) {
		this.toloc = toloc;
	}
	

	public bookingdetails(String fromloc, String toloc) {
		super();
		this.fromloc = fromloc;
		this.toloc = toloc;

	}
	@Override
	public String toString() {
		return "Transfer [fromloc=" + fromloc + ", toloc=" + toloc + ", Date=" + date +  "]";
	}
	

}
