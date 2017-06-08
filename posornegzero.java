import java.util.*;
public class posnegzero{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        if(n>0)
        System.out.println("Positive");
        else if(n==0)
        System.out.println("zero");
        else
         System.out.println("Negative");  
   }
}
