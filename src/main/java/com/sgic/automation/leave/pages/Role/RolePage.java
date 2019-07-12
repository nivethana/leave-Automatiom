package com.sgic.automation.leave.pages.Role;

import com.sgic.automation.leave.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class RolePage extends PageBase {
    private static final Logger LOGGER=Logger.getLogger(RolePage.class);


    public static By roleSubmenu=By.xpath("//*[@id=\"page4\"]/ul/li[1]/a");
    public static By addRole=By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/section/div/div[1]/button");
    public static By roleTextbox=By.xpath("//*[@id=\"exampleForm.ControlTextarea1\"]");
    public static By roleSavebtn=By.xpath("/html/body/div[3]/div/div/div[3]/button[2]");
    public static By roleClosebtn=By.xpath("/html/body/div[4]/div/div/div[3]/button[1]");
    public static By roleAddSucOkbtn=By.xpath("/html/body/div[2]/div/div[4]/div/button");
    public static By roleTitel=By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/section/div/div[2]/table/thead/tr/th[1]");

    public static By roleEditbtn=By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/section/div/div[2]/table/tbody/tr[2]/td[2]/button[1]/i");
    public static By rolDeleteBtn=By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/section/div/div[2]/table/tbody/tr[3]/td[2]/button[2]");

    public static boolean isdisplyRolepage(){implicitWait(5);
        return getDriver().findElement(roleTitel).isDisplayed();
    }

    public static void ClickAddBtnRole(){implicitWait(5);
        getDriver().findElement(addRole).click();
    }

    public static void ClickRoleSubmenu(){implicitWait(5);
        getDriver().findElement(roleSubmenu).click();
    }

    public static void sendtextRole(){implicitWait(5);
        getDriver().findElement(roleTextbox).sendKeys("QA");
    }

    public static void ClickSaveRole(){implicitWait(5);
        getDriver().findElement(roleSavebtn).click();
    }

    public static void ClickCloseRole(){implicitWait(5);
        getDriver().findElement(roleClosebtn).click();
    }

    public static void ClickOkrole(){implicitWait(5);
        getDriver().findElement(roleAddSucOkbtn).click();
    }

    public static void ClickEdit(){
        implicitWait(5);
        getDriver().findElement(roleEditbtn).click();
    }

    public static void ClickDeleteBtn(){
        implicitWait(5);
        getDriver().findElement(rolDeleteBtn).click();
    }
}
