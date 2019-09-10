/*
1. Зарегистрируйтесь на http://automationpractice.com
2. Создать два тестовых класса:
2.1. AccountTest со следующими тестами: 1-5 - возможность открытия страничек "ORDER HISTORY AND DETAILS",
 "MY CREDIT SLIPS", "MY ADDRESSES", "MY PERSONAL INFORMATION" и "MY WISHLISTS"
 (очевидно, что логин должен быть в @Before).
2.2. SearchTest с одним тестом: открыть сайт, ввести в поиск "Printed Summer Dress" ,
нажать поиск, проверить, что появилось три результата и первый совпадает с запросом.
3. Собрать два теста в один сьют @RunWith(Suite.class).
4. Запустить сьют через мавен и через IDE.
*/


package Lesson05;

        import java.util.List;
        import java.util.concurrent.TimeUnit;

        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.firefox.FirefoxDriver;
        import org.openqa.selenium.support.ui.Select;


public class HomeAutomativeRegistering {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();

        //navigate to URL
        driver.navigate().to("http://automationpractice.com/index.php");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();

        driver.findElement(By.xpath("//*[@id='email_create']")).sendKeys("QwertyTestACC@gmail.com");
        driver.findElement(By.xpath("//*[@id='SubmitCreate']")).click();

        //Select Radio Button
        String valueOfGender = "2"; //in this case, value is integer, it can be String in most of the cases.

        List<WebElement> RadioButtonList = driver.findElements(By.name("id_gender"));

        System.out.println("Total number of buttons is: " +RadioButtonList.size());

        for (int i = 0; i < RadioButtonList.size(); i++){
            String gend = RadioButtonList.get(i).getAttribute("value");
            if (gend.equalsIgnoreCase((valueOfGender))){
                RadioButtonList.get(i).click();
                break;
            }

        }

        //Enter customer details
        driver.findElement(By.xpath("//*[@id='customer_firstname']")).sendKeys("MyFirstName");
        driver.findElement(By.xpath("//*[@id='customer_lastname']")).sendKeys("MyLastName");
        driver.findElement(By.xpath("//*[@id='passwd']")).sendKeys("PasswordQwerty");

        //Select date of Birth
        Select sDate = new Select(driver.findElement(By.xpath("//*[@id='days']")));
        sDate.selectByVisibleText("16  ");

        Select sMonth = new Select(driver.findElement(By.xpath("//*[@id='months']")));
        sMonth.selectByVisibleText("April ");

        Select sYear = new Select(driver.findElement(By.xpath("//*[@id='years']")));
        sYear.selectByVisibleText("1984  ");

        //select required check boxes
        String newsLetterReq = "Yes";
        if (newsLetterReq.equalsIgnoreCase(newsLetterReq)){
            driver.findElement(By.xpath(".//*[@id='newsletter']")).click();
        }

        String reciveSpclOffer = "Yes";
        if (reciveSpclOffer.equalsIgnoreCase(reciveSpclOffer)){
            driver.findElement(By.xpath("//*[@id='optin']")).click();


            //Fill address related details
            driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys("FirstnameInAddress");
            driver.findElement(By.xpath("//*[@id='lastname']")).sendKeys("LastNameinAddress");
            driver.findElement(By.xpath("//*[@id='company']")).sendKeys("Company");
            driver.findElement(By.xpath("//*[@id='address1']")).sendKeys("Addrress1");
            driver.findElement(By.xpath("//*[@id='address2']")).sendKeys("Address2");
            driver.findElement(By.xpath("//*[@id='city']")).sendKeys("SomeTown");

            Select sState = new Select(driver.findElement(By.xpath("//*[@id='id_state']")));
            sState.selectByVisibleText("Alabama");

            driver.findElement(By.xpath("//*[@id='postcode']")).sendKeys("1001");

            Select sCountry = new Select(driver.findElement(By.xpath("//*[@id='id_country']")));
            sCountry.selectByVisibleText("United States");

            driver.findElement(By.xpath("//*[@id='other']")).sendKeys("additional information");
            driver.findElement(By.xpath("//*[@id='phone']")).sendKeys("103333377770");
            driver.findElement(By.xpath("//*[@id='phone_mobile']")).sendKeys("7777777777");
            driver.findElement(By.xpath("//*[@id='alias']")).sendKeys("alias");

            driver.findElement(By.xpath("//*[@id='account-creation_form']")).click();


        }

    }

}