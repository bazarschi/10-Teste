import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
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
        FirstPage webForm = new FirstPage(driver);
        webForm.ClickOnVirtualReadMore();
        Assert.assertEquals(webForm.getVirtualHeader(),"Virtual");
    }

    @Test(testName = "Verify functionality for Return in Virtual")
    public void VerifyReturn() {
        driver.get(Utils.BASE_URL);
        FirstPage webForm = new FirstPage(driver);
        webForm.ClickOnVirtualReadMore();
        Utils.waitForElementToLoad(5);
        Virtual secondPage = new Virtual(driver);
        secondPage.clickOnReturnToHompage();
        Assert.assertEquals(webForm.getSubmitHeader(),"Submit");
    }

    @Test(testName = "Verify functionality for New Letter in Header")
    public void VerifyHeader() {
        driver.get(Utils.BASE_URL);
        FirstPage webForm = new FirstPage(driver);
        webForm.WriteToNewsletterEmail();
        Assert.assertEquals(webForm.getSubmitHeader(),"Submit");
    }

    @Test(testName = "Verify functionality for Questions in Navbar")
    public void VerifyNavbar() {
        driver.get(Utils.BASE_URL);
        FirstPage webForm = new FirstPage(driver);
        webForm.setClickQuestions();
        Assert.assertEquals(webForm.getSubmitHeader(),"Submit");
    }

    @Test(testName = "Verify functionality for How Do I Sing Up in Questions")
    public void VerifyQuestions() {
        driver.get(Utils.BASE_URL);
        FirstPage webForm = new FirstPage(driver);
        webForm.setClickQuestions();
        webForm.setClickHowDoISingUp();
        Assert.assertEquals(webForm.getSubmitHeader(),"Submit");
    }

    @Test(testName = "Verify functionality for Start The Enrollment in Home Page")
    public void VerifyStartTheEnrollment() {
        driver.get(Utils.BASE_URL);
        FirstPage webForm = new FirstPage(driver);
        webForm.setClickStartTheEnrollment();
        Enrollment webFormSecond = new Enrollment(driver);
        Assert.assertEquals(webFormSecond.getPersonalInformationHeader(),"Personal Information");
    }

    @Test(testName = "Verify functionality for Username in Account Information")
    public void VerifyUsername() {
        driver.get(Utils.BASE_URL);
        FirstPage webForm = new FirstPage(driver);
        webForm.setClickStartTheEnrollment();
        Enrollment secondWebForm = new Enrollment(driver);
        secondWebForm.WriteToUsernameLetter();
        Enrollment webFormSecond = new Enrollment(driver);
        Assert.assertEquals(webFormSecond.getPersonalInformationHeader(),"Personal information");
    }

    @Test(testName = "Verify functionaliy for Next in Account Information ")
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
        Enrollment webFormSecond = new Enrollment(driver);
        Assert.assertEquals(webFormSecond.getPersonalInformationHeader(),"Personal information");
    }

    @Test(testName = "Verify functionality for Phone Number in Contact Information")
    public void VerifyPhoneNumber() {
        driver.get(Utils.BASE_URL);
        FirstPage webForm = new FirstPage(driver);
        webForm.setClickStartTheEnrollment();
        Enrollment secondWebForm = new Enrollment(driver);
        secondWebForm.NavigateToPageTwo();
        secondWebForm.WriteToPhoneNumberNumbers();
        ContactPage webFormSecond = new ContactPage(driver);
        Assert.assertEquals(webFormSecond.getContactInformationHeader(),"Contact information");

    }

    @Test(testName = "Verify functionality for First Name in Personal Information")
    public void VerifyFirstNamne() {
        driver.get(Utils.BASE_URL);
        FirstPage webForm = new FirstPage(driver);
        webForm.setClickStartTheEnrollment();
        Enrollment secondWebForm = new Enrollment(driver);
        secondWebForm.WriteToLastNameLetter();
        Enrollment webFormSecond = new Enrollment(driver);
        Assert.assertEquals(webFormSecond.getPersonalInformationHeader(),"Personal information");
    }

    @Test(testName = "Verify functionality for First Name Second Name Username in Personal Information")
    public void VerifyIncompletePersonalInformation() {
        driver.get((Utils.BASE_URL));
        FirstPage webForm = new FirstPage(driver);
        webForm.setClickStartTheEnrollment();
        Enrollment secondWebForm = new Enrollment(driver);
        secondWebForm.WriteToNameLetter();
        secondWebForm.WriteToLastNameLetter();
        secondWebForm.WriteToUsernameLetter();
        secondWebForm.ClickOnNextButton();
        Enrollment webFormSecond = new Enrollment(driver);
        Assert.assertEquals(webFormSecond.getPersonalInformationHeader(),"Personal information");
    }

    @Test(testName = "Verify functionality for First Namme Last Name Username Password Confirm Password in Personal Information")
    public void VerifyFullPersonalInformation() {
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
        Enrollment webFormSecond = new Enrollment(driver);
        Assert.assertEquals(webFormSecond.getPersonalInformationHeader(),"Personal information");
    }

    @Test(testName = "Verify functionality for Email Field in Contact Information")
    public void VerifyEmailField() {
        driver.get(Utils.BASE_URL);
        FirstPage webForm = new FirstPage(driver);
        webForm.setClickStartTheEnrollment();
        Enrollment secondForm = new Enrollment(driver);
        secondForm.NavigateToPageTwo();
        Utils.waitForElementToLoad(5);
        ContactPage thirdForm = new ContactPage(driver);
        thirdForm.WriteToEmailLetter();
        ContactPage webFormSecond = new ContactPage(driver);
        Assert.assertEquals(webFormSecond.getContactInformationHeader(),"Contact information");
    }

    @Test(testName = "Verify Next Button without Contact Information")
    public void VerifyNextButtonWithoutContactDetails() {
        driver.get(Utils.BASE_URL);
        FirstPage webForm = new FirstPage(driver);
        webForm.setClickStartTheEnrollment();
        Enrollment secondForm = new Enrollment(driver);
        secondForm.NavigateToPageTwo();
        ContactPage thirdForm = new ContactPage(driver);
        thirdForm.setClickNextContactInformation();
        ContactPage webFormSecond = new ContactPage(driver);
        Assert.assertEquals(webFormSecond.getContactInformationHeader(),"Contact Information");
    }

    @Test(testName = "Verify Next Button to go to next page Cours Option")
    public void VerifyNextButtonToGoToCoursOptionPage() {
        driver.get(Utils.BASE_URL);
        FirstPage webForm = new FirstPage(driver);
        webForm.setClickStartTheEnrollment();
        Enrollment secondForm = new Enrollment(driver);
        secondForm.NavigateToPageTwo();
        ContactPage thirdForm = new ContactPage(driver);
        thirdForm.NavigateToPageCourseOption();
        CourseOption fourthForm = new CourseOption(driver);
        fourthForm.setClickAutomationTesting();
        fourthForm.setNextCourseOption();
        PaymentInformation webFormSecond = new PaymentInformation(driver);
        Assert.assertEquals(webFormSecond.getPaymentInformationHeader(),"Payment Information");
    }

    @Test(testName = "Verify functionality for Payment Information page without all payment info")
    private void VerifyFourPaymentFieldsOnPaymentInformation() {
        driver.get(Utils.BASE_URL);
        FirstPage webForm = new FirstPage(driver);
        webForm.setClickStartTheEnrollment();
        Enrollment secondForm = new Enrollment(driver);
        secondForm.NavigateToPageTwo();
        ContactPage thirdForm = new ContactPage(driver);
        thirdForm.NavigateToPageCourseOption();
        CourseOption fourthForm = new CourseOption(driver);
        fourthForm.setClickAutomationTesting();
        fourthForm.setNextCourseOption();
        PaymentInformation fifthForm = new PaymentInformation(driver);
        fifthForm.WriteToCardHolderLetter();
        PaymentInformation webFormSecond = new PaymentInformation(driver);
        Assert.assertEquals(webFormSecond.getPaymentInformationHeader(),"Payment Information");
    }

    @Test(testName = "Verify functionality four Payment Information page with all payment info")
    private void WriteAllCardInformationInPaymentInformationPage() {
        driver.get(Utils.BASE_URL);
        FirstPage webForm = new FirstPage(driver);
        webForm.setClickStartTheEnrollment();
        Enrollment secondForm = new Enrollment(driver);
        secondForm.NavigateToPageTwo();
        ContactPage thirdForm = new ContactPage(driver);
        thirdForm.NavigateToPageCourseOption();
        CourseOption fourthForm = new CourseOption(driver);
        fourthForm.setClickAutomationTesting();
        fourthForm.setNextCourseOption();
        PaymentInformation fifthForm = new PaymentInformation(driver);
        fifthForm.WriteAllCardInformation();
        Succes webFormSeccond =new Succes(driver);
        Assert.assertEquals(webFormSeccond.getSuccesHeader(),"Success!");
    }

    @AfterSuite
    public static void cleanUp() {
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
