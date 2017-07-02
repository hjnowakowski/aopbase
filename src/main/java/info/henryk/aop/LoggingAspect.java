package info.henryk.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;

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

    public void serveExeption(RuntimeException exeption){
        logger.error("Exeption" + exeption.getLocalizedMessage());
    }

    public void methodExecuted(JoinPoint joinPoint){
        joinPoint.getKind();
        joinPoint.getArgs();
        joinPoint.getSignature();
        joinPoint.getTarget()

        logger.info("Method "+ joinPoint.getSignature().getName() +" has already been executed");
    }
}
