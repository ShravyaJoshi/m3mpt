package PageBeanFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class paymentPageFactory {

	WebDriver driver;
	
	@FindBy(id="txtCardholderName")
	WebElement pfchname;
	
	@FindBy(id="txtDebit")
	WebElement pfdebit;
	
	@FindBy(id="txtCvv")
	WebElement pfcvv;
	
	@FindBy(xpath="//*[@id='txtMonth']")
	WebElement pfmonth;
	
	@FindBy(xpath="//*[@id='txtYear']")
	WebElement pfyear;
	
	@FindBy(id="btnPayment")
	WebElement pfpay;

	public WebElement getPfpay() {
		return pfpay;
	}

	public void setPfpay() {
	pfpay.click();
	}

	public WebElement getPfchname() {
		return pfchname;
	}

	public void setPfchname(String sfchname) {
		pfchname.sendKeys(sfchname);
	}

	public WebElement getPfdebit() {
		return pfdebit;
	}

	public void setPfdebit(String sfdebit) {
		 pfdebit.sendKeys(sfdebit);
	}

	public WebElement getPfcvv() {
		return pfcvv;
	}

	public void setPfcvv(String sfcvv) {
		 pfcvv.sendKeys(sfcvv);
	}

	public WebElement getPfmonth() {
		return pfmonth;
	}

	public void setPfmonth(String sfmonth) {
	 pfmonth.sendKeys(sfmonth);
	}

	public WebElement getPfyear() {
		return pfyear;
	}

	public void setPfyear(String sfyear) {
		pfyear.sendKeys(sfyear);
	}

	public paymentPageFactory(WebDriver driver) {
	
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
}
