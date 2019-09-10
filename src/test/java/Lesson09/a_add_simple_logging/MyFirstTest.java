package lesson09.a_add_simple_logging;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class MyFirstTest extends lesson09.a_add_simple_logging.BaseTest {

    @Test
    public void verifyFirstTipIsCorrectlyUpdatedAfterEnteringNewQuery() {
        lesson09.a_add_simple_logging.LandingPage landingPage = new lesson09.a_add_simple_logging.LandingPage (driver);
        landingPage.openPage();
        String query1 = "Dress";
        String query2 = "T-shirt";

        landingPage.searchFor(query1);
        Assert.assertThat(landingPage.getFirstTipText(7),
                CoreMatchers.containsString(query1));

        landingPage.searchFor(query2);

        String firstTipText = landingPage.getFirstTipText(1);
        assertAll(() -> Assert.assertThat(firstTipText, CoreMatchers.containsString(query2)));
    }

}