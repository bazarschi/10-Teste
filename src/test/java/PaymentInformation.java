import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentInformation extends PageObject{

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[2]/input")
    private WebElement newLetterCardHolder;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[4]/button[2]")
    private WebElement setClickOnNext;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[3]/div/div[1]/input")
    private WebElement setNumberCardNumber;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[3]/div/div[2]/input")
    private WebElement setNumberCVC;
    @FindBy(xpath = "//*[@id=\"month\"]/option[2]")
    private WebElement setExpiryMounth;
    @FindBy(xpath = "//*[@id=\"year\"]/option[5]")
    private WebElement setExpiryYear;

    public void WriteToCardHolderLetter() {
        this.newLetterCardHolder.sendKeys("xxx");
        Utils.scrollToElement(driver,setClickOnNext);
        this.setClickOnNext.click();
    }

    public void WriteAllCardInformation() {
        this.newLetterCardHolder.sendKeys("zxz");
        this.setNumberCardNumber.sendKeys("123456");
        this.setNumberCVC.sendKeys("777");
        this.setExpiryMounth.click();
        this.setExpiryYear.click();
        Utils.scrollToElement(driver,setClickOnNext);
        this.setClickOnNext.click();
    }

    public PaymentInformation(WebDriver driver) {super(driver);}

}
