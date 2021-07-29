package Behavioral_Pattern.Observer_Pattern.Rice_Server.data;

import Behavioral_Pattern.Observer_Pattern.Rice_Server.UpdatedataDisplay.Observer;

public interface Subject {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver(double data);
}
