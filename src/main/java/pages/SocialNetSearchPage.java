package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class SocialNetSearchPage {
    private SelenideElement searchField = $x("//input[@name='q']");
    private SelenideElement searchButton = $x("//span[text()='найти']");
    public static String req;

    public void fillSearchField(String request){
        req = request; // store request value in static var to use it in further tests
        searchField.val(request);
    }

    public void clickSearchButton() {
        searchButton.click();
    }


}
