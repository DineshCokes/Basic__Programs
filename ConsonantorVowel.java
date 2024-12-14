import java.util.Scanner;
public class ConsonantorVowel {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        char a=in.next().charAt(0);
        if(a=='A' || a=='E' || a=='I' || a=='O' || a=='U' || a=='a' || a=='e' || a=='i' || a=='o' || a=='u')
        {
            System.out.println("It is a Vowel");
        }
        else{
            System.out.println("It is a Consonant");
        }
    }
}
