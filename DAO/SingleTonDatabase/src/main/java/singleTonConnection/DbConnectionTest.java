package singleTonConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbConnectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = DbConnection.getDatabaseCoonection();
		try {
			String insertQuery = "insert into student values(8,'Alpesh','prajapati',25,'1995-07-21')";
			String query = "select * from student";
			Statement st = con.createStatement();
			int row = st.executeUpdate(insertQuery);
			ResultSet rs = st.executeQuery(query);
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4)
						+ " " + rs.getString(5));
			}

		} catch (Exception e) {
			System.out.print(e);
		}

	}

}
