package Behavioral_Pattern.Observer_Pattern.Message_Post;

import javax.swing.*;

public class DisplayFrame extends JFrame {
    private JTextArea textArea;
    public DisplayFrame(){
        this.textArea = new JTextArea(280,180);
        setSize(300,200);
        setVisible(true);
        add(textArea);
    }
    public void  display(String data){
        textArea.append(data+ "\n");
    }
}
