import java.util.Scanner;
public class PerimeterofRectangle {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int l=in.nextInt();
        int b=in.nextInt();
        int perimeter =2*(l+b);
        System.out.println("Perimeter of a Rectangle is "+perimeter);
    }
}
