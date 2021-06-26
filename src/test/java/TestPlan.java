import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestPlan {
    private static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }

    @Test(testName = "Verify functionality for Read More in Virtual")
    public void VerifyVirtual() {
        driver.get(Utils.BASE_URL);
        FirstPage webForme = new FirstPage(driver);
        webForme.ClickOnVirtualReadMore();
    }

    @Test(testName = "Verify functionality for Return in Virtual")
    public void VerifyReturn() {
        driver.get(Utils.BASE_URL);
        FirstPage webForme = new FirstPage(driver);
        webForme.ClickOnVirtualReadMore();
        Utils.waitForElementToLoad(5);
        Virtual secondPage = new Virtual(driver);
        secondPage.clickOnReturnToHompage();
    }

    @Test(testName = "Verify functionality for New Letter in Header")
    public void VerifyHeader() {
        driver.get(Utils.BASE_URL);
        FirstPage webForme = new FirstPage(driver);
        webForme.WriteToNewsletterEmail();
    }

    @Test(testName = "Verify functionality for Questions in Navbar")
    public void VerifyNavbar() {
        driver.get(Utils.BASE_URL);
        FirstPage webForme = new FirstPage(driver);
        webForme.setClickQuestions();

    }

    @Test(testName = "Verify functionality for How Do I Sing Up in Questions")
    public void VerifyQuestions() {
        driver.get(Utils.BASE_URL);
        FirstPage webForme = new FirstPage(driver);
        webForme.setClickQuestions();
    }

    @Test(testName = "Verify functionality for Start The Enrollment in Home Page")
    public void VerifyStartTheEnrollment() {
        driver.get(Utils.BASE_URL);
        FirstPage webForme = new FirstPage(driver);
        webForme.setClickStartTheEnrollment();
    }

    @Test(testName = "Verify functionality for Usetname in Account Information")
    public void VerifyUsername() {
        driver.get(Utils.BASE_URL);
        FirstPage webForm = new FirstPage(driver);
        webForm.setClickStartTheEnrollment();
        Enrollment secondWebForm = new Enrollment(driver);
        secondWebForm.WriteToUsernameLetter();
    }

    @Test(testName = "Verify functionaliy for Next in Account Information")
    public void  VerifyNext() {
        driver.get(Utils.BASE_URL);
        FirstPage webForm = new FirstPage(driver);
        webForm.setClickStartTheEnrollment();
        Enrollment secondWebForm = new Enrollment(driver);
        secondWebForm.WriteToNameLetter();
        secondWebForm.WriteToLastNameLetter();
        secondWebForm.WriteToUsernameLetter();
        secondWebForm.WriteToPasswordLetter();
        secondWebForm.WriteToConfirmPasswordLetter();
        secondWebForm.ClickOnNextButton();

    }

    @Test(testName = "Verify functionality for Phone Number in Personal Information")
    public void VerifyPhoneNumber() {
        driver.get(Utils.BASE_URL);
        FirstPage webForm = new FirstPage(driver);
        webForm.setClickStartTheEnrollment();
        Enrollment secondWebForm = new Enrollment(driver);
        secondWebForm.NavigateToPageTwo();
        secondWebForm.WriteToPhoneNumberNumbers();

    }

    @Test(testName = "Verify functionality for First Name in Personal Information")
    public void VerifyFirstNamne() {
        driver.get(Utils.BASE_URL);
        FirstPage webForme = new FirstPage(driver);
        webForme.setClickStartTheEnrollment();
        Enrollment secondWebForm = new Enrollment(driver);
        secondWebForm.WriteToLastNameLetter();
    }

    @Test(testName = "Verify functionality for First Name Second Name Username in Personal Information")
    public void VerifyIncompletePersonalInformation() {
        driver.get((Utils.BASE_URL));
        FirstPage webForme = new FirstPage(driver);
        webForme.setClickStartTheEnrollment();
        Enrollment secondWebForme = new Enrollment(driver);
        secondWebForme.WriteToNameLetter();
        secondWebForme.WriteToLastNameLetter();
        secondWebForme.WriteToUsernameLetter();
        secondWebForme.ClickOnNextButton();
    }

    @Test(testName = "Verify functionality for First Namme Last Name Username Password Confirm Passwors in Personal INformation")
    public void VerifyFullPersonalInformation() {
        driver.get(Utils.BASE_URL);
        FirstPage webForme = new FirstPage(driver);
        webForme.setClickStartTheEnrollment();
        Enrollment secondWebForme = new Enrollment(driver);
        secondWebForme.WriteToNameLetter();
        secondWebForme.WriteToLastNameLetter();
        secondWebForme.WriteToUsernameLetter();
        secondWebForme.WriteToPasswordLetter();
        secondWebForme.WriteToConfirmPasswordLetter();
        secondWebForme.ClickOnNextButton();
    }

    @Test(testName = "Verify functionality for Email Field in Contact Information")
    public void VerifyEmailField() {
        driver.get(Utils.BASE_URL);
        FirstPage webForme = new FirstPage(driver);
        webForme.setClickStartTheEnrollment();
        Enrollment secondForm = new Enrollment(driver);
        secondForm.NavigateToPageTwo();
        Utils.waitForElementToLoad(5);
        ContactPage thirdForm = new ContactPage(driver);
        thirdForm.WriteToEmailLetter();
    }

    @Test(testName = "Verify Next Button without Contact Cnformation")
    public void VerifyNextButtonWithoutContactDetails() {
        driver.get(Utils.BASE_URL);
        FirstPage webForme = new FirstPage(driver);
        webForme.setClickStartTheEnrollment();
        Enrollment secondForm = new Enrollment(driver);
        secondForm.NavigateToPageTwo();
        ContactPage thirdForm = new ContactPage(driver);
        thirdForm.setClickNextContactInformation();

    }



    @AfterSuite
    public static void cleanUp() {
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
