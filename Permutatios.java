
import java.util.*;
public class Main
{
   static int f(int n)
    {
        int factorial = 1;
        for (int i = 2; i <= n; i++)
            factorial = factorial * i;
        return factorial;
    }
    
    
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int fact=1;
		String str=sc.next();
		int length=str.length();
		int[] str_freq=new int[26];
		
		for(int i=0;i<length;i++)
		{
		    str_freq[str.charAt(i) - 'a']++;
		}
		
		for(int i=0;i<26;i++)
		{
		    fact = fact * f(str_freq[i]);
		}
		System.out.println(f(length)/fact);
	}
}
