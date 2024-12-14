import java.util.Scanner;
public class CompoundInterest {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int p=in.nextInt();
        int n=in.nextInt();
        int r=in.nextInt();
        double result=Math.pow(p*(1+r/100),n);
        System.out.println("Compound Interest is "+result);
    }
}
