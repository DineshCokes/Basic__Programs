import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int temp=a;
        int rem;
        int result=0;
        while(a!=0)
        {
            rem=a%10;
            a=a/10;
            result=(int)(result+Math.pow(rem, 3));
        }
        if(temp==result)
        {
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not a Armstrong Number");
        }
    }
}
