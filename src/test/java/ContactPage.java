import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactPage extends PageObject{


    @FindBy(xpath = "//*[@id=\"email\"]")
    private WebElement newLetterEmailField;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/button[2]")
    private WebElement clickNextContactInformation;
    @FindBy(xpath = "//*[@id=\"phone\"]")
    private WebElement newNumberPhoneField;
    @FindBy(xpath = "//*[@id=\"country\"]")
    private WebElement newLetterCountreField;
    @FindBy(xpath = "//*[@id=\"city\"]")
    private WebElement newLetterCityField;
    @FindBy(xpath = "//*[@id=\"postCode\"]")
    private WebElement newNumberPostCodeField;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/h3")
    private WebElement contactInformationHeader;



    public ContactPage (WebDriver driver) {super(driver); }

    public void WriteToEmailLetter() {
        this.newLetterEmailField.sendKeys("abcd");
    }

    public void setClickNextContactInformation() {
        this.clickNextContactInformation.click();
    }

    public void  NavigateToPageCourseOption() {
        this.newLetterEmailField.sendKeys("hbg");
        this.newNumberPhoneField.sendKeys("661");
        this.newLetterCountreField.sendKeys("njdfjbdj");
        this.newLetterCityField.sendKeys("bdbd");
        this.newNumberPostCodeField.sendKeys("5656");
        Utils.scrollToElement(driver,clickNextContactInformation);
        this.setClickNextContactInformation(); }

    public String getContactInformationHeader() {
        return this.contactInformationHeader.getText();
    }
}
