import java.sql.*;
import org.mariadb.jdbc.Driver;

public class Main {

	static final String DB_LINK="jdbc:mariadb://localhost/ooplab"; //database name
	public static void main(String[] args) throws Exception {
		Connection con=null;
		try {
			new Driver();
			con=DriverManager.getConnection(DB_LINK,"root","leo"); 
			Statement smt=con.createStatement();
			String sampleQuery="Select * from student"; //db table name
			ResultSet results=smt.executeQuery(sampleQuery);
			while(results.next()) {
				System.out.println("Rollno	:" + results.getString(1) + "	|Name	:" + results.getString(3)); //column no. 
			}
			con.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			con.close();
		}
	}

}
