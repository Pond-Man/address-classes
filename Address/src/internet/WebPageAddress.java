package internet;
import address.Address;

//--------------------------------------------
//Part: 1
//Written by: Briac Cordelle 40167269
//------------------------------------

public class WebPageAddress extends Address {
	
	private String resourceName;
	private String domainName;
	
	/**
	 * @param resourceName
	 */
	private void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}
	
	/**
	 * @param domainName
	 */
	private void setDomainName(String domainName) {
		this.domainName = domainName;
	}
	
	/**
	 * @return resourceName
	 */
	public String getResourceName() {
		return resourceName;
	}
	
	/**
	 * @return domainName
	 */
	public String getDomainName() {
		return domainName;
	}

	/** default constructor
	 * 
	 */
	public WebPageAddress() {
		super();
	}
	
	/** parametrized constructor
	 * @param validFrom
	 * @param validTo
	 * @param resourceName
	 * @param domainName
	 */
	public WebPageAddress(String validFrom, String validTo, String resourceName, String domainName) {
		super(validFrom, validTo);
		this.setResourceName(resourceName);
		this.setDomainName(domainName);
	}
	
	/** copy constructor
	 * @param obj
	 */
	public WebPageAddress(WebPageAddress obj) {
		super(new Address(obj.getValidFrom(), obj.getValidTo()));
		this.setResourceName(obj.getResourceName());
		this.setDomainName(obj.getDomainName());
	}
	
	/** format object information to String
	 *
	 */
	@Override
	public String toString() {
		return "This web page address: " + "www." + domainName + "/" + resourceName + " is valid from " + getValidFrom() + " to " + getValidTo() + checkValidity() + "\n";
	}
	
	
	/** check if two objects are equal
	 * @param obj
	 */
	@Override
	public boolean equals(Object obj) {
		//check that the object has isn't null and is a Web Page Address object
		//instanceof returns false on empty objects
		if(obj instanceof WebPageAddress) {

			WebPageAddress temp = (WebPageAddress) obj;

			//compare if attributes are the same 
			if((this.getValidFrom() == temp.getValidFrom() && this.getValidTo() == temp.getValidTo())) {
				if(this.domainName == temp.domainName && this.resourceName == temp.resourceName) {
					return true;
				}
			}
		}
		
		//return false if any condition is false 
		return false;
	}
	
	
	
}
