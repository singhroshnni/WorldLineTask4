package Features;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Task4.Task4.ExcelReader;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {

	WebDriver driver;
	
	@Given("User is on the login page")
	public void openWebApp() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("https://www.saucedemo.com/");
		  System.out.println("SauceLabs opened successfully");
		
	}
	
	@When("User enters {string} and {int} from Excel")
	public void user_enters_and_from_excel(String sheetName, int rowNumber) throws InvalidFormatException, IOException {
		
		ExcelReader reader = new ExcelReader();
		List<Map<String,String>> testData = 
				reader.getData("D:/WorldLine/loginData.xlsx", sheetName);
	
        
        String username = testData.get(rowNumber).get("username");
		String password = testData.get(rowNumber).get("password");
		
		
		WebElement uname =driver.findElement(By.id("user-name"));
        WebElement pas =driver.findElement(By.id("password"));
       
        
        uname.sendKeys(username);
        pas.sendKeys(password);
        
	}

	@When("user clicks on login button")
	public void user_clicks_on_the_login_button() throws InterruptedException {
		 WebElement sub =driver.findElement(By.id("login-button"));
		  sub.click();
		  Thread.sleep(5000);
	}

	@Then("User should be logged in successfully")
	public void user_should_be_logged_in_successfully() {
		  
        String actual=driver.getCurrentUrl();
        String expected ="https://www.saucedemo.com/inventory.html";
        
        Assert.assertEquals(expected, actual);
        driver.quit();
	}

	@Then("Show successful message")
	public void show_successful_message() {
	    System.out.print("login");
	}

//	@After
//	public void terminate() {
//		
//	}

}
