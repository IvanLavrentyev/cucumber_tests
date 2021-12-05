import io.cucumber.java.en.Then;
import pages.SearchResultPage;

public class SearchResultPagedefs {
    SearchResultPage searchResultPage = new SearchResultPage();

    @Then("Check that header is correct")
    public void checkThatHeaderIsCorrect() {
        System.out.println(searchResultPage.checkSearchHeader());
    }
}
