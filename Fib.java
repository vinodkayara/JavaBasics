public class Fib {
    public static void main (String []args){
       int n=20,FirstNum=0, SecNum=1,Nextnum;

       for(int i=1;i<=n;i++){
        System.out.print(FirstNum + ",");
        Nextnum=FirstNum+SecNum;
        FirstNum =SecNum;
        SecNum = Nextnum;
       }
    }
}
