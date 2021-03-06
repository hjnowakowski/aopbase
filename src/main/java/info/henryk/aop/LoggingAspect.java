package info.henryk.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;

/**
 * Created by henryknowakowski on 01.07.2017.
 */
public class LoggingAspect {

    private Logger logger = Logger.getLogger(getClass().getName());

    public void logExecution(JoinPoint joinPoint){
        System.out.println(joinPoint.getSignature());
    }





//TODO: how to overload logExecution() and use logExecution(JoinPoint joinPoint)


//    public void logExecution() {
//        logger.info("Method executing");
//    }
    public void warnifNull(Object returnedValue){
        if (returnedValue == null){
            logger.warn("Returned value is null");
        }
    }

    public void serveExeption(RuntimeException exeption){
        logger.error("Exeption" + exeption.getLocalizedMessage());
    }

    public void methodExecuted(JoinPoint joinPoint){

        logger.info("Method "+ joinPoint.getSignature().getName() +" has already been executed");
    }


}
