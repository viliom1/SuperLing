package display;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Vili on 29-Apr-16.
 */
public class Display  extends Canvas{
    private String title;
    private int width, height;
    private JFrame frame;
    private Canvas canvas;

    public Display(String title, int width, int height) {
        this.title = title;
        this.width = width;
        this.height = height;
        this.createFrame();
    }

    private void createFrame(){
        Dimension dimension = new Dimension(this.width,this.height);
        this.frame = new JFrame(this.title);
        this.frame.setResizable(false);
        this.frame.setSize(this.width,this.height);
        this.frame.setVisible(true);
        this.frame.setFocusable(true);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setLocationRelativeTo(null);
        this.frame.setAutoRequestFocus(true);
        this.canvas = new Canvas();
        this.canvas.setSize(dimension);
        this.canvas.setMaximumSize(dimension);
        this.canvas.setMinimumSize(dimension);
        this.canvas.setPreferredSize(dimension);
        this.frame.add(this.canvas);
        this.frame.pack();
    }

    public Canvas getCanvas(){
        return this.canvas;
    }
}
