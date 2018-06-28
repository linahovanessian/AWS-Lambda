package com.aws.unit1.pojohandler;

/**
 * @author linahovanessian on 6/28/18.
 */
public class ResponseClass {

    private String greetingMessage;

    public ResponseClass(){

    }

    public ResponseClass(String greetingMessage) {
        this.greetingMessage = greetingMessage;
    }

    public String getGreetingMessage() {
        return greetingMessage;
    }

    public void setGreetingMessage(String greetingMessage) {
        this.greetingMessage = greetingMessage;
    }
}
