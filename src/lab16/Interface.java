package lab16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interface extends JFrame {
    public String Ftt = "Times New Roman";
    public int fs = 14;
    private JTextArea tf;
    public Interface(){
        super("Окно списка");
        tf = new JTextArea();
        tf.setBounds(0,0, 400,300);
        tf.setFont(new Font(Ftt, Font.PLAIN, 14));

        JMenuBar menuBar = new JMenuBar();

        JMenu Color = new JMenu("Цвет");
        JMenuItem Blue = new JMenuItem("Синий");
        JMenuItem Red = new JMenuItem("Красный");
        JMenuItem Black = new JMenuItem("Чёрный");
        Color.add(Black);Color.add(Red);Color.add(Blue);
        menuBar.add(Color);

        Blue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setForeground(java.awt.Color.BLUE);
            }
        });
        Red.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setForeground(java.awt.Color.RED);
            }
        });
        Black.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setForeground(java.awt.Color.BLACK);
            }
        });

        JMenu Ft = new JMenu("Шрифт");
        JMenuItem TNR = new JMenuItem("Times New Roman");
        TNR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ftt = "Times New Roman";
                tf.setFont(new Font(Ftt, java.awt.Font.PLAIN, fs));
            }
        });
        JMenuItem MSSS = new JMenuItem("MS Sans Serif");
        MSSS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ftt = "MS Sans Serif";
                tf.setFont(new Font(Ftt, java.awt.Font.PLAIN, fs));
            }
        });
        JMenuItem CNI = new JMenuItem("Courier New");
        CNI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ftt = "Courier New";
                tf.setFont(new Font(Ftt, java.awt.Font.PLAIN, fs));
            }
        });
        Ft.add(TNR);Ft.add(MSSS);Ft.add(CNI);
        menuBar.add(Ft);

        JMenu Size = new JMenu("Размер");
        JMenuItem Big = new JMenuItem("18");
        Big.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fs = 18;
                tf.setFont(new Font(Ftt, java.awt.Font.PLAIN, fs));
            }
        });
        JMenuItem Middle = new JMenuItem("16");
        Middle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fs = 16;
                tf.setFont(new Font(Ftt, java.awt.Font.PLAIN, fs));
            }
        });
        JMenuItem Small = new JMenuItem("14");
        Small.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fs = 14;
                tf.setFont(new Font(Ftt, java.awt.Font.PLAIN, fs));
            }
        });
        Size.add(Big);Size.add(Middle);Size.add(Small);
        menuBar.add(Size);

        setJMenuBar(menuBar);add(tf);
        setSize(400,300);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame.setDefaultLookAndFeelDecorated(true);
                new Interface();
            }
        });
    }
}
