package com.sgic.automation.leavesystem.tests.recruitment;

import com.sgic.automation.leave.pages.Dashboard.DashboardPage;
import com.sgic.automation.leave.pages.Recruitment.RecruitmentPage;
import com.sgic.automation.leavesystem.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class closeRecruitmentTest extends TestBase {
    private static final Logger LOGGER=Logger.getLogger(closeRecruitmentTest.class);

    @Test

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
    }

}
