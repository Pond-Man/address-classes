package physical;

public class Locale {
	
	private String countryCode;
	private int numCountryCode;
	private String countryName;
	
	/**
	 * @param coutryCode the coutryCode to set
	 */
	private void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	/**
	 * @param numCountryCode the numCountryCode to set
	 */
	private void setNumCountryCode(int numCountryCode) {
		this.numCountryCode = numCountryCode;
	}

	/**
	 * @param countryName the countryName to set
	 */
	private void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	/**
	 * @return the coutryCode
	 */
	public String getCountryCode() {
		return countryCode;
	}

	/**
	 * @return the numCountryCode
	 */
	public int getNumCountryCode() {
		return numCountryCode;
	}

	/**
	 * @return the countryName
	 */
	public String getCountryName() {
		return countryName;
	}

	/**
	 * @param coutryCode
	 * @param numCountryCode
	 * @param countryName
	 */
	public Locale(String countryCode, int numCountryCode, String countryName) {
		this.setCountryCode(countryCode);
		this.setNumCountryCode(numCountryCode);
		this.setCountryName(countryName);
	}
	
	/** format object information to String
	 *
	 */
	@Override	
	public String toString() {
		return "Locale is: \"" + countryCode + "\" " + numCountryCode + " \"" + countryName + "\"";
	}
	
	
	
	

}
