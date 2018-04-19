/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

/**
 *
 * @author Student_test
 */
public class JDBC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        
        Class.forName("com.mysql.jdbc.Driver"); 
        
        String url = "jdbc:mysql://localhost:3306/osoby";
	String login = "root";
	String password = "";
	Connection conn = DriverManager.getConnection(url,login,password);
        
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM studenci");
        
        
        ResultSetMetaData rsmd = rs.getMetaData();
        //rs.next();
        //System.out.println(rs.getString("wiek"));
        
        //System.out.println(rsmd.getColumnCount());
        
        for (int i=1; i<=rsmd.getColumnCount(); i++){
            System.out.print(rsmd.getColumnName(i)+"\t");
        }
        System.out.println("");
            
        while (rs.next()){
            for (int i=1; i<=rsmd.getColumnCount(); i++){
                System.out.print(rs.getString(i) + "\t");
            }
                System.out.println("");
        }
            
        //rs.next();
        //System.out.println(rs.getString("imie"));
        //System.out.println(rs.getMetaData());
        
                
                
    }
    
}
