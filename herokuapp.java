import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class herokuapp {

	public static void main(String[] args) throws InterruptedException{
		 System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver\\chromedriver.exe");
		 String downloadFilePath = "C:\\Users\\Manik\\Desktop\\mak";
			HashMap<String, Object>chromePref = new HashMap<String, Object>();
			chromePref.put("download.default_directory", downloadFilePath);
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("prefs", chromePref);
			WebDriver driver;
		 driver =new ChromeDriver(options);
		 driver.manage().window().maximize();
		 
		 driver.get("http://the-internet.herokuapp.com/");//upload file
		 driver.findElement(By.xpath("//a[@href='/upload']")).click();
		 driver.findElement(By.id("file-upload")).sendKeys("D:\\intelegencia\\sql assignment 2.docx");
		 String expectedfile = driver.findElement(By.id("file-upload")).getAttribute("value");
		 Thread.sleep(3000);
		 if(expectedfile.equalsIgnoreCase("sql assignment 2.docx"))
		 {
			 System.out.println("File Uploaded Successfully");
		 }
		 Thread.sleep(3000);
		 driver.findElement(By.id("file-submit")).click();
		 Thread.sleep(3000);
		 
		 driver.get("http://the-internet.herokuapp.com/");//download file
		 driver.findElement(By.xpath("//a[@href='/download']")).click();
		 driver.findElement(By.xpath("//a[@href='download/output.html']")).click();
		 
		 driver.get("https://the-internet.herokuapp.com/");
		 driver.findElement(By.xpath("//a[contains(.,'Multiple Windows')]")).click();//multi window
		 driver.findElement(By.xpath("//a[contains(.,'Click Here')]")).click();


		  // TODO Auto-generated method stub

	}

}
