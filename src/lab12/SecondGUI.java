package lab12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Scanner;

public class SecondGUI {
    public static void main(String args[]) throws InterruptedException {
        JFrame frame = new JFrame("My Second GUI");
        Scanner sc = new Scanner(System.in);
        ImageIcon img = new ImageIcon(sc.nextLine());
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel= new JPanel();
        panel.setBackground(Color.GRAY);
        panel.setPreferredSize(new Dimension(img.getIconWidth(),img.getIconHeight()));
//добавили панель к фрейму
        JLabel label = new JLabel(img);
        panel.add(label).setBounds(0, 0, 50, 50);
        frame.getContentPane().add(panel);
//упакуем во фрейм
        frame.pack();
        frame.setVisible(true);
    }
}
