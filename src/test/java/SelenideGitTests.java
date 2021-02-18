import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SelenideGitTests {
    @Test
    void findJunitInSelenideTest() {
        open("https://github.com/");
        $(By.name("q")).setValue("selenide").pressEnter();
        $(".repo-list > li", 0).shouldHave(Condition.text("selenide/selenide")).click();
        $(".repo-list > li", 0).$(".v-align-middle").click();
        $(byText("Wiki")).click();
        $("#wiki-pages-box").shouldHave(Condition.text("SoftAssertions"));
        $(byText("SoftAssertions")).click();
        $(".markdown-body").shouldHave(Condition.text("Using JUnit5"));
    }
}
