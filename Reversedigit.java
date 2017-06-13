import java.io.*;
import java.util.Scanner;
class Reversedigit{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=0;
        while(n>0)
        {
          m=n%10;
          n=n/10;
           System.out.print(m);
        }
       
    }
}
