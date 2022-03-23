
 
package ipaddressvalidation;

/**
 *
 * @author Kamesh Raghul
 */

public class IpAddressValidation 
{

    public boolean validateIpv4Address(String Ip) 
    {
        try {
		String[] IPAddress = Ip.split("\\.");
		
		if (IPAddress.length != 4) {
			return false;
		}
		
		if (IPAddress[3].equals("0") || IPAddress[3].equals("255")) {
			return false;
		}
		
        for (String IPAddres : IPAddress) {
            int ipValue = Integer.parseInt(IPAddres);
            if (ipValue > 255 || ipValue < 0) {
                return false;
            }
        }
		
		
		
        }
        catch (NumberFormatException e)
        {
            
        }
        return true;
    }
}
