import java.util.Scanner;
public class LargestAmongthreeNumbers {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        if(a>b && a>c)
        {
            System.out.println("A is Greater Number");
        }
        else if(b>a && b>c)
        {
            System.out.println("B is Greater Number");
        }
        else
        {
            System.out.println("C is a Greater Number");
        }
    }
}
