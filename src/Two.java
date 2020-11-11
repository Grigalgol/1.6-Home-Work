import java.util.*;
public class Two {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
        if (a>=b)
        {
            if (a>=c && c<=b) System.out.println(c + " " + b  + " " + a);
            else if (a>=c) System.out.println(b + " " + c  + " " + a);
            else System.out.println(b + " " + a  + " " + c);
        }
        else
        {
            if (b>=c && c<=a) System.out.println(c + " " + a  + " " + b);
            else if (b>=c) System.out.println(a + " " + c  + " " + b);
            else System.out.println(a + " " + b  + " " + c);
        }
    }
}
