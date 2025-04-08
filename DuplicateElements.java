import  java.util.*;
import  java.util.HashSet;
public class DuplicateElements {
    public static boolean containsDuplicate(int[] nums){
        HashSet<Integer> set = new HashSet<>();

        for(int num: nums ){
            if(set.contains(num)){
                return true ;
            }
            set.add(num);


        }
        return false;

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("enter size of array:");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println(" enter the array elements: ");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();

        }
        boolean result =containsDuplicate(nums);

        if(result)
        System.out.println("Duplicate element is Found");

        else
         System.out.println("No Duplicate element ");

        

    }
}
