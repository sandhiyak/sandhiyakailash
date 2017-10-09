import java.util.*;
class Reversewor{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String st[]=s.split(" ");
for(int i=st.length-1;i>=0;i--)
{
if(i!=0)
System.out.print(st[i]+" ");
else
System.out.print(st[i]);
}
}
}
