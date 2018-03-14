package com;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {

    String Url="http://localhost:3003 ";
    WebDriver driver = new ChromeDriver();

    public void initialiseDriver(){

        driver.get(Url);
        driver.manage().window().maximize();

    }

    public void closeDriver(){
        driver.quit();
    }
}
