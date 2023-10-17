package com.jdbc;
//INSERTING DATA INTO DATABASE

import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class INSERT {

	public static void main(String[] args) throws Exception {
		Scanner s=new Scanner(System.in);
		System.out.println("insert name:");
		String  name=s.nextLine();
		
		System.out.println("insert place:");
		String place=s.nextLine();
		System.out.println("insert number:");
		long number=s.nextLong();
System.out.println("thank you");
		try{
			String s1="INSERT INTO SHARANMP VALUES('"+name+"','"+number+"','"+place+"')";
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:ORCLE123","SCOTT","tiger");

			PreparedStatement st=con.prepareStatement(s1);
			st.execute();
			System.out.println("data inserted successfully");




			con.close();
		}
		catch (Exception e) {
			System.out.println(e);
		}

	}

}
