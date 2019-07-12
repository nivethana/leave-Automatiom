package com.sgic.automation.leave.pages.Recruitment;

import com.sgic.automation.leave.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class EditPage extends PageBase {

    public static final Logger LOGGER=Logger.getLogger(EditPage.class);

    private static By btnEdit=By.xpath("//*[@class=\"btn btn-success btn-circle\"]");
    private static By editRecruitmentname=By.xpath("//*[@id=\"exampleForm.ControlTextarea1\"]");
    private static By updatebtnEdit=By.xpath("/html/body/div[3]/div/div/div[3]/button[2]");
    private static By closebtnEdit=By.xpath("//*[@class=\"btn btn-danger \"]");



    public static void clickEditRecruitment(){
        implicitWait(5);
        getDriver().findElement(btnEdit).click();
    }

    public static void sendEditRecruitment(){
        implicitWait(5);
        getDriver().findElement(editRecruitmentname).sendKeys("permanat");

    }

    public static void ClickUptbtnEdit(){
        implicitWait(5);
        getDriver().findElement(updatebtnEdit).click();

    }

    public static void ClickClosebtnEdit(){
        implicitWait(5);
        getDriver().findElement(closebtnEdit).click();

    }
    public static void ClearRecruitmentType(){
        implicitWait(5);
        getDriver().findElement(editRecruitmentname).clear();
    }



}
