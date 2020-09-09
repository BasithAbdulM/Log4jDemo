package trylogger;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

public class XmlConfigLog4j {
    static Logger logger=Logger.getLogger(XmlConfigLog4j.class);

    @Test
    public void start() {
        DOMConfigurator.configure("log4j2.xml");
        logger.debug("This is a debug");
        logger.info("This is the Starting point");
        logger.warn("Warning");
        logger.error("Error");
        logger.fatal("Fatal Message");

    }

}
