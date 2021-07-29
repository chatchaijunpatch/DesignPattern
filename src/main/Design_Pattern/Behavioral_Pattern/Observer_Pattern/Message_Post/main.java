package Behavioral_Pattern.Observer_Pattern.Message_Post;

import Behavioral_Pattern.Observer_Pattern.Message_Post.data.FacebookPage;
import Behavioral_Pattern.Observer_Pattern.Message_Post.observer.BackupService;
import Behavioral_Pattern.Observer_Pattern.Message_Post.observer.User;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        FacebookPage page = new FacebookPage("Master Chef");
        User user = new User("Kwan");
        user.follow(page);
        BackupService service = new BackupService("backup.txt", page);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String message = scanner.nextLine();
            page.post(message);
        }
    }
}
