package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class GeneratedTests extends TestBase {
    @Test
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("Успешный поиск книги")
    void generatedTest() {
        step("Открыть 'https://www.litres.ru/'", () -> {
            step("// todo: just add selenium action");
        });

        step("Ввести в поисковую строку 'Оруэлл'", () -> {
            step("// todo: just add selenium action");
        });

        step("Проверить наличие в выдаче '1984'", () -> {
            step("// todo: just add selenium action");
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open url 'https://www.litres.ru/'", () ->
            open("https://www.litres.ru/"));

        step("Page title should have text 'ЛитРес – библиотека электронных книг, скачать в fb2 или читать онлайн на LitRes'", () -> {
            String expectedTitle = "ЛитРес – библиотека электронных книг, скачать в fb2 или читать онлайн на LitRes";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url 'https://www.litres.ru/'", () ->
            open("https://www.litres.ru/"));

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}