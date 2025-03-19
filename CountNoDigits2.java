import java.util.Scanner;

public class CountNoDigits2 {
     public static void main(String[] args) {
        int number;
        System.out.print("Enter the numbers :");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        String str= String.valueOf(number);

        System.out.println("Count of digit is : "+str.length());
    
}
}
