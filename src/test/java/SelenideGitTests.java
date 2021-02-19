import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SelenideGitTests {
    @Test
    void findJunitInSelenideTest() {
        open("https://github.com/");
        $(By.name("q")).setValue("selenide").pressEnter();
        $(".repo-list > li").shouldHave(text("selenide/selenide")).click();
        $(".repo-list > li").$(".v-align-middle").click();
        $(byText("Wiki")).click();
        $("#wiki-pages-box").shouldHave(text("SoftAssertions"));
        $(byText("SoftAssertions")).click();
        $(".markdown-body").shouldHave(text("Using JUnit5"));
    }
}
