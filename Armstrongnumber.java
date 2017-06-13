import java.util.*;
class Armstrongnumber{
 public static void main(String args[])
 {
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 int temp=n;
 int sum=0;
 while(n>0)
 {
 int m=n%10;
 sum=sum+(m*m*m);
 n=n/10;
 }
 if(temp==sum)
 System.out.println("Armstrong number");
 else
 System.out.println("Not an Aramstrong number");
 }
}
