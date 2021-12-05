package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;
import static pages.SocialNetSearchPage.req;

public class SearchResultPage {

    private SelenideElement element = $x("//span[text()='" + req + "']");

    public String checkSearchHeader() {;
       return element.getText();
    }

}
