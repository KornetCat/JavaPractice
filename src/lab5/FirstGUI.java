package lab5;

import jdk.swing.interop.SwingInterOpUtils;

import javax.swing.*;
import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;

public class FirstGUI {
    public static int a = 0;
    public static int b = 0;
    public static void main(String args[]) throws InterruptedException {
        JFrame frame = new JFrame("My First GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        JPanel panel= new JPanel();
        panel.setBackground(Color.GRAY);
        panel.setPreferredSize( new Dimension(200,300));
        JButton button1 = new JButton("AC Milan");
        JButton button2 = new JButton("Real Madrid");
        panel.add(button1);
        panel.add(button2);
//добавили панель к фрейму
        JLabel label = new JLabel("AC Milan: "+a+" Real Madrid: "+b, JLabel.CENTER);
        JLabel lablala = new JLabel("Last Scorer: N/A");
        JLabel winnerlab = new JLabel("Winner: DRAW");
        panel.add(label);
        panel.add(lablala);
        panel.add(winnerlab);
        frame.getContentPane().add(panel);
//упакуем во фрейм
        frame.pack();
        frame.setVisible(true);
        ActionListener Act1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lab5.FirstGUI.a += 1;
                label.setText("AC Milan: "+a+" Real Madrid: "+b);
                lablala.setText("Last Scorer: AC Milan");
                if(a>b){
                    winnerlab.setText("Winner: AC Milan");
                }else if(b>a){
                    winnerlab.setText("Winner: Real Madrid");
                }else{
                    winnerlab.setText("Winner: DRAW");
                }
            }
        };
        ActionListener Act2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lab5.FirstGUI.b += 1;
                label.setText("AC Milan: "+a+" Real Madrid: "+b);
                lablala.setText("Last Scorer: Real Madrid");
                if(a>b){
                    winnerlab.setText("Winner: AC Milan");
                }else if(b>a){
                    winnerlab.setText("Winner: Real Madrid");
                }else{
                    winnerlab.setText("Winner: DRAW");
                }
            }
        };
        button1.addActionListener(Act1);
        button2.addActionListener(Act2);
        int sec = 30;
        JLabel akalab = new JLabel("Time: "+sec);
        panel.add(akalab);
        while(sec>0){
            Thread.sleep(1000);
            sec -= 1;
            akalab.setText("Time: "+sec);
        }
        JDialog aa = new JDialog();
        if(a>b){
            JOptionPane.showMessageDialog(label, "Winner: AC Milan");
        }else if(b>a){
            JOptionPane.showMessageDialog(label, "Winner: Real Madrid");
        }else{
            JOptionPane.showMessageDialog(label, "No winner");
        }
        panel.setVisible(false);
    }
}
