package physical;
import internet.TelecomAddress;

//-----------------------------------------
//Part: 1
//Written by: Briac Cordelle 40167269
//------------------------------------

public class PostOfficeBoxAddress extends GeneralDeliveryAddress {
	
	private Locale locale; 
	private int boxLobbyDoorCode;
	
	/**
	 * @return the locale
	 */
	public Locale getLocale() {
		return locale;
	}

	/**
	 * @return the boxLobbyDoorCode
	 */
	public int getBoxLobbyDoorCode() {
		return boxLobbyDoorCode;
	}

	/**
	 * @param locale the locale to set
	 */
	private void setLocale(Locale locale) {
		this.locale = locale;
	}
	
	/**
	 * @param boxLobbyDoorCode the boxLobbyDoorCode to set
	 */
	private void setBoxLobbyDoorCode(int boxLobbyDoorCode) {
		this.boxLobbyDoorCode = boxLobbyDoorCode;
	}
	
	/** default constructor 
	 * 
	 */
	public PostOfficeBoxAddress() {
		super();
	}
	
	/**
	 * @param validFrom
	 * @param validTo
	 * @param addressLine
	 * @param city
	 * @param regionOrState
	 * @param zipOrPostCode
	 * @param telecomAddress
	 * @param boxLobbyDoorCode
	 */
	public PostOfficeBoxAddress(String validFrom, String validTo, String addressLine, String city, String regionOrState, String zipOrPostCode,
			TelecomAddress telecomAddress, Locale locale, int boxLobbyDoorCode) {
		
		super(validFrom, validTo, addressLine, city, regionOrState, zipOrPostCode, telecomAddress);
		this.setLocale(locale);
		this.setBoxLobbyDoorCode(boxLobbyDoorCode);
	}

	/** copy constructor
	 * @param obj 
	 */
	public PostOfficeBoxAddress(PostOfficeBoxAddress obj) {
		super(new GeneralDeliveryAddress(obj));
		this.setLocale(obj.getLocale());
	}
	
	
	/** format object information to String
	 *
	 */
	@Override
	public String toString() {
		String address = getAddressLine() + ", " + getCity() + ", " + getRegionOrState() + ", \nZip or Post Code: " + getZipOrPostCode() + ", \n" + getLocale() + ", \nLobby door code is: " + boxLobbyDoorCode + ", \n" + getTelecomAddress().getPhoneNumber() + ".\n";
		return "This is the PO Box Address:\n" + address + "It is valid from " + getValidFrom() + " to " + getValidTo() + checkValidity() + "\n";
	}
	
	/** check if two objects are equal
	 * @param obj
	 */
	@Override
	public boolean equals(Object obj) {
		//check that the object has isn't null and is an object of this class
		//instanceof returns false on empty objects
		if(obj instanceof PostOfficeBoxAddress) {

			PostOfficeBoxAddress temp = (PostOfficeBoxAddress) obj;

			//compare if attributes are the same 
			if(this.getValidFrom() == temp.getValidFrom() && this.getValidTo() == temp.getValidTo()) {
				if(this.getAddressLine() == temp.getAddressLine() && this.getCity() == temp.getCity() && this.getRegionOrState() == temp.getRegionOrState() && 
			    this.getZipOrPostCode() == temp.getZipOrPostCode() && this.boxLobbyDoorCode == temp.boxLobbyDoorCode && this.getTelecomAddress() == temp.getTelecomAddress()) {
					return true;
				}
			}
		}
		
		//return false if any condition is false 
		return false;
	}
	
	

}
