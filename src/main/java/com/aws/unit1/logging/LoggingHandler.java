package com.aws.unit1.logging;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author linahovanessian on 6/28/18.
 */
public class LoggingHandler implements RequestHandler<String,String> {

    // Initialize the Log4j logger.
    static final Logger logger = LogManager.getLogger(LoggingHandler.class);


    @Override
    public String handleRequest(String input, Context context) {
        LambdaLogger lambdaLogger = context.getLogger();
        lambdaLogger.log( input );
        lambdaLogger.log( "this is the lambdaLogger" );


        logger.log( Level.ALL , "input is " + input );


        // System.err: One log statement but with a line break (AWS Lambda writes two events to CloudWatch).
        System.err.println("log data from stderr. \n this is a continuation of system.err");


        logger.error("log data from log4j err. \n this is a continuation of log4j.err");

        // Return will include the log stream name so you can look
        // up the log later.
        return String.format("Hello %s. log stream = %s", input, context.getLogStreamName());

    }
}
