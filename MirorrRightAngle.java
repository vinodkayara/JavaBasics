public class MirorrRightAngle{
    public static void main(String[] args) {
        int row=6;
        for(int i=1;i<=row;i++){
            for(int j=(row-i)*2;j>=1;j--)
               System.out.print(" ");
            
            for(int j=1;j<=i;j++)
                System.out.print("* ");
                System.out.println();
              
            }
        }
    }
