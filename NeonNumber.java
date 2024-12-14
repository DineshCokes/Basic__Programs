import java.util.Scanner;
public class NeonNumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int square=a*a;
        int rem;
        int result=0;
        while (square!=0) {
            rem=square%10;
            square=square/10;
            result=result+rem;
        }
        if(result==a)
        {
            System.out.println("Neon Number");
        }
        else{
            System.out.println("Not a Neon Number");
        }
    }
}
