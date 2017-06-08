import java.util.*;  
class Primenumber{  
     public static void main(String args[]){  
      int i,m=0,flag=0;
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      m=n/2;    
      for(i=2;i<=m;i++){    
       if(n%i==0){    
       System.out.println("Not a Prime");    
       flag=1;    
       break;    
       }    
      }    
      if(flag==0)    
      System.out.println("Prime");    
    }  
    }  
