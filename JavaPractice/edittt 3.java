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

        JPanel pnlcagelco = new JPanel();
        pnlcagelco.setBounds(0, 0, 1215, 838);
        pnlcagelco.setBackground(Color.GREEN);
        pnlcagelco.setLayout(null);
        pnlcagelco.setVisible(false);
        frame.add(pnlcagelco);

        JLabel lblcagelco = new JLabel();
        lblcagelco.setIcon(new ImageIcon("C:\\Users\\Admin\\Downloads\\BLR-FINACIALS FINAL UI\\CONFIRMATION TO EXIT.png"));
        lblcagelco.setBounds(0, 0, 1200, 800);
        pnlcagelco.add(lblcagelco);

        JButton btncagelcoyes = new JButton("YES");
        btncagelcoyes.setContentAreaFilled(false);
        btncagelcoyes.setFocusPainted(false);
        btncagelcoyes.setOpaque(false);
        btncagelcoyes.setBounds(342, 459, 239, 66);
        pnlcagelco.add(btncagelcoyes);

        JButton btncagelcono = new JButton("NO");
        btncagelcono.setContentAreaFilled(false);
        btncagelcono.setFocusPainted(false);
        btncagelcono.setOpaque(false);
        btncagelcono.setBounds(634, 459, 239, 66);
        pnlcagelco.add(btncagelcono);

        JButton btncagelcoconfirm = new JButton("BACK");
        btncagelcoconfirm.setContentAreaFilled(false);
        btncagelcoconfirm.setFocusPainted(false);
        btncagelcoconfirm.setOpaque(false);
        btncagelcoconfirm.setBounds(634, 459, 239, 66);
        pnlcagelco.add(btncagelcoconfirm);

        //pangasinan

        JPanel pnlpangasinan = new JPanel();
        pnlpangasinan.setBounds(0, 0, 1215, 838);
        pnlpangasinan.setBackground(Color.GREEN);
        pnlpangasinan.setLayout(null);
        pnlpangasinan.setVisible(false);
        frame.add(pnlpangasinan);

        JLabel lblpangasinan = new JLabel();
        lblpangasinan.setIcon(new ImageIcon("C:\\Users\\Admin\\Downloads\\BLR-FINACIALS FINAL UI\\CONFIRMATION TO EXIT.png"));
        lblpangasinan.setBounds(0, 0, 1200, 800);
        pnlpangasinan.add(lblpangasinan);

        JButton btnpangasinanyes = new JButton("YES");
        btnpangasinanyes.setContentAreaFilled(false);
        btnpangasinanyes.setFocusPainted(false);
        btnpangasinanyes.setOpaque(false);
        btnpangasinanyes.setBounds(342, 459, 239, 66);
        pnlpangasinan.add(btnpangasinanyes);

        JButton btnpangasinanno = new JButton("NO");
        btnpangasinanno.setContentAreaFilled(false);
        btnpangasinanno.setFocusPainted(false);
        btnpangasinanno.setOpaque(false);
        btnpangasinanno.setBounds(634, 459, 239, 66);
        pnlpangasinan.add(btnpangasinanno);

        JButton btnpangasinanconfirm = new JButton("BACK");
        btnpangasinanconfirm.setContentAreaFilled(false);
        btnpangasinanconfirm.setFocusPainted(false);
        btnpangasinanconfirm.setOpaque(false);
        btnpangasinanconfirm.setBounds(634, 459, 239, 66);
        pnlpangasinan.add(btnpangasinanconfirm);

        //batelec

        JPanel pnlbatelec = new JPanel();
        pnlbatelec.setBounds(0, 0, 1215, 838);
        pnlbatelec.setBackground(Color.GREEN);
        pnlbatelec.setLayout(null);
        pnlbatelec.setVisible(false);
        frame.add(pnlbatelec);

        JLabel lblbatelec = new JLabel();
        lblbatelec.setIcon(new ImageIcon("C:\\Users\\Admin\\Downloads\\BLR-FINACIALS FINAL UI\\CONFIRMATION TO EXIT.png"));
        lblbatelec.setBounds(0, 0, 1200, 800);
        pnlbatelec.add(lblbatelec);

        JButton btnbatelecyes= new JButton("YES");
        btnbatelecyes.setContentAreaFilled(false);
        btnbatelecyes.setFocusPainted(false);
        btnbatelecyes.setOpaque(false);
        btnbatelecyes.setBounds(342, 459, 239, 66);
        pnlbatelec.add(btnbatelecyes);

        JButton btnbatelecno = new JButton("NO");
        btnbatelecno.setContentAreaFilled(false);
        btnbatelecno.setFocusPainted(false);
        btnbatelecno.setOpaque(false);
        btnbatelecno.setBounds(634, 459, 239, 66);
        pnlbatelec.add(btnbatelecno);

        JButton btnbatelecconfirm = new JButton("BACK");
        btnbatelecconfirm.setContentAreaFilled(false);
        btnbatelecconfirm.setFocusPainted(false);
        btnbatelecconfirm.setOpaque(false);
        btnbatelecconfirm.setBounds(634, 459, 239, 66);
        pnlbatelec.add(btnbatelecconfirm);

        //meralco

        JPanel pnlmeralco = new JPanel();
        pnlmeralco.setBounds(0, 0, 1215, 838);
        pnlmeralco.setBackground(Color.GREEN);
        pnlmeralco.setLayout(null);
        pnlmeralco.setVisible(false);
        frame.add(pnlmeralco);

        JLabel lblmeralco = new JLabel();
        lblmeralco.setIcon(new ImageIcon("C:\\Users\\Admin\\Downloads\\BLR-FINACIALS FINAL UI\\CONFIRMATION TO EXIT.png"));
        lblmeralco.setBounds(0, 0, 1200, 800);
        pnlmeralco.add(lblmeralco);

        JButton btnmeralcoyes= new JButton("YES");
        btnmeralcoyes.setContentAreaFilled(false);
        btnmeralcoyes.setFocusPainted(false);
        btnmeralcoyes.setOpaque(false);
        btnmeralcoyes.setBounds(342, 459, 239, 66);
        pnlmeralco.add(btnmeralcoyes);

        JButton btnmeralcono = new JButton("NO");
        btnmeralcono.setContentAreaFilled(false);
        btnmeralcono.setFocusPainted(false);
        btnmeralcono.setOpaque(false);
        btnmeralcono.setBounds(634, 459, 239, 66);
        pnlmeralco.add(btnmeralcono);

        JButton btnmeralcoconfirm = new JButton("BACK");
        btnmeralcoconfirm.setContentAreaFilled(false);
        btnmeralcoconfirm.setFocusPainted(false);
        btnmeralcoconfirm.setOpaque(false);
        btnmeralcoconfirm.setBounds(634, 459, 239, 66);
        pnlmeralco.add(btnmeralcoconfirm);
    }
}