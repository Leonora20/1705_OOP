import java.sql.*;
import org.mariadb.jdbc.Driver;

public class Main {

	static final String DB_LINK="jdbc:mariadb://localhost/ooplab"; //database name
	public static void main(String[] args) throws Exception {
		Connection con=null;
		try {
			new Driver();
			con=DriverManager.getConnection(DB_LINK,"root","leo"); //db user password
			Statement smt=con.createStatement();
			String sampleQuery="Update student set Age=?, Name=? WHERE Rollno=?"; 
			PreparedStatement statement = con.prepareStatement(sampleQuery);
			statement.setString(1, "22");
			statement.setString(2, "Vishu");
			statement.setString(3, "718");
			 
			int rowsUpdated = statement.executeUpdate();
			if (rowsUpdated > 0) {
			    System.out.println("An existing user was updated successfully!");
			}
			con.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			con.close();
		}
	}

}