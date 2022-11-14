package service;

import java.util.logging.Logger;

import details.Cab;
import repository.cabbook;

public class bookingimpl implements booking {
	private static Logger logger = Logger.getLogger("book-system");

	private cabbook cabbook;

	public bookingimpl(cabbook cabbook) {
		this.cabbook = cabbook;
	}

	public boolean transfer(String fromloc, String toloc) {

		logger.info(" intiated...");

		Cab fromAccount = cabbook.load(fromloc);

		if (fromAccount == null) {
			logger.info("cab not found " + fromloc);
			throw new CabNotFound(fromloc);
		}

		Cab toAccount = cabbook.load(toloc);

		if (toAccount == null) {
			logger.info("account not found " + toloc);
			throw new CabNotFound(toloc);
		}

	cabbook.update(fromAccount);
		cabbook.update(toAccount);



		logger.info(" success...");
		boolean t=true;
		return t;
	}


}
