import java.util.Scanner;

public class ArmstrongNumber {
    public static boolean isArmstrong(int number) {
        int originalNumber =number,sum=0,digits = 0,temp=number;

        while(temp>0){
            temp= temp/10;
            digits++;
        }
        temp= number;

        while(temp>0){
        
            int  digit = temp%10;
            sum =sum + (int)Math.pow(digit, digits);
            temp=temp/10;


        }
        return sum == originalNumber;

        
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number :");
        int num = sc.nextInt();
        sc.close();

        if(isArmstrong(num)){
            System.out.println(num + " is Armstrong number.");
        }
        else{
            System.out.println(num+ "is not an Armstrong number");
        }
    }
}