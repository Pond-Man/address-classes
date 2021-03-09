package internet;
import address.Address;

//--------------------------------------------
//Part: 1
//Written by: Briac Cordelle 40167269
//------------------------------------

/**
 * @author Briac
 *
 */
public class EmailAddress extends Address {
	
	private String userName;
	private String domainName;
	private String topDomain;
	
	/**
	 * @param userName
	 */
	private void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @param domainName
	 */
	private void setDomainName(String domainName) {
		this.domainName = domainName;
	}
	/**
	 * @param topDomain
	 */
	private void setTopDomain(String topDomain) {
		this.topDomain = topDomain;
	}
	
	/**
	 * @return userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @return domainName
	 */
	public String getDomainName() {
		return domainName;
	}
	/**
	 * @return topDomain
	 */
	public String getTopDomain() {
		return topDomain;
	}
	
	/** default constructor
	 * 
	 */
	public EmailAddress() {
		super();
	}
	
	/** parametrized constructor
	 * @param validFrom
	 * @param validTo
	 * @param userName
	 * @param domainName
	 * @param topDomain
	 */
	public EmailAddress(String validFrom, String validTo, String userName, String domainName, String topDomain) {
		super(validFrom, validTo);
		this.setUserName(userName);
		this.setDomainName(domainName);
		this.setTopDomain(topDomain);
	}
	
	/** copy constructor
	 * @param obj
	 */
	public EmailAddress(EmailAddress obj) {
		super(new Address(obj.getValidFrom(), obj.getValidTo()));
		this.setUserName(obj.getUserName());
		this.setDomainName(obj.getDomainName());
		this.setTopDomain(obj.getTopDomain());
	}
	
	/**format object information to String
	 *
	 */
	@Override
	public String toString() {
		return "This email address: " + userName + "@" + domainName + "." + topDomain + " is valid from " + getValidFrom() + " to " + getValidTo() + checkValidity() + "\n";
	}
	
	
	
	/** check if two objects are equal
	 *  @param obj
	 */
	@Override
	public boolean equals(Object obj) {
		//check that the object has isn't null and is an object of this class
		//instanceof returns false on empty objects
		if(obj instanceof EmailAddress) {

			EmailAddress temp = (EmailAddress) obj;

			//compare if attributes are the same 
			if((this.getValidFrom() == temp.getValidFrom() && this.getValidTo() == temp.getValidTo())) {
				if(this.userName == temp.userName && this.domainName == temp.domainName && this.topDomain == temp.topDomain) {
					return true;
				}
			}
		}
		
		//return false if any condition is false 
		return false;
	}
	
	
	

}
