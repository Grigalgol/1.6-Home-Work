import java.util.*;
public class Three {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if(a%100==13 || a%100==11 || a%100==12 || a%100==14) System.out.println(a + " TOPTOB");
        else{
            switch (a % 10) {
                case 1:
                    System.out.println(a + " TOPT");
                    break;
                case 2:
                    System.out.println(a + " TOPTA");
                    break;
                case 3:
                    System.out.println(a + " TOPTA");
                    break;
                case 4:
                    System.out.println(a + " TOPTA");
                    break;
                default:
                    System.out.println(a + " TOPTOB");
                    break;
            }
        }
    }
}