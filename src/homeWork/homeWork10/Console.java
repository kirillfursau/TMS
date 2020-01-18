package homeWork.homeWork10;

import javax.swing.*;
import java.awt.*;

public class Console {
    public static void main(String[] args) {
//        JPanel windowContent;
//        JTextField displayField;
//        windowContent = new JPanel();
//        BorderLayout b1 = new BorderLayout();
//        windowContent.setLayout (b1);
//        displayField = new JTextField(30);
//        windowContent.add("North",displayField);
//        JFrame frame = new JFrame("Store");
//        windowContent.toString();
//        frame.setContentPane(windowContent);
//        frame.pack();
//        frame.setVisible(true);
        Store store = new Store();
        store.start();
    }
}

