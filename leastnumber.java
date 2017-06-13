import java.util.*;
class leastnumber
{
    public static void main(String args[])
    {
        int i=0,j=0;
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int a=Integer.parseInt(s);
        int dig=sc.nextInt();
        int arr[]=new int[s.length()];
        for(i=0;i<s.length();i++)
        {
            arr[i]=a%10;
            a=a/10;
			 
        }
        Arrays.sort(arr);
        for(j=0;j<s.length()-dig;j++)
        {
            System.out.print(arr[j]);
        }
    }
}
