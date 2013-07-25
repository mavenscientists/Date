package date;

/**
 *
 * @author  Karan Sharma
 * @time     Jul 25, 2013 8:14:52 AM 
 */
public class Date {

    //default values
    int day = 1;
    int month = 1;
    int year = 2001;
    
    void setDay(int day)
    {
        this.day = day;
    }
    
    void setMonth(int month)
    {
        this.month = month;
    }
    
    void setYear(int year)
    {
        this.year = year;
    }
    
    int getDay()
    {
        return day;
    }
    
    int getMonth()
    {
        return month;
    }
    
    int getYear()
    {
        return year;
    }
    
    public static void main(String[] args) 
    {
        Date defaultDate = new Date();
        System.out.println("--System Default Date--");
        System.out.println("Day   : " + defaultDate.getDay() );
        System.out.println("Month : " + defaultDate.getMonth() );
        System.out.println("Year  : " + defaultDate.getYear() );
        
        Date date1 = new Date();
        date1.setDay(25);
        date1.setMonth(7);
        date1.setYear(2013);
        System.out.println("--New Date--");
        System.out.println("Day   : " + date1.getDay() );
        System.out.println("Month : " + date1.getMonth() );
        System.out.println("Year  : " + date1.getYear() );
                
    }

}
