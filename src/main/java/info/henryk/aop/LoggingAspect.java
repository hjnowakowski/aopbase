package info.henryk.aop;

import java.util.logging.Logger;

/**
 * Created by henryknowakowski on 01.07.2017.
 */
public class LoggingAspect {
    public void logExecution(){
        Logger.getLogger(getClass().getName()).info("Method executing");
    }
}
