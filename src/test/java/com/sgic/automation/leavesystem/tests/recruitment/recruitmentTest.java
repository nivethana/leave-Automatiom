package com.sgic.automation.leavesystem.tests.recruitment;


import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.leave.pages.Dashboard.DashboardPage;
import com.sgic.automation.leave.pages.Recruitment.EditPage;
import com.sgic.automation.leave.pages.Recruitment.RecruitmentPage;
import com.sgic.automation.leavesystem.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;


public class recruitmentTest extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(recruitmentTest.class);

    @Test(priority = 1)
    public void addRecruitmentType(){

        extentTest=extentReport.startTest("addRecruitment");
        DashboardPage.clickManageempType();
        LOGGER.info("DashBoardPage is menu CLick");

        RecruitmentPage.clickRecruitmenttype();

        LOGGER.info("successful recruitment menu");
        softAssert.assertTrue(RecruitmentPage.isRcruitmentDisply(),"Successful verify");
        LOGGER.info("recruitment page didplied successful");
        RecruitmentPage.clickAddrecruitment();
        LOGGER.info("Addrecruitment btn successful");
        RecruitmentPage.sendkeyReqruitmentType();
        LOGGER.info("successful sendkey");
        RecruitmentPage.clickAddrecruitmentbtn();
        LOGGER.info("Successful add button");
        softAssert.assertTrue(RecruitmentPage.VisibleAddrecruitment(),"visible text");
        extentTest.log(LogStatus.PASS, " Add Btn in Leave management System : ");
        extentReport.endTest(extentTest);
        softAssert.assertAll();

    }

    @Test(priority = 2)
    public void editBtn(){

        extentTest=extentReport.startTest("editRecruitment");
        DashboardPage.clickManageempType();
        LOGGER.info("DashBoardPage is menu CLick");

        RecruitmentPage.clickRecruitmenttype();

        LOGGER.info("successful click recruitment menu");
        RecruitmentPage.isRcruitmentDisply();
        LOGGER.info("recruitment page didplied successful");

        EditPage.clickEditRecruitment();
        LOGGER.info("Click edit recruitment");
        EditPage.ClearRecruitmentType();
        LOGGER.info("Successful clear");
        EditPage.sendEditRecruitment();
        LOGGER.info("Successful sendkey");
        EditPage.ClickUptbtnEdit();
        LOGGER.info("Successful edit");

        extentTest.log(LogStatus.PASS,"Edit in Leave management System");
        extentReport.endTest(extentTest);
        softAssert.assertAll();

    }

    @Test(priority = 3)
    public void DeletBtn(){

        extentTest =extentReport.startTest("Delete btn test");

        DashboardPage.clickManageempType();
        LOGGER.info("DashBoardPage is menu CLick");

        RecruitmentPage.clickRecruitmenttype();

        LOGGER.info("successful recruitment menu");
        RecruitmentPage.isRcruitmentDisply();
        LOGGER.info("recruitment page didplied successful");

        RecruitmentPage.clickDeleteRecruitment();
        LOGGER.info("successful Deleted");
        RecruitmentPage.clickOkDeleteRecruitment();
        LOGGER.info("Deleted ");

        extentTest.log(LogStatus.PASS,"Delete Btn in Leave management System");
        extentReport.endTest(extentTest);
        softAssert.assertAll();

    }

    @Test(priority = 4)

    public void CloseTest(){
        extentTest =extentReport.startTest("Close btn test");

        DashboardPage.clickManageempType();
        LOGGER.info("DashBoardPage is menu CLick");

        RecruitmentPage.clickRecruitmenttype();

        LOGGER.info("successful recruitment menu");
        RecruitmentPage.isRcruitmentDisply();
        LOGGER.info("recruitment page didplied successful");
        RecruitmentPage.clickAddrecruitment();
        LOGGER.info("Addrecruitment btn successful");
        RecruitmentPage.sendkeyReqruitmentType();
        LOGGER.info("successful sendkey");
        RecruitmentPage.clickCloseRecruitment();
        LOGGER.info("successful close btn");


        extentTest.log(LogStatus.PASS,"Delete Btn in Leave management System");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }





}
