package physical;
import internet.TelecomAddress;

//--------------------------------------------
//Part: 1
//Written by: Briac Cordelle 40167269
//------------------------------------

public class GeographicAddress extends GeneralDeliveryAddress {
	
	private Locale locale; 
	
	/**
	 * @return the locale
	 */
	public Locale getLocale() {
		return locale;
	}
	
	/**
	 * @param locale
	 */
	private void setLocale(Locale locale) {
		this.locale = locale;
	}

	/** default constructor
	 * 
	 */
	public GeographicAddress() {
		super();
	}
	

	/** parametrized constructor
	 * @param validFrom
	 * @param validTo
	 * @param addressLine
	 * @param city
	 * @param regionOrState
	 * @param zipOrPostCode
	 * @param telecomAddress
	 * @param locale
	 */
	public GeographicAddress(String validFrom, String validTo, String addressLine, String city, String regionOrState, String zipOrPostCode, TelecomAddress telecomAddress, Locale locale) {
		super(validFrom, validTo, addressLine, city, regionOrState, zipOrPostCode, telecomAddress);
		this.setLocale(locale);
	}
	
	/** copy constructor
	 * @param obj
	 */
	public GeographicAddress(GeographicAddress obj) {
		super(new GeneralDeliveryAddress(obj));
		this.setLocale(obj.getLocale());
		
	}
	
	/** format object information to String
	 *  @param obj
	 */
	@Override
	public String toString() {
		String address = getAddressLine() + ", " + getCity() + ", " + getRegionOrState() + ", \nZip or Post Code: " + getZipOrPostCode() + ", \n" + getLocale() + ", \n" + getTelecomAddress().getPhoneNumber() + ".\n";
		return "This is the geographic address:\n" + address + "It is valid from " + getValidFrom() + " to " + getValidTo() + checkValidity() + "\n";
	}
	
	/** check if two objects are equal
	 *  @param obj
	 */
	@Override
	public boolean equals(Object obj) {
		//check that the object has isn't null and is an object of this class
		//instanceof returns false on empty objects
		if(obj instanceof GeographicAddress) {

			GeographicAddress temp = (GeographicAddress) obj;

			//compare if attributes are the same 
			if((this.getValidFrom() == temp.getValidFrom() && this.getValidTo() == temp.getValidTo())) {
				if(this.getAddressLine() == temp.getAddressLine() && this.getCity() == temp.getCity() && this.getRegionOrState() == temp.getRegionOrState() && 
			    this.getZipOrPostCode() == temp.getZipOrPostCode() && this.getTelecomAddress() == temp.getTelecomAddress() && this.getLocale() == temp.getLocale()) {
					return true;
				}
			}
		}
		
		//return false if any condition is false 
		return false;
	}
	
	
}
