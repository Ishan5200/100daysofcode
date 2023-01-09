package Day_37;

import javax.swing.*;
import java.awt.*;

public class MyLabel extends JLabel {

    public MyLabel(){

        ImageIcon imageLabel = new ImageIcon("C:\\Users\\AMAN\\Desktop\\java topics\\src\\c3.png");
        this.setIcon(imageLabel);

        this.setText("Hello Connections!!");
        this.setFont(new Font("MV Boli", Font.BOLD, 20)); // set font of the Text
        this.setHorizontalTextPosition(JLabel.RIGHT); // Set text Right of ImageIcon

        this.setForeground(new Color(60, 0, 0)); // set font color of the Text

        this.setIconTextGap(-60);

        this.setVerticalAlignment(JLabel.CENTER);// Set vertical position of icon+text within label
        this.setHorizontalAlignment(JLabel.CENTER);// Set horizontal position of icon+text within label


    }
}