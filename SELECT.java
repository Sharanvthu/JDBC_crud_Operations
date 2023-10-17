package com.jdbc;
//FETCHING DATA FROM THE DATABASE
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class SELECT 
{

	public static void main(String[] args) throws Exception 
	{
		try{//7892520220
			String s="SELECT * from SHARANMP";
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:ORCLE123","SCOTT","tiger");
			Statement stm=con.createStatement();
			ResultSet res=stm.executeQuery(s);
			System.out.println("==========================================");
			System.out.println("NAME\tMOBILE_NO\tPLACE");
			System.out.println("==========================================");
			while (res.next()) 
			{
				String name=res.getString(1);
				long number=res.getLong(2);
				String place=res.getString(3);
				System.out.println(name+"\t"+number+"\t"+place);
			}
			res.close();
			stm.close();
			con.close();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}


	}

	

}
