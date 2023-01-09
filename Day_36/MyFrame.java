package Day_36;

 
    import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame()
    {
        this.setSize(750,600); // sets the x-dimension, and y-dimension of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //EXIT out of application after clicking on Close button
        this.setTitle("This is my first Swing Project"); // sets title of the frame
        this.setResizable(false); // prevent frame from  being resized
        ImageIcon image = new ImageIcon("C:\\Users\\AMAN\\Desktop\\java topics\\src\\Theatre.jpg");
        this.setIconImage(image.getImage()); // Change Icon of the frame
        this.getContentPane().setBackground(new Color(0,170,150)); // Setting custom color in background
        this.setVisible(true); // Make frame visible
    }
}
    

