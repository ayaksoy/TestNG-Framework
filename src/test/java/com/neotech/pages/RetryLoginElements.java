package com.neotech.pages;

import com.neotech.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RetryLoginElements extends CommonMethods {
    @FindBy(css = ".toast-message")
    public WebElement invalidCredentials;

    public RetryLoginElements() {
        PageFactory.initElements(driver, this);
    }
}
