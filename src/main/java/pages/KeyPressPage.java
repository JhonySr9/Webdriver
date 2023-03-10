package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressPage {

    private WebDriver driver;
    private By inputField = By.id("target");
    private By resultText = By.id("result");

    public KeyPressPage(WebDriver driver){
        this.driver = driver;
    }

    public void enterTest(String text){
        driver.findElement(inputField).sendKeys(text);
    }

    public void enterPi(){
        enterTest(Keys.chord(Keys.ALT, Keys.NUMPAD1, Keys.NUMPAD6, Keys.NUMPAD6) + "aaaa");
    }

    public String getResult(){
        return driver.findElement(resultText).getText();
    }


}
