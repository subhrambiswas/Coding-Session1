
		import java.util.concurrent.TimeUnit;
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		import java.io.*;
		public class Introduction {
		    public static void main(String[] args) {
		        System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32/chromedriver.exe");
		        WebDriver driver = new ChromeDriver();
		        driver.get("https://www.flipkart.com/");
		        driver.manage().window().maximize();
		        driver.manage().deleteAllCookies();
		        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		        System.out.println(driver.getTitle());
		        //driver.findElement(By.linkText("REGISTER")).click();
		        //driver.findElement(By.xpath("//input[@id='input-username']")).sendKeys("subhram");
		        
		   
	}

}