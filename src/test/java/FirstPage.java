import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FirstPage extends PageObject {

    @FindBy(xpath = "/html/body/section[3]/div/div/div[1]/div/div/a")
    private WebElement readmoreVirtual;

    @FindBy(xpath = "/html/body/section[2]/div/div/h3")
    private WebElement newletterHeader;

    @FindBy(xpath = "/html/body/section[2]/div/div/div/input")
    private WebElement newsLetterEmailField;

    @FindBy(xpath = "/html/body/a")
    private WebElement returnVirtual;

    @FindBy(xpath = "/html/body/nav/div/button/span")
    private WebElement clickNavbar;

    @FindBy(xpath = "//*[@id=\"navmenu\"]/ul/li[2]/a")
    private WebElement clickQuestions;

    @FindBy(xpath = "//*[@id=\"questions\"]/div[4]/h3/button")
    private WebElement clickHowDoISingUp;

    @FindBy(xpath = "//*[@id=\"questions\"]/div/h2")
    private WebElement newQuestionsField;

    @FindBy(xpath = "/html/body/section[1]/div/div/div/a")
    private WebElement clickStartTheEnrollment;

    @FindBy(xpath = "//*[@id=\"username\"]")
    private WebElement newNameUsernameField;





    public FirstPage (WebDriver driver) {
        super(driver);
    }

    public void ClickOnVirtualReadMore() {
        Utils.scrollToElement(driver, this.newletterHeader);
        this.readmoreVirtual.click();
    }

    public void setReturnVirtual() {
        this.returnVirtual.click();
    }

    public void setClickNavbar() {
        this.clickNavbar.click();
    }

    public void setClickQuestions() {
        this.clickQuestions.click();
    }

    public void setClickStartTheEnrollment() { this.clickStartTheEnrollment.click(); }

    public void setClickHowDoISingUp() {
        Utils.scrollToElement(driver, this.clickHowDoISingUp);
        this.clickHowDoISingUp.click();
    }

    public void WriteToNewsletterEmail() {
        this.newsLetterEmailField.sendKeys("hdsahdhsa");
    }

    public void ClickonQuestions() {
        Utils.scrollToElement(driver,this.clickQuestions );
        this.clickHowDoISingUp.click();
    }


}
