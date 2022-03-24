package units;


public class Units {
    
    
     public double CheckLength(String Length)
    {
        String[] Length_Array = Length.split(" ");
        double length=Double.parseDouble(Length_Array[0]);
        
        if(length==1 && Length_Array[1].equalsIgnoreCase("cm"))
        {
            return 1;
        }
        if(Length_Array[1].equalsIgnoreCase("m"))
        {
            return length*100;
        }
        if(length==100 && Length_Array[1].equalsIgnoreCase("cm"))
        {
            return length/1000;
        }
        return 0;
        
    }
     
     
     public double Meter(String Length, String Length1)
     {
        String[] Length_Array = Length.split(" ");
        String[] Length_Array1 = Length1.split(" ");
        double length=Double.parseDouble(Length_Array[0]);
        double length1=Double.parseDouble(Length_Array1[0])/100;

        return length+length1;
     }
     
     
     public double MeterandKiloMeter(String Length, String Length1)
     {
        String[] Length_Array = Length.split(" ");
        String[] Length_Array1 = Length1.split(" ");
        double length=Double.parseDouble(Length_Array[0]);
        double length1=Double.parseDouble(Length_Array1[0])*1000;
        
        return length+length1;
        
     }
     
     
     public double MeterandCentiMeter(String Length, String Length1)
     {
        String[] Length_Array = Length.split(" ");
        String[] Length_Array1 = Length1.split(" ");
        double length=Double.parseDouble(Length_Array[0]);
        double length1=Double.parseDouble(Length_Array1[0])*100;
        
        return length-length1;
        
     }

    
    
    
}
