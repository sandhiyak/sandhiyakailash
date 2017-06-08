import java.util.Scanner;
class largestnumber{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if((a>=b)&&(a>=c))
        {
            System.out.println("largest number:"+a);
        }
        else if((b>=a)&&(b>=c))
         System.out.println("largest number:"+b);
         else if((c>=a)&&(c>=b))
         System.out.println("largest number:"+c);
    }
}
