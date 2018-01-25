package handler;

import data.Request;

/**
 * Created by Anton Mikhaylov on 24.01.2018.
 */
public class BaseHandler implements Handler {

    protected Handler next;
    protected String messageOK = this.getClass().getSimpleName() +  ": validation passed";
    protected String messageError = this.getClass().getSimpleName() +  ": validation error";

    @Override
    public void handle(Request request) {
        if (next != null) {
            next.handle(request);
        }
    }

    @Override
    public void setNext(Handler handler) {
        next = handler;
    }

    protected void printOK() {
        System.out.println(messageOK);
    }

    protected void printError() {
        System.out.println(messageError);
    }
}
