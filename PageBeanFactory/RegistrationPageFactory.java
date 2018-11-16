package PageBeanFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPageFactory {

	WebDriver driver;
	
	@FindBy(name="txtFN")
	WebElement pffirstname;
	
	@FindBy(id="txtLastName")
	WebElement pflastname;
	
	@FindBy(xpath="//*[@id='txtEmail']")
	WebElement pfemail;
	
	@FindBy(how=How.NAME,using="Phone")
	WebElement pfphone;
	
	@FindBy(name="size")
	WebElement pfpeople;
	
	@FindBy(id="txtAddress1")
	WebElement pfaddress1;
	
	@FindBy(id="txtAddress2")
	WebElement pfaddress2;
	
	@FindBy(name="city")
	WebElement pfcity;
	
	@FindBy(name="state")
	WebElement pfstate;
	
	@FindBy(name="memberStatus")
	WebElement pfstatus;
	
	@FindBy(xpath="html/body/form/table/tbody/tr[14]/td/a")
	WebElement pfbutton;
	

	

	
	

   public WebElement getPffirstname() {
		return pffirstname;
	}




	public void setPffirstname(String sffirstname) {
		pffirstname.sendKeys(sffirstname);
	}




	public WebElement getPflastname() {
		return pflastname;
	}




	public void setPflastname(String sflastname) {
		 pflastname.sendKeys(sflastname);
	}




	public WebElement getPfemail() {
		return pfemail;
	}




	public void setPfemail(String sfemail) {
	pfemail.sendKeys(sfemail);
	}




	public WebElement getPfphone() {
		return pfphone;
	}




	public void setPfphone(String sfphone) {
		 pfphone.sendKeys(sfphone);
	}




	public WebElement getPfpeople() {
		return pfpeople;
	}




	public void setPfpeople(String sfpeople) {
		pfpeople.sendKeys(sfpeople);
	}




	public WebElement getPfaddress1() {
		return pfaddress1;
	}




	public void setPfaddress1(String sfaddress1) {
		 pfaddress1.sendKeys(sfaddress1);
	}




	public WebElement getPfaddress2() {
		return pfaddress2;
	}




	public void setPfaddress2(String sfaddress2) {
	pfaddress2.sendKeys(sfaddress2);
	}

    public WebElement getPfcity() 
    {
		return pfcity;
	}




	public void setPfcity(String sfcity) {
	Select sel=new Select(pfcity);
	sel.selectByVisibleText(sfcity);
	}




	public WebElement getPfstate() {
		return pfstate;
	}




	public void setPfstate(String sfstate) {
		Select sel=new Select(pfstate);
		sel.selectByVisibleText(sfstate);
	}




	public WebElement getPfstatus() {
		return pfstatus;
	}




	public WebDriver getDriver() {
		return driver;
	}




	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}




	public void setPfstatus() {
		
			driver.findElement(By.xpath("html/body/form/table/tbody/tr[12]/td[2]/input")).click();
		
	}




	public WebElement getPfbutton() {
		return pfbutton;
	}




	public void setPfbutton() {
	pfbutton.click();


	}

public RegistrationPageFactory(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
}
