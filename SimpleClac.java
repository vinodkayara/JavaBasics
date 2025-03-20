
import java.util.Scanner;

public class SimpleClac {
    public static void main(String[] args) {
        int opr ,n1,n2;
        System.out.println("choose the operator");
        System.out.println("1.ADD\n 2.SUBSTRACT\n 3.MULTIPLY\n 4.DIVIDE");
        Scanner sc = new Scanner(System.in);
        opr=sc.nextInt();

        System.out.println("Enter the first NUmber :");
        n1= sc.nextInt();

        System.out.println("Enter the Seccond Number");
        n2 = sc.nextInt();

        int result = 0;
        
        switch (opr) {
            case 1:
                result = n1 + n2;
                break;

            case 2:
                result = n1 - n2;
                break;
            case 3:
                result = n1 * n2;
                break;
            case 4:
                result = n1 / n2;
                break;
            default:
                System.out.print("Entered Operator is not valid");
        }
        System.out.print("The result is :"+ result);
    
    }
    
}
