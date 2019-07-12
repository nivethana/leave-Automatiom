package com.sgic.automation.leave.pages.Dashboard;

import com.sgic.automation.leave.utils.PageBase;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;
import org.apache.log4j.Logger;


public class DashboardPage extends PageBase {
    private static final Logger LOGGER=Logger.getLogger(DashboardPage.class);
    public SoftAssert softAssert;

    private static By dashBoard=By.xpath("//*[@id=\"root\"]/div/header/nav/a[2]");
    private static By dashBoardmenu=By.xpath("//*[@id=\"sidebar\"]/ul/li[1]/a/span");
    private static By profileMenu=By.xpath("//*[@id=\"sidebar\"]/ul/li[2]/a");
    private static By leaveMenu=By.xpath("//*[@id=\"sidebar\"]/ul/li[3]/a");
    private static By manageleaveMenu=By.xpath("//*[@id=\"sidebar\"]/ul/li[5]/a/span");
    private static By manageuserMenu=By.xpath("//*[@id=\"sidebar\"]/ul/li[6]/a/span");
    private static By manageEmployeemenu= By.xpath("//*[@id=\"sidebar\"]/ul/li[4]/a/span");
    private static By settingMenu=By.xpath("//*[@id=\"sidebar\"]/ul/li[7]/a/span");

    private static By leavetypeSubmenu=By.xpath("//*[@id=\"page3\"]/ul/li[2]/a");



    public static boolean isDashboardDisply(){
        implicitWait(5);
        return getDriver().findElement(dashBoard).isDisplayed();
    }

    public static void clickDashboardmenu(){
        implicitWait(5);
        getDriver().findElement(dashBoardmenu).click();

    }
    public static void clickProfilmenu(){
        implicitWait(5);
        getDriver().findElement(profileMenu).click();

    }
    public static void clickLeavemenu(){implicitWait(5);
        getDriver().findElement(leaveMenu).click();

    }
    public static void clickManageempType() {
        implicitWait(5);
        getDriver().findElement(manageEmployeemenu).click();
    }
    public static void clickManageLeave() {
        implicitWait(5);
        getDriver().findElement(manageleaveMenu);

    }

    public static void clickSubLeaveType(){
        implicitWait(5);
        getDriver().findElement(leavetypeSubmenu);
    }


    public static void clickmanageUsermenu(){
        implicitWait(5);
        getDriver().findElement(manageuserMenu).click();

    }
    public static void clickSettingmenu(){
        implicitWait(5);
        getDriver().findElement(settingMenu).click();

    }


}
