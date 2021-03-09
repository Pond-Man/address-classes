package address;
import internet.*;
import physical.*;

//--------------------------------------------
//Part: 1 & 2
//Written by: Briac Cordelle 40167269
//------------------------------------


/**
 * @author Briac
 *
 */
public class Driver {

	/**
	 * @param addresses array that you want to copy 
	 * @return copyAddresses copy of array
	 */
	public static Object[] copyAddresses(Address[] addresses) {
		
		Object[] copyAddresses = new Object[addresses.length];
		
		for(int i = 0; i < addresses.length; i++) {
			try {
				copyAddresses[i] = new EmailAddress((EmailAddress) (addresses[i]));
			}catch(Exception k) {
			}
			try {
				copyAddresses[i] = new TelecomAddress((TelecomAddress) (addresses[i]));
			} catch(Exception f) {
			}
			try {
				copyAddresses[i] = new WebPageAddress((WebPageAddress) (addresses[i]));
			}catch(Exception h) {
			}
			try {
				copyAddresses[i] = new GeneralDeliveryAddress((GeneralDeliveryAddress) (addresses[i]));
			}catch(Exception j) {
			}
			try {
				copyAddresses[i] = new GeographicAddress((GeographicAddress) (addresses[i]));
			}catch(Exception w) {
			}
			try {
				copyAddresses[i] = new PostOfficeBoxAddress((PostOfficeBoxAddress) (addresses[i]));
			}catch(Exception l) {
			}
		}
		
		//address objects are done separately 
		for(int i = 0; i < addresses.length; i++) {
			if(copyAddresses[i] == null) {
				copyAddresses[i] = new Address(addresses[i]);
			}
		}
		
		//print out copy array
		for(int i = 0; i < addresses.length; i++) {
			System.out.println("\nAddress at index " + i);
			System.out.println(copyAddresses[i]);		
			}
		
		return copyAddresses;
	}
	
	
	public static void main(String[] args) {
		
		EmailAddress mail1 = new EmailAddress("2015-12-25", "2017-04-15", "joe.smith", "gmail", "com");
		EmailAddress mail2 = new EmailAddress("2012-06-14", "2037-11-17", "keanu.reeeeeves", "gmail", "com");
		
		TelecomAddress phone1 = new TelecomAddress("2021-02-11", "2029-06-08", "+971", "", "58", 6770182, 789, "mobile");
		TelecomAddress phone2 = new TelecomAddress("2021-02-11", "2029-06-08", "+1", "", "438", 3899583, 123, "mobile");
		TelecomAddress phone3 = new TelecomAddress("2019-01-24", "2020-02-24", "+86", "", "10", 88050801, 456, "landline");
		TelecomAddress phone4 = new TelecomAddress("1689-03-29", "2315-02-26", "+1", "", "526", 6630333, 439, "landline");
		
		WebPageAddress website1 = new WebPageAddress("2002-09-13", "2017-09-15", "catflip", "siamese");
		WebPageAddress website2 = new WebPageAddress("1969-06-05", "2254-09-15", "yeet", "conjugation");
		
		GeneralDeliveryAddress place1 = new GeneralDeliveryAddress("2021-03-12", "2022-03-14", "145 Rue Al Magzhi", "Dubai", "United Arab Emirates", "00000", phone1);
		GeneralDeliveryAddress place2 = new GeneralDeliveryAddress("2002-08-31", "2004-07-13", "259 1st Street", "Mineola", "United States of America", "11501", phone4);
		
		Locale locale1 = new Locale("FR", 574, "Japan");
		Locale locale2 = new Locale("US", 364, "Saudi Arabia");
		
		GeographicAddress qingdaoHome = new GeographicAddress("2011-08-31", "2013-06-22", "Aomen Lu 17", "Qingdao", "Shandong", "20398", phone3, new Locale("CA", 124, "Uzebkistan"));
		GeographicAddress berlinHome = new GeographicAddress("2010-08-31", "2011-06-22", "122 Wieland Strasse", "Berlin", "Brandenburg", "10", phone2, locale2);
		
		PostOfficeBoxAddress box1 = new PostOfficeBoxAddress("2015-07-16", "2022-03-03", "600 Frank Avenue", "New York", "United States of America", "10", phone4, locale1, 343);

		Address address1 = new Address("2021-03-12", "2022-03-23");
		Address address2 = new Address("2018-03-12", "2022-04-05");
		
		
		//using equals()
		System.out.println(mail1.equals(address2));
		System.out.println(box1.equals(berlinHome));
		System.out.println(place1.equals(website1));
		System.out.println(phone1.equals(phone4));
		
		//print out object info
		System.out.println(mail1);
		System.out.println(mail2);
		System.out.println(phone1);
		System.out.println(phone2);
		System.out.println(phone3);
		System.out.println(phone4);
		System.out.println(website1);
		System.out.println(website2);
		System.out.println(place1);
		System.out.println(place2);
		System.out.println(qingdaoHome);
		System.out.println(berlinHome);
		System.out.println(box1);
		System.out.println(address1);
		System.out.println(address2);
		
		//create array of address objects
		Address[] addresses = new Address[15];
		
		//fill array
		addresses[0] = mail1;
		addresses[1] = mail2;
		addresses[2] = phone1;
		addresses[3] = phone2;
		addresses[4] = phone3;
		addresses[5] = phone4;
		addresses[6] = website1;
		addresses[7] = website2;
		addresses[8] = place1;
		addresses[9] = place2;
		addresses[10] = qingdaoHome;
		addresses[11] = berlinHome;
		addresses[12] = box1;
		addresses[13] = address1;
		addresses[14] = address2;
		
		traceObsoleteAddresses(addresses, 2020, 03, 15);		
		copyAddresses(addresses);
	}
	
	/**
	 * @param addresses array of address objects
	 * @param year int type YYYY
	 * @param month int type MM
	 * @param day int type DD
	 */
	public static void traceObsoleteAddresses(Address[] addresses, int year, int month, int day) {
				
		for(int i = 0; i < addresses.length; i++) {
			if(addresses[i].checkValidity(year, month, day)) {
				System.out.println("\nAddress at index " + i + " is valid");
				System.out.println(addresses[i].toString());
			}else {
				System.out.println("\nAddress at index " + i + " is obsolete");
				System.out.println(addresses[i].toString());
			}
		}
		
	}

}
