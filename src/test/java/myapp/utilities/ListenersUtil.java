//package myapp.utilities;
//
//import org.testng.ITestContext;
//import org.testng.ITestListener;
//import org.testng.ITestResult;
//
//import java.io.IOException;
//
//public class ListenersUtil implements ITestListener {
//
//    /*
//    Listeners are used to LISTEN the test cases when they pass, fail, skip, start, end ...
//    Listener will customize the TestNG framework.
//    We will use listeners for adding special functionalities under special cases like onStart, onFinish, onTestStart, onTestSuccess, onTestFailure ...
//    Under these cases we can  take screenshot, rerun failed test cases automatically.
//     */
//
//    @Override
//    public void onStart(ITestContext context) {
//
//        System.out.println("onStart: Runs once before ALL @Test cases: " + context.getName());
//
//    }
//
//
//    @Override
//    public void onFinish(ITestContext context) {
//
//        System.out.println("onFinish: Runs once after ALL @Test cases: " + context.getName());
//
//    }
//
//    @Override
//    public void onTestStart(ITestResult result) {
//
//        System.out.println("onTestStart: Runs once before EACH @Test cases: " + result.getName());
//
//    }
//
//    @Override
//    public void onTestSuccess(ITestResult result) {
//
//        System.out.println("onTestSuccess: Runs once after EACH PASSING @Test cases: " + result.getName());
//
//    }
//
//    @Override
//    public void onTestFailure(ITestResult result) {
//
//        //System.out.println("onTestFailure: Runs once after EACH FAILED @Test cases: " + result.getName());
//
//        try {
//            MediaUtils.takeScreenshotOfTheEntirePage();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//
//    }
//
//    @Override
//    public void onTestSkipped(ITestResult result) {
//
//        System.out.println("onTestSkipped: Runs once after EACH SKIPPED @Test cases: " + result.getName());
//
//    }
//
//    @Override
//    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
//
//        System.out.println("onTestFailedButWithinSuccessPercentage: Runs once after total success percentage @Test cases: " + result.getName());
//
//    }
//
//    @Override
//    public void onTestFailedWithTimeout(ITestResult result) {
//
//        System.out.println("onTestFailedWithTimeout: Runs once after failed test cases due to a timeout issue @Test cases: " + result.getName());
//
//    }
//
//
//        //Implement IRetryAnalyzer
//        //This method will be called to RETRY FAILED TEST CASES
//
////    private int retryCount = 0;//Counter
////    private static final int maxRetryCount = 3;//Rerun count
//
////    @Override
////    public boolean retry(ITestResult result) {
////        if (retryCount < maxRetryCount) {
////            retryCount++;
////            return true;
////        }
////        return false;
//    }
//}
