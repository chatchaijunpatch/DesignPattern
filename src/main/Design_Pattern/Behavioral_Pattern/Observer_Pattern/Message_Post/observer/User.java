package Behavioral_Pattern.Observer_Pattern.Message_Post.observer;

import Behavioral_Pattern.Observer_Pattern.Message_Post.DisplayFrame;
import Behavioral_Pattern.Observer_Pattern.Message_Post.data.Subject;

import java.time.LocalDateTime;

public class User implements Observer {
    private String name;
    private DisplayFrame frame;

    public User(String name) {
        this.name = name;
        this.frame = new DisplayFrame();
    }
    public void follow(Subject subject){
        subject.addObserver(this);
    }

    @Override
    public void update(String data) {
        frame.display(LocalDateTime.now() + ": "+data);
    }
}
