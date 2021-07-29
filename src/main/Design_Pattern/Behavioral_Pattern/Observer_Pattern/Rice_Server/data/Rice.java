package Behavioral_Pattern.Observer_Pattern.Rice_Server.data;

import Behavioral_Pattern.Observer_Pattern.Rice_Server.UpdatedataDisplay.Observer;

import java.util.ArrayList;
import java.util.List;

public class Rice implements Subject {
    private List<Observer> observerList;
    private double price;

    public Rice() {
        this.observerList = new ArrayList<>();
    }
    public void addObserver(Observer o){
        observerList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObserver(double data) {
        for (Observer o : observerList) o.update(data);
    }

    public void setPrice(double price) {
        this.price = price;
        notifyObserver(price);
    }

    public double getPrice() {
        return price;
    }
}
