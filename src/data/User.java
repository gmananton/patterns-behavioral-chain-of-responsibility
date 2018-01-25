package data;

/**
 * Created by Anton Mikhaylov on 24.01.2018.
 */
public class User {

    private String name;
    private boolean isAuthenticated;

    public User() {
    }

    public User(String name, boolean isAuthenticated) {
        this.name = name;
        this.isAuthenticated = isAuthenticated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAuthenticated() {
        return isAuthenticated;
    }

    public void setAuthenticated(boolean authenticated) {
        isAuthenticated = authenticated;
    }
}
