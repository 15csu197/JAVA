/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{//anagram
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String str;
	    String str2;
	    int flag;
	    int i;
	    str=scan.nextLine();
	    str2=scan.nextLine();
	    str.replace("\\s","");
	    str2.replace("\\s","");
	    int n=str.length();
	    int d=str2.length();
	    if(n!=d)
	    {
	        System.out.println("Not anagram");
	    }
	    else{
	    flag=1;
	        
	        char a[]=str.toCharArray();
	        char b[]=str2.toCharArray();
	        Arrays.sort(a);
	        Arrays.sort(b);
	        for(i=0;i<=n-1;i++)
	        {
	        if(a[i]==b[i])
	        {
	       continue;
	       	        }
	       else{
	           flag=0;
	           break;
	       }    	       	          } 
	    
	    if(flag==1)
	    {
	    System.out.println("anagram");
	        
	    }
	            
	    if(flag==0)
	    {
	    System.out.println("not anagram");
	        
	    }
	        }
	    
	    
	}
}
