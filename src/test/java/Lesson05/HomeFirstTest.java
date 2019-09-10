/*
1. Напишите тест, похожий на рассмотренный на занятии 5 (ввод поиcкового запроса и проверка первой подсказки),
только проверьте, что все подсказки выпадающего списка содержат вводимый текст.
1.1. Искать список всех подсказок через findElements;
1.2. Проверку всех подсказок сделать с помощью Stream API.
2. Запустить сьют через мавен и через IDE.
3. Закоммитить изменения, залить их на репозиторий GitHub и прислать ссылку.

Stream API
@Test
public void linksTest() {
    List<WebElement> links = driver.findElements(By.tagName("a"));
    System.out.println("Total Links : " + links.size());
long count = links.stream().filter(item -> item.isDisplayed()).count();
    System.out.println("Total Link visible " + count);
}

Find Elements command takes in By object as the parameter and returns a list of web elements.
It returns an empty list if there are no elements found using the given locator strategy and locator value.
Below is the syntax of find elements command.
List<WebElement> elementName = driver.findElements(By.LocatorStrategy("LocatorValue"));

Example:
List<WebElement> listOfElements = driver.findElements(By.xpath("//div"));
*/

package Lesson05;

import org.hamcrest.CoreMatchers;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HomeFirstTest {

    static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);

        driver.get("http://automationpractice.com/index.php");
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }

    @Test(timeout = 5000l)
    public void verifyFirstTipIsCorrect() {
        driver.findElement(By.id("search_query_top"))
                .clear();
        driver.findElement(By.id("search_query_top"))
                .sendKeys("Dress");

        Assert.assertThat(
                driver
                        .findElement(By.xpath("//*[@id=\"index\"]/div[2]/ul/li[1]"))
                        .getText(),
                CoreMatchers.containsString("Dress"));
    }

    @Test(timeout = 5000l)
    public void verifyFirstTipIsCorrect_viaAssertTrue() {
        driver.findElement(By.id("search_query_top"))
                .clear();
        driver.findElement(By.id("search_query_top"))
                .sendKeys("Dress");

        Assert.assertTrue("First tip text was wrong",
                driver.findElement(By.xpath("//*[@id=\"index\"]/div[2]/ul/li[1]"))
                        .getText().contains("Dress1"));
    }
}


