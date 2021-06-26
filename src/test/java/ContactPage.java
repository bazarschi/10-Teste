import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactPage extends PageObject{


    @FindBy(xpath = "//*[@id=\"email\"]")
    private WebElement newLetterEmailField;

    public ContactPage (WebDriver driver) {super(driver); }

    public void WriteToEmailLetter() { this.newLetterEmailField.sendKeys("abcd");}

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/button[2]")
    private WebElement clickNextContactInformation;

    public void setClickNextContactInformation() { this.clickNextContactInformation.click();}
}
