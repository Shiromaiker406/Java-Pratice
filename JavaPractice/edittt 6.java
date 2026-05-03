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

        // cagelco

        JPanel pnlconfirmationExitcagelco = new JPanel();
        pnlconfirmationExitcagelco.setBounds(0, 0, 1215, 838);
        pnlconfirmationExitcagelco.setBackground(Color.GREEN);
        pnlconfirmationExitcagelco.setLayout(null);
        pnlconfirmationExitcagelco.setVisible(false);
        frame.add(pnlconfirmationExitcagelco);

        JLabel lblconfirmationExitcagelco = new JLabel();
        lblconfirmationExitcagelco.setIcon(new ImageIcon("C:\\Users\\Admin\\Downloads\\BLR-FINACIALS FINAL UI\\CONFIRMATION TO EXIT.png"));
        lblconfirmationExitcagelco.setBounds(0, 0, 1200, 800);
        pnlconfirmationExitcagelco.add(lblconfirmationExitcagelco);

        JButton btnYescagelco = new JButton("YES");
        btnYescagelco.setContentAreaFilled(false);
        btnYescagelco.setFocusPainted(false);
        btnYescagelco.setOpaque(false);
        btnYescagelco.setBounds(342, 459, 239, 66);
        pnlconfirmationExitcagelco.add(btnYescagelco);

        JButton btnNocagelco = new JButton("NO");
        btnNocagelco.setContentAreaFilled(false);
        btnNocagelco.setFocusPainted(false);
        btnNocagelco.setOpaque(false);
        btnNocagelco.setBounds(634, 459, 239, 66);
        pnlconfirmationExitcagelco.add(btnNocagelco);

        //pangasinan

        JPanel pnlconfirmationExitpangasinan = new JPanel();
        pnlconfirmationExitpangasinan.setBounds(0, 0, 1215, 838);
        pnlconfirmationExitpangasinan.setBackground(Color.GREEN);
        pnlconfirmationExitpangasinan.setLayout(null);
        pnlconfirmationExitpangasinan.setVisible(false);
        frame.add(pnlconfirmationExitpangasinan);

        JLabel lblconfirmationExitpangasinan = new JLabel();
        lblconfirmationExitpangasinan.setIcon(new ImageIcon("C:\\Users\\Admin\\Downloads\\BLR-FINACIALS FINAL UI\\CONFIRMATION TO EXIT.png"));
        lblconfirmationExitpangasinan.setBounds(0, 0, 1200, 800);
        pnlconfirmationExitpangasinan.add(lblconfirmationExitpangasinan);

        JButton btnYespangasinan = new JButton("YES");
        btnYespangasinan.setContentAreaFilled(false);
        btnYespangasinan.setFocusPainted(false);
        btnYespangasinan.setOpaque(false);
        btnYespangasinan.setBounds(342, 459, 239, 66);
        pnlconfirmationExitpangasinan.add(btnYespangasinan);

        JButton btnNopangasinan = new JButton("NO");
        btnNopangasinan.setContentAreaFilled(false);
        btnNopangasinan.setFocusPainted(false);
        btnNopangasinan.setOpaque(false);
        btnNopangasinan.setBounds(634, 459, 239, 66);
        pnlconfirmationExitpangasinan.add(btnNopangasinan);

        //batelec

        JPanel pnlconfirmationExitbatelec = new JPanel();
        pnlconfirmationExitbatelec.setBounds(0, 0, 1215, 838);
        pnlconfirmationExitbatelec.setBackground(Color.GREEN);
        pnlconfirmationExitbatelec.setLayout(null);
        pnlconfirmationExitbatelec.setVisible(false);
        frame.add(pnlconfirmationExitbatelec);

        JLabel lblconfirmationExitbatelec = new JLabel();
        lblconfirmationExitbatelec.setIcon(new ImageIcon("C:\\Users\\Admin\\Downloads\\BLR-FINACIALS FINAL UI\\CONFIRMATION TO EXIT.png"));
        lblconfirmationExitbatelec.setBounds(0, 0, 1200, 800);
        pnlconfirmationExitbatelec.add(lblconfirmationExitbatelec);

        JButton btnYesbatelec= new JButton("YES");
        btnYesbatelec.setContentAreaFilled(false);
        btnYesbatelec.setFocusPainted(false);
        btnYesbatelec.setOpaque(false);
        btnYesbatelec.setBounds(342, 459, 239, 66);
        pnlconfirmationExitbatelec.add(btnYesbatelec);

        JButton btnNobatelec = new JButton("NO");
        btnNobatelec.setContentAreaFilled(false);
        btnNobatelec.setFocusPainted(false);
        btnNobatelec.setOpaque(false);
        btnNobatelec.setBounds(634, 459, 239, 66);
        pnlconfirmationExitbatelec.add(btnNobatelec);

        //meralco

        JPanel pnlconfirmationExitmeralco = new JPanel();
        pnlconfirmationExitmeralco.setBounds(0, 0, 1215, 838);
        pnlconfirmationExitmeralco.setBackground(Color.GREEN);
        pnlconfirmationExitmeralco.setLayout(null);
        pnlconfirmationExitmeralco.setVisible(false);
        frame.add(pnlconfirmationExitmeralco);

        JLabel lblconfirmationExitmeralco = new JLabel();
        lblconfirmationExitmeralco.setIcon(new ImageIcon("C:\\Users\\Admin\\Downloads\\BLR-FINACIALS FINAL UI\\CONFIRMATION TO EXIT.png"));
        lblconfirmationExitmeralco.setBounds(0, 0, 1200, 800);
        pnlconfirmationExitmeralco.add(lblconfirmationExitmeralco);

        JButton btnYesmeralco = new JButton("YES");
        btnYesmeralco.setContentAreaFilled(false);
        btnYesmeralco.setFocusPainted(false);
        btnYesmeralco.setOpaque(false);
        btnYesmeralco.setBounds(342, 459, 239, 66);
        pnlconfirmationExitmeralco.add(btnYesmeralco);

        JButton btnNomeralco = new JButton("NO");
        btnNomeralco.setContentAreaFilled(false);
        btnNomeralco.setFocusPainted(false);
        btnNomeralco.setOpaque(false);
        btnNomeralco.setBounds(634, 459, 239, 66);
        pnlconfirmationExitmeralco.add(btnNomeralco);
        
    }
}