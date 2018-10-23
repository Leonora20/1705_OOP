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
			String sampleQuery="Insert into student (Rollno, Age, Name) VALUES (?, ?, ?)";
			PreparedStatement statement = con.prepareStatement(sampleQuery);
			statement.setString(1, "710");
			statement.setString(2, "22");
			statement.setString(3, "Shweta");
			 
			int rowsInserted = statement.executeUpdate();
			if (rowsInserted > 0) {
			    System.out.println("A new Student was inserted successfully!");
			}
			con.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			con.close();
		}
	}

}