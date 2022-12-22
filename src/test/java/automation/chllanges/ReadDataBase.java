package automation.chllanges;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ReadDataBase {
	// Step 1) Make a connection to the Database using method.
		// DriverManager.getConnection(URL, "userid", "password")

		// Step 2) Create Query to the Database using the Statement Object.
		// Statement stmt = connection.createStatement();

		// Step 3) Send the query to database using execute query and store the results
		// in the ResultSet object.
		// ResultSet rs = stmt.executeQuery(select * from employee;);
		//JDBC is a library which has JAR file. Connection,ResultSet and Statement is interface 		
		public static void main(String[] args) throws Throwable {
		//JDBC path by using class.forName()
		Class.forName("oracle.jdbc.driver.oracleDriver");
		//With the hepl of getConnection() I have to pass url,host,Schema,UserName $ password
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin@localhost:1521/database","hr","hr");
		//To omit case sensitive issue
		Statement stmt=connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
		ResultSet rs=stmt.executeQuery("select * from employees"); 
		//For bunch of data
		List<String> columnvalue=new ArrayList<String>();
		while(rs.next()) {   //To omit header
		columnvalue.add(rs.getString("salary"));	
			
		}
		System.out.println(columnvalue);
	}
	

}
