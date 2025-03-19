import java.util.Scanner;

public class COuntNoDigits {
    public static void main(String[] args) {
        int number;
        System.out.print("Enter the numbers :");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();

        int count=0;
        while(number!=0){
            number = number/10;
            count++;
        }
        System.out.print("The count of digit is : "+count);
    }
    
}
