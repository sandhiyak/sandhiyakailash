import java.util.*;
class duplicate_remove{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        StringBuffer sb=new StringBuffer(s);
        for(int i=0;i<sb.length();i++)
        {
            for(int j=i+1;j<sb.length();j++)
            {
                if(s.charAt(i)==s.charAt(j))
                sb.deleteCharAt(j);
            }
        }
        System.out.println(sb);
    }
}
