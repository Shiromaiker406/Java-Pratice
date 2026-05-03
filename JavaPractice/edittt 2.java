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

        // CREDIT CARD
        JPanel pnlcreditcard = new JPanel();
        pnlcreditcard.setBounds(0, 0, 1215, 838);
        pnlcreditcard.setBackground(Color.GREEN);
        pnlcreditcard.setLayout(null);
        pnlcreditcard.setVisible(false);
        frame.add(pnlcreditcard);

        JLabel lblcreditcard = new JLabel();
        lblcreditcard.setIcon(new ImageIcon("C:\\Users\\Admin\\Downloads\\BLR-FINACIALS FINAL UI\\CREDIT CARD.png"));
        lblcreditcard.setBounds(0, 0, 1200, 800);
        pnlcreditcard.add(lblcreditcard);

        JButton btnExit13 = new JButton("ANOTHER EXIT");
        btnExit13.setContentAreaFilled(false);
        btnExit13.setFocusPainted(false);
        btnExit13.setOpaque(false);
        btnExit13.setBounds(838, 625, 166, 40);
        pnlcreditcard.add(btnExit13);

        JButton btnBack13 = new JButton("Back");
        btnBack13.setContentAreaFilled(false);
        btnBack13.setFocusPainted(false);
        btnBack13.setOpaque(false);
        btnBack13.setBounds(178, 624, 166, 40);
        pnlcreditcard.add(btnBack13);

        JButton btnBPI = new JButton("Back");
        btnBPI.setContentAreaFilled(false);
        btnBPI.setFocusPainted(false);
        btnBPI.setOpaque(false);
        btnBPI.setBounds(178, 624, 166, 40);
        pnlcreditcard.add(btnBack13);

        JButton btnEquicom = new JButton("Back");
        btnEquicom.setContentAreaFilled(false);
        btnEquicom.setFocusPainted(false);
        btnEquicom.setOpaque(false);
        btnEquicom.setBounds(178, 624, 166, 40);
        pnlcreditcard.add(btnBack13);

        JButton btnMetrobank  = new JButton("Back");
        btnMetrobank.setContentAreaFilled(false);
        btnMetrobank.setFocusPainted(false);
        btnMetrobank.setOpaque(false);
        btnMetrobank.setBounds(178, 624, 166, 40);
        pnlcreditcard.add(btnBack13);

        JButton btnRCBC = new JButton("Back");
        btnRCBC.setContentAreaFilled(false);
        btnRCBC.setFocusPainted(false);
        btnRCBC.setOpaque(false);
        btnRCBC.setBounds(178, 624, 166, 40);
        pnlcreditcard.add(btnBack13);


        //BPI
        JPanel pnlBPI = new JPanel();
        pnlBPI.setBounds(0, 0, 1215, 838);
        pnlBPI.setBackground(Color.GREEN);
        pnlBPI.setLayout(null);
        pnlBPI.setVisible(false);
        frame.add(pnlBPI);

        JLabel lblBPI = new JLabel();
        lblBPI.setIcon(new ImageIcon("C:\\Users\\Admin\\Downloads\\BLR-FINACIALS FINAL UI\\WATER.png"));
        lblBPI.setBounds(0, 0, 1200, 800);
        pnlBPI.add(lblBPI);

        JButton btnBPIexit = new JButton("ANOTHER EXIT");
        btnBPIexit.setContentAreaFilled(false);
        btnBPIexit.setFocusPainted(false);
        btnBPIexit.setOpaque(false);
        btnBPIexit.setBounds(838, 625, 166, 40);
        pnlBPI.add(btnBPIexit);

        JButton btnBPIback = new JButton("Back");
        btnBPIback.setContentAreaFilled(false);
        btnBPIback.setFocusPainted(false);
        btnBPIback.setOpaque(false);
        btnBPIback.setBounds(178, 624, 166, 40);
        pnlBPI.add(btnBPIback);

        JButton btnBPIconfirm = new JButton("Back");
        btnBPIconfirm.setContentAreaFilled(false);
        btnBPIconfirm.setFocusPainted(false);
        btnBPIconfirm.setOpaque(false);
        btnBPIconfirm.setBounds(727, 482, 111, 27);
        pnlBPI.add(btnBPIconfirm);

        //Equicom

        JPanel pnlequicom = new JPanel();
        pnlequicom.setBounds(0, 0, 1215, 838);
        pnlequicom.setBackground(Color.GREEN);
        pnlequicom.setLayout(null);
        pnlequicom.setVisible(false);
        frame.add(pnlequicom);

        JLabel lblequicom = new JLabel();
        lblequicom.setIcon(new ImageIcon("C:\\Users\\Admin\\Downloads\\BLR-FINACIALS FINAL UI\\WATER.png"));
        lblequicom.setBounds(0, 0, 1200, 800);
        pnlequicom.add(lblequicom);

        JButton btnequicomexit = new JButton("ANOTHER EXIT");
        btnequicomexit.setContentAreaFilled(false);
        btnequicomexit.setFocusPainted(false);
        btnequicomexit.setOpaque(false);
        btnequicomexit.setBounds(838, 625, 166, 40);
        pnlequicom.add(btnequicomexit);

        JButton btnequicomback = new JButton("Back");
        btnequicomback.setContentAreaFilled(false);
        btnequicomback.setFocusPainted(false);
        btnequicomback.setOpaque(false);
        btnequicomback.setBounds(178, 624, 166, 40);
        pnlequicom.add(btnequicomback);

        JButton btnequicomconfirm = new JButton("Back");
        btnequicomconfirm.setContentAreaFilled(false);
        btnequicomconfirm.setFocusPainted(false);
        btnequicomback.setOpaque(false);
        btnequicomback.setBounds(727, 482, 111, 27);
        pnlequicom.add(btnequicomconfirm);

        //MetroBank

        JPanel pnlmetrobank = new JPanel();
        pnlmetrobank.setBounds(0, 0, 1215, 838);
        pnlmetrobank.setBackground(Color.GREEN);
        pnlmetrobank.setLayout(null);
        pnlmetrobank.setVisible(false);
        frame.add(pnlmetrobank);

        JLabel lblmetrobank = new JLabel();
        lblmetrobank.setIcon(new ImageIcon("C:\\Users\\Admin\\Downloads\\BLR-FINACIALS FINAL UI\\WATER.png"));
        lblmetrobank.setBounds(0, 0, 1200, 800);
        pnlmetrobank.add(lblmetrobank);

        JButton btnmetrobankexit = new JButton("ANOTHER EXIT");
        btnmetrobankexit.setContentAreaFilled(false);
        btnmetrobankexit.setFocusPainted(false);
        btnmetrobankexit.setOpaque(false);
        btnmetrobankexit.setBounds(838, 625, 166, 40);
        pnlmetrobank.add(btnmetrobankexit);

        JButton btnmetrobankback = new JButton("Back");
        btnmetrobankback.setContentAreaFilled(false);
        btnmetrobankback.setFocusPainted(false);
        btnmetrobankback.setOpaque(false);
        btnmetrobankback.setBounds(178, 624, 166, 40);
        pnlmetrobank.add(btnmetrobankback);

        JButton btnmetrobankconfirm = new JButton("Back");
        btnmetrobankconfirm.setContentAreaFilled(false);
        btnmetrobankconfirm.setFocusPainted(false);
        btnmetrobankconfirm.setOpaque(false);
        btnmetrobankback.setBounds(727, 482, 111, 27);
        pnlmetrobank.add(btnmetrobankconfirm);

        //RCBC

        JPanel pnlrcbc = new JPanel();
        pnlrcbc.setBounds(0, 0, 1215, 838);
        pnlrcbc.setBackground(Color.GREEN);
        pnlrcbc.setLayout(null);
        pnlrcbc.setVisible(false);
        frame.add(pnlrcbc);

        JLabel lblrcbc = new JLabel();
        lblrcbc.setIcon(new ImageIcon("C:\\Users\\Admin\\Downloads\\BLR-FINACIALS FINAL UI\\WATER.png"));
        lblrcbc.setBounds(0, 0, 1200, 800);
        pnlrcbc.add(lblrcbc);

        JButton btnrcbcexit = new JButton("ANOTHER EXIT");
        btnrcbcexit.setContentAreaFilled(false);
        btnrcbcexit.setFocusPainted(false);
        btnrcbcexit.setOpaque(false);
        btnrcbcexit.setBounds(838, 625, 166, 40);
        pnlrcbc.add(btnrcbcexit);

        JButton btnrcbcback = new JButton("Back");
        btnrcbcback.setContentAreaFilled(false);
        btnrcbcback.setFocusPainted(false);
        btnrcbcback.setOpaque(false);
        btnrcbcback.setBounds(178, 624, 166, 40);
        pnlrcbc.add(btnrcbcback);

        JButton btnrcbcconfirm = new JButton("Back");
        btnrcbcconfirm.setContentAreaFilled(false);
        btnrcbcconfirm.setFocusPainted(false);
        btnrcbcconfirm.setOpaque(false);
        btnrcbcconfirm.setBounds(727, 482, 111, 27);
        pnlrcbc.add(btnrcbcconfirm);



    }
}
