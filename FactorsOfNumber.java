
import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        int number;
        System.out.println("enter the number :");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();

        System.out.println("the factors of the numbers are :");

            for(int i =1;i<=number;i++){
              if( number % i==0){
               System.out.print( i + " ");
              }
            }
    }
}
