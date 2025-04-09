import java.util.Scanner;

public class SmallerNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of n :");
        int n = sc.nextInt();

        System.out.println("enter the elements of array:");
        int [] nums = new int[n];

        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int[] result=new int[n];

        for(int i=0;i<n;i++){

         int count=0;
          for(int j=0;j<n;j++){
            if(nums[j]<nums[i]){
                count++;
            }
          }
          result[i]=count;
        }
        System.out.println("Count of smaller numbers than current number:");
            for(int res : result){
                System.out.println(res+ " ");
            }  
    }
    
}
