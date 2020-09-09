package trylogger;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.RollingFileAppender;
import org.testng.ReporterConfig;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;

public class PropertyFileLog4j {
    static Logger logger=Logger.getLogger(PropertyFileLog4j.class);
    RollingFileAppender rollingFileAppender;
    @Test
    public void start()  {
        PropertyConfigurator.configure("log4j2.properties");
        logger.debug("This is a debug");
        logger.info("This is the Starting point");
        logger.warn("Warning");
        logger.error("Error");
        logger.fatal("Fatal Message");

    }
}
