/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package units;

public class Temperature {
    
    public double CheckTemperature(String Temperature)
    {
        
        String[] Temp_Array = Temperature.split(" ");
        double temperature=Double.parseDouble(Temp_Array[0]);
        if(Temp_Array[1].equalsIgnoreCase("c"))
        {
            return (temperature * 9/5) + 32;
            
        } 
        
        if(Temp_Array[1].equalsIgnoreCase("k"))
        {
            return temperature-273.15;
            
        }
        return 0;
        
        
        
        
        
    }
}
