package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=486458755421&hvpos=&hvnetw=g&hvrand=2470354437587588541&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007788&hvtargid=kwd-10573980&hydadcr=14453_2154373&gclid=CjwKCAjwxOCRBhA8EiwA0X8hizCGgIbUczLaGdOq2GX-WUljoyWMeBMj_oAMLbhdFRfw3pBmwesJMRoCffoQAvD_BwE");
		driver.findElement(By.xpath("//select[@id='searchDropdownBox']")).click();
		 Actions act = new Actions(driver);
		 for(int i=0;i<=6;i++) {
			 act.sendKeys(Keys.ARROW_DOWN).perform();
		 }
			 act.sendKeys(Keys.ENTER).perform();
			WebElement cart = driver.findElement(By.xpath("]"));
					 act.moveToElement(cart).perform();;
			 
		 
		
			 
			 
		 
		
		
		
	}

}
