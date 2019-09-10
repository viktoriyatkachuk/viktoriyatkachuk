package lesson09.a_add_simple_logging;

import static lesson09.a_add_simple_logging.Conditions.VISIBLE;

import java.util.List;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class SimpleAPI {

    abstract WebDriver getDriver();

    void open(String url) {
        System.out.println(url + " is opening...");
        getDriver().get(url);
    }

    WebElement $(By locator) {
        return $(locator, VISIBLE);
    }

    WebElement $(String css) {
        return $(By.cssSelector(css));
    }

    WebElement $(By locator, Function<By, ExpectedCondition<WebElement>> condition) {
        return waitFor(condition.apply(locator));
    }

    WebElement $(By locator, lesson09.a_add_simple_logging.Conditions condition) {
        return waitFor(condition.getCondition().apply(locator));
    }

    List<WebElement> $$(By locator) {
        return getDriver().findElements(locator);
    }

    List<WebElement> $$(String css) {
        return getDriver().findElements(By.cssSelector(css));
    }

    List<WebElement> $$(By locator, Function<By, ExpectedCondition<List<WebElement>>> condition) {
        return waitFor(condition.apply(locator));
    }

    List<WebElement> $$(By locator, int expNumberToBe) {
        return $$(locator, loc -> ExpectedConditions.numberOfElementsToBe(loc, expNumberToBe));
    }

    <T> T waitFor(ExpectedCondition<T> condition, long timeout) {
        return (new WebDriverWait(getDriver(), timeout)).until(condition);
    }

    <T> T waitFor(ExpectedCondition<T> condition) {
        return waitFor(condition, 10l);
    }
}