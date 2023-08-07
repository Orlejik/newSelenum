package HelpDesk;

import Core.BaseSeleniumPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import readProperties.ConfigProvider;

public class LoginPage extends BaseSeleniumPage {

    @FindBy(xpath = "//input[@id='username']")
    private WebElement loginInput;
    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordInput;

    /**
     * not needed to be found because basically we can log in only be pressing Enter key.
     *
      */
    @FindBy(xpath = "//input[@type='submit']")
    private WebElement submitInput;

    /**
     * in the constructor we do not specify the URL of the page, because we don't need to open this page in browser.
     * This log in action should be performed quietly.
     */
    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    /**
     * Here we create the instance of a new class, where the new page, after login, will be indicated.
     * the new instance is <b>TicketPage</b> - this page will be shown after successful authorization.
     */

    public TicketsPage auth(String login, String password){
        loginInput.sendKeys(login);
        passwordInput.sendKeys(password, Keys.ENTER);
        return new TicketsPage();
    }



}
