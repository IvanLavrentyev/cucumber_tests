import io.cucumber.java.en.Then;
import pages.SocialNetSearchPage;

public class SocialNetSearchPagedefs {

    SocialNetSearchPage socialNetSearchPage = new SocialNetSearchPage();

    @Then("Enter request {string}")
    public void enterRequest(String arg0) {
        socialNetSearchPage.fillSearchField(arg0);
    }

    @Then("Click search button")
    public void clickSearchButton() {
        socialNetSearchPage.clickSearchButton();
    }
}
