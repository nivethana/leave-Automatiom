package com.sgic.automation.leavesystem.tests.role;

import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.leave.pages.Dashboard.DashboardPage;
import com.sgic.automation.leave.pages.Role.RoleEditPage;
import com.sgic.automation.leave.pages.Role.RolePage;
import com.sgic.automation.leavesystem.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class roleTest extends TestBase {
    private static final Logger LOGGER=Logger.getLogger(roleTest.class);
@Test
    public void addRolrTest(){
        extentTest=extentReport.startTest("Add Role");

        DashboardPage.clickmanageUsermenu();
        LOGGER.info("Successful Click ManageLeave");
        RolePage.ClickRoleSubmenu();
        LOGGER.info("Sccc sub menu");
        RolePage.ClickAddBtnRole();
        LOGGER.info("click add");
        RolePage.isdisplyRolepage();
        LOGGER.info("verify page");
        RolePage.sendtextRole();
        LOGGER.info("success key send");
        RolePage.ClickSaveRole();
        LOGGER.info("click save");
        RolePage.ClickOkrole();
        LOGGER.info("successful");

        extentTest.log(LogStatus.PASS,"Delete Btn in Leave management System");
        extentReport.endTest(extentTest);
        softAssert.assertAll();

    }

    @Test
    public void EditTest(){
    extentTest=extentReport.startTest("Edit Test");
    DashboardPage.clickmanageUsermenu();
    RolePage.ClickRoleSubmenu();
    RolePage.ClickEdit();
    RoleEditPage.clearText();
    RoleEditPage.sendKey();
    RoleEditPage.clickUpdate();
    RoleEditPage.clickEditOk();
    }

    @Test
    public void DeleteTest(){
        extentTest=extentReport.startTest("Delete Test");
        DashboardPage.clickmanageUsermenu();
        RolePage.ClickRoleSubmenu();
        RolePage.ClickDeleteBtn();
        RoleEditPage.clickConfirmDeleteOk();
        RoleEditPage.clickOkDelete();
    }

}
