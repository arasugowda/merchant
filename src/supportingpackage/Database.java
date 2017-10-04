/*
 *  Developed By InfiniteGlobe
 * 
 */

package supportingpackage;

import java.sql.SQLException;
import javax.sql.*;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Database 
{

        String dbURL = "jdbc:mysql://localhost:3306/merchant"; // Mysql Database Connection url
        String username = "root"; // database username
        String password = "root"; // database password
    
    
        // method establishes the database connection
        public Connection dbConnect()
        {
                Connection conn = null;    
                try
                {
                        Class.forName("com.mysql.jdbc.Driver"); // Loading the driver
                        conn = DriverManager.getConnection(dbURL, username, password); // Connecting to Mysql Databse
                }
                catch(Exception e){}
                return conn;     
        }        
     
    
        // method used to get requested coloumn value from thew table 
        public String getRequestedValue(String sql_query , String colname , String type)
        {
                String ret_value = "";
              
                
               try
               {
                       Class.forName("com.mysql.jdbc.Driver"); // Load the Driver
                       Connection conn =  DriverManager.getConnection(dbURL, username, password); // Connect to Database
                       Statement stmt = conn.createStatement(); // Create Statement
                       ResultSet select_result = stmt.executeQuery(sql_query); // Execute the query

                       if (select_result.next())
                       {
                                    // if coloumn type is of int ,then condition executes
                                    if(type.equals("INT-FORMAT")) 
                                        { ret_value = Integer.toString(select_result.getInt(colname)); }
                                    
                                    // if coloumn type is of float ,then condition executes
                                    if(type.equals("FLOAT-FORMAT"))
                                        { ret_value =  Float.toString(select_result.getFloat(colname)); }
                                    
                                    // if coloumn type is of long ,then condition executes
                                    if(type.equals("LONG-FORMAT")) 
                                        { ret_value = Long.toString(select_result.getLong(colname)); }
                                    
                                    // if coloumn type is of string ,then condition executes
                                    if(type.equals("STRING-FORMAT"))
                                        { ret_value = select_result.getString(colname); }
                                    
                                    // if coloumn type is of double ,then condition executes
                                    if(type.equals("DOUBLE-FORMAT"))
                                        { ret_value = Double.toString(select_result.getDouble(colname));}
                                    
                                     // if coloumn type is of boolean ,then condition executes
                                    if(type.equals("BOOLEAN-FORMAT"))
                                        { ret_value = Boolean.toString(select_result.getBoolean(colname));}
                                
                       }
              }
              catch(Exception e){}
                
                return ret_value;
                
        }
        
        //method insert the rows to table
        public void insert(String tablename,String sql_query)
        {
                try 
                {
                        Class.forName("com.mysql.jdbc.Driver"); // Loading the driver
                        Connection conn =  DriverManager.getConnection(dbURL, username, password); // Connecting to database
                        Statement stmt = conn.createStatement(); //Creting the statement 
                        int result =  stmt.executeUpdate(sql_query); // executing the query
                        
                        if(result > 0)
                        {
                               // if data inserted 
                               JOptionPane.showMessageDialog(null, "DATA INSERTED");
                        }
                        else
                        {
                               // if data is not inserted 
                               JOptionPane.showMessageDialog(null, "DATA NOT INSERTED...PLEASE CHECK AGAIN");
                        }
                
                    conn.close(); // Closing the Connection
                }    
                catch (Exception ex) {}
        }
    
        
        // method to insert the row
        public void insertRow(String tablename,String sql_query)
        {
                try 
                {
                        Class.forName("com.mysql.jdbc.Driver"); //Loading the Driver
                        Connection conn =  DriverManager.getConnection(dbURL, username, password); // Connecting to database
                        Statement stmt = conn.createStatement(); // Creating the statement
                        int i = stmt.executeUpdate(sql_query); // executing the query
                        conn.close(); //closing the connection
                }    
                catch (Exception ex) {}
        }
    
    
        
        
            // method returns the number of rows from the table
            public long addToTable(String tablename,String sql)
            {
                    long value = 0;
                
                    try
                    {
                            Class.forName("com.mysql.jdbc.Driver"); // Loading the Driver
                            Connection conn =  DriverManager.getConnection(dbURL, username, password); //Database Connection
                            Statement stmt = conn.createStatement(); // Creating Statement
                            int result =  stmt.executeUpdate(sql); // executing the query
                            
                                if(result>0)
                                {
                                     // getting the maximum value from table   
                                     String select_query = "SELECT max(id) as LargestID FROM "+tablename;
                                     ResultSet select_result = stmt.executeQuery(select_query);

                                        if (select_result.next())
                                        {
                                                // gets the Largest Id value
                                                value = select_result.getInt("LargestID");
                                        }
                                }     
                     
                    }
                    catch(Exception e){}
                    
                    // returning the value
                    return value;
               
              }
            
         
            
            
            
            
            
            
            
            
        public void update_table(String tablename,String sql_query)
        {
                try 
                {
                     Class.forName("com.mysql.jdbc.Driver");
                     Connection conn =  DriverManager.getConnection(dbURL, username, password);
                     Statement stmt = conn.createStatement();
                        
                     int result =  stmt.executeUpdate(sql_query);
                
                        if(result > 0){
                            JOptionPane.showMessageDialog(null, tablename+" UPDATED SUCCESSFULLY!!!");
                        }
                        else
                        {
                             JOptionPane.showMessageDialog(null, tablename+" NOT UPDATED...PLEASE CHECK AGAIN");
                        }
                
                conn.close();
                } 
                catch (Exception ex) {}
        }
        
        
        
        
        
        
        
        
        // method use to delete the row rom the table
        public void delete_table(String tablename,String sql_query)
        {
                try 
                {
                     Class.forName("com.mysql.jdbc.Driver"); // Load the driver
                     Connection conn =  DriverManager.getConnection(dbURL, username, password); // Database Connecion
                     Statement stmt = conn.createStatement(); // Create Statement
                        
                        int result =  stmt.executeUpdate(sql_query); // execute the query
                        if(result > 0)
                        {
                            // if row are deleted
                            JOptionPane.showMessageDialog(null, tablename +" DELETED SUCCESSFULY!!!!");
                        }
                        else
                        {
                             // if row are not deleted
                            JOptionPane.showMessageDialog(null, tablename +" NOT DELETED...PLEASE CHECK YOUR ID AGAIN");
                        }
                    
                    // Close the Database Connection   
                    conn.close();
                } 
                catch (Exception ex) {}
        }
            
           
        
        // method return the number of rows in the table
        public long return_row_count(String sql,String col)
        {
               long value = 0;
               try
               {
                       Class.forName("com.mysql.jdbc.Driver"); // Load the Driver
                       Connection conn =  DriverManager.getConnection(dbURL, username, password); // Connect to Database
                       Statement stmt = conn.createStatement(); // Create Statement
                       ResultSet select_result = stmt.executeQuery(sql); // Execute the query

                       if (select_result.next())
                       {
                               // get the vale and assign it to the variable     
                               value = select_result.getInt(col);
                       }
              }
              catch(Exception e){}
                
                    //returning the value
                    return value;
        
        }
        
        
            
            
}
