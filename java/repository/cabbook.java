package repository;

import java.util.List;

import details.Cab;
import details.bookingdetails;
import details.cabdetails;

public interface cabbook {
	void save(cabdetails cabdetails);
	Cab load(String location);
	void update(Cab cab);
	public void tsave(bookingdetails bookingdetails);
	public List<bookingdetails> getTransfer();
	public List<cabdetails> getcabdetails(int n1);
	

}
