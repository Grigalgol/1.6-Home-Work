import java.util.*;
public class DopFive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
        int maxx=0, sr=0, minn=0;
        if(a>=b && a>=c) {
            maxx = a;
            if(b>=c) {
                sr=b; minn=c;
            }
            else {
                sr=c; minn=b;
            }
        }
        else if(b>=c && b>=a){
            maxx = b;
            if(a>=c) {
                sr=a; minn=c;
            }
            else {
                sr=c; minn=a;
            }
        }
        else if(c>=a && c>=b) {
            maxx = c;
            if(b>=a) {
                sr=b; minn=a;
            }
            else {
                sr=a; minn=b;
            }
        }
        a=minn;
        b=sr;
        c=maxx;
        System.out.println(a + " " + b + " " + c);
    }
}