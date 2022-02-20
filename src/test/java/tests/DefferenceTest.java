package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DefferenceTest {

    @Test
    void successFillTest() {
        open("https://github.com/selenide/selenide");

        //Ищем template в body
        //body
        //--div
        //--div
        //----template

        //1. Находит div c template [Success]
        $("div template").should(cssClass("js-flash-template"));

        //2. Находит первый div, в котором начинает искать template [Failed]
        $("div").$("template").should(cssClass("js-flash-template"));

    }
}
