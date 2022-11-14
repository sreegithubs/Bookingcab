package com.app;

import java.util.Scanner;

import details.bookingdetails;
import details.cabdetails;
import repository.Jdbccabbook;
import repository.cabbook;
import service.booking;
import service.bookingimpl;

public class App {
private static cabdetails cabdetails;
private static bookingdetails bookingdetails;

public static void main(String[] args) {
		
		cabbook c = new Jdbccabbook();
		booking b = new bookingimpl(c);
		Scanner input = new Scanner(System.in);
		while(true)
		{	
		System.out.println("Select 1 for Booking");
		System.out.println("Select 2 for Location");
		System.out.println("Select 0 to exit");
		int option = input.nextInt();
		if(option!=0) {
		switch(option) {
		case 1:{
		cabbook cab = new Jdbccabbook();
		int id =1;// a.k.a D.A.O
		System.out.println("Enter Name");
		String username = input.next();
		System.out.println("Enter phone");
		String phoneno = input.next();
		System.out.println("Enter gender");
		String gender = input.next();
		cabdetails cd = new cabdetails(id,username,phoneno,gender);
		cab.save(cd);
		break;
		}
		case 2:{
		cabbook cab = new Jdbccabbook();
		System.out.println("Enter from location");
		String fromloc = input.next();
		System.out.println("Enter to location");
		String toloc = input.next();
		
		bookingdetails bd = new bookingdetails(fromloc,toloc);
		cab.tsave(bd);
		
		break;
		}
		
		}
}else {
	break;
} 
		}}
}
