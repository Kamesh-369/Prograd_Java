import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int flag=1;
// 		if(str.length() %2 == 0)
// 		{
		for(int i=0;i<str.length();i++)
		{
		    
		    char ch=str.charAt(i);
		    if(ch=='P')
		    {
		        char ch2=str.charAt(i+1);
		        if(ch2=='R')
		        {
		            continue;
		        }
		        else 
		        {
		            flag=0;
		            break;
		        }
		    }
		    else
		    {
		        char ch2=str.charAt(i+1);
		        if(ch2=='P')
		        {
		            continue;
		        }
		        else 
		        {
		            flag=0;
		            break;
		        }
		    }
		}
		//}
// 		else 
// 		{
// 		    flag = 0;
// 		}
		if(flag==1)
		{
		    System.out.println("Perfect");
		}
		else
		{
		    System.out.println("Imperfect");
		}
		
	}
}
