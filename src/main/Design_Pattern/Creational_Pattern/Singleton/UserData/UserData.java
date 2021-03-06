package Creational_Pattern.Singleton.UserData;

public class UserData {
    private String firstName;
    private String lastName;
    private static  UserData instance;

    private UserData() {
    }
    public static  UserData getInstance(){
        if (instance == null) instance = new UserData();
        return  instance;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
