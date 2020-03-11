package factoryMethod;

import java.util.Calendar;

public class Factory {
	
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		
		System.out.println(cal);
		
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		
		
		Website site = WebsiteFactory.getWebsite("blog");
		System.out.println(site.getPages());
		
		site = WebsiteFactory.getWebsite("shop");
		System.out.println(site.getPages());
		
		
	}

}
