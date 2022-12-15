import javax.swing.*;
import java.awt.*;
import java.awt.color.*;

public class Main {
    public static void main(String[] args){
        JFrame myFrame = new JFrame();
        myFrame.setSize(1000, 1000);
        myFrame.setVisible(true);
        JPanel myPanel = new JPanel();
        myFrame.add(myPanel);
        myPanel.setSize(1000, 1000);
        myPanel.setBackground(Color.BLUE);
        JButton myButton = new JButton();
        myPanel.add(myButton);
        myButton.setVisible(true);
        myButton.setBounds(500, 500, 40, 10);
        myFrame.setLocationRelativeTo(null);
    }
}
