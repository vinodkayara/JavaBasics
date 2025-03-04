
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;
        boolean leap = false;
        System.out.println("THE YEAR TO BE CHECKED IS:");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();

        if(year % 4 == 0){
            if( year % 100 == 0){
                if(year % 400 == 0)
                    leap = true;
                    else 
                     leap = false;
                }else{
                
                    leap = true;
                }
                
            }
            else{
                leap = false;
        }
        
        
        System.out.println(year + " is leap year? "+ leap);
    }
}


