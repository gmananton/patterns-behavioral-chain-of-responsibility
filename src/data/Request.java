package data;

/**
 * Created by Anton Mikhaylov on 24.01.2018.
 */
public class Request {

    private String message;
    private User user;

    public Request() {
    }

    public Request(String message, User user) {
        this.message = message;
        this.user = user;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
