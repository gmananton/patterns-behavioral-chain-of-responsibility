package handler;

import data.Request;

/**
 * Created by Anton Mikhaylov on 24.01.2018.
 */
public interface Handler {
    void handle(Request request);
    void setNext(Handler handler);
}
