/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package supportingpackage;

import java.sql.*;
import java.util.Arrays;
import javax.swing.DefaultListSelectionModel;
import javax.swing.JTable;


public class StringOperation {
    
    public Database db = new Database();
    
    public String filterString(String str)
    {
        String temp = "";
        
        for(int i=0;i<str.length();i++)
        {
            if(Character.isDigit(str.charAt(i))) {  temp+=str.charAt(i); }
            
        }
        return temp;
    }
    
    
    public void get_Farmer_Patti_Array_Format(String[] table_values)
    {
                String[] patti_value = new String[table_values.length];
                String[] farmer_name  = new String[table_values.length];
                String[] unique_farmer_with_null = new String[table_values.length];
                String[] temp_storage = new String[19];
                int count = 0;
        
        
                    // this loop will get each row
                    // and split the each row
                    // and get the farmer names and that names
                    // will be stored in array variable
                    for(int i = 0;i<table_values.length;i++) 
                    {
                        temp_storage = table_values[i].split("/");
                        farmer_name[i] = temp_storage[1];
                    }
        
        
        
                // This will return the unique farmer names in an array with null values at last    
                unique_farmer_with_null = print_Distinct_Elements(farmer_name,0,unique_farmer_with_null);
        
                // This will count how many null values are not present 
                // in an array
                for(int i=0;i<unique_farmer_with_null.length;i++)
                {
                    if(unique_farmer_with_null[i]!=null)
                    {
                        count++;
                    }
                }
        
        
        
                // assigning the unique farmer values into an another array
                String[] unique_farmer = new String[count];
                int m = 0;
                for(int i=0;i<unique_farmer_with_null.length;i++)
                {
                        if(unique_farmer_with_null[i]!=null)
                        {
                            unique_farmer[m] = new String(unique_farmer_with_null[i]);
                            m++;
                        }
                }
                
                
                
                print_details(table_values,unique_farmer);
                
                
        
    }
    
    
    
     public void print_details(String[] table_values,String[] unique_farmer)
    {
            try
            {
                    Connection con = db.dbConnect();
                    Statement st = con.createStatement();
                    ResultSet rs = null;
                    double farmer_commission = 0.0;
                    double x_value_calc = 0.0;
                    
                    
                    System.out.println("FARMER TRANSACTION PATTI\n");
                    for(int i=0;i<unique_farmer.length;i++)
                    {
                            Boolean NAME_COUNT = true;
                            Double total = 0.0;
                            System.out.println("-----------------------------------------------------");
                            for(int j=0;j<table_values.length;j++)
                            {
                                    String[] farmer = table_values[j].split("/");
                                    
                                    if(farmer[1].equalsIgnoreCase(unique_farmer[i]))
                                    {
                                            if(NAME_COUNT)
                                            {
                                                System.out.println(unique_farmer[i]+",\t\t\t"+farmer[7]);
                                                System.out.println("-------------------------------------------------");
                                                System.out.println("Amount \t   Rate/Kg \t    kg\t    Slno");
                                                System.out.println("--------------------------------------------------");
                                                NAME_COUNT = false;
                                            }
                                            Double item_amt = Double.parseDouble(farmer[8]) * Double.parseDouble(farmer[3]);
                                            System.out.println(item_amt+" \t    "+farmer[8]+"  \t   "+farmer[3]+" \t     "+farmer[4]);
                                            rs = st.executeQuery("select * from commodity where itemname='"+farmer[2]+"'");
                                            
                                            if(rs.next()){
                                                farmer_commission = Double.parseDouble(rs.getString("farmercommission"));
                                            }
                                            
                                            x_value_calc = x_value_calc + ((item_amt * farmer_commission) / 100);
                                            total = total + item_amt;
                                            // System.out.println("--------------------------------------------------");
                                    }
                                     
                                
                            }
                            System.out.println("--------------------------------------------------");
                            System.out.println(total+"  \t\t\t   "+(total - x_value_calc)+"\n\n");
                    }
            }
            catch(Exception e){}        
    
    }
     
     
     
     
     
     
      public void get_Farmer_patti(String[] table_values)
    {
                String[] patti_value = new String[table_values.length];
                String[] farmer_name  = new String[table_values.length];
                String[] unique_farmer_with_null = new String[table_values.length];
                String[] temp_storage = new String[19];
                int count = 0;
        
        
                    // this loop will get each row
                    // and split the each row
                    // and get the farmer names and that names
                    // will be stored in array variable
                    for(int i = 0;i<table_values.length;i++) 
                    {
                        temp_storage = table_values[i].split("/");
                        farmer_name[i] = temp_storage[1];
                    }
        
        
        
                // This will return the unique farmer names in an array with null values at last    
                unique_farmer_with_null = print_Distinct_Elements(farmer_name,0,unique_farmer_with_null);
        
                // This will count how many null values are not present 
                // in an array
                for(int i=0;i<unique_farmer_with_null.length;i++)
                {
                    if(unique_farmer_with_null[i]!=null)
                    {
                        count++;
                    }
                }
        
        
        
                // assigning the unique farmer values into an another array
                String[] unique_farmer = new String[count];
                int m = 0;
                for(int i=0;i<unique_farmer_with_null.length;i++)
                {
                        if(unique_farmer_with_null[i]!=null)
                        {
                            unique_farmer[m] = new String(unique_farmer_with_null[i]);
                            m++;
                        }
                }
                
                
                
                print_details_only_kg(table_values,unique_farmer);
                
                
        
    }
    
    
    
    public void print_details_only_kg(String[] table_values,String[] unique_farmer)
    {
            try
            {
                    System.out.println("\n\nFARMER KG PATTI\n\n");
                    for(int i=0;i<unique_farmer.length;i++)
                    {
                            Boolean NAME_COUNT = true;
                            System.out.println("-----------------------------------------------------");
                            for(int j=0;j<table_values.length;j++)
                            {
                                    String[] farmer = table_values[j].split("/");
                                    
                                    if(farmer[1].equalsIgnoreCase(unique_farmer[i]))
                                    {
                                            if(NAME_COUNT)
                                            {
                                                System.out.println(unique_farmer[i]+",\t\t\t"+farmer[7]);
                                                System.out.println("-------------------------------------------------");
                                                System.out.println("kg\t    Slno");
                                                System.out.println("--------------------------------------------------");
                                                NAME_COUNT = false;
                                            }
                                            System.out.println(farmer[3]+" \t     "+farmer[4]);
                                    }
                                     
                            }
                            System.out.println("--------------------------------------------------");
                           
                    }
            }
            catch(Exception e){}        
    
    }
     
     
     
    
    
    
    
    
    
    
    
    public String[] print_Distinct_Elements(String[] arr,int count,String[] unique_farmer)
    {
       
        int k = 0;
        int m = 0;
        
        String key_name = arr[k];
        String[] tmp = new String[arr.length];
        
        
            for(int i=0;i<arr.length;i++)
            {
                if(!key_name.equalsIgnoreCase(arr[i]))
                {
                    tmp[m] = new String(arr[i]);
                    m++;
                }
            }
            
            
           
            
                int count1 = 0;
                for(int j=0;j<tmp.length;j++)
                {
                    if(tmp[j]!=null)
                    {
                        count1++;
                    }
                }
           
                    String[] tmp1 = new String[count1];
                    for(int n=0;n<count1;n++)
                    {
                        tmp1[n] = new String(tmp[n]);
                    }
           
            
            
                    unique_farmer[count] = key_name;
                    count++;
                        if(count1 != 0) 
                        {   return print_Distinct_Elements(tmp1, count, unique_farmer);  }
                        
        return unique_farmer;
    }
    
    
    
    
    
    
    public int getSelectedCount(JTable table_transaction)
    {
        int ret_val = 0;
        DefaultListSelectionModel selectionModel = (DefaultListSelectionModel) table_transaction.getSelectionModel();
        
        try
        {
                // loops executes based on numbers of
                // rows in the table
                for (int i1 = 0; i1 < table_transaction.getRowCount(); i1++)
                {

                        // Condition executes based on selected
                        //rows in the table
                        if (selectionModel.isSelectedIndex(i1))
                        {
                            ret_val++;
                        }                       
                }
        }
        catch(Exception e){}
        return ret_val;
    }
    
    
    
}
