package lab15.Ex2;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.*;

public class CountriesMenu extends JFrame {

    public CountriesMenu() {

        super("Тестовое окно");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] items = {
                "USA",
                "Russia",
                "China"
        };

        Map<String, String> dict_f = new HashMap<String, String>();
        dict_f.put("USA", "Amerika");
        dict_f.put("Russia", "Our Country");
        dict_f.put("China", "Many people");

        Map<String, String> dict_s = new HashMap<String, String>();
        dict_s.put("USA", "The United States of America (USA), commonly known as the United States (U.S.)\n" +
                "or simply America, is a country primarily located in North America and consisting of 50\n" +
                "states, a federal district, five major unincorporated territories, and nine Minor Outlying\n" +
                "Islands. It includes 326 Indian reservations. It is the world's third-largest country by both\n" +
                "land and total area. It shares land borders with Canada to its north and with Mexico to its\n" +
                "south and has maritime borders with the Bahamas, Cuba, Russia, and other nations.\n" +
                "With a population of over 333 million, it is the most populous country in the Americas and\n" +
                "the third-most populous in the world. The national capital of the United States is Washington,\n" +
                "D.C., and its most populous city and principal financial center is New York City.");
        dict_s.put("Russia", "Russia, or the Russian Federation, is a country spanning Eastern Europe\n" +
                "and Northern Asia. It is the largest country in the world by area, extends across eleven\n" +
                "time zones, and shares land boundaries with fourteen countries. It is the world's ninth-most\n" +
                "populous country and Europe's most populous country. The country's capital and largest city\n" +
                "is Moscow. Saint Petersburg is Russia's cultural centre and second-largest city. Other major\n" +
                "urban areas in the country include Novosibirsk, Yekaterinburg, Nizhny Novgorod, Chelyabinsk,\n" +
                "Krasnoyarsk, and Kazan.");
        dict_s.put("China", "China, officially the People's Republic of China (PRC), is a country\n" +
                "in East Asia. It is the world's second-most populous country with a population exceeding\n" +
                "1.4 billion. China spans the equivalent of five time zones and borders fourteen countries\n" +
                "by land, tied with Russia as having the most of any country in the world. With an area of\n" +
                "nearly 9.6 million square kilometres (3,700,000 sq mi), it is the world's third largest country\n" +
                "by total land area. The country is divided into 22 provinces, five autonomous regions, four\n" +
                "municipalities, and two semi-autonomous special administrative regions. The national capital\n" +
                "is Beijing, and the most populous city and largest financial center is Shanghai.");

        Container content = getContentPane();
        setPreferredSize(new Dimension(500, 400));

        content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));

        final JLabel label = new JLabel();
        label.setAlignmentX(LEFT_ALIGNMENT);
        content.add(label);

        JTextArea ar1 = new JTextArea(20, 20);
        add(ar1);

        ActionListener actionListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JComboBox box = (JComboBox)e.getSource();
                String item = (String)box.getSelectedItem();
                ar1.setText(dict_s.get(item));
                JOptionPane.showMessageDialog(label,  dict_f.get(item));
            }
        };

        JComboBox comboBox = new JComboBox(items);
        comboBox.setAlignmentX(LEFT_ALIGNMENT);
        comboBox.addActionListener(actionListener);
        content.add(comboBox);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame.setDefaultLookAndFeelDecorated(true);
                new CountriesMenu();
            }
        });
    }
}
