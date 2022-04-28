package qa.guru.owner;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebDriverTestHW {

    @Test
    @Disabled
    public void testGitHubTitle() {
        WebDriver driver = new ChromeDriver();
//        ChromeDriver driver = new ChromeDriver();
        driver.get("https://github.com");
// (!) в случае ошибки несовместимосети версии ChromeDriver с версией браузера Chrome
// берем актуальную\ нужную в https://chromedriver.chromium.org/downloads
// и подменяем, где была выложена ранее, например, в C:\chromedriver
        System.out.println(driver.getTitle());
        assertEquals( driver.getTitle(), "GitHub: Where the world builds software · GitHub");
        driver.quit();

    }
//    @Test
//    public void testGitHubTitle2() {
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://github.com");
//        System.out.println(driver.getTitle());
//        assertEquals( driver.getTitle(), "GitHub: Where the world builds software · GitHub");
//        driver.quit();
//
//    }
}
