package display;

import javax.swing.*;

/**
 * Created by Vili on 29-Apr-16.
 */
public class Display {
    private String title;
    private int width, height;
    private JFrame frame;

    public Display(String title, int width, int height) {
        this.title = title;
        this.width = width;
        this.height = height;
        this.createFrame();
    }

    private void createFrame(){
        this.frame = new JFrame(this.title);
        this.frame.setResizable(false);
        this.frame.setSize(this.width,this.height);
        this.frame.setVisible(true);
        this.frame.setFocusable(true);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setLocationRelativeTo(null);
        this.frame.setAutoRequestFocus(true);
    }
}
