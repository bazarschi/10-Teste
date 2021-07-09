import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Enrollment extends PageObject {


    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/button")
    private WebElement clickNextButton;
    @FindBy(xpath = "//*[@id=\"phone\"]")
    private WebElement newsNumbersPhoneNumberField;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/button")
    private WebElement clickNext;
    @FindBy(xpath = "//*[@id='firstName']")
    private WebElement firstNameField;
    @FindBy(xpath = "//*[@id=\"lastName\"]")
    private WebElement lastNameField;
    @FindBy(xpath = "//*[@id=\"username\"]")
    private WebElement userNameField;
    @FindBy(xpath = "//*[@id=\"password\"]")
    private WebElement passwordField;
    @FindBy(xpath = "//*[@id=\"cpassword\"]")
    private WebElement confirmPasswordField;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/h3")
    private WebElement personalInformationHeader;



    public Enrollment (WebDriver driver) {
        super(driver);
    }

    public void ClickOnNextButton() {
        Utils.scrollToElement(driver, this.clickNextButton);
        this.clickNextButton.click(); }

    public void WriteToPhoneNumberNumbers() {
        this.newsNumbersPhoneNumberField.sendKeys("12345"); }

    public void ClickOnNext() {
        this.clickNext.click(); }

    public void NavigateToPageTwo() {
        // Populeaza First Name, Last Name, Username, Password si Confirm Password
        this.firstNameField.sendKeys("sdadasd");
        this.lastNameField.sendKeys("fsgfs");
        this.userNameField.sendKeys("fsdgdsf");
        this.passwordField.sendKeys("dfsdfg");
        this.confirmPasswordField.sendKeys("fsgdfh");
        // Click butonul de next
        Utils.scrollToElement(driver, clickNext);
        this.clickNext.click(); }

    public void WriteToNameLetter() {
        this.lastNameField.sendKeys("jdh");
    }

    public void WriteToLastNameLetter() {
        this.lastNameField.sendKeys("vfsdfs");
    }

    public void WriteToUsernameLetter() {
        this.userNameField.sendKeys("dfsdfg");
    }

    public void WriteToPasswordLetter() {
        this.passwordField.sendKeys("sdfgfsg");
    }

    public void WriteToConfirmPasswordLetter() {
        this.confirmPasswordField.sendKeys("djd");

    }

    public String getPersonalInformationHeader() {
        return this.personalInformationHeader.getText();
    }

}
