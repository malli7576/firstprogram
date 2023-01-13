import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class largenumber {
    public static void main(String[] args) {
        largenumber lg=new largenumber();
        lg.set();
        int a,b,c,large;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        a=sc.nextInt();
        System.out.println("Enter second number");
        b=sc.nextInt();
        System.out.println("Enter third number");
        c=sc.nextInt();
        if (a>b && a>c){
            large=a;
        }else if (b>a && b>c){
            large=b;
        }else
            large=c;
        System.out.println("largenumber is"+large);
    }
    public void set(){
        Set<String> set=new HashSet<>();
        set.add("Welcome");
      
        set.add("Set map");
        set.add("to");
        System.out.println(set);
    }
}
