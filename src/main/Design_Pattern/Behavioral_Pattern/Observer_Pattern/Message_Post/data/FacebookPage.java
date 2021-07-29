package Behavioral_Pattern.Observer_Pattern.Message_Post.data;

import Behavioral_Pattern.Observer_Pattern.Message_Post.data.Subject;
import Behavioral_Pattern.Observer_Pattern.Message_Post.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class FacebookPage implements Subject {
    private List<Observer> observers;
    private String name;
    private List<String> posts;

    public FacebookPage(String name) {
        this.name = name;
        this.observers = new ArrayList<>();
        this.posts = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver(String data) {
        for (Observer o : observers) o.update(data);
    }
    public void post(String message){
        posts.add(message);
        notifyObserver(message);
    }
}
