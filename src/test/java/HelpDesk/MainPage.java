package HelpDesk;

import Core.BaseSeleniumPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import readProperties.ConfigProvider;

public class MainPage extends BaseSeleniumPage {

    @FindBy(xpath = "//select[@id='id_queue']")
    private WebElement queueList;
    @FindBy(xpath = "//option[text()='Django Helpdesk']")
    private WebElement queueListValue;
    @FindBy(xpath = "//input[@name='title']")
    private WebElement title;
    @FindBy(xpath = "//textarea[@name='body']")
    private WebElement body;
    @FindBy(id = "id_due_date")
    private WebElement due_date;
    @FindBy(xpath = "//div[@id='ui-datepicker-div']/table/tbody/tr/td/a[text()='15']")
    private WebElement datePicker;
    @FindBy(id = "id_attachment")
    private WebElement attachFile;
    @FindBy(id = "id_submitter_email")
    private WebElement email;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submitButton;
    @FindBy(xpath = "//a[@id='userDropdown']")
    private  WebElement loginDropdown;

    public MainPage() {
        driver.get(ConfigProvider.URL);
        PageFactory.initElements(driver, this);
    }

    public MainPage createTicket(String titleValue, String bodyValue, String emailValue, String filePath){
        queueList.click();
        queueListValue.click();
        title.sendKeys(titleValue);
        body.sendKeys(bodyValue);
        due_date.click();
        datePicker.click();
        attachFile.sendKeys(filePath);
        email.sendKeys(emailValue);
        submitButton.click();
        return this;
    }

    public LoginPage loginPage(){
        loginDropdown.click();
        return new LoginPage();
    }
}
