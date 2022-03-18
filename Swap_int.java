import java.util.*;
public class Main
{
static void Swap(int size,ArrayList<Integer>container_2)
{
    for(int i=0;i<size-1;i+=2)
		{
		    Collections.swap(container_2, i, i+1);
		}
		System.out.println(container_2);
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		ArrayList<Integer> container = new ArrayList<Integer>();
		
		int no_of_elements=sc.nextInt();
		
		for(int i=0;i<no_of_elements;i++)
		{
		    container.add(sc.nextInt());
		}
		
		Swap(no_of_elements,container);
	}
}