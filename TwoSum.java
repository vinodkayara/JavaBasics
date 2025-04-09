import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array :");
        int n =  sc.nextInt();

        int[] nums=new int[n];
        System.out.println("enter array elements ");

        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }

        System.out.println("enter target sum:");
        int target = sc.nextInt();

        int[] result=twoSum(nums,target);

        if(result.length==2){
            System.out.println("Indices of elements are :"+result[0]+ "and" +result[1]);

        }
        else{
            System.out.println("No such pair found!");
        }

    }
    public static int[] twoSum(int[] nums,int target){
        HashMap<Integer,Integer> map= new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int rem = target - nums[i];

            if(map.containsKey(rem)){
                return new int[] {map.get(rem),i};
            }
            map.put(nums[i],i);
        }
        return new int[] {};
    }
    }

