package lab12;

import javax.swing.*;
import java.awt.*;

public class ThirdGUI {
    public static ImageIcon make(String a){
        return new ImageIcon("C:\\Users\\saksa\\IdeaProjects\\untitled5\\src\\lab12\\"+a+".jpg");
    }
    public static void main(String args[]) throws InterruptedException {
        ImageIcon[] img = new ImageIcon[5];
        for(int i=0;i<5;i++){
            img[i] = make(Integer.toString(i+1));
        }
        JFrame frame = new JFrame("My Third GUI");
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel= new JPanel();
        panel.setBackground(Color.GRAY);
        panel.setPreferredSize( new Dimension(img[0].getIconWidth(),img[0].getIconHeight()));
//добавили панель к фрейму
        JLabel label = new JLabel(img[0]);
        panel.add(label).setBounds(10, 10, 27, 30);
        frame.getContentPane().add(panel);
//упакуем во фрейм
        frame.pack();
        frame.setVisible(true);
        int a = 0;
        while(true){
            label.setIcon(img[a%5]);
            Thread.sleep(100);
            a+=1;
        }
    }
}
