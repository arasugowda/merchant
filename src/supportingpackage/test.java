/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package supportingpackage;

import java.text.*;
import java.util.*;
import java.util.Date;

/**
 *
 * @author DELL
 */
public class test {
    public static void main(String[] args) {
        
        try
        {
            /*List<Date> dates = new ArrayList<Date>();

            String str_date ="27-02-2015";
            String end_date ="10-03-2015";

            DateFormat formatter ; 

            formatter = new SimpleDateFormat("dd-MM-yyyy");
            
            
            Date  startDate = (Date)formatter.parse(str_date); 
            Date  endDate = (Date)formatter.parse(end_date);
            
            
            long interval = 24*1000 * 60 * 60; // 1 hour in millis
            long endTime = endDate.getTime() ; // create your endtime here, possibly using Calendar or Date
            long curTime = startDate.getTime();
            
            while (curTime <= endTime) 
            {
                dates.add(new Date(curTime));
                curTime += interval;
            }
            
            for(int i=0;i<dates.size();i++)
            {
                Date lDate =(Date)dates.get(i);
                String ds = formatter.format(lDate);    
                System.out.println(" Date is ..." + ds);
            } */
            
            
           /* String date = "02-2016";
            String[] input = date.split("-");
            //int day = Integer.valueOf(input[0]);
            int month = Integer.valueOf(input[0]);
            int year = Integer.valueOf(input[1]);
            Calendar cal=Calendar.getInstance();
            cal.set(Calendar.YEAR,year);
            cal.set(Calendar.MONTH,month-1);
            //cal.set(Calendar.DATE, day);
            //since month number starts from 0 (i.e jan 0, feb 1), 
            //we are subtracting original month by 1
            int days = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
            System.out.println(days);
            
            */
            
            String input = "2009-09-30";
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date myDate = dateFormat.parse(input);
            Calendar cal1 = Calendar.getInstance();
            cal1.setTime(myDate);
            cal1.add(Calendar.DAY_OF_YEAR, -1);
            Date previousDate = cal1.getTime();
            
            String date_String = String.format("%1$td-%1$tm-%1$tY",previousDate);
            System.out.println(date_String);

        }
        catch(Exception e){}
        
    }
    
}
