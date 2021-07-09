import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CourseOption extends PageObject {

    @FindBy( xpath = "//*[@id=\"flexRadioButton2\"]")
    private WebElement setClickAutomationTesting;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[3]/button[2]")
    private WebElement setNextCourseOption;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/h3")
    private WebElement paymentInformationHeader;


    public CourseOption(WebDriver driver) { super(driver); }

    public void setClickAutomationTesting() {this.setClickAutomationTesting.click();}

    public void setNextCourseOption() {this.setNextCourseOption.click();}

    public String getPaymentInformationHeader() {
        return this.paymentInformationHeader.getText();
    }


}
