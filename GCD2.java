import java.util.Scanner;

public class GCD2 {
    public static void main(String[] args) {
        int number1,number2;
        
        System.out.println("Enter the number 1 :");
        Scanner sc = new Scanner(System.in);
        number1 =sc.nextInt();

        System.out.println("Enter the number 2 :");
        number2 =sc.nextInt();

        while(number1!=number2){
            if(number1>number2){
                number1= number1-number2;
            }
            else if (number2> number1){
                number2 = number2-number1;
            }
        }
        System.out.println("GCD = " + number1);

    }
    
}
