package com.sgic.automation.leavesystem.tests.recruitment;

import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.leave.pages.Dashboard.DashboardPage;
import com.sgic.automation.leave.pages.Recruitment.EditPage;
import com.sgic.automation.leave.pages.Recruitment.RecruitmentPage;
import com.sgic.automation.leavesystem.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;


public class editRecruitment extends TestBase {
    private static final Logger LOGGER= Logger.getLogger(editRecruitment.class);

    @Test
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
}
