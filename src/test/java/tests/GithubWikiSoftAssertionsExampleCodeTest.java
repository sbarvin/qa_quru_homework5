package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.GithubWikiSoftAssertionsPage;

public class GithubWikiSoftAssertionsExampleCodeTest {

    GithubWikiSoftAssertionsPage githubWikiSoftAssertionsPage = new GithubWikiSoftAssertionsPage();

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://github.com";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void successFillTest() {

        githubWikiSoftAssertionsPage
                .openPage()
                .gotoWikiPageFromHeaderMenu()
                .gotoSoftAssertionsWikiPageFromWikiPage()
                .checkJUnit5InSoftAssertionsWikiPage();

    }

}
