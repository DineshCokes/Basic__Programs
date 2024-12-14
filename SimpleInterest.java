import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int p=in.nextInt();
        int n=in.nextInt();
        int r=in.nextInt();
        double result=p*n*r/100;
        System.out.println("Simple Interest "+result);
    }
}
