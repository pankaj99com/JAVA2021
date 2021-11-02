package PreapreoWnWebdriver;

public class FirefoxDriver implements WebDriver{
	
	public FirefoxDriver() {
		
		System.out.println("Firefox driver launched");
	}

	
	public void get(String url) {
		System.out.println("Launnching url Firefox browser:"+url);
		
	}

	public void findElement(String locator) {
		// TODO Auto-generated method stub
		
	}

}
