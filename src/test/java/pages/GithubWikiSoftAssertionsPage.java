package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class GithubWikiSoftAssertionsPage {

    //locators
    private final SelenideElement
            wikiLink = $("#wiki-tab"),
            softAssertionsLink = $("#wiki-body").$(byText("Soft assertions")),
            junit5exampleCode = $$("ol").findBy(text("Using JUnit5 extend test class:")).sibling(0);

    //actions
    public GithubWikiSoftAssertionsPage openPage() {
        open("/selenide/selenide");
        return this;
    }

    public GithubWikiSoftAssertionsPage gotoWikiPageFromHeaderMenu() {
        wikiLink.click();
        return this;
    }

    public GithubWikiSoftAssertionsPage gotoSoftAssertionsWikiPageFromWikiPage() {
        softAssertionsLink.click();
        return this;
    }

    public GithubWikiSoftAssertionsPage checkJUnit5InSoftAssertionsWikiPage() {
        junit5exampleCode.shouldHave(text("@Test"));
        return this;
    }



}
