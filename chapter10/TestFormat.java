import java.util.Calendar;
import java.util.Date;

/**
 * TestFormat
 */
public class TestFormat {

    public static void main(String[] args) {
        String s=String.format("%c",55);    //int to char
        String a=String.format("%x",55);   // to hexadecimal
        String b=String.format("%d", 55);  // int formating 
        String c=String.format("% .2f", 55.321); //Float formating

        
        System.out.println("character : "+s+"\nHexadecimal: "+a+"\nDecimal : "+b+"\nfloat: "+c);
        System.out.println(String.format("For. more than one arr first %d second %.1f ",55,56.23));
        
        //Date formating
        System.out.println(String.format("%tc",new Date()));  //for complete Date and time
        System.out.println(String.format("%tr",new Date()));  //for just time
        System.out.println(String.format("%tA, %tB %td", new Date(),new Date(),new Date())); 
        //tA fori week tB for month td for date
        System.out.println(String.format("%tA, %<tB %<td",new Date()));  //Same as above arg.
         


        //calender formating

        Calendar cal=Calendar.getInstance();
        cal.set(2001,6,4,12,00);
        long date1=cal.getTimeInMillis();
        date1+=1000*60*60;
        System.out.println("Time in millisec : "+date1);
        System.out.println("date is : "+ cal.getTime());
        cal.add(cal.DATE,60);
        System.out.println("Adding 60 days : "+cal.getTime());
        cal.set(2001,6,4,12,00);
        cal.roll(cal.DATE,60);
        System.out.println("Adding 60 dates : "+cal.getTime());
        cal.set(2001,6,4,12,00);
        cal.set(cal.DATE, 2);
        System.out.println("Setting Date to 2 : "+cal.getTime());

    }
}