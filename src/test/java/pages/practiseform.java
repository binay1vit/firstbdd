package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class practiseform {
	
	@FindBy(id="firstName")
	public WebElement firstName;
	
	@FindBy(id="lastName")
	public WebElement lastName;
	
	@FindBy(id="userEmail")
	public WebElement emailId;
	
	@FindBy(xpath="//input[@id='gender-radio-1']/following-sibling::label")
	public WebElement male;
	
	@FindBy(xpath="//input[@id='gender-radio-2']/following-sibling::label")
	public WebElement female;
	
	@FindBy(xpath="//input[@id='gender-radio-3']/following-sibling::label")
	public WebElement other;
	
	@FindBy(id="userNumber")
	public WebElement mobileNumber;
	
	@FindBy(id="dateOfBirthInput")
	public WebElement dob;
	
	@FindBy(xpath="//select[@class='react-datepicker__year-select']")
	public WebElement dobyyyy;
	
	@FindBy(xpath="//select[@class='react-datepicker__month-select']")
	public WebElement dobmmm;
	
	@FindBy(xpath="//div[@id='subjectsContainer']/div/div")
	public WebElement subjects;
	
	@FindBy(xpath="//label[contains(text(),'Sports')]")
	public WebElement hobbiesSports;
	
	@FindBy(xpath="//label[contains(text(),'Reading')]")
	public WebElement hobbiesReading;
	
	@FindBy(xpath="//label[contains(text(),'Music')]")
	public WebElement hobbiesMusic;
	
	@FindBy(id="uploadPicture")
	public WebElement uploadPicture;
	
	@FindBy(id="currentAddress")
	public WebElement currentAddress;
	
	@FindBy(xpath="//div[contains(text(),'Select State')]")
	public WebElement state; 
	
	@FindBy(xpath="//div[contains(@class,'css-1uccc91-singleValue')]")
	public WebElement statetext; 
	
	@FindBy(xpath="//div[contains(text(),'Select City')]")
	public WebElement city;
	
	@FindBy(xpath="//div[contains(@class,'css-1wa3eu0-placeholder')][2]")
	public WebElement citytext; 
	
	@FindBy(id="submit")
	public WebElement submit;
	
	@FindBy(id="closeLargeModal")
	public WebElement close;
	
	

}
