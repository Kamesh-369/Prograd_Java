
package units;


public class Weight {
    
    public double CheckWeight(String Weight)
    {
        String[] Weight_Array = Weight.split(" ");
        double weight=Double.parseDouble(Weight_Array[0]);
        
        if(weight==1 && Weight_Array[1].equalsIgnoreCase("g"))
        {
            return 1;
        }
        if(Weight_Array[1].equalsIgnoreCase("kg"))
        {
            return weight*1000;
        } 
        return 0;
    }
    
    
        public double CheckWeightGrams(String Weight_1,String Weight_2)
    {
        String[] Weight_Array1 = Weight_1.split(" ");
        String[] Weight_Array2 = Weight_2.split(" ");
        double weight1=Double.parseDouble(Weight_Array1[0]);
        double weight2=Double.parseDouble(Weight_Array2[0]);
        
        return weight1 + weight2*1000;
    }
        
            public double CheckWeightKiloGrams(String Weight_1,String Weight_2)
    {
        String[] Weight_Array1 = Weight_1.split(" ");
        String[] Weight_Array2 = Weight_2.split(" ");
        double weight1=Double.parseDouble(Weight_Array1[0]);
        double weight2=Double.parseDouble(Weight_Array2[0]);
        double result=weight1*1000 - weight2;
        return result/1000;
    }
        
    
    
    
}
