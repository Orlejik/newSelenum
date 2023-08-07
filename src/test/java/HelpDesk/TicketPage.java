package HelpDesk;

import Core.BaseSeleniumPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TicketPage extends BaseSeleniumPage {

    @FindBy(xpath = "//*[@id='content-wrapper']/div/div[1]/div/div/table/tbody/tr[2]/td[2]")
    private WebElement email;

    @FindBy(xpath = "//h3")
    private WebElement title;

    @FindBy(xpath = "//*[@id='ticket-description']//p")
    private WebElement body;

    public TicketPage() {
        PageFactory.initElements(driver, this);
    }

    public String getEmail() {
        return email.getText();
    }

    public String getTitle() {
        return title.getText();
    }

    public String getDescription() {
        return body.getText();
    }
}
