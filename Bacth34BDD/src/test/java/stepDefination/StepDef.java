package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef {
	
	
	WebDriver driver;
	

@Given("User Launch Browser")
public void user_launch_browser() {
	
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
   
}

@When("User Open URL {string}")
public void user_open_url(String url) {
	
	driver.get(url);
    
}

@When("User enters Email as {string} and Password as {string}")
public void user_enters_email_as_and_password_as(String em, String pass) {
	
	WebElement email=driver.findElement(By.id("modalusername"));
	WebElement password=driver.findElement(By.id("current-password"));
	email.sendKeys(em);
    password.sendKeys(pass);
   
}

@When("Click on Login button")
public void click_on_login_button() {
	
	WebElement btn=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[4]/div[1]/div/div[4]/div[1]/button/span"));
	btn.click();
   
}

@Then("Page Title Should be {string}")
public void page_title_should_be(String ExpectedResult) throws InterruptedException {
	
	
	Thread.sleep(10000);
	String ActuaLResult=driver.getTitle();
	Assert.assertEquals(ActuaLResult, ExpectedResult);
	
}

@When("User Click on Logout link")
public void user_click_on_logout_link() {
	
	
	WebElement logbtn=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[3]/div/nav/div/button"));
    logbtn.click();
   
}

@Then("Close Browser")
public void close_browser() {
   
	
	driver.close();
}
}
