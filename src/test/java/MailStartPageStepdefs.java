import io.cucumber.java.en.Then;
import pages.MailStartPage;

public class MailStartPageStepdefs {

    MailStartPage mailStartPage = new MailStartPage();

    @Then("Click button")
    public void clickButton() {
        mailStartPage.clickButtonSocialNetworks();
    }
}
