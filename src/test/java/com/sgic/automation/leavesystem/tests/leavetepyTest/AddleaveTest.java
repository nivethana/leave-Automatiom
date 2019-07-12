package com.sgic.automation.leavesystem.tests.leavetepyTest;

import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.leave.pages.Dashboard.DashboardPage;
import com.sgic.automation.leavesystem.utils.TestBase;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class AddleaveTest extends TestBase {
    private static final Logger LOGGER=Logger.getLogger(AddleaveTest.class);
    @Test
    public void addLeavetype(){
        extentTest=extentReport.startTest("AddleaveTest");

        DashboardPage.clickManageLeave();
        LOGGER.info("Successful click");
        DashboardPage.clickSubLeaveType();
        LOGGER.info("Successful sub menu");

        extentTest.log(LogStatus.PASS, " Leave Type in Leave management System : ");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }
}
