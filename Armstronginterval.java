import java.util.*;
class Armstronginterval{
 public static void main(String args[])
 {
 Scanner sc=new Scanner(System.in);
 int low=sc.nextInt();
 int high=sc.nextInt();
 for(int i=low;i<=high;i++)
 {
 int temp=i;
 int sum=0;
 while(temp>0)
 {
 int m=temp%10;
 sum=sum+(m*m*m);
 temp=temp/10;
 }
 if(i==sum)
 System.out.println(sum);
 else
 continue;
 }
 }
}


