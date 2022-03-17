package mid_term;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class logIn {

    WebDriver driver = new ChromeDriver();
	
	@Test (priority= -1)
	
	 public void launchBrowser() {
	        System.out.println("launching chrome browser"); 
	        System.setProperty("webdriver.chrome.driver" , "chromedriver.exe ");
	        driver.get("https://demo.openmrs.org/openmrs/\r\n");
	}
       
	@Test (priority= 0)
	public void Wrongusername() {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Chetan");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("hetan123");
	    driver.findElement(By.xpath("//li[contains(text(),'Registration Desk')]")).click();
		driver.findElement(By.xpath("//input[@id='loginButton']")).click();
		try {
			Thread.sleep(1000);
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}}       
	        
 
	@Test  (priority= 1)
	public void username() {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Admin123");
	    driver.findElement(By.xpath("//li[contains(text(),'Registration Desk')]")).click();
		driver.findElement(By.xpath("//input[@id='loginButton']")).click();
		try {
			Thread.sleep(1000);
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		}
		
	@Test  (priority= 2)
    public void patient() {
    	driver.findElement(By.xpath("//a[@id=\"referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension\"]")).click();
    	try {
			Thread.sleep(1000);
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			} }
	
	@Test  (priority= 3)
    public void demographics() {
    	driver.findElement(By.xpath("//input[@name='givenName']")).sendKeys("Chetan");
    	driver.findElement(By.xpath("//input[@name='middleName']")).sendKeys("Bakshi");
    	driver.findElement(By.xpath("//input[@name='familyName']")).sendKeys("xyz");
    	driver.findElement(By.xpath("//button[@id='next-button']")).click(); 
    	driver.findElement(By.xpath("//option[contains(text(),'Male')]")).click();
    	try {
			Thread.sleep(1000);
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
    	driver.findElement(By.xpath("//button[@id='next-button']")).click();
    	driver.findElement(By.xpath("//input[@id='birthdateDay-field']")).sendKeys("01");
    	driver.findElement(By.xpath("//option[contains(text(),'September')]")).click();
    	driver.findElement(By.xpath("//input[@id='birthdateYear-field']")).sendKeys("1990");
    	try {
			Thread.sleep(1000);
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
    	driver.findElement(By.xpath("//button[@id='next-button']")).click(); 
    	driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("rue lejenesse");
    	driver.findElement(By.xpath("//input[@id='address2']")).sendKeys("sherbrook");
    	driver.findElement(By.xpath("//input[@id='cityVillage']")).sendKeys("montreal");
    	driver.findElement(By.xpath("//input[@id='stateProvince']")).sendKeys("quebec");
    	driver.findElement(By.xpath("//input[@id='country']")).sendKeys("canada");
    	driver.findElement(By.xpath("//input[@id='postalCode']")).sendKeys("H2M187");
    	try {
			Thread.sleep(1000);
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
    	driver.findElement(By.xpath("//button[@id='next-button']")).click();
    	driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("98575512");
    	try {
			Thread.sleep(1000);
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
    	driver.findElement(By.xpath("//button[@id='next-button']")).click();
    	driver.findElement(By.xpath("//select[@id='relationship_type']")).click();
    	driver.findElement(By.xpath("//input[@ng-model='relationship.name']")).sendKeys("vasu");
    	try {
			Thread.sleep(1000);
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
    	driver.findElement(By.xpath("//button[@id='next-button']")).click();
    	driver.findElement(By.xpath("//input[@id='submit']")).click();
    	try {
			Thread.sleep(1000);
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
	}
	
	
	@Test (priority = 4)
    public void Logout() {
    	driver.findElement(By.xpath("//a[@href=\"/openmrs/appui/header/logout.action?successUrl=openmrs\"]")).click();
    	 try {
				Thread.sleep(1000);
				} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
    
	}
    	
    }

	
	
	
		  

