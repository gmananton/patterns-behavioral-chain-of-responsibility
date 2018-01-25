package handler;

import data.Request;

/**
 * Created by Anton Mikhaylov on 24.01.2018.
 * Выводит сообщение и пользователя, его отправившего
 */
public class Printer extends BaseHandler {

    @Override
    public void handle(Request request) {
        System.out.println("Message from user " + request.getUser().getName() + ":");
        System.out.println(request.getMessage());
    }
}
