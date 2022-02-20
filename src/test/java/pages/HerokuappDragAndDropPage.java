package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class HerokuappDragAndDropPage {

    //locators

    private final SelenideElement
            boxA = $("#column-a"),
            boxB = $("#column-b");

    //actions
    public HerokuappDragAndDropPage openPage() {
        open("/drag_and_drop");
        return this;
    }

    public HerokuappDragAndDropPage moveBoxAtoBoxB() {
        boxA.dragAndDropTo(boxB);
        return this;
    }

    public HerokuappDragAndDropPage checkBoxAAfterMove() {
        boxA.shouldHave(text("B"));
        return this;
    }

    public HerokuappDragAndDropPage checkBoxBAterMove() {
        boxB.shouldHave(text("A"));
        return this;
    }
}
