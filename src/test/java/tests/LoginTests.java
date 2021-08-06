package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.SeleniumUtils;

public class LoginTests extends TestBase{

    @Test (groups = {"smoke_test"})
    public void appHealthCheck(){


        logger.info("Navigating to the main page");

        Assert.assertTrue(driver.getCurrentUrl().equals(ConfigReader.getProperty("url")));

    }

    @Test (groups = {"smoke_test"})
    public void positiveLogin() {


        LoginPage loginPage = new LoginPage();
        logger.info("Entering Email, Password and clicking login button and verifying the url is expected");

        loginPage.login(email, pass);
        Assert.assertTrue(driver.getCurrentUrl().equals("http://duobank-env.eba-hjmrxg9a.us-east-2.elasticbeanstalk.com/dashboard.php"));

    }

}

