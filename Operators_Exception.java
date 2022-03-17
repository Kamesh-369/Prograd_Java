import java.util.*;


public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String sp[]=s.split("\\s");
		int ans;
		try{
		int n1=Integer.parseInt(sp[0]);
		int n2=Integer.parseInt(sp[2]);
		switch(sp[1])
		{
		    case "+":
		    {
		        ans=n1+n2;
		        System.out.println(ans);
		        break;
		    }
		    case "-":
		    {
		        
		        if(n1<n2)
		        throw new Exception("Number 1 is smaller than Number 2");
		        ans=n1-n2;
		        System.out.println(ans);
		        break;
		    }
		    case "*":
		    {
		        ans=n1*n2;
		        System.out.println(ans);
		        break;
		    }
		    case "/":
		    {
		        ans=n1/n2;
		        System.out.println(ans);
		        break;
		    }
		    default:
		    {
		        throw new Exception ("Other Operators Are Not Supported");
		    }
		    
		}
		}
		catch (NumberFormatException e)
		{
		    System.out.println("Exception Occured::::"+e);
		}
		catch (Exception e)
		{
		    System.out.println("Exception Occured::::"+e);
		}
		
		
		
	}
}
