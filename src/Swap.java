import java.awt.*;
import java.util.concurrent.SynchronousQueue;

public class   Swap {
    public static void main(String[]args){
        int a=12;
        int b= 34;
        int c= a;
        a = b;
        b = c;
        System.out.println(a);
        System.out.println(b);

    }
}
