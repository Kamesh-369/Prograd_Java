import java.util.*;
import java.io.*;

public class Main
{ 
    static void check(String msg)
    {
        char fname=msg.charAt(0);
        try {
            
        if(!(Character.isUpperCase(fname)))
		{
		    throw new Exception("First character need to be in upper case");
		}
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try{
		    
		File f=new File("file1.txt");
		if(f.createNewFile())
		{
		    System.out.println("File Created : "+f.getName());
		}
		else 
		{
		    System.out.println("File Already Exist : "+f.getName());
		}
		FileWriter writer= new FileWriter("file1.txt");
		Scanner r = new Scanner(f);
		String name=sc.next();
	    check(name);
		String Col_name=sc.next();
		check(Col_name);
		String dept=sc.next();
		check(dept);
		int year= sc.nextInt();
		String form=sc.next();
	    writer.write("Name: "+name);
		writer.write("\nCollege Name: "+Col_name);
		writer.write("\nDepartment: "+dept);
		writer.write("\nYear of study: "+year);
		writer.write("\nForm Submitted (Y/N): "+form);
		writer.close();
		while(r.hasNextLine())
		{
		    String data = r.nextLine();
		    System.out.println(data);
		}
		
		if(form.equals("N"))
		{
		    throw new Exception("Student has not submitted the form");
		}
		}
		catch (Exception e)
		{
		    System.out.println(e);
		}
	
	}
}
