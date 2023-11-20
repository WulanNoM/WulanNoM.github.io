import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RestoranGUI {
    private JFrame frame;
    private JList<String> menuList;
    private DefaultListModel<String> menuListModel;

    public RestoranGUI() {
        frame = new JFrame("Aplikasi Restoran");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        menuListModel = new DefaultListModel<>();
        menuList = new JList<>(menuListModel);

        JButton refreshButton = new JButton("Refresh Menu");
        refreshButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                refreshMenu();
            }
        });

        frame.setLayout(new BorderLayout());
        frame.add(menuList, BorderLayout.CENTER);
        frame.add(refreshButton, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    private void refreshMenu() {
        // Implementasikan logika untuk mengambil dan menampilkan menu dari kelas MenuManager
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new RestoranGUI();
            }
        });
    }
}