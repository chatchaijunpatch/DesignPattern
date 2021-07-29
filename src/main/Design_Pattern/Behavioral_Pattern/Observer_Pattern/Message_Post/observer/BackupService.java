package Behavioral_Pattern.Observer_Pattern.Message_Post.observer;

import Behavioral_Pattern.Observer_Pattern.Message_Post.data.Subject;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class BackupService implements Observer {
    private String filename;
    public BackupService(String filename, Subject subject) {
        this.filename = filename;
        subject.addObserver(this);
    }
    @Override
    public void update(String data) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(filename, true);
            PrintWriter out = new PrintWriter(fileWriter);
            out.println(data);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileWriter != null)
                    fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
