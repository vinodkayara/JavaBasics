import java.util.Scanner;

public class PowerOfNumber2 {
     public static void main(String[] args) {
        int base,exponent;
        System.out.println("Enter the base:");
        Scanner sc = new Scanner(System.in);
        base=sc.nextInt();
        System.out.println("Enter the exponent:");
        exponent= sc.nextInt();


        System.out.println("the pow of entered no is :" +Math.pow(base, exponent));

     }
}
