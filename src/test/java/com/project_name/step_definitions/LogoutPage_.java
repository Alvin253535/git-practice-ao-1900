package com.project_name.step_definitions;

import com.project_name.pages.BasePage;
import com.project_name.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage_ extends BasePage {

@FindBy(xpath = "//i[@class='fa fa-lock']")
public WebElement logoutButton;


public void logout(){
        BrowserUtils.sleep(2);
        logoutButton.click();
        }

        }

/*
 @FindBy(xpath = "//i[@class='fa fa-lock']")
    public WebElement logoutButton;


 public void logout(){
     BrowserUtils.sleep(2);
     logoutButton.click();
 }
 */