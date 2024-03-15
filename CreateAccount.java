package week9;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		//launch the browser
		ChromeDriver driver= new ChromeDriver(options);
		//launch url
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		

		//2. Click on toggle menu button from the left corner
		//3. Click view All and click Sales from App Launcher
		//4. Click on Accounts tab 
		//5. Click on New button
		//6. Enter 'your name' as account name
		//7. Select Ownership as Public 
		//8. Click save and verify Account name "

		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Qeagle@123");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.className("slds-icon-waffle")).click();
		//driver.findElement(By.className("slds-button")).click();
		Thread.sleep(30);
		driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
		//driver.findElement(By.className("slds-app-launcher__tile-body slds-truncate")).click();
		driver.findElement(By.xpath("(//div[@class='slds-app-launcher__tile-body slds-truncate'])[2]")).click();
		//driver.findElement(By.xpath("(//span[@class='slds-truncate'])[8]")).click();
		WebElement findElement = driver.findElement(By.xpath("//span[@class='slds-truncate']/parent::a[@title='Accounts']"));
		driver.executeScript("arguments[0].click();",findElement);
		driver.findElement(By.xpath("//div[text()='New']")).click();
		Thread.sleep(30);
		driver.findElement(By.xpath("(//input[@class='slds-input'])[5]")).sendKeys("keerthi");
		Thread.sleep(3000);
		Actions builder=new Actions(driver);
		
		WebElement findElement2=driver.findElement(By.xpath("//lighting-icon[@icon-name='utility:down'])[7]"));
		builder.scrollToElement(findElement).perform();
		driver.findElement(By.xpath("(//label[text()='Ownership']//following::button)[1]")).click();
		 driver.findElement(By.xpath("//span[text()='Public']")).click();
		 //driver.findElement(By.xpath(null))
		 
		
		
		
		
	}

}
