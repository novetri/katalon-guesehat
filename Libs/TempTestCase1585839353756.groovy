import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())


RunConfiguration.setExecutionSettingFile('/var/folders/bn/lkxpp5r9765_fnmct7y84t000000gn/T/Katalon/Test Cases/01. Article Pages/TC01_As a user, able to see article sub menu/20200402_215553/execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCase('Test Cases/01. Article Pages/TC01_As a user, able to see article sub menu', new TestCaseBinding('Test Cases/01. Article Pages/TC01_As a user, able to see article sub menu',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
