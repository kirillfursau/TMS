package model;

public class User {
    private String login;
    private String password;

    public User(String login, String password) {
        setLogin(login);
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

}
