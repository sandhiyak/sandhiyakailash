import java.util.*;
class sumofdigits{
         public static void main(String args[])
         {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int sum=0;
         while(n>0)
         {
         int num=n%10;
         sum=sum+num;
         n=n/10;
         }
         System.out.println("Sum of digits is "+sum);
         }
         }
