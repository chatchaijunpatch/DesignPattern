package Behavioral_Pattern.Observer_Pattern.Message_Post.data;

import Behavioral_Pattern.Observer_Pattern.Message_Post.observer.Observer;

public interface Subject {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver(String o);
}
