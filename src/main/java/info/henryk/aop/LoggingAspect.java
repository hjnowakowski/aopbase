package info.henryk.aop;

//import java.util.logging.Logger;
import org.apache.log4j.Logger;

/**
 * Created by henryknowakowski on 01.07.2017.
 */
public class LoggingAspect {
    private Logger logger = Logger.getLogger(getClass().getName());
    public void logExecution(){
        logger.info("Method executing");
    }
    public void warnifNull(Object returnedValue){
        if (returnedValue == null){
            logger.warn("Returned value is null");
        }
    }
}
