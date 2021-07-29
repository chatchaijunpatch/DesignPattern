package Behavioral_Pattern.Observer_Pattern.Rice_Server.UpdatedataDisplay;

import Behavioral_Pattern.Observer_Pattern.Rice_Server.data.Subject;

public class EconStat implements Observer {
    private Subject subject;
    private double min = 999999;
    private double max = -999999;
    private double average;
    private int numData;
    public EconStat(Subject subject) {
        this.subject = subject;
        subject.addObserver(this);
    }
    @Override
    public void update(double data) {
        if (data < min) min = data;
        if (data > max) max = data;
        average = (average * numData + data) / (numData + 1);
        ++numData;
        display();
    }
    private void display() {
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Average: " + average);
    }
}
