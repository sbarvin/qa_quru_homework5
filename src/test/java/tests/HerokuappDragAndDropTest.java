package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.HerokuappDragAndDropPage;

public class HerokuappDragAndDropTest {

    HerokuappDragAndDropPage herokuappDragAndDropPage = new HerokuappDragAndDropPage();

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://the-internet.herokuapp.com";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void successFillTest() {
        herokuappDragAndDropPage
                .openPage()
                .moveBoxAtoBoxB()
                .checkBoxAAfterMove()
                .checkBoxBAterMove();
    }
}
