package kiran2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Mysql2 {      
	
	static final String dburl="jdbc:mysql://localhost/katmandu";
	static final String user="root";
	static final String pass="kiran";
	
	public static void main(String args[]) throws SQLException, NumberFormatException, IOException {
		
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		int choice;
		con=DriverManager.getConnection(dburl,user,pass);	
		
		do {
			System.out.println("\n");
			System.out.println("Menu :");
			System.out.println("1. insert Record into Table");
			System.out.println("2. Update the existing Record :");
			System.out.println("3. Dispaly all the records from table:");
			System.out.println("4. delete the record:");
			System.out.println("5. Exit");
			
			System.out.println("Enter your choice:");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    
			choice=Integer.parseInt(br.readLine());
			
			switch(choice)
			{
			case 1:
				System.out.println("Enter your First Name: ");
				String FristName=br.readLine();
				
				System.out.println("Enter your Last Name: ");
				String LastName=br.readLine();
				
				System.out.println("Enter your Roll: ");       
				int Roll=Integer.parseInt(br.readLine());
				
				String sql="insert into kt values (?,?,?)";
				PreparedStatement p=con.prepareCall(sql);
				
			    p.setString(1, FristName);
				p.setString(2, LastName);
				p.setInt(3,Roll);
				
				p.executeUpdate();
				System.out.println("runnde");
				break;
			case 2:
				System.out.println("Enter Roll Number Update");
				Roll=Integer.parseInt(br.readLine());
				
				System.out.println("Enter New First Name: ");
				 FristName=br.readLine();
				
				System.out.println("Enter New Last Name: ");
				 LastName=br.readLine();
				 
				 sql="Update kt set FirstName=?, LastName=? Where Roll=? ";
				 p=con.prepareCall(sql);
					
				    p.setString(1, FristName);
					p.setString(2, LastName);
					p.setInt(3,Roll);
					
					p.executeUpdate();
					System.out.println("Record Update");
					break;
					
			case 3:
				stmt=con.createStatement();
				sql="select * from kt";
				rs=stmt.executeQuery(sql);
				
				while(rs.next())
                {
					System.out.println("\n");
					System.out.println(rs.getString(1));
					System.out.println(rs.getString(2));
					System.out.println(rs.getString(3));
				}
				break;
				
			case 4:
				System.out.println("Enter roll no. you wish to delete:");
				int rolls=Integer.parseInt(br.readLine());
				
				sql="delete from kt where roll=?";
				p=con.prepareStatement(sql);
				p.setInt(1, rolls);
				p.executeUpdate();
				System.out.println("Record deleted!!..");
				break;
				
			case 5:
				System.exit(0);
				break;
				
				default:
					System.out.println("invalid choice..try later!!");
					break;
				
                    
				
				
			}
			
		}while(choice!=5);
			
			
			
		} 
		}

    

