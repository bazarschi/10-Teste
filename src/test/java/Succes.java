import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Succes extends PageObject {

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[5]/h3")
    private WebElement succesHeader;

    public String getSuccesHeader() {
        return this.succesHeader.getText();
    }

    public Succes(WebDriver driver) {super(driver);}
}
