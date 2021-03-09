package internet;
import address.Address;

//--------------------------------------------
//Part: 1
//Written by: Briac Cordelle 40167269
//------------------------------------

public class TelecomAddress extends Address {
	
	private String countryCode;
	private String nationalDirectDialingPrefix;
	private String areaCode;
	private long number;
	private int extension;
	private String physicalType;
	private String phoneNumber;
	
	
	/**
	 * @param countryCode
	 */
	private void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	
	/**
	 * @param nationalDirectDialingPrefix
	 */
	private void setNationalDirectDialingPrefix(String nationalDirectDialingPrefix) {
		this.nationalDirectDialingPrefix = nationalDirectDialingPrefix;
	}
	
	/**
	 * @param areaCode
	 */
	private void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
	
	/**
	 * @param number
	 */
	private void setNumber(long number) {
		this.number = number;
	}
	
	/**
	 * @param extension
	 */
	private void setExtension(int extension) {
		this.extension = extension;
	}
	
	/**
	 * @param physicalType
	 */
	private void setPhysicalType(String physicalType) {
		this.physicalType = physicalType;
	}
	
	/**
	 * @param countryCode
	 * @param nationalDirectDialingPrefix
	 * @param areaCode
	 * @param number
	 * @param extension
	 */
	private void setPhoneNumber(String countryCode, String nationalDirectDialingPrefix, String areaCode, long number, int extension) {
		this.phoneNumber = countryCode + " " + nationalDirectDialingPrefix + areaCode + " " + number + " ext. " + extension;
	}
	
	/**
	 * @return countryCode
	 */
	public String getCountryCode() {
		return countryCode;
	}
	
	/**
	 * @return nationalDirectDialingPrefix
	 */
	public String getNationalDirectDialingPrefix() {
		return nationalDirectDialingPrefix;
	}
	
	/**
	 * @return areaCode
	 */
	public String getAreaCode() {
		return areaCode;
	}
	
	/**
	 * @return number
	 */
	public long getNumber() {
		return number;
	}
	
	/**
	 * @return extension
	 */
	public int getExtension() {
		return extension;
	}
	
	/**
	 * @return physicalType
	 */
	public String getPhysicalType() {
		return physicalType;
	}
	
	/**
	 * @return phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/** default constructor
	 * 
	 */
	public TelecomAddress() {
		super();
	}
	
	/** parametrized constructor
	 * @param countryCode String type
	 * @param nationalDirectDialingPrefix String type
	 * @param areaCode String type
	 * @param number long type
	 * @param extension int type
	 * @param physicalType String type
	 */
	public TelecomAddress(String validFrom, String validTo, String countryCode, String nationalDirectDialingPrefix, String areaCode, long number, int extension,
			String physicalType) {
		super(validFrom, validTo);
		this.setCountryCode(countryCode);
		this.setNationalDirectDialingPrefix(nationalDirectDialingPrefix);
		this.setAreaCode(areaCode);
		this.setNumber(number);
		this.setExtension(extension);
		this.setPhysicalType(physicalType);
		this.setPhoneNumber(countryCode, nationalDirectDialingPrefix, areaCode, number, extension);
	}
	
	/** copy constructor
	 * @param obj
	 */
	public TelecomAddress(TelecomAddress obj) {
		super(new Address(obj.getValidFrom(), obj.getValidTo()));
		this.setAreaCode(obj.getAreaCode());
		this.setCountryCode(obj.getCountryCode());
		this.setExtension(obj.getExtension());
		this.setNationalDirectDialingPrefix(obj.getNationalDirectDialingPrefix());
		this.setNumber(obj.getNumber());
		this.setPhysicalType(obj.getPhysicalType());
		this.setPhoneNumber(obj.getCountryCode(), obj.getNationalDirectDialingPrefix(), obj.getAreaCode(), obj.getNumber(), obj.getExtension());

	}
	
	/** format object information to String
	 *
	 */
	@Override
	public String toString() {
		return "This " + getPhysicalType() + " phone number: " + getPhoneNumber() + " is valid from " + getValidFrom() + " to " + getValidTo() + checkValidity() + "\n";
	}
	
	/** check if two objects are equal
	 *  @param obj
	 */
	@Override
	public boolean equals(Object obj) {
		//check that the object has isn't null and is an object of this class
		//instanceof returns false on empty objects
		if(obj instanceof TelecomAddress) {

			TelecomAddress temp = (TelecomAddress) obj;
	
			//compare if attributes are the same 
			if((this.getValidFrom() == temp.getValidFrom() && this.getValidTo() == temp.getValidTo())) {
				if(this.getPhoneNumber() == temp.getPhoneNumber() && this.physicalType == temp.physicalType) {
					return true;
				}
			}
		}
		
		//return false if any condition is false 
		return false;
	}
	
	

}
