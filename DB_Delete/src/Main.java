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
			String sampleQuery="Delete from student where Rollno=?"; 
			PreparedStatement statement = con.prepareStatement(sampleQuery);
			statement.setString(1, "706");
			 
			int rowsDeleted = statement.executeUpdate();
			if (rowsDeleted > 0) {
			    System.out.println("A user was deleted successfully!");
			}
			con.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			con.close();
		}
	}

}