package repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import database.FirstConnection;
import details.Cab;
import details.bookingdetails;
import details.cabdetails;

public class Jdbccabbook implements cabbook{
	
	Scanner input = new Scanner(System.in);
	public void save(cabdetails cabdetails) {
			Connection con = null;
		try {
			con = FirstConnection.getConnection();

			String sql = "insert into cabdetails (id,username,phoneno,gender) values (?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, cabdetails.getid());
			ps.setString(2, cabdetails.getUsername());
			ps.setString(3,cabdetails.getPhoneno());
			ps.setString(4,cabdetails.getgender());
	
			int rowCount = ps.executeUpdate();
			if (rowCount == 1) {
				System.out.println(" Created");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public Cab load(String location) {	

		Cab cab = null;

		Connection connection = null;
		try {
			connection = FirstConnection.getConnection();

			String sql = "select * from cabdetails where id=?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, location);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				cab = new Cab();
				cab.setid(rs.getInt(1));
				cab.setUsername(rs.getString(2));
				cab.setPhoneno(rs.getString(3));
				cab.setgender(rs.getString(4));
				
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return cab;
	}

	public void update(Cab cab) {

		Connection connection = null;
		try {
			connection = FirstConnection.getConnection();

			String sql = "update cabdetails set where id=?";
			PreparedStatement ps = connection.prepareStatement(sql);
	
			ps.setString(1, cab.getUsername());
			ps.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}
	public List<cabdetails> getcabdetails(int n1) {
	
	Connection con = null;

	List<cabdetails> cabdetails1 = new ArrayList<cabdetails>();

	try {
		con = FirstConnection.getConnection();
		String sql;
		if(n1==0) {
		sql="select * from cabdetails;";
		}
		else {
		sql="select * from cabdetails where id="+n1+";";
		}
		
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);

		while (rs.next()) {
			cabdetails cabdetails = new cabdetails();
			cabdetails.setUsername(rs.getString(1));
			cabdetails.setPhoneno(rs.getString(2));
			cabdetails.setgender(rs.getString(3));
			
			cabdetails1.add(cabdetails);
		}

	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	return cabdetails1;

}
	
	public List<bookingdetails> getTransfer() {
	
	Connection con = null;

	List<bookingdetails> tdetails1 = new ArrayList<bookingdetails>();

	try {
		con = FirstConnection.getConnection();

		String sql="select * from trans;";
		
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);

		while (rs.next()) {
			bookingdetails bd = new bookingdetails();
			bd.setFromloc(rs.getString(1));
			bd.setToloc(rs.getString(2));
			bd.setDate(rs.getString(3));
			tdetails1.add(bd);
		}

		// step-7 : close connection
	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	return tdetails1;
	}


	public void tsave(bookingdetails bd) {
		Connection con = null;
		try {
			con = FirstConnection.getConnection();
			String sql = "insert into trans (fromloc,toloc,date) values (?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);

			Date utilDate = new Date(0);
			LocalDate Date = LocalDate.now();
			ps.setString(1, bd.getFromloc());
			ps.setString(2, bd.getToloc());
			ps.setDate(3, new java.sql.Date(utilDate.getTime()));
			//ps.setDate(4, new java.sql.Date(utilDate.getTime()));

			int rowCount = ps.executeUpdate();
			if (rowCount == 1) {
				System.out.println(" updated");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
	
}
