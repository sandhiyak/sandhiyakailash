import java.util.*;
public class Repeated_regno {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		Set<Integer> s=new LinkedHashSet<Integer>();
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				s.add(arr[i]);	
			}
		}
		String str=s.toString();
			System.out.print(str.replace("[","").replace("]","").replace(",",""));
		
	}

}
