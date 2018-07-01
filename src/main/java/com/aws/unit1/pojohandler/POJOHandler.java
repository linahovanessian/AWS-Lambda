package com.aws.unit1.pojohandler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

/**
 * @author linahovanessian on 6/28/18.
 */
public class POJOHandler implements RequestHandler<RequestClass, ResponseClass> {


    @Override
    public ResponseClass handleRequest(RequestClass input, Context context) {
        String greetingMessage = "Hello " + input.getFirstName() + " " + input.getLastName();


        return new ResponseClass( greetingMessage );
    }
}
