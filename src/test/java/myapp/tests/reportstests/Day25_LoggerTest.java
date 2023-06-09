package myapp.tests.reportstests;

import org.apache.logging.log4j.LogManager;
import org.testng.annotations.Test;



public class Day25_LoggerTest {



    @Test
    public void loggerTest(){
        LogManager.getLogger().fatal("Fatal Error");
        LogManager.getLogger().error("Fatal Error");
        LogManager.getLogger().info("Info");
        LogManager.getLogger().debug("Debug");


    }

}
