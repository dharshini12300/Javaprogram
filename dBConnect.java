package propertiesfile;

import java.sql.*;

public class dBConnect {
		
    public static Connection getConn()
    {
    	Connection con = null;
    	//driver name for mysql
    	String loadDriver = "com.mysql.cj.jdbc.Driver";
    	  
        // url of the
        String dbURL = "jdbc:mysql://localhost:3306/DbName";
        // database
  
        // username to coonect db
        String dbUSERNAME = "root";
  
        // password to connect db
        String dbPASSWORD = "root";
  
        try {
            // load the driver
            Class.forName(loadDriver);
            con = DriverManager.getConnection(
                dbURL, dbUSERNAME, dbPASSWORD);
  
            // get the connection
            Statement st = con.createStatement();
            ResultSet rs
                = st.executeQuery("SELECT * FROM CUSTOMER");
            while (rs.next()) {
                System.out.println(
                    "ID -" + rs.getInt(1) + " || "
                    + "First-Name -" + rs.getString(2)
                    + " || "
                    + "LastName -" + rs.getString(4));
            }
        }
        catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
  
        return con; // return the connection obj.
    
    }

	public static void main(String[] args)
	{
		dBConnect.getConn();
	}

}
