package address;

//--------------------------------------------
// Part: 1
// Written by: Briac Cordelle 40167269
//------------------------------------


/**
 * @author Briac Cordelle 
 * 
 */
public class Address {

	private String validFrom;
	private String validTo;

	/**
	 * @return validFrom String
	 */
	public String getValidFrom() {
		return validFrom;
	}

	/**
	 * @return validTo String
	 */
	public String getValidTo() {
		return validTo;
	}

	/**
	 * @param validFrom set validFrom to passed String
	 */
	private void setValidFrom(String validFrom) {
		this.validFrom = validFrom;
	}

	/**
	 * @param validTo set validTo to passed string
	 */
	private void setValidTo(String validTo) {
		this.validTo = validTo;
	}

	/**
	 * default constructor
	 * 
	 */
	public Address() {
		super();
	}

	/**
	 * parameterized constructor
	 * 
	 * @param validFrom validFrom date
	 * @param validTo   validTo date
	 */
	public Address(String validFrom, String validTo) {
		this.setValidFrom(validFrom);
		this.setValidTo(validTo);
	}

	/**
	 * copy constructor
	 * 
	 * @param address object that needs to be copied
	 */
	public Address(Address address) {
		this.setValidFrom(address.getValidFrom());
		this.setValidTo(address.getValidTo());
	}

	/** format object information to String
	 * 
	 */ 
	@Override
	public String toString() {
		return "This address is valid from: " + validFrom + " to " + validTo + "\n";
	}

	/** check if two objects are equal
	 *  @param obj
	 */
	@Override
	public boolean equals(Object obj) {
		//check that the object has isn't null and is an object of this class
		//instanceof returns false on empty objects
		if(obj instanceof Address) {
			Address temp = (Address) obj;

			//compare if attributes are the same 
			if((this.validFrom.equals(temp.getValidFrom()) && (this.validTo.equals(temp.getValidTo())))) {
				return true;
			}
		}
		//return false if any condition is false 
		return false;
	}
	
	/**
	 * @return validity String with information
	 */
	public String checkValidity() {

		//split string into components
		String[] from = getValidFrom().split("-");
		String[] to = getValidTo().split("-");

		//set date
		int year = 2021;
		int month = 3;
		int day = 8;
		
		//vars for year
		int yearFrom = Integer.valueOf(from[0]);
		int yearTo = Integer.valueOf(to[0]);
		//vars for month
		int monthFrom = Integer.valueOf(from[1]);
		int monthTo = Integer.valueOf(to[1]);
		//vars for day 
		int dayFrom = Integer.valueOf(from[2]);
		int dayTo = Integer.valueOf(to[2]);

		String validity = " and is therefore ";

		//check if date ends before current year or starts after current year
		if(yearTo < year || yearFrom > year) {
			validity += "obsolete.";
		}else if(yearFrom < year && yearTo > year) {
			validity += "still usable today.";
		}else {
			//valid from previous year to this year so monthTo and dayTo need to be checked
			if(yearFrom <= year && yearTo == year) {
				//check if monthTo is before current date
				if(monthTo < month) {
					validity += "obsolete.";
					//check if monthTo is after current date
				}else if(monthTo > month) {
					validity += "still usable today";
					//if monthTo = month
				}else {
					//check if dayTo is before current date
					if(dayTo < day) {
						validity += "obsolete.";
						//check if dayTo is after current date
					}else {
						validity += "still usable today.";
					}
				}

			//valid from this year to later years so monthFrom and dayFrom need to be checked
			}else if(yearFrom == year && yearTo >= year) {
				//check if monthFrom is after month
				if(monthFrom > month) {
					validity += "obsolete.";
					//check if monthFrom is before month
				}else if(monthFrom < month){
					validity += "still usable today.";
					//if monthFrom = month
				}else {
					//check if dayFrom is after day
					if(dayFrom > day) {
						validity += "obsolete.";
						//check if dayFrom is before day
					}else if(dayFrom < day) {
						validity += "still usable today.";
						//is valid from today
					}else {
						validity += "usable today.";
					}
				}
			}
		}

		return validity;

	}
	
	/** 
	 * @param year valid year
	 * @param month valid month
	 * @param day valid day
	 * @return validity boolean value 
	 */
	public boolean checkValidity(int year, int month, int day) {

		String[] from = getValidFrom().split("-");
		String[] to = getValidTo().split("-");

		//vars for year
		int yearFrom = Integer.valueOf(from[0]);
		int yearTo = Integer.valueOf(to[0]);
		//vars for month
		int monthFrom = Integer.valueOf(from[1]);
		int monthTo = Integer.valueOf(to[1]);
		//vars for day 
		int dayFrom = Integer.valueOf(from[2]);
		int dayTo = Integer.valueOf(to[2]);

		boolean validity = false;

		//check if date ends before current year or starts after current year
		if(yearTo < year || yearFrom > year) {
			
		}else if(yearFrom < year && yearTo > year) {
			validity = true;
		}else {
			//valid from previous year to this year so monthTo and dayTo need to be checked
			if(yearFrom <= year && yearTo == year) {
				//check if monthTo is before current date
				if(monthTo < month) {
					
					//check if monthTo is after current date
				}else if(monthTo > month) {
					validity = true;
					//if monthTo = month
				}else {
					//check if dayTo is before current date
					if(dayTo < day) {
			
						//check if dayTo is after current date
					}else {
						validity = true;
					}
				}

				//valid from this year to later years so monthFrom and dayFrom need to be checked
			}else if(yearFrom == year && yearTo >= year) {
				//check if monthFrom is after month
				if(monthFrom > month) {
					
					//check if monthFrom is before month
				}else if(monthFrom < month){
					validity = true;
					//if monthFrom = month
				}else {
					//check if dayFrom is after day
					if(dayFrom > day) {
						
						//check if dayFrom is before day
					}else if(dayFrom < day) {
						validity = true;
						//is valid from today
					}else {
						validity = true;
					}
				}
			}
		}

		return validity;

	}

}
