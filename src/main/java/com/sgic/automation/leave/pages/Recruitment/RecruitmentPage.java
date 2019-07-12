package com.sgic.automation.leave.pages.Recruitment;

import com.sgic.automation.leave.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class RecruitmentPage extends PageBase {

    private static final Logger LOGGER = Logger.getLogger(RecruitmentPage.class);



    private static By recruitmentType=By.xpath("//*[@id=\"page2\"]/ul/li[1]/a");

    private static By recruitmentAddbtn=By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/section/div/div[1]/button");
    private static By recruitmentTypetitle=By.xpath("//*[@class=\"h6 text-uppercase mb-0\"]");

    private static By recruitmentTypename=By.xpath("//*[@id=\"exampleForm.ControlTextarea1\"]");

    private static By btnAdd=By.xpath("/html/body/div[3]/div/div/div[3]/button[2]");
    private static By btnClose=By.xpath("/html/body/div[3]/div/div/div[3]/button[1]");
    private static By addText=By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/section/div/div[2]/table/tbody/tr[1]/td[1]");

    private static By btnDelete=By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/section/div/div[2]/table/tbody/tr[1]/td[2]/button[2]");
    private static By btnOkDelete=By.xpath("/html/body/div[2]/div/div[4]/div[2]/button");

    private static By visibleText=By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/section/div/div[2]/table/tbody/tr/td[1]");


    public static boolean isRcruitmentDisply(){
        return getDriver().findElement(recruitmentTypetitle).isDisplayed();

    }



    public static void sendkeyReqruitmentType(){
        implicitWait(5);
        getDriver().findElement(recruitmentTypename).sendKeys("Tempary");
    }

    public static void clickRecruitmenttype()
    {implicitWait(5);
        getDriver().findElement(recruitmentType).click();
    }

    public static void clickAddrecruitment(){
        implicitWait(5);
        getDriver().findElement(recruitmentAddbtn).click();
    }

    public static void clickCloseRecruitment(){
        implicitWait(5);
        getDriver().findElement(btnClose).click();
    }

    public static void clickRecruitmenttypename()
    {implicitWait(5);
        getDriver().findElement(recruitmentTypename).click();
    }

    public static void clickAddrecruitmentbtn(){
        implicitWait(5);
        getDriver().findElement(btnAdd).click();
    }

    public  static boolean VisibleAddrecruitment(){
        implicitWait(5);
        return getDriver().findElement(addText).isDisplayed();
    }

    public static void clickDeleteRecruitment(){
        implicitWait(5);
        getDriver().findElement(btnDelete).click();
    }

    public static void clickOkDeleteRecruitment(){
        implicitWait(5);
        getDriver().findElement(btnOkDelete).click();
    }



}
