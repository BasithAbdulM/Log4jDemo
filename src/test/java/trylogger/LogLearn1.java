package trylogger;


import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
//                                                              Basic Configurator
//                                                                Factory design patten
public class LogLearn1 {
    static Logger logger=Logger.getLogger(LogLearn1.class);

    @Test
    public void start(){
        BasicConfigurator.configure();
        logger.debug("This is a debug");
        logger.info("This is the Starting point");
        logger.warn("Warning");
        logger.error("Error");
        logger.fatal("Fatal Message");


    }
    @Test
    public void end(){
        BasicConfigurator.configure();
        logger.info("End the Process");

    }
}
