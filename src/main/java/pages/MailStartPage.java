package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MailStartPage {
    private static String s = "Соцсети";
    private SelenideElement socialNetworks = $x("//a[text()='" + s + "']");

    public void clickButtonSocialNetworks() {
        socialNetworks.click();
    }

}
