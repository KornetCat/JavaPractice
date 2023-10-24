package lab15;

import javax.swing.*;
import java.awt.*;

public class Ex3 extends JFrame {
    public Ex3(){
        super("С меню");
        setPreferredSize(new Dimension(500, 500));

        JMenu FileMenu = new JMenu("Файл");
        JMenuItem Save = new JMenuItem("Сохранить");
        FileMenu.add(Save);
        JMenuItem  Exit = new JMenuItem("Выйти");
        FileMenu.add(Exit);
        JMenuItem Prav = new JMenuItem("Правка");
        FileMenu.add(Prav);


        JMenu EditMenu = new JMenu("Изменить");
        JMenuItem Copy = new JMenuItem("Копировать");
        EditMenu.add(Copy);
        JMenuItem Vires = new JMenuItem("Вырезать");
        EditMenu.add(Vires);
        JMenuItem Vstav = new JMenuItem("Вставить");
        EditMenu.add(Vstav);

        JMenu HelpMenu = new JMenu("Помощь");
        JMenuBar a = new JMenuBar();
        a.add(FileMenu);
        a.add(EditMenu);
        a.add(HelpMenu);

        setJMenuBar(a);

        JButton First = new JButton("Button 1");
        JButton Second = new JButton("Button 2");
        JPanel Pan = new JPanel();
        Pan.add(new JLabel());
        Pan.add(First);
        Pan.add(Second);
        add(Pan);
        JTextArea Text = new JTextArea("Поле, в которое вы можете ввести текст", 3, 1);
        JPanel PanSec = new JPanel();
        PanSec.add(Text);
        add(PanSec);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame.setDefaultLookAndFeelDecorated(true);
                new Ex3();
            }
        });
    }
}
