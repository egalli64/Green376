package data;

public interface Config {
	
    /** MySQL */
    //String URL = "jdbc:mysql://localhost:3306/me";
    public static final String URL = "jdbc:mysql://localhost:3306/me?serverTimezone=Europe/Rome";
    public static final String USER = "green";
    public static final String PASSWORD = "password";

}
