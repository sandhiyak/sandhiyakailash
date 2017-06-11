import java.util.Scanner;
public class multiplicationtable {
 public static void main(String args[])
 {
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 int upto=sc.nextInt();
	 for(int i=1;i<=upto;i++)
	 {
		 int mul=i*n;
		 System.out.print(i);
		 System.out.print("*");
		 System.out.print(n);
		 System.out.print("=");
		 System.out.println(mul);
	 }
 }
}
