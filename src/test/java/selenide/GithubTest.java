package selenide;

import com.codeborne.selenide.CollectionCondition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.itemWithText;
import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.files.DownloadActions.click;

public class GithubTest {

    @Test
    void SoftAssertionsTest(){
        // - Откройте страницу Selenide в Github
        open("https://github.com/selenide/selenide");
        // - Перейдите в раздел Wiki проекта
        $("#wiki-tab").click();
        // - Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
        $$(".markdown-body li").shouldHave(itemWithText("Soft assertions"));
        // - Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5
        $(byText("Soft assertions")).click();
        $(".markdown-body").shouldHave(text("3. Using JUnit5 extend test class:"));




    }
}
