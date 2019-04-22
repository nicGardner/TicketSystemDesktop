package models;

public class CurrentUser {
    private static String username;
    private static boolean admin;
    private static int user_id;


    public static void setUsername(String name)
    {
        username=name;
    }

    public static void setAdmin(boolean isAdmin)
    {
        admin=isAdmin;
    }

    public static String getUsername()
    {
        return username;
    }

    public static boolean isAdmin()
    {
        return admin;
    }

    public static int getUser_id()
    {
        return user_id;
    }

    public static void setUser_id(int id)
    {
        user_id=id;
    }
}
