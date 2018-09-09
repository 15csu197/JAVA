/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer a[]={3,1,4,4,4};
        int n=a.length;
    Arrays.sort(a, Collections.reverseOrder());
    int flag=0;int i=0;
        while(i<n-1)
        {
            if(a[i]==a[i+1]){
              flag=1;
              i++;
            continue;
                
            }
        
        else{
            flag=0;
            System.out.print(a[0]+" "+a[i+1]);
            break;
        }
	}
	if(flag==1)
	        System.out.print(a[0]+" "+a[1]);

	}
}
