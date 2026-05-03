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

        //laguna

        JPanel pnlconfirmationExitlaguna = new JPanel();
        pnlconfirmationExitlaguna.setBounds(0, 0, 1215, 838);
        pnlconfirmationExitlaguna.setBackground(Color.GREEN);
        pnlconfirmationExitlaguna.setLayout(null);
        pnlconfirmationExitlaguna.setVisible(false);
        frame.add(pnlconfirmationExitlaguna);

        JLabel lblconfirmationExitlaguna = new JLabel();
        lblconfirmationExitlaguna.setIcon(new ImageIcon("C:\\Users\\Admin\\Downloads\\BLR-FINACIALS FINAL UI\\CONFIRMATION TO EXIT.png"));
        lblconfirmationExitlaguna.setBounds(0, 0, 1200, 800);
        pnlconfirmationExitlaguna.add(lblconfirmationExitlaguna);

        JButton btnYeslaguna = new JButton("YES");
        btnYeslaguna.setContentAreaFilled(false);
        btnYeslaguna.setFocusPainted(false);
        btnYeslaguna.setOpaque(false);
        btnYeslaguna.setBounds(342, 459, 239, 66);
        pnlconfirmationExitlaguna.add(btnYeslaguna);

        JButton btnNolaguna = new JButton("NO");
        btnNolaguna.setContentAreaFilled(false);
        btnNolaguna.setFocusPainted(false);
        btnNolaguna.setOpaque(false);
        btnNolaguna.setBounds(634, 459, 239, 66);
        pnlconfirmationExitlaguna.add(btnNolaguna);
        
        //legaspi

        JPanel pnlconfirmationExitlegaspi = new JPanel();
        pnlconfirmationExitlegaspi.setBounds(0, 0, 1215, 838);
        pnlconfirmationExitlegaspi.setBackground(Color.GREEN);
        pnlconfirmationExitlegaspi.setLayout(null);
        pnlconfirmationExitlegaspi.setVisible(false);
        frame.add(pnlconfirmationExitlegaspi);

        JLabel lblconfirmationExitlegaspi = new JLabel();
        lblconfirmationExitlegaspi.setIcon(new ImageIcon("C:\\Users\\Admin\\Downloads\\BLR-FINACIALS FINAL UI\\CONFIRMATION TO EXIT.png"));
        lblconfirmationExitlegaspi.setBounds(0, 0, 1200, 800);
        pnlconfirmationExitlegaspi.add(lblconfirmationExitlegaspi);

        JButton btnYeslegaspi = new JButton("YES");
        btnYeslegaspi.setContentAreaFilled(false);
        btnYeslegaspi.setFocusPainted(false);
        btnYeslegaspi.setOpaque(false);
        btnYeslegaspi.setBounds(342, 459, 239, 66);
        pnlconfirmationExitlegaspi.add(btnYeslegaspi);

        JButton btnNolegaspi = new JButton("NO");
        btnNolegaspi.setContentAreaFilled(false);
        btnNolegaspi.setFocusPainted(false);
        btnNolegaspi.setOpaque(false);
        btnNolegaspi.setBounds(634, 459, 239, 66);
        pnlconfirmationExitlegaspi.add(btnNolegaspi);

        //manila

        JPanel pnlconfirmationExitmanila = new JPanel();
        pnlconfirmationExitmanila.setBounds(0, 0, 1215, 838);
        pnlconfirmationExitmanila.setBackground(Color.GREEN);
        pnlconfirmationExitmanila.setLayout(null);
        pnlconfirmationExitmanila.setVisible(false);
        frame.add(pnlconfirmationExitmanila);

        JLabel lblconfirmationExitmanila = new JLabel();
        lblconfirmationExitmanila.setIcon(new ImageIcon("C:\\Users\\Admin\\Downloads\\BLR-FINACIALS FINAL UI\\CONFIRMATION TO EXIT.png"));
        lblconfirmationExitmanila.setBounds(0, 0, 1200, 800);
        pnlconfirmationExitmanila.add(lblconfirmationExitmanila);

        JButton btnYesmanila = new JButton("YES");
        btnYesmanila.setContentAreaFilled(false);
        btnYesmanila.setFocusPainted(false);
        btnYesmanila.setOpaque(false);
        btnYesmanila.setBounds(342, 459, 239, 66);
        pnlconfirmationExitmanila.add(btnYesmanila);

        JButton btnNomanila = new JButton("NO");
        btnNomanila.setContentAreaFilled(false);
        btnNomanila.setFocusPainted(false);
        btnNomanila.setOpaque(false);
        btnNomanila.setBounds(634, 459, 239, 66);
        pnlconfirmationExitmanila.add(btnNomanila);

        //maynilad

        JPanel pnlconfirmationExitmaynilad = new JPanel();
        pnlconfirmationExitmaynilad.setBounds(0, 0, 1215, 838);
        pnlconfirmationExitmaynilad.setBackground(Color.GREEN);
        pnlconfirmationExitmaynilad.setLayout(null);
        pnlconfirmationExitmaynilad.setVisible(false);
        frame.add(pnlconfirmationExitmaynilad);

        JLabel lblconfirmationExitmaynilad = new JLabel();
        lblconfirmationExitmaynilad.setIcon(new ImageIcon("C:\\Users\\Admin\\Downloads\\BLR-FINACIALS FINAL UI\\CONFIRMATION TO EXIT.png"));
        lblconfirmationExitmaynilad.setBounds(0, 0, 1200, 800);
        pnlconfirmationExitmaynilad.add(lblconfirmationExitmaynilad);

        JButton btnYesmaynilad = new JButton("YES");
        btnYesmaynilad.setContentAreaFilled(false);
        btnYesmaynilad.setFocusPainted(false);
        btnYesmaynilad.setOpaque(false);
        btnYesmaynilad.setBounds(342, 459, 239, 66);
        pnlconfirmationExitmaynilad.add(btnYesmaynilad);

        JButton btnNomaynilad = new JButton("NO");
        btnNomaynilad.setContentAreaFilled(false);
        btnNomaynilad.setFocusPainted(false);
        btnNomaynilad.setOpaque(false);
        btnNomaynilad.setBounds(634, 459, 239, 66);
        pnlconfirmationExitmaynilad.add(btnNomaynilad);
    }
}