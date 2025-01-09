package seliniumpac;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class AMAZON {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe"); 
		  WebDriver driver = new ChromeDriver(); 		 
		  driver.get("https://www.amazon.in/");
		  driver.manage().window().maximize();
//		           TO PRINT REDMI MOBILS UNDER 20K
		  
		  driver.findElement(By.xpath("//input[@class='nav-input nav-progressive-attribute']")).sendKeys("redmi mobile under 20000",Keys.TAB);
		  driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		  List<WebElement> mobile = driver.findElements(By.xpath("//div[@class='sg-col-20-of-24 s-matching-dir sg-col-16-of-20 sg-col sg-col-8-of-12 sg-col-12-of-16']"));
		
		  for(WebElement mobile1:mobile)
		  {
			  System.out.println("...."+mobile1.getText());	 
		  }
//		           THREE DIFFERENT PRODECT ADD TO CART
		  
		  driver.findElement(By.xpath("//input[@class='nav-input nav-progressive-attribute']")).sendKeys("moto g85 5g");
		  driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		  driver.findElement(By.xpath("//span[@class='a-button a-button-primary a-button-icon']")).click();
		  driver.findElement(By.xpath("//input[@class='nav-input nav-progressive-attribute']")).clear();
		  driver.findElement(By.xpath("//input[@class='nav-input nav-progressive-attribute']")).sendKeys("oneplus buds 3pro");
		  driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		  driver.findElement(By.xpath("//span[@class='a-button a-button-primary a-button-icon']")).click();
		  driver.findElement(By.xpath("//input[@class='nav-input nav-progressive-attribute']")).clear();
		  driver.findElement(By.xpath("//input[@class='nav-input nav-progressive-attribute']")).sendKeys("water heater");
		  driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		  driver.findElement(By.xpath("//span[@class='a-button a-button-primary a-button-icon']")).click();
	
	}

}
