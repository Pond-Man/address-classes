package physical;
import address.Address;
import internet.TelecomAddress;

//--------------------------------------------
//Part: 1
//Written by: Briac Cordelle 40167269
//------------------------------------

/**
 * @author Briac
 *
 */
public class GeneralDeliveryAddress extends Address {
	
	private String addressLine;
	private String city;
	private String regionOrState;
	private String zipOrPostCode;
	private TelecomAddress telecomAddress;
	
	/**
	 * @return the addressLine
	 */
	public String getAddressLine() {
		return addressLine;
	}
	
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	
	/**
	 * @return the regionOrState
	 */
	public String getRegionOrState() {
		return regionOrState;
	}
	
	/**
	 * @return the zipOrPostCode
	 */
	public String getZipOrPostCode() {
		return zipOrPostCode;
	}
	
	/**
	 * @return the telecomAddress
	 */
	public TelecomAddress getTelecomAddress() {
		return telecomAddress;
	}

	/**
	 * @param addressLine the addressLine to set
	 */
	private void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}

	/**
	 * @param city the city to set
	 */
	private void setCity(String city) {
		this.city = city;
	}

	/**
	 * @param regionOrState the regionOrState to set
	 */
	private void setRegionOrState(String regionOrState) {
		this.regionOrState = regionOrState;
	}

	/**
	 * @param zipOrPostCode the zipOrPostCode to set
	 */
	private void setZipOrPostCode(String zipOrPostCode) {
		this.zipOrPostCode = zipOrPostCode;
	}

	/**
	 * @param telecomAddress the telecom address to set
	 */
	private void setTelecomAddress(TelecomAddress telecomAddress) {
		this.telecomAddress = telecomAddress;
	}

	/** default constructor 
	 * 
	 */
	public GeneralDeliveryAddress() {
		super();
	}
	
	/** parametrized constructor
	 * @param addressLine
	 * @param city
	 * @param regionOrState
	 * @param zipOrPostCode
	 * @param telecomAddress
	 */
	public GeneralDeliveryAddress(String validFrom, String validTo, String addressLine, String city, String regionOrState, String zipOrPostCode,
			TelecomAddress telecomAddress) {
		super(validFrom, validTo);
		this.setAddressLine(addressLine);
		this.setCity(city);
		this.setRegionOrState(regionOrState);
		this.setZipOrPostCode(zipOrPostCode);
		this.setTelecomAddress(telecomAddress);
	}
	
	
	/** copy constructor
	 * @param obj
	 */
	public GeneralDeliveryAddress(GeneralDeliveryAddress obj) {
			
		super(new Address(obj.getValidFrom(), (obj.getValidTo())));
			
		this.setAddressLine(obj.getAddressLine());
		this.setCity(obj.getCity());
		this.setRegionOrState(obj.getRegionOrState());
		this.setZipOrPostCode(obj.getZipOrPostCode());
		this.setTelecomAddress(obj.getTelecomAddress());
	}
	
	/** format object information to String
	 *
	 */
	@Override
	public String toString() {
		String address = getAddressLine() + ", " + getCity() + ", " + getRegionOrState() + ", \nZip or Post Code: " + getZipOrPostCode() + ", \n" + getTelecomAddress().getPhoneNumber() + ".\n";
		return "This is the general delivery address:\n" + address + "It is valid from " + getValidFrom() + " to " + getValidTo() + checkValidity() + "\n";
	}
	
	
	
	/** check if two objects are equal
	 * @param obj
	 */
	@Override
	public boolean equals(Object obj) {
		//check that the object has isn't null and is an object of this class
		//instanceof returns false on empty objects
		if(obj instanceof GeneralDeliveryAddress) {

			GeneralDeliveryAddress temp = (GeneralDeliveryAddress) obj;

			//compare if attributes are the same 
			if((this.getValidFrom() == temp.getValidFrom() && this.getValidTo() == temp.getValidTo())) {
				if(this.addressLine == temp.addressLine && this.city == temp.city && this.regionOrState == temp.regionOrState && 
				this.zipOrPostCode == temp.zipOrPostCode && this.getTelecomAddress() == temp.getTelecomAddress()) {
					return true;
				}
			}
		}
		
		//return false if any condition is false 
		return false;
	}
	

}
