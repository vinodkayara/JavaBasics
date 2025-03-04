
import java.util.Scanner;

public class RightTriangleStar {
    public static void main (String [] args){
      int row;
      System.out.println("Enter the number of Rows :");
      Scanner sc = new Scanner(System.in);
      row = sc.nextInt();

      for(int i=0;i<row;i++){
        for(int j=0; j<=i;j++){
            System.out.print("* ");
        }
        System.out.println();
      }
      
    }
}

