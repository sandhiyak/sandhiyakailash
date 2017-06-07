import java.util.Scanner;
 
public class reverse {
 
    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);
 
       System.out.print("Enter a String: ");
       String string = input.nextLine();
 
       System.out.println("Reverse String Result: ");
       for(int i=1; i<=string.length() ;i++)
       {  
            System.out.print(string.charAt(string.length()-i)); 
       }
       System.out.println();
    }
 
}
