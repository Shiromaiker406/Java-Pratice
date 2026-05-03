import javax.swing.*;
import java.awt.*;

public class edittt {

    public static void main(String[] args) {
        JFrame frame = new JFrame("BLR FINANCIALS"); // Main Frame
        frame.setSize(1215, 838);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null); // Absolute positioning
        frame.setVisible(true); // Set visibility after all components are added

        //aia

        JPanel pnlconfirmationExitaia2 = new JPanel();
        pnlconfirmationExitaia2.setBounds(0, 0, 1215, 838);
        pnlconfirmationExitaia2.setBackground(Color.GREEN);
        pnlconfirmationExitaia2.setLayout(null);
        pnlconfirmationExitaia2.setVisible(false);
        frame.add(pnlconfirmationExitaia2);

        JLabel lblconfirmationExitaia2 = new JLabel();
        lblconfirmationExitaia2.setIcon(new ImageIcon("C:\\Users\\Admin\\Downloads\\BLR-FINACIALS FINAL UI\\CONFIRMATION TO EXIT.png"));
        lblconfirmationExitaia2.setBounds(0, 0, 1200, 800);
        pnlconfirmationExitaia2.add(lblconfirmationExitaia2);

        JButton btnYesaia2 = new JButton("YES");
        btnYesaia2.setContentAreaFilled(false);
        btnYesaia2.setFocusPainted(false);
        btnYesaia2.setOpaque(false);
        btnYesaia2.setBounds(342, 459, 239, 66);
        pnlconfirmationExitaia2.add(btnYesaia2);

        JButton btnNoaia2 = new JButton("NO");
        btnNoaia2.setContentAreaFilled(false);
        btnNoaia2.setFocusPainted(false);
        btnNoaia2.setOpaque(false);
        btnNoaia2.setBounds(634, 459, 239, 66);
        pnlconfirmationExitaia2.add(btnNoaia2);

        //maxicare

        JPanel pnlconfirmationExitmaxicare2 = new JPanel();
        pnlconfirmationExitmaxicare2.setBounds(0, 0, 1215, 838);
        pnlconfirmationExitmaxicare2.setBackground(Color.GREEN);
        pnlconfirmationExitmaxicare2.setLayout(null);
        pnlconfirmationExitmaxicare2.setVisible(false);
        frame.add(pnlconfirmationExitmaxicare2);

        JLabel lblconfirmationExitmaxicare2 = new JLabel();
        lblconfirmationExitmaxicare2.setIcon(new ImageIcon("C:\\Users\\Admin\\Downloads\\BLR-FINACIALS FINAL UI\\CONFIRMATION TO EXIT.png"));
        lblconfirmationExitmaxicare2.setBounds(0, 0, 1200, 800);
        pnlconfirmationExitmaxicare2.add(lblconfirmationExitmaxicare2);

        JButton btnYesmaxicare2 = new JButton("YES");
        btnYesmaxicare2.setContentAreaFilled(false);
        btnYesmaxicare2.setFocusPainted(false);
        btnYesmaxicare2.setOpaque(false);
        btnYesmaxicare2.setBounds(342, 459, 239, 66);
        pnlconfirmationExitmaxicare2.add(btnYesmaxicare2);

        JButton btnNomaxicare2 = new JButton("NO");
        btnNomaxicare2.setContentAreaFilled(false);
        btnNomaxicare2.setFocusPainted(false);
        btnNomaxicare2.setOpaque(false);
        btnNomaxicare2.setBounds(634, 459, 239, 66);
        pnlconfirmationExitmaxicare2.add(btnNomaxicare2);

        //pru

        JPanel pnlconfirmationExitpru2 = new JPanel();
        pnlconfirmationExitpru2.setBounds(0, 0, 1215, 838);
        pnlconfirmationExitpru2.setBackground(Color.GREEN);
        pnlconfirmationExitpru2.setLayout(null);
        pnlconfirmationExitpru2.setVisible(false);
        frame.add(pnlconfirmationExitpru2);

        JLabel lblconfirmationExitpru2 = new JLabel();
        lblconfirmationExitpru2.setIcon(new ImageIcon("C:\\Users\\Admin\\Downloads\\BLR-FINACIALS FINAL UI\\CONFIRMATION TO EXIT.png"));
        lblconfirmationExitpru2.setBounds(0, 0, 1200, 800);
        pnlconfirmationExitpru2.add(lblconfirmationExitpru2);

        JButton btnYespru2 = new JButton("YES");
        btnYespru2.setContentAreaFilled(false);
        btnYespru2.setFocusPainted(false);
        btnYespru2.setOpaque(false);
        btnYespru2.setBounds(342, 459, 239, 66);
        pnlconfirmationExitpru2.add(btnYespru2);

        JButton btnNopru2 = new JButton("NO");
        btnNopru2.setContentAreaFilled(false);
        btnNopru2.setFocusPainted(false);
        btnNopru2.setOpaque(false);
        btnNopru2.setBounds(634, 459, 239, 66);
        pnlconfirmationExitpru2.add(btnNopru2);

        //sunlife

        JPanel pnlconfirmationExitsunlife2 = new JPanel();
        pnlconfirmationExitsunlife2.setBounds(0, 0, 1215, 838);
        pnlconfirmationExitsunlife2.setBackground(Color.GREEN);
        pnlconfirmationExitsunlife2.setLayout(null);
        pnlconfirmationExitsunlife2.setVisible(false);
        frame.add(pnlconfirmationExitsunlife2);

        JLabel lblconfirmationExitsunlife2 = new JLabel();
        lblconfirmationExitsunlife2.setIcon(new ImageIcon("C:\\Users\\Admin\\Downloads\\BLR-FINACIALS FINAL UI\\CONFIRMATION TO EXIT.png"));
        lblconfirmationExitsunlife2.setBounds(0, 0, 1200, 800);
        pnlconfirmationExitsunlife2.add(lblconfirmationExitsunlife2);

        JButton btnYessunlife2 = new JButton("YES");
        btnYessunlife2.setContentAreaFilled(false);
        btnYessunlife2.setFocusPainted(false);
        btnYessunlife2.setOpaque(false);
        btnYessunlife2.setBounds(342, 459, 239, 66);
        pnlconfirmationExitsunlife2.add(btnYessunlife2);

        JButton btnNosunlife2 = new JButton("NO");
        btnNosunlife2.setContentAreaFilled(false);
        btnNosunlife2.setFocusPainted(false);
        btnNosunlife2.setOpaque(false);
        btnNosunlife2.setBounds(634, 459, 239, 66);
        pnlconfirmationExitsunlife2.add(btnNosunlife2);

    }
}