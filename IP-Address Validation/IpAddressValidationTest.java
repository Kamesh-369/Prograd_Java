package ipaddressvalidation;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IpAddressValidationTest {
	
	IpAddressValidation IpAddress = null;
	
	@Before
	public void setObject() {
		IpAddress = new IpAddressValidation();
	}
        
        
	@Test
	public void IPv4AddressLengthChecking_Invalid() {
		assertFalse(IpAddress.validateIpv4Address("8.8.8"));
		assertFalse(IpAddress.validateIpv4Address("192.168"));		
	}
	
	@Test
	public void IPv4AddressLastBitEndingInZero_Invalid() {
		assertFalse(IpAddress.validateIpv4Address("8.8.8.0"));
		assertFalse(IpAddress.validateIpv4Address("192.168.0.0"));
		assertFalse(IpAddress.validateIpv4Address("198.168.10.0"));
                assertFalse(IpAddress.validateIpv4Address("0.0.0.0"));
	}
	
	@Test
	public void IPv4AddressLastBitExcedingLimit_Invalid() {
		assertFalse(IpAddress.validateIpv4Address("255.255.255.255"));
		assertFalse(IpAddress.validateIpv4Address("11.25.51.255"));
	}
	
	@Test
	public void IPv4AddressNegativeValue_Invalid() {
		assertFalse(IpAddress.validateIpv4Address("-8.8.8.8"));
		assertFalse(IpAddress.validateIpv4Address("192.168.-1.25"));		
	}
	
	@Test
	public void IPv4InValidAddress() {
		assertFalse(IpAddress.validateIpv4Address("256.256.257.289"));
		assertFalse(IpAddress.validateIpv4Address("399.399.399.399"));
		assertFalse(IpAddress.validateIpv4Address("192.168.355.259"));
	}
        
        @Test
	public void IPv4ValidAddress() {
		assertTrue(IpAddress.validateIpv4Address("192.168.0.1"));
		assertTrue(IpAddress.validateIpv4Address("192.168.1.1"));
		assertTrue(IpAddress.validateIpv4Address("8.8.8.8"));
		assertTrue(IpAddress.validateIpv4Address("12.12.06.220"));

	}
	

}