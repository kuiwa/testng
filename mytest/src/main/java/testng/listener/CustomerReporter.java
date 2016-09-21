package testng.listener;

import java.util.List;
import java.util.Map;

import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.xml.XmlSuite;

import testng.helper.Logger;


public class CustomerReporter implements IReporter{
    public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
        for (ISuite suite : suites) {
            String suiteName = suite.getName();
            Map suiteResults = suite.getResults();
            for (ISuiteResult sr : suite.getResults().values()) {
                ITestContext tc = sr.getTestContext();
                Logger.print("Passed tests for sutie '" + suiteName + "' is: " + tc.getPassedTests().getAllResults().size());
                Logger.print("Failed tests for suite '" + suiteName + "' is: " + tc.getFailedTests().getAllResults().size());
                Logger.print("Skipped tests for suite '" + suiteName + "' is: " + tc.getSkippedTests().getAllResults().size());
            }
        }
    }
}
