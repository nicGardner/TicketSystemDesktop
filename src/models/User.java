package models;

public class User {
    private int user_id;
    private String username, password;
    private boolean admin;


    public User(int user_id, String username, String password, boolean admin)
    {
        setUser_id(user_id);
        setUsername(username);
        setPassword(password);
        setAdmin(admin);
    }


    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
}
