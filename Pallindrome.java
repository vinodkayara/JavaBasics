
import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
      int number;       //121
      System.out.println("enter the number: ");  
      Scanner sc = new Scanner(System.in);
      number = sc.nextInt();
      int reversedNum=0 ; int temp=number;

      while(temp>0){
        int remainder = temp % 10;       //121%10=1
        reversedNum = reversedNum * 10 + remainder;    
        temp = temp /10;


      }
      if(reversedNum == number){
        System.out.println("number is pallindrome ");
      }else{
        System.out.println(" number is not pallimdrome ");
      }

    
    }
}
