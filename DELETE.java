package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DELETE {

	public static void main(String[] args) throws Exception {
		try {
			String s="delete from sharanmp where name='bayya'";
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:ORCLE123","SCOTT","tiger");
			Statement st=con.createStatement();
			int count =st.executeUpdate(s);
			System.out.println(count+"rows deleted");
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
//"oracle.jdbc.driver.OracleDriver"
//"jdbc:oracle:thin:@localhost:1521:ORCLE123","SCOTT","tiger"