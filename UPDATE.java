package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UPDATE {

	public static void main(String[] args) throws Exception {
		/*try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:ORCLE123","SCOTT","tiger");
		Statement st=con.createStatement();
		ResultSet res=st.executeQuery("select * from sharanmp");
		System.out.println("NAME\t\tMOBILE_NO\t\tPLACE");
		while(res.next())
		{
			String name=res.getString(1);
			long number=res.getLong(2);
			String place=res.getString(3);
			System.out.println(name+"\t\t"+number+"\t\t"+place);
		}
		}
		catch (Exception e) {
			System.out.println(e);
		}*/
		try{
			String s= "UPDATE SHARANMP SET MOBILE_NO=8310419321 WHERE NAME='nanda'";
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:ORCLE123","SCOTT","tiger");
			
			Statement st=con.createStatement();
			int count=st.executeUpdate(s);
			System.out.println(count+"row updated");
			con.close();
		}
		catch (Exception e) {
			System.out.println(e);
		}

	}

}
