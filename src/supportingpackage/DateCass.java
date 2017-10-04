
package supportingpackage;

import java.text.*;
import java.util.*;
public class DateCass 
{
    public void getNoOfdays(int startdate,int startmonth ,int startyear,int enddate,int endmonth,int endyear)
    {
            Calendar cal1 = new GregorianCalendar();
            Calendar cal2 = new GregorianCalendar();
            cal1.set(startyear, startmonth, startdate); 
            cal2.set(endyear, endmonth, enddate);
            System.out.println("Days= "+daysBetween(cal1.getTime(),cal2.getTime()));
    }    
      
    
        public int daysBetween(Date d1, Date d2)
        {
            return (int)( (d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24));
        }  

        
        
     public List getDates(Date from , Date to)
     {
            List<Date> dates = null;
            try
            {
                    dates = new ArrayList<Date>();
                    
//                    String str_date ="27-02-2015";
//                    String end_date ="10-03-2015";
                
                    
                    String str_date = String.format("%1$td-%1$tm-%1$tY",from);
                    String end_date = String.format("%1$td-%1$tm-%1$tY",to);
                    
                    

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

            
            }
            catch(Exception e){}
     
        return dates;           
     }
     
     
     public String getPreviousDate(String date_string) throws Exception
     {
            
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            Date myDate = dateFormat.parse(date_string);
            Calendar cal1 = Calendar.getInstance();
            cal1.setTime(myDate);
            cal1.add(Calendar.DAY_OF_YEAR, -1);
            Date previousDate = cal1.getTime();
            
            String date_String = String.format("%1$td-%1$tm-%1$tY",previousDate);
            System.out.println(date_String);
         
            return date_String;
     }
     
        
        
}
