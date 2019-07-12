package com.sgic.automation.leave.pages.Role;

import com.sgic.automation.leave.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

import javax.print.DocFlavor;
import java.security.PublicKey;

public class RoleEditPage extends PageBase {
    private static final Logger LOGGER=Logger.getLogger(RoleEditPage.class);

    public static By EditTextbox=By.xpath("//*[@id=\"exampleForm.ControlTextarea1\"]");
    public static By EditUpdateBtn=By.xpath("/html/body/div[3]/div/div/div[3]/button[2]");
    public static By EditCloseBtn=By.xpath("/html/body/div[3]/div/div/div[3]/button[1]");
    public static By EditSuccessOkBtn=By.xpath("/html/body/div[2]/div/div[4]/div/button");

    public static By DeleteConfirmOk=By.xpath("/html/body/div[2]/div/div[4]/div[2]/button");
    public static By DeleteCancelBtn=By.xpath("/html/body/div[2]/div/div[4]/div[1]/button");
    public static By DeleteOkBtn=By.xpath("/html/body/div[2]/div/div[3]/div/button");




    public static void sendKey(){
        implicitWait(5);
    getDriver().findElement(EditTextbox).sendKeys("Senior UI designer");
    LOGGER.info("***Success sent");
    }

    public static void clearText(){
        implicitWait(5);
        getDriver().findElement(EditTextbox).clear();
        LOGGER.info("***Success clear***");


    }

    public static void clickUpdate(){
        implicitWait(5);
        getDriver().findElement(EditUpdateBtn).click();
        LOGGER.info("****Success update");

    }

    public static void clickEditOk(){
        implicitWait(5);
        getDriver().findElement(EditSuccessOkBtn).click();
        LOGGER.info("***sucess Ok****");
    }

    public static void clickClosebtn(){
        implicitWait(5);
        getDriver().findElement(EditCloseBtn).click();
        LOGGER.info("****success Close");
    }

    public static void clickConfirmDeleteOk(){
        implicitWait(5);
        getDriver().findElement(DeleteConfirmOk).click();
        LOGGER.info("***Success conform***");
    }

    public static void clickConfirmCancel(){
        implicitWait(5);
        getDriver().findElement(DeleteCancelBtn).click();
        LOGGER.info("Succesful Cancel Delete");
    }

    public static void clickOkDelete(){
        implicitWait(5);
        getDriver().findElement(DeleteOkBtn).click();
        LOGGER.info("Successfil Delete");
    }
}


