class Holiday
{
private String name;
private int day;
public String month;
public Holiday(String name,int day,String month)//Parameterized Constructor
{
    this.name=name;
    this.day=day;
    this.month=month;
}
public int getDay()
    {
        return this.day;
    }
}
public class Main
{
	public static void main(String[] args)
	{
		Holiday h=new Holiday("Diwali",24,"10");
		Holiday h1=new Holiday("Independence Day",15,"08");
	    inSameMonth(h.month,h1.month);
	    Holiday holiarr[]={h,h1};
	    System.out.println("Average:"+avgDate(holiarr));
	}
		static void inSameMonth(String month,String month2)
	{
	    if(month.equals(month2))
	    {
	        System.out.println("True");
	    }
	    else
	    {
	        System.out.println("False");
	    }
	}
	public static double avgDate(Holiday arr[])
    {
      int avg = 0;
      int length = arr.length;
      for(int i=0;i<length;i++)
      {
          avg+=arr[i].getDay();
      }
      double average = avg/length;
      return average;
    }
}