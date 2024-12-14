import java.util.Scanner;
public class SwaptwoNumbers {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        System.out.println("Before Swapping : "+a+" "+b);
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("After Swapping: "+a+" "+b);
    }
    
}
