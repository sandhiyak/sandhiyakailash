import java.util.Scanner;
public class JavaProgram
{
    public static void main(String args[])
    {
        char ch;
        Scanner scan = new Scanner(System.in);
		    ch = scan.next().charAt(0);
		if(ch=='a' || ch=='A' || ch=='e' || ch=='E' ||
        ch=='i' || ch=='I' || ch=='o' || ch=='O' ||
        ch=='u' || ch=='U')
        {
            System.out.print("VOWEL");
        }
        else
        {
            System.out.print("CONSONANT");
        }
    }
}
