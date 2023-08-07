package HelpDesk;

import Core.BaseSeleniumPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TicketsPage extends BaseSeleniumPage {
    @FindBy(id = "search_query")
    private WebElement searchQuery;

    @FindBy(xpath = "//div[@class='tickettitle']//a")
    private WebElement ticketTitle;

    public TicketsPage() {
        PageFactory.initElements(driver, this);
    }

    public TicketPage findTicket(String str){
        searchQuery.sendKeys(str, Keys.ENTER);
        ticketTitle.click();
        return new TicketPage();
    }
}
