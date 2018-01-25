import data.Request;
import data.User;
import handler.Authenticator;
import handler.MessageValidator;
import handler.Printer;

/**
 * Created by Anton Mikhaylov on 24.01.2018.
 */
public class Main {

    public static void main(String[] args) {

        Authenticator authenticator = new Authenticator();
        MessageValidator validator = new MessageValidator();
        Printer printer = new Printer();

        authenticator.setNext(validator);
        validator.setNext(printer);

        authenticator.handle(request1());
        System.out.println("-------------------------------------\n");

        authenticator.handle(request2());
        System.out.println("-------------------------------------\n");

        authenticator.handle(request3());
        System.out.println("-------------------------------------\n");

    }

    private static Request request1() {
        User user = new User("Anton", true);
        String msg = "Hello, my name is Anton!";
        return new Request(msg, user);
    }

    private static Request request2() {
        User user = new User("Anton", false);
        String msg = "Hello, my name is Anton!";
        return new Request(msg, user);
    }

    private static Request request3() {
        User user = new User("Anton", true);
        String msg = "";
        return new Request(msg, user);
    }

}
