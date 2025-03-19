
import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        int base,exponent;
        System.out.println("Enter the base:");
        Scanner sc = new Scanner(System.in);
        base=sc.nextInt();
        System.out.println("Enter the exponent:");
        exponent= sc.nextInt();

        int result =1;
        for(int i=1;i<=exponent;i++){
            result = result * base ;

        }
        System.out.println("The pow of entered number is :"+result);
    }
    
}
