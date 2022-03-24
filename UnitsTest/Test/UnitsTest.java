/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package units;


import org.junit.Before;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kamesh Raghul
 */
public class UnitsTest {
    
    public UnitsTest() {
    }
       
    Temperature temperature = null;
    Weight weight=null;
    Units length=null;
	
	@Before
	public void setObject() {
		temperature = new Temperature();
                weight=new Weight();
                length=new Units();
	}
        
        @Test
        public void celsiusConversion() {

        //temperature.CheckTemperature(Temperature)
        assertEquals(32.0, temperature.CheckTemperature("0 C"),0);

    }
       @Test
        public void kelvinConversion() {

        
        assertEquals(-273.15, temperature.CheckTemperature("0 K"),0);

    }
        @Test
        public void WeightUnitChecking()
        {
            assertEquals(1.0, weight.CheckWeight("1 g"),0);
            assertEquals(100, weight.CheckWeight("0.1 kg"),0);
        }
        
        
        @Test
        public void WeightUnitCheckingGrams()
        {
            assertEquals(1010, weight.CheckWeightGrams("10 g","1 kg"),0);
        }
        
        @Test
        public void WeightUnitCheckingKiloGrams()
        {
            assertEquals(1, weight.CheckWeightKiloGrams("1.5 kg","500 g"),0);
        }
        
        @Test
        public void LengthChecking()
        {
            assertEquals(1, length.CheckLength("1 cm"),0);
            assertEquals(100, length.CheckLength("1 m"),0);
        }
        
        
        @Test
        public void Meter()
        {
            assertEquals(2, length.Meter("1 m","100 cm"),0);
        }
     
        @Test 
        public void MeterandKiloMeter()
        {
            assertEquals(1200,length.MeterandKiloMeter("200 cm" , "1 km"),0);
        }
        
        public void MeterandCentiMeter()
        {
            assertEquals(1900,length.MeterandCentiMeter("2000 cm" , "1 m"),0);
        }
    
    
}
