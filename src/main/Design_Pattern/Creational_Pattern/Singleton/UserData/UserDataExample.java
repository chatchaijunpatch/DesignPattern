package Creational_Pattern.Singleton.UserData;

public class UserDataExample {
    public static void main(String[] args) {
        UserData userData = UserData.getInstance();
        userData.setFirstName("Hee");
        userData.setLastName("CNX");
        System.out.println(userData.getInstance().getFirstName());
    }
}
