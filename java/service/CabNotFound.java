package service;

public class CabNotFound extends RuntimeException {

	public CabNotFound(String cabnum) {
		super(cabnum);
	} 

}
