/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abhis
 */
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBConnect {
    public static void main(String args[])throws SQLException
    {
        Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/Employees","admin1","admin");
        Statement st=con.createStatement();
        String s="SELECT * from Workers";
        ResultSet rs=st.executeQuery(s);
        while(rs.next())
        {
            int id=rs.getInt("ID");
            String FN=rs.getString("FIRST_NAME");
            String LN=rs.getString("LAST_NAME");
            String J=rs.getString("JOB_TITLE");
            String p=id+" "+FN+" "+LN+" "+J;
            System.out.println(p);
        }
    }
}
