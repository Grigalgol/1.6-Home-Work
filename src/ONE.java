import java.util.*;
public class ONE {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a>=0 && a<10) System.out.println("DIGIT");
        else if (a>=10 && a<=99) System.out.println("NUM");
        else System.out.println("OTHER");
    }
}
