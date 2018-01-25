package handler;

import data.Request;
import data.User;

/**
 * Created by Anton Mikhaylov on 24.01.2018.
 * Проверяет, аутентифицирован ли юзер
 */
public class Authenticator extends BaseHandler {

    @Override
    public void handle(Request request) {

        User user = request.getUser();

        if (user.getName() != null && user.isAuthenticated()) {
            printOK();
            next.handle(request);
        } else {
            printError();
        }
    }
}
