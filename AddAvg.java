public class AddAvg {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int sum=0;
        float avg=0;


        for(int i=0;i<arr.length;i++){
              sum=sum+ arr[i];
              avg = sum/ arr.length;

        }
        System.out.println(sum);
        System.out.println(avg);

    }
}
