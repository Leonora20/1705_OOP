import java.io.Writer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import org.mariadb.jdbc.Driver;

public class db_insert {

	static final String DB_LINK ="jdbc:mariadb://localhost/ooplab";
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Scanner sc=null;
		Writer wr=null;
		
		
		
		Connection con=null;
		try{
			new Driver();
			con=DriverManager.getConnection(DB_LINK,"root","leo");
			Statement smt=con.createStatement();
			String sqlquery="select * from student";
			ResultSet records=smt.executeQuery(sqlquery);
			while(records.next())
			{
				System.out.println(records.getNString("rollno")
						+" "+ records.getNString(1));
			}
			
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		
		
	}
}
