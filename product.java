import java.util.*;


public class Product {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int noInputs=sc.nextInt();
        int []container=new int[noInputs];
        System.out.println("Key:");
        int Key=sc.nextInt();
        int count=0;
        for(int i=0;i<noInputs;i++)
        {
            container[i]=sc.nextInt();
        }
        for(int i=0;i<noInputs;i++)
        {
            for(int j=i+1;j<noInputs;j++)
            {
                if(container[i]*container[j]==Key)
                {
                    count++;                    
                }
            }
        }
        System.out.println(count);        
    }
    
}