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

        JPanel pnlconfirmationExitaia = new JPanel();
        pnlconfirmationExitaia.setBounds(0, 0, 1215, 838);
        pnlconfirmationExitaia.setBackground(Color.GREEN);
        pnlconfirmationExitaia.setLayout(null);
        pnlconfirmationExitaia.setVisible(false);
        frame.add(pnlconfirmationExitaia);

        JLabel lblconfirmationExitaia = new JLabel();
        lblconfirmationExitaia.setIcon(new ImageIcon("C:\\Users\\Admin\\Downloads\\BLR-FINACIALS FINAL UI\\CONFIRMATION TO EXIT.png"));
        lblconfirmationExitaia.setBounds(0, 0, 1200, 800);
        pnlconfirmationExitaia.add(lblconfirmationExitaia);

        JButton btnYesaia = new JButton("YES");
        btnYesaia.setContentAreaFilled(false);
        btnYesaia.setFocusPainted(false);
        btnYesaia.setOpaque(false);
        btnYesaia.setBounds(342, 459, 239, 66);
        pnlconfirmationExitaia.add(btnYesaia);

        JButton btnNoaia = new JButton("NO");
        btnNoaia.setContentAreaFilled(false);
        btnNoaia.setFocusPainted(false);
        btnNoaia.setOpaque(false);
        btnNoaia.setBounds(634, 459, 239, 66);
        pnlconfirmationExitaia.add(btnNoaia);

        //maxicare

        JPanel pnlconfirmationExitmaxicare = new JPanel();
        pnlconfirmationExitmaxicare.setBounds(0, 0, 1215, 838);
        pnlconfirmationExitmaxicare.setBackground(Color.GREEN);
        pnlconfirmationExitmaxicare.setLayout(null);
        pnlconfirmationExitmaxicare.setVisible(false);
        frame.add(pnlconfirmationExitmaxicare);

        JLabel lblconfirmationExitmaxicare = new JLabel();
        lblconfirmationExitmaxicare.setIcon(new ImageIcon("C:\\Users\\Admin\\Downloads\\BLR-FINACIALS FINAL UI\\CONFIRMATION TO EXIT.png"));
        lblconfirmationExitmaxicare.setBounds(0, 0, 1200, 800);
        pnlconfirmationExitmaxicare.add(lblconfirmationExitmaxicare);

        JButton btnYesmaxicare = new JButton("YES");
        btnYesmaxicare.setContentAreaFilled(false);
        btnYesmaxicare.setFocusPainted(false);
        btnYesmaxicare.setOpaque(false);
        btnYesmaxicare.setBounds(342, 459, 239, 66);
        pnlconfirmationExitmaxicare.add(btnYesmaxicare);

        JButton btnNomaxicare = new JButton("NO");
        btnNomaxicare.setContentAreaFilled(false);
        btnNomaxicare.setFocusPainted(false);
        btnNomaxicare.setOpaque(false);
        btnNomaxicare.setBounds(634, 459, 239, 66);
        pnlconfirmationExitmaxicare.add(btnNomaxicare);


        //pru

        JPanel pnlconfirmationExitpru = new JPanel();
        pnlconfirmationExitpru.setBounds(0, 0, 1215, 838);
        pnlconfirmationExitpru.setBackground(Color.GREEN);
        pnlconfirmationExitpru.setLayout(null);
        pnlconfirmationExitpru.setVisible(false);
        frame.add(pnlconfirmationExitpru);

        JLabel lblconfirmationExitpru = new JLabel();
        lblconfirmationExitpru.setIcon(new ImageIcon("C:\\Users\\Admin\\Downloads\\BLR-FINACIALS FINAL UI\\CONFIRMATION TO EXIT.png"));
        lblconfirmationExitpru.setBounds(0, 0, 1200, 800);
        pnlconfirmationExitpru.add(lblconfirmationExitpru);

        JButton btnYespru = new JButton("YES");
        btnYespru.setContentAreaFilled(false);
        btnYespru.setFocusPainted(false);
        btnYespru.setOpaque(false);
        btnYespru.setBounds(342, 459, 239, 66);
        pnlconfirmationExitpru.add(btnYespru);

        JButton btnNopru = new JButton("NO");
        btnNopru.setContentAreaFilled(false);
        btnNopru.setFocusPainted(false);
        btnNopru.setOpaque(false);
        btnNopru.setBounds(634, 459, 239, 66);
        pnlconfirmationExitpru.add(btnNopru);


        //sunlife

        JPanel pnlconfirmationExitsunlife = new JPanel();
        pnlconfirmationExitsunlife.setBounds(0, 0, 1215, 838);
        pnlconfirmationExitsunlife.setBackground(Color.GREEN);
        pnlconfirmationExitsunlife.setLayout(null);
        pnlconfirmationExitsunlife.setVisible(false);
        frame.add(pnlconfirmationExitsunlife);

        JLabel lblconfirmationExitsunlife = new JLabel();
        lblconfirmationExitsunlife.setIcon(new ImageIcon("C:\\Users\\Admin\\Downloads\\BLR-FINACIALS FINAL UI\\CONFIRMATION TO EXIT.png"));
        lblconfirmationExitsunlife.setBounds(0, 0, 1200, 800);
        pnlconfirmationExitsunlife.add(lblconfirmationExitsunlife);

        JButton btnYessunlife = new JButton("YES");
        btnYessunlife.setContentAreaFilled(false);
        btnYessunlife.setFocusPainted(false);
        btnYessunlife.setOpaque(false);
        btnYessunlife.setBounds(342, 459, 239, 66);
        pnlconfirmationExitsunlife.add(btnYessunlife);

        JButton btnNosunlife = new JButton("NO");
        btnNosunlife.setContentAreaFilled(false);
        btnNosunlife.setFocusPainted(false);
        btnNosunlife.setOpaque(false);
        btnNosunlife.setBounds(634, 459, 239, 66);
        pnlconfirmationExitsunlife.add(btnNosunlife);
        
    }
}