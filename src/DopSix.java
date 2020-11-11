import java.util.*;
public class DopSix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
        if(a>=b+c || b>=a+c || c>=a+b) System.out.println("impossible");
        else if (a*a==b*b+c*c || b*b==a*a+c*c || c*c==a*a+b*b) System.out.println("right");
        else if (a*a>=b*b+c*c || b*b>=a*a+c*c || c*c>=a*a+b*b) System.out.println("obtuse");
        else if (a*a<=b*b+c*c || b*b<=a*a+c*c || c*c<=a*a+b*b) System.out.println("acute");
        else System.out.println("impossible");
    }
}
