package com.sgic.automation.leavesystem.tests.recruitment;

import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.leave.pages.Dashboard.DashboardPage;
import com.sgic.automation.leave.pages.Recruitment.RecruitmentPage;
import com.sgic.automation.leavesystem.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class DeleteTest extends TestBase {

    private static final Logger LOGGER=Logger.getLogger(DeleteTest.class);

    @Test
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


    }

