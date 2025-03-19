
import java.util.Scanner;

public class GCD1 {

    public static void main(String[] args) {
        int number1,number2;

        System.out.println("Enter the number 1 :");
        Scanner sc = new Scanner(System.in);
        number1 =sc.nextInt();

        System.out.println("Enter the number 2 :");
        number2 =sc.nextInt();

        int GCD=1;
        for(int i=1 ;i<number1 && i<number2; i++){
            if( number1 % i== 0 && number2 % i== 0){
              GCD = i ;
            }
            
        }
        System.out.println(GCD);


    }
    
}
