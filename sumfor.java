import java.util.Scanner;
public class sumfor
{
    public static void main(String args[])
    {
        int i, n, sum=0, num;
        Scanner scan = new Scanner(System.in);
        n=scan.nextInt();
        for(i=0; i<n; i++)
        {
            num=scan.nextInt();
            sum=sum + num;
        }
		System.out.print("Sum of numbers is "+sum);
    }
}
