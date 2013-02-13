package org.nsesa.editor.gwt.an.it;

import junit.framework.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Date: 13/02/13 10:31
 *
 * @author <a href="philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public class SeleniumIT {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://localhost:8080/editor/editor.html?documentID=1");
        final String title = driver.getTitle();
        new WebDriverWait(driver, 10).until(new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver input) {
                return input.getTitle().toLowerCase().contains("document 1");
            }
        });
        Assert.assertEquals("Document 1 - Nsesa Editor", driver.getTitle());
        driver.quit();
    }
}
