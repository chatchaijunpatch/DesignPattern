package Behavioral_Pattern.Observer_Pattern.Rice_Server.UpdatedataDisplay;

import Behavioral_Pattern.Observer_Pattern.Rice_Server.data.Subject;

//
public class NewsRoom implements Observer {
    private Subject subject;
    public NewsRoom(Subject subject){
        this.subject = subject;
        subject.addObserver(this); // ?????????????? NewsRoom
    }

    @Override
    public void update(double data) {
        System.out.println("Current Rice Price: "+data);
    }
}
