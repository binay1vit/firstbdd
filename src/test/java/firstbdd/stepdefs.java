package firstbdd;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.practiseform;

public class stepdefs {
	
	//WebDriver driver=hooks.driver;
	
	WebDriver driver = hooks.driver;
	
	practiseform pg = PageFactory.initElements(driver, practiseform.class);

	@Given("^I am on automation-practice-form web app$")
	public void i_am_on_automation_practice_form_web_app() {
	  System.out.println(driver.getCurrentUrl());
	}
	@When("^I enter firstname$")
	public void i_enter_firstname() throws InterruptedException {
		 //System.out.println("I enter firstname");
		pg.firstName.sendKeys("Test");
		pg.firstName.sendKeys(Keys.TAB);
		Thread.sleep(2000);
	}
	@And("^I enter lastname$")
	public void i_enter_lastname() throws InterruptedException {
		pg.lastName.sendKeys("Lead");
		pg.lastName.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		 //System.out.println("I enter lastname");
	}
	@When("I enter emailId")
	public void i_enter_email_id() throws InterruptedException {
		 //System.out.println("I enter emailId");
		pg.emailId.sendKeys("test.lead@test.com");
		pg.emailId.sendKeys(Keys.TAB);
		Thread.sleep(2000);
	}
	@When("I select gender")
	public void i_select_gender() throws InterruptedException {
		 //System.out.println("I select gender");
		pg.female.click();
		Thread.sleep(2000);
	}
	@When("I enter mobileno")
	public void i_enter_mobileno() throws InterruptedException {
		// System.out.println("I enter mobileno");
		 pg.mobileNumber.sendKeys("1122334455");
		 Thread.sleep(2000);
	}
	@When("I enter dob")
	public void i_enter_dob() throws InterruptedException {
		 //System.out.println("I enter dob");
		/*
		 * JavascriptExecutor js = (JavascriptExecutor)driver;
		 * js.executeScript("arguments[0].value='02 Feb 1982'", pg.dob);
		 */
		pg.dob.click();
		Select oselect = new Select(pg.dobyyyy);
		oselect.selectByVisibleText("1982");
		Thread.sleep(1000);
		Select oselect1 = new Select(pg.dobmmm);
		oselect1.selectByVisibleText("February");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(@class,'react-datepicker__day react-datepicker__day') and contains(text(),'27')]"))
		.click();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0,150)");
	}
	@When("I enter Subjects")
	public void i_enter_subjects() throws InterruptedException, AWTException {
		 //System.out.println("I enter Subjects");
		pg.subjects.click();
		
		Robot robot = new Robot();
		StringSelection strSelection = new StringSelection("English");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection, null);
		
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		//pg.subjects.sendKeys("English");
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		/*
		 * Actions action = new Actions(driver); //action.sendKeys("English");
		 * action.sendKeys(Keys.ENTER);
		 */
		Thread.sleep(1000);
	}
	@When("I choose hobbies")
	public void i_choose_hobbies() throws InterruptedException {
		//System.out.println("I choose hobbies");
		pg.hobbiesSports.click();
		Thread.sleep(2000);
	}
	@When("I upload a file")
	public void i_upload_a_file() throws InterruptedException {
		//System.out.println("I upload a file");
		pg.uploadPicture.sendKeys("C:\\Users\\Binay\\Desktop\\images.jpg");
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0,150)");
		 Thread.sleep(1000);
	}
	@When("I enter address")
	public void i_enter_address() throws InterruptedException {
		//System.out.println("I enter address");
		pg.currentAddress.sendKeys("Road no 24, Hno 4, Patna");
		Thread.sleep(1000);
		pg.currentAddress.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0,150)");
		 Thread.sleep(1000);
	}
	@When("I select state")
	public void i_select_state() throws InterruptedException, AWTException {
		pg.state.click();
		Thread.sleep(1000);
		Robot robot = new Robot();
		StringSelection strSelection = new StringSelection("NCR");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection, null);
		
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1000);
	}
	@When("I select city")
	public void i_select_city() throws InterruptedException, AWTException {
		//System.out.println("I select city");
		pg.city.click();
		Thread.sleep(1000);
		Robot robot = new Robot();
		StringSelection strSelection = new StringSelection("Delhi");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection, null);
		
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1000);
	}
	@When("I submit")
	public void i_submit() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", pg.submit);
		//pg.submit.click();
		Thread.sleep(2000);
	}
	@Then("Form should be submitted")
	public void form_should_be_submitted() throws InterruptedException {
		//System.out.println("Form should be submitted");
		pg.close.click();
		Thread.sleep(2000);
	}

}
