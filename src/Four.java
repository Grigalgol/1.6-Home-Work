import java.util.*;
public class Four {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double x;
        double a= in.nextDouble(), b= in.nextDouble();
        if(a<=0 && b<=0) System.out.println("no such x");
        else if (a>=0 && b>=0) System.out.println("any x");
        else if (a>0 && b<0) {
            x=Math.abs(b/a);
            System.out.print("x<");
            System.out.printf("%.1f", -1*x);
            System.out.print(" or x>");
            System.out.printf("%.1f", x);
        }
        else {
            x=Math.abs(b/a);
            System.out.printf("%.1f", -1*x);
            System.out.print("<x<");
            System.out.printf("%.1f", x);
        }
    }
}