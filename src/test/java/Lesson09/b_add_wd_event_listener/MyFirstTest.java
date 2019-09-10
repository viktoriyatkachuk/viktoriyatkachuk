package lesson09.b_add_wd_event_listener;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import pages.LandingPage;

public class MyFirstTest extends lesson09.b_add_wd_event_listener.BaseTest {

    @Test
    public void verifyFirstTipIsCorrectlyUpdatedAfterEnteringNewQuery() {
        LandingPage landingPage = new LandingPage(driver);
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