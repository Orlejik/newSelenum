package HelpDesk;

import Core.BaseSeleniumTest;
import Helpers.TextValues;
import org.junit.Assert;
import org.junit.Test;
import readProperties.ConfigProvider;

import static Helpers.StringFormatters.getUniqueString;

public class HelpDeskTest extends BaseSeleniumTest {

    @Test
    public void testHelpDesk(){

        String title = getUniqueString(TextValues.TICKET_TITLE);
        String body = TextValues.TICKET_BODY;
        String email = TextValues.TICKET_EMAIL;
        String filePath = TextValues.TICKET_ATTACHMENT;
        TicketPage ticketPage =  new MainPage()
                .createTicket(title, body, email, filePath)
                .loginPage()
                .auth(ConfigProvider.ADMIN_LOGIN, ConfigProvider.ADMIN_PASSWORD)
                .findTicket(title)
                ;

        Assert.assertTrue(ticketPage.getTitle().contains(title));
        Assert.assertEquals(ticketPage.getDescription(), body);
        Assert.assertEquals(ticketPage.getEmail(), email);

    }

}
