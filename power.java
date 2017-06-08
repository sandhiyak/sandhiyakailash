import java.util.*;
public class power{
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        int x;
        int n;
      System.out.print("base:");
        x= in.nextInt();
      System.out.print("exponent: ");
        n= in.nextInt();
       while(n>=2){
            System.out.println((x)*(n));
            System.out.println();
            break;
        }
    }
}
