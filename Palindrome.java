

import java.util.*;


public class Main {
    
    public static String reverse(String text) {
        int len = text.length() - 1;
        String reverse = "";
        while (len >= 0) {
            reverse += text.charAt(len);
            len--;
        }
        return reverse;
    }    
    
    public static boolean check_palindrme(String text)
    {
        int first=0;
        int last=text.length() - 1;
        while(first<last)
        {
            if(text.charAt(first)!=text.charAt(last))
            {
                return false;
            }
            first++;
            last--;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String text=sc.next();
        int len=text.length()-1;
        int chk=len-1;
        boolean flag=true;
        String str="";
        if(check_palindrme(text))
        {
            System.out.println(text);           
        }
        else
        {
            flag=true;
            while(chk>=0)
            {
                if(text.charAt(chk) == text.charAt(len))
                {
                    flag=false;
                    str=text.substring(chk, len);
                    if(check_palindrme(str))
                    {
                        text = text + reverse(text.substring(0, chk));
                    }
                    else 
                    {
                        text = text + reverse(text.substring(0, len));
                    }
                    System.out.println(text);
                    break;
                }
                else
                {
                    chk--;
                }
            }
            if(flag)
            {
                text = text + reverse(text.substring(0, len));
//                System.out.println("The resultant string is:");
                System.out.println(text);
            }
        }
        
        
    }
    
}
