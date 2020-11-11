import java.util.*;
public class DopTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b= in.nextInt();
        int c;
        if(a==1 && b>0 && b<32) c=365-b;
        else
        if(a==2 && b>0 && b<29) c=365-31-b;
        else
        if(a==3 && b>0 && b<32) c=365-31-28-b;
        else
        if(a==4 && b>0 && b<31) c=365-31-28-31-b;
        else
        if(a==5 && b>0 && b<32) c=365-31-28-31-30-b;
        else
        if(a==6 && b>0 && b<31) c=365-31-28-31-30-31-b;
        else
        if(a==7 && b>0 && b<32) c=365-31-28-31-30-31-30-b;
        else
        if(a==8 && b>0 && b<32) c=365-31-28-31-30-31-30-31-b;
        else
        if(a==9 && b>0 && b<31) c=365-31-28-31-30-31-30-31-31-b;
        else
        if(a==10 && b>0 && b<32) c=365-31-28-31-30-31-30-31-31-30-b;
        else
        if(a==11 && b>0 && b<31) c=365-31-28-31-30-31-30-31-31-30-31-b;
        else
        if(a==12 && b>0 && b<32) c=365-31-28-31-30-31-30-31-31-30-31-30-b;
        else
            c=-1;
        System.out.println(c);
    }
}