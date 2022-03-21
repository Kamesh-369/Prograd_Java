
package symbols;

import java.util.*;
public class Symbols {
    public static boolean symCheck(String sym)
    {
        int parenthesis=0,curlyBraces=0,squareBraces=0;
        for(int i=0;i<sym.length();i++)
        {
            if(sym.charAt(i)=='{')
            {
                curlyBraces++;
            }
            else if(sym.charAt(i)=='(')
                    {
                        parenthesis++;
                    }
            else if(sym.charAt(i)=='[')
                    {
                        squareBraces++;
                    }
            else if(sym.charAt(i)=='}')
                    {
                        curlyBraces--;
                    }
            else if(sym.charAt(i)==')')
                    {
                        parenthesis--;
                    }
            else if(sym.charAt(i)==']')
                    {
                        squareBraces--;
                    }
        }
        if(squareBraces==0 && parenthesis==0 && curlyBraces==0)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
    public static void symPrint (String sym)
    {
        int parenthesis=0,curlyBraces=0,squareBraces=0;
        char [] ch=new char[35];
        int j=0;
        for(int i=0;i<sym.length();i++)
        {
            if(sym.charAt(i)=='{')
                    {
                        curlyBraces++;
                    }
            else if(sym.charAt(i)=='(')
                    {
                        parenthesis++;
                    }
            else if(sym.charAt(i)=='[')
                    {
                        squareBraces++;
                    }
            else if(sym.charAt(i)=='}')
                    {
                        curlyBraces--;
                    }
            else if(sym.charAt(i)==')')
                    {
                        parenthesis--;
                    }
            else if(sym.charAt(i)==']')
                    {
                        squareBraces--;
                    }
        }
        for(int i=0;i<sym.length();i++)
        {
            if(i!=0)
            {
                j++;
            }
            if(sym.charAt(i)=='{' && curlyBraces!=0)
            {
                ch[j] = sym.charAt(i);
                j=j+1;
                ch[j]='}';
                curlyBraces--;
            }
            else if(sym.charAt(i)=='[' && squareBraces!=0)
            {
                ch[j] = sym.charAt(i);
                j=j+1;
                ch[j]=']';
                squareBraces--;
            }
            else if(sym.charAt(i)=='(' && parenthesis!=0)
            {
                ch[j] = sym.charAt(i);
                j=j+1;
                ch[j]=')';
                parenthesis--;
            }
            else if(sym.charAt(i)=='}' && curlyBraces<0)
            {
                ch[j]='{';
                j=j+1;
                ch[j] = sym.charAt(i);
                curlyBraces++;
                
                
            }
            else if(sym.charAt(i)==')' && parenthesis<0)
            {
                ch[j]='(';
                j=j+1;
                ch[j] = sym.charAt(i);
                parenthesis++;
                
            }else if(sym.charAt(i)==']' && squareBraces<0)
            {
                ch[j]='[';
                j=j+1;
                ch[j] = sym.charAt(i);
                squareBraces++;
            }
            else if(sym.charAt(i)=='{' && curlyBraces==0)
            {
                ch[j]='{';
                j++;                
            }
            else if(sym.charAt(i)=='}' && curlyBraces==0)
            {
                ch[j]='}';
                j++;                
            }
            else if(sym.charAt(i)=='{' && curlyBraces==0 && sym.charAt(i+1)=='}')
            {
                ch[j]='{';
                j++;
                ch[j]='}';
                j++;     
                i++;
            }
            else if(sym.charAt(i)=='[' && squareBraces==0)
            {
                ch[j]='[';
                j++;                
            }
            else if(sym.charAt(i)=='[' && squareBraces==0 && sym.charAt(i+1)=='}')
            {
                ch[j]='[';
                j++;
                ch[j]=']';
                j++;     
                i++;
            }
            else if(sym.charAt(i)==']' && squareBraces==0)
            {
                ch[j]=']';
                j++;                
            }
            else if(sym.charAt(i)=='(' && parenthesis==0)
            {
                ch[j]='(';
                j++;                
            }
            else if(sym.charAt(i)=='(' && parenthesis==0 && sym.charAt(i+1)==')')
            {
                ch[j]='(';
                j++;
                ch[j]=')';
                j++;     
                i++;
            }
            else if(sym.charAt(i)==')' && parenthesis==0)
            {
                ch[j]=')';
                j++;                
            }
            
        }
        for (char c : ch) {
            System.out.print(c);
        }
        
        
        
        
    }
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String sym=sc.next();
//        int parenthesis=0,curlyBraces=0,squareBraces=0;
        if(symCheck(sym))
        {
            System.out.println(sym);
        }
        else
        {
            symPrint(sym);
        }
        
    }
    
}
