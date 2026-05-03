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

        JButton btncagelcoyes = new JButton("YES");
        btncagelcoyes.setContentAreaFilled(false);
        btncagelcoyes.setFocusPainted(false);
        btncagelcoyes.setOpaque(false);
        btncagelcoyes.setBounds(342, 459, 239, 66);
        pnlconfirmationExitcagelco.add(btncagelcoyes);

        JButton btncagelcono = new JButton("NO");
        btncagelcono.setContentAreaFilled(false);
        btncagelcono.setFocusPainted(false);
        btncagelcono.setOpaque(false);
        btncagelcono.setBounds(634, 459, 239, 66);
        pnlconfirmationExitcagelco.add(btncagelcono);

        JButton btncagelcoconfirm = new JButton("BACK");
        btncagelcoconfirm.setContentAreaFilled(false);
        btncagelcoconfirm.setFocusPainted(false);
        btncagelcoconfirm.setOpaque(false);
        btncagelcoconfirm.setBounds(634, 459, 239, 66);
        pnlconfirmationExitcagelco.add(btncagelcoconfirm);

        //pangasinan

        JPanel pnlconfirmationExitpangasinan = new JPanel();
        pnlconfirmationExitpangasinan.setBounds(0, 0, 1215, 838);
        pnlconfirmationExitpangasinan.setBackground(Color.GREEN);
        pnlconfirmationExitcagelco.setLayout(null);
        pnlconfirmationExitpangasinan.setVisible(false);
        frame.add(pnlconfirmationExitpangasinan);

        JLabel lblconfirmationExitpangasinan = new JLabel();
        lblconfirmationExitpangasinan.setIcon(new ImageIcon("C:\\Users\\Admin\\Downloads\\BLR-FINACIALS FINAL UI\\CONFIRMATION TO EXIT.png"));
        lblconfirmationExitpangasinan.setBounds(0, 0, 1200, 800);
        pnlconfirmationExitpangasinan.add(lblconfirmationExitpangasinan);

        JButton btnpangasinanyes = new JButton("YES");
        btnpangasinanyes.setContentAreaFilled(false);
        btnpangasinanyes.setFocusPainted(false);
        btnpangasinanyes.setOpaque(false);
        btnpangasinanyes.setBounds(342, 459, 239, 66);
        pnlconfirmationExitcagelco.add(btnpangasinanyes);

        JButton btnpangasinanno = new JButton("NO");
        btnpangasinanno.setContentAreaFilled(false);
        btnpangasinanno.setFocusPainted(false);
        btnpangasinanno.setOpaque(false);
        btnpangasinanno.setBounds(634, 459, 239, 66);
        pnlconfirmationExitcagelco.add(btnpangasinanno);

        JButton btnpangasinanconfirm = new JButton("BACK");
        btnpangasinanconfirm.setContentAreaFilled(false);
        btnpangasinanconfirm.setFocusPainted(false);
        btnpangasinanconfirm.setOpaque(false);
        btnpangasinanconfirm.setBounds(634, 459, 239, 66);
        pnlconfirmationExitcagelco.add(btnpangasinanconfirm);

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

        JButton btnbatelecyes= new JButton("YES");
        btnbatelecyes.setContentAreaFilled(false);
        btnbatelecyes.setFocusPainted(false);
        btnbatelecyes.setOpaque(false);
        btnbatelecyes.setBounds(342, 459, 239, 66);
        pnlconfirmationExitbatelec.add(btnbatelecyes);

        JButton btnbatelecno = new JButton("NO");
        btnbatelecno.setContentAreaFilled(false);
        btnbatelecno.setFocusPainted(false);
        btnbatelecno.setOpaque(false);
        btnbatelecno.setBounds(634, 459, 239, 66);
        pnlconfirmationExitbatelec.add(btnbatelecno);

        JButton btnbatelecconfirm = new JButton("BACK");
        btnbatelecconfirm.setContentAreaFilled(false);
        btnbatelecconfirm.setFocusPainted(false);
        btnbatelecconfirm.setOpaque(false);
        btnbatelecconfirm.setBounds(634, 459, 239, 66);
        pnlconfirmationExitbatelec.add(btnbatelecconfirm);

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

        JButton btnmeralcoyes= new JButton("YES");
        btnmeralcoyes.setContentAreaFilled(false);
        btnmeralcoyes.setFocusPainted(false);
        btnmeralcoyes.setOpaque(false);
        btnmeralcoyes.setBounds(342, 459, 239, 66);
        pnlconfirmationExitmeralco.add(btnmeralcoyes);

        JButton btnmeralcono = new JButton("NO");
        btnmeralcono.setContentAreaFilled(false);
        btnmeralcono.setFocusPainted(false);
        btnmeralcono.setOpaque(false);
        btnmeralcono.setBounds(634, 459, 239, 66);
        pnlconfirmationExitmeralco.add(btnmeralcono);

        JButton btnmeralcoconfirm = new JButton("BACK");
        btnmeralcoconfirm.setContentAreaFilled(false);
        btnmeralcoconfirm.setFocusPainted(false);
        btnmeralcoconfirm.setOpaque(false);
        btnmeralcoconfirm.setBounds(634, 459, 239, 66);
        pnlconfirmationExitmeralco.add(btnmeralcoconfirm);
    }
}