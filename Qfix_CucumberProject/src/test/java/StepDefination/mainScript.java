package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class mainScript {
	public static WebDriver driver;

    @Given("^Launch the browser$")
    public void launch_the_browser() throws Throwable {
    	System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
        driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://demostores.eduqfix.com/marketplace/account/login");
    	Thread.sleep(3000);	
        
    }

    @When("^Login with valid usernme: \"([^\"]*)\" and password: \"([^\"]*)\"$")
    public void login_with_valid_usernme_something_and_password_something(String strArg1, String strArg2) throws Throwable {
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	
    	WebElement username= driver.findElement(By.xpath("//input[@id='email']"));
    
    	username.sendKeys(strArg1);
    	
    	WebElement password= driver.findElement(By.xpath("//input[@id='pass']"));
    
    	password.sendKeys(strArg2);
    	
    
    }

    @Then("^click on login button$")
    public void click_on_login_button() throws Throwable {
    	WebElement loginClk = driver.findElement(By.xpath("//span[contains(text(),'Sign in')]"));
    	loginClk.click();
    	Thread.sleep(3000);
    }

    @Then("^Browser close$")
    public void browser_close() throws Throwable {
    	Thread.sleep(5000);
    	driver.quit();
    }

}


