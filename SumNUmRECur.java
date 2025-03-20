
import java.util.Scanner;

public class SumNUmRECur {
    public static void main(String[] args) {
        int number ;
        System.out.println("enter the number : ");
        Scanner sc =new Scanner(System.in);
        number = sc.nextInt();
        System.out.println("Sum of natural number:"+sum(number));


    }
  
    public static int sum(int value){
        if(value==0)
            return  0;
    

        return value + sum(value-1);
    }
        
    }
    

