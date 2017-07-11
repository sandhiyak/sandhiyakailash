import java.util.*;
class removeduplicate{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str[]=sc.nextLine().split("");
        Set<String> s=new LinkedHashSet<String>();
        for(int i=0;i<str.length;i++)
        {
        s.add(str[i]);
        }
        System.out.println(s);
    }
}




