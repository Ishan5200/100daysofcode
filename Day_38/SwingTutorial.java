package Day_38;

import javax.swing.*;
import javax.swing.border.Border;

import Day_36.MyFrame;
import Day_37.MyLabel;

import java.awt.*;

public class SwingTutorial
{
    public static void main(String[] args) {

        /*
        JFrame -> A GUI window to add components
        JFrame frame = new JFrame(); // Creates a frame
        frame.setSize(750,600); // sets the x-dimension, and y-dimension of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //EXIT out of application after clicking on Close button
        frame.setTitle("This is my first JFrame"); // sets title of the frame
        frame.setResizable(false); // prevent frame from  being resized
        ImageIcon image = new ImageIcon("C:\\Users\\AMAN\\Desktop\\java topics\\src\\Theatre.jpg");
        frame.setIconImage(image.getImage()); // Change Icon of the frame
        frame.getContentPane().setBackground(new Color(0,170,150)); // Setting custom color in background
        frame.setVisible(true); // Make frame visible
        */

        Border border = BorderFactory.createLineBorder(new Color(110,110,110),5);

        MyFrame frame = new MyFrame();
        MyLabel label = new MyLabel();

        label.setBorder(border);

        frame.add(label);


    }
}