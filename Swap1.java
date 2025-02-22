public class Swap1 {
    public static void main(String []args){
        int a=10; int b=20;
        System.out.println("before swapping  values are .."+a+"  "+b);

        //logic1-third variable
        int t=a;
        a=b;
        b=t;

        //logic2 - use+ & - without using third variable 
         a=a+b; //10+20=30
         b=a-b; //30-20=10
         a=a-b;//30-10=20;

         //logic - use * / without third variable 
         //here a and b values should not be zero
         a=a*b;
         b=a/b;
         a=a/b;

       // logic5 -sinle statement 
       //a=10 b=20
      b=a+b-(a=b);


        System.out.println("before swapping  values are .."+a+"  "+b);


    }
}