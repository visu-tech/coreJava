package comfanocciseries;

public class Fibonacci {
    public static void performFibonacci(int num){
        int a=0,b=1;
        System.out.println(a+""+b);

       for(int i=1;i<num;i++) {
           int c = (a + b);

           System.out.println("" + "" + c);

           a = b;
           b = c;

       }
           System.out.println(num);


       }




    }

