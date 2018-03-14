package com;

import  org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class loginPage {


  @FindBy(id = "username")
  private WebElement userName;

  @FindBy(id = "password")
  private WebElement password;

  @FindBy(id = "doLogin")
  private WebElement submit;

  @FindBy(id = "hotelName")
  private WebElement hotel;

  @FindBy(id = "address")
  private WebElement address;

  @FindBy(id = "owner")
  private WebElement owner;

  @FindBy(id = "phone")
  private WebElement phone;

  public loginPage enterloginDetails(){

    userName.sendKeys("admin");
    password.sendKeys("Password");
    submit.click();
    return this;

  }






}


