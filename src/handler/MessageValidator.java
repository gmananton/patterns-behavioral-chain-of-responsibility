package handler;

import data.Request;

/**
 * Created by Anton Mikhaylov on 24.01.2018.
 * Проверяет, не пустое ли сообщение
 */
public class MessageValidator extends BaseHandler {
    @Override
    public void handle(Request request) {

        String msg = request.getMessage();
        if (msg != null && !msg.equals("")) {
            printOK();
            next.handle(request);
        } else {
            printError();
        }
    }
}
