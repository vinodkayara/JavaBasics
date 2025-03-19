
import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        int number;
        System.out.println("enter the number:");
        Scanner sc =new Scanner(System.in);
        number= sc.nextInt();


        if(number % 2==0){
            System.out.println("Entered Number is Even.");
        }
        else{
            System.out.println("Entered Number is Odd.");
        }
    }
}
