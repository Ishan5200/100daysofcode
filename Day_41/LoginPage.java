package Day_41;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class LoginPage extends JFrame implements ActionListener {
    JPanel panel;
    JLabel user_label, password_label, message;
    JTextField userName_text;
    JPasswordField password_text;
    JButton submit, cancel;
    LoginPage() {
        this.setBackground(new Color(11,17,10));
        this.setSize(800,400);
        this.setResizable(false);
        user_label = new JLabel();
        user_label.setText("User Name :");
        userName_text = new JTextField();
        password_label = new JLabel();
        password_label.setText("User Password :");
        password_text = new JPasswordField();
        submit = new JButton("Login");
        panel = new JPanel(new GridLayout(3, 1));
        panel.add(user_label);
        panel.add(userName_text);
        panel.add(password_label);
        panel.add(password_text);
        message = new JLabel();
        panel.add(message);
        panel.add(submit);

        submit.addActionListener(this);
        add(panel, BorderLayout.CENTER);
        setTitle(" Please Login!");
        setSize(450,350);
        setVisible(true);
    }
    public static void main(String[] args) {
        new LoginPage();
    }
    public void actionPerformed(ActionEvent ae) {
        String userName = userName_text.getText();
        String password = password_text.getText();
        if (userName.trim().equals("VIT Bhopal") && password.trim().equals("VitBhopal")) {
            message.setText(" Hello " + userName + "");
        } else {
            message.setText(" Invalid user.. ");
        }
    }
}