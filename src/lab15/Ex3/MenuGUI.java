package lab15.Ex3;

import javax.swing.*;
import java.awt.*;

public class MenuGUI extends JFrame {
    public MenuGUI(){
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
        JTextArea Text = new JTextArea("Поле, в которое вы можете ввести текст", 3, 1);
        LayoutManager A = new LayoutManager() {
            @Override
            public void addLayoutComponent(String name, Component comp) {}
            @Override
            public void removeLayoutComponent(Component comp) {}
            @Override
            public Dimension preferredLayoutSize(Container parent) {
                return new Dimension(100, 50);
            }
            @Override
            public Dimension minimumLayoutSize(Container parent) {
                return new Dimension(100, 50);
            }

            @Override
            public void layoutContainer(Container parent) {
                Component list[] = parent.getComponents();
                int currentY = 5;
                int curX = 5;
                for(int i=0; i<list.length; i++){
                    Dimension pref = list[i].getPreferredSize();
                    if(list[i].getClass() == new JButton().getClass()){
                        curX += 5;
                        curX += pref.width;
                    }else{
                        curX = 5;
                        currentY += 5;
                        currentY += pref.height;
                    }
                    list[i].setBounds(curX, currentY, pref.width, pref.height);
                }
            }
        };
        JPanel cont = new JPanel(A);
        First.setBounds(100, 5, First.getPreferredSize().width, First.getPreferredSize().height);
        cont.add(First);
        cont.add(Second);
        cont.add(Text);
        setContentPane(cont);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame.setDefaultLookAndFeelDecorated(true);
                new MenuGUI();
            }
        });
    }
}
