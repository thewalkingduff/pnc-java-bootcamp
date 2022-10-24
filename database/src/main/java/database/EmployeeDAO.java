package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
	


	public List<Employee> findByFirstName( String firstName, String lastName ) {
		String dburl = "jdbc:mysql://192.168.2.100:3306/classicmodels";
		String user = "dev";
		String password = "ultra30dev";

		Connection connection = null;
		PreparedStatement stmt = null;
		ResultSet result = null;
		
		ArrayList<Employee> employees = new ArrayList<>();

		try {
			connection = DriverManager.getConnection(dburl, user, password);
			System.out.println("connection is read only " + connection.isReadOnly());

			String SelectSQL = "Select * FROM employees where firstName = ? and lastName = ?";
			stmt = connection.prepareStatement(SelectSQL);
			stmt.setString(1,firstName);
			stmt.setString(2,lastName);
			
			result = stmt.executeQuery();

			while (result.next()) {
				// get column 1 from the result set..
				// NOTE : the result set is 1 based so getting column 0 will fail.
				Employee e = new Employee();
				
				e.setEmployeeNumber(result.getInt(1));
				e.setFirstName(result.getString("firstName"));
				e.setLastName(result.getString("lastName"));
				e.setEmail(result.getString("email"));
				
				employees.add(e);
			}

			//System.out.println(result.toString());

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				result.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					try {
						connection.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
		
		return employees;
	}
}
