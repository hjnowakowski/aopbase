package info.henryk.aop;

//import java.util.logging.Logger;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by henryknowakowski on 02.07.2017.
 */
public class BenchmarkAspect {
    private Logger logger = Logger.getLogger(getClass());

    public void measureExecutionTime(ProceedingJoinPoint proceedingJoinPoint) {
        long startTime = System.nanoTime();

        try {
            Customer customer =  (Customer) proceedingJoinPoint.getArgs()[0];
            if (customer.getName() == null){
                Object[] args = new Object[] {new Customer("anonim")};
                proceedingJoinPoint.proceed(args);

            }else {
                proceedingJoinPoint.proceed();
            }

            proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            //throwable.printStackTrace();
        }

        long endTime = System.nanoTime();

        logger.info("Execution time =" + (endTime = startTime) + " ns");


    }
}
