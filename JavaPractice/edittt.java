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

        //water
        JPanel pnlwater = new JPanel();
        pnlwater.setBounds(0, 0, 1215, 838);
        pnlwater.setBackground(Color.GREEN);
        pnlwater.setLayout(null);
        pnlwater.setVisible(false);
        frame.add(pnlwater);

        JLabel lblwater = new JLabel();
        lblwater.setIcon(new ImageIcon("C:\\Users\\Admin\\Downloads\\BLR-FINACIALS FINAL UI\\WATER.png"));
        lblwater.setBounds(0, 0, 1200, 800);
        pnlwater.add(lblwater);

        JButton btnExit11 = new JButton("ANOTHER EXIT");
        btnExit11.setContentAreaFilled(false);
        btnExit11.setFocusPainted(false);
        btnExit11.setOpaque(false);
        btnExit11.setBounds(838, 625, 166, 40);
        pnlwater.add(btnExit11);

        JButton btnBack11 = new JButton("Back");
        btnBack11.setContentAreaFilled(false);
        btnBack11.setFocusPainted(false);
        btnBack11.setOpaque(false);
        btnBack11.setBounds(178, 624, 166, 40);
        pnlwater.add(btnBack11);

        JButton btnlaguna = new JButton("Back");
        btnlaguna.setContentAreaFilled(false);
        btnlaguna.setFocusPainted(false);
        btnlaguna.setOpaque(false);
        btnlaguna.setBounds(178, 624, 166, 40);
        pnlwater.add(btnBack11);

        JButton btnlegaspi = new JButton("Back");
        btnlegaspi.setContentAreaFilled(false);
        btnlegaspi.setFocusPainted(false);
        btnlegaspi.setOpaque(false);
        btnlegaspi.setBounds(178, 624, 166, 40);
        pnlwater.add(btnBack11);

        JButton btnmanila= new JButton("Back");
        btnmanila.setContentAreaFilled(false);
        btnmanila.setFocusPainted(false);
        btnmanila.setOpaque(false);
        btnmanila.setBounds(178, 624, 166, 40);
        pnlwater.add(btnBack11);

        JButton btnmaynilad  = new JButton("Back");
        btnmaynilad.setContentAreaFilled(false);
        btnmaynilad.setFocusPainted(false);
        btnmaynilad.setOpaque(false);
        btnmaynilad.setBounds(178, 624, 166, 40);
        pnlwater.add(btnBack11);


        // Laguna
        JPanel pnllaguna = new JPanel();
        pnllaguna.setBounds(0, 0, 1215, 838);
        pnllaguna.setBackground(Color.GREEN);
        pnllaguna.setLayout(null);
        pnllaguna.setVisible(false);
        frame.add(pnllaguna);

        JLabel lbllaguna = new JLabel();
        lbllaguna.setIcon(new ImageIcon("C:\\Users\\Admin\\Downloads\\BLR-FINACIALS FINAL UI\\WATER.png"));
        lbllaguna.setBounds(0, 0, 1200, 800);
        pnllaguna.add(lbllaguna);

        JButton btnlagunaexit = new JButton("ANOTHER EXIT");
        btnlagunaexit.setContentAreaFilled(false);
        btnlagunaexit.setFocusPainted(false);
        btnlagunaexit.setOpaque(false);
        btnlagunaexit.setBounds(838, 625, 166, 40);
        pnllaguna.add(btnlagunaexit);

        JButton btnlagunaback = new JButton("Back");
        btnlagunaback.setContentAreaFilled(false);
        btnlagunaback.setFocusPainted(false);
        btnlagunaback.setOpaque(false);
        btnlagunaback.setBounds(178, 624, 166, 40);
        pnllaguna.add(btnlagunaback);

        JButton btnlagunaconfirm = new JButton("Back");
        btnlagunaconfirm.setContentAreaFilled(false);
        btnlagunaconfirm.setFocusPainted(false);
        btnlagunaconfirm.setOpaque(false);
        btnlagunaconfirm.setBounds(727, 482, 111, 27);
        pnllaguna.add(btnlagunaconfirm);


        // Legaspi
        JPanel pnllegaspi = new JPanel();
        pnllegaspi.setBounds(0, 0, 1215, 838);
        pnllegaspi.setBackground(Color.GREEN);
        pnllegaspi.setLayout(null);
        pnllegaspi.setVisible(false);
        frame.add(pnllegaspi);

        JLabel lbllegaspi = new JLabel();
        lbllegaspi.setIcon(new ImageIcon("C:\\Users\\Admin\\Downloads\\BLR-FINACIALS FINAL UI\\WATER.png"));
        lbllegaspi.setBounds(0, 0, 1200, 800);
        pnllegaspi.add(lbllaguna);

        JButton btnlegaspiexit = new JButton("ANOTHER EXIT");
        btnlegaspiexit.setContentAreaFilled(false);
        btnlegaspiexit.setFocusPainted(false);
        btnlegaspiexit.setOpaque(false);
        btnlegaspiexit.setBounds(838, 625, 166, 40);
        pnllaguna.add(btnlegaspiexit);

        JButton btnlegaspiback = new JButton("Back");
        btnlegaspiback.setContentAreaFilled(false);
        btnlegaspiback.setFocusPainted(false);
        btnlegaspiback.setOpaque(false);
        btnlegaspiback.setBounds(178, 624, 166, 40);
        pnllaguna.add(btnlegaspiback);

        JButton btnlegaspiconfirm = new JButton("Back");
        btnlegaspiconfirm.setContentAreaFilled(false);
        btnlegaspiconfirm.setFocusPainted(false);
        btnlegaspiconfirm.setOpaque(false);
        btnlegaspiconfirm.setBounds(727, 482, 111, 27);
        pnllaguna.add(btnlegaspiconfirm);


        // manila
        JPanel pnlmanila = new JPanel();
        pnlmanila.setBounds(0, 0, 1215, 838);
        pnlmanila.setBackground(Color.GREEN);
        pnlmanila.setLayout(null);
        pnlmanila.setVisible(false);
        frame.add(pnlmanila);

        JLabel lblmanila = new JLabel();
        lblmanila.setIcon(new ImageIcon("C:\\Users\\Admin\\Downloads\\BLR-FINACIALS FINAL UI\\WATER.png"));
        lblmanila.setBounds(0, 0, 1200, 800);
        pnlmanila.add(lblmanila);

        JButton btnmanilaexit = new JButton("ANOTHER EXIT");
        btnmanilaexit.setContentAreaFilled(false);
        btnmanilaexit.setFocusPainted(false);
        btnmanilaexit.setOpaque(false);
        btnmanilaexit.setBounds(838, 625, 166, 40);
        pnllaguna.add(btnmanilaexit);

        JButton btnmanilaback = new JButton("Back");
        btnmanilaback.setContentAreaFilled(false);
        btnmanilaback.setFocusPainted(false);
        btnmanilaback.setOpaque(false);
        btnmanilaback.setBounds(178, 624, 166, 40);
        pnllaguna.add(btnmanilaback);

        JButton btnmanilaconfirm = new JButton("Back");
        btnmanilaconfirm.setContentAreaFilled(false);
        btnmanilaconfirm.setFocusPainted(false);
        btnmanilaconfirm.setOpaque(false);
        btnmanilaconfirm.setBounds(727, 482, 111, 27);
        pnllaguna.add(btnmanilaconfirm);


        // maynilad
        JPanel pnlmaynilad = new JPanel();
        pnlmaynilad.setBounds(0, 0, 1215, 838);
        pnlmaynilad.setBackground(Color.GREEN);
        pnlmaynilad.setLayout(null);
        pnlmaynilad.setVisible(false);
        frame.add(pnlmaynilad);

        JLabel lblmaynilad = new JLabel();
        lblmaynilad.setIcon(new ImageIcon("C:\\Users\\Admin\\Downloads\\BLR-FINACIALS FINAL UI\\WATER.png"));
        lblmaynilad.setBounds(0, 0, 1200, 800);
        pnllaguna.add(lblmaynilad);

        JButton btnmayniladexit = new JButton("ANOTHER EXIT");
        btnmayniladexit.setContentAreaFilled(false);
        btnmayniladexit.setFocusPainted(false);
        btnmayniladexit.setOpaque(false);
        btnmayniladexit.setBounds(838, 625, 166, 40);
        pnllaguna.add(btnmayniladexit);

        JButton btnmayniladback = new JButton("Back");
        btnmayniladback.setContentAreaFilled(false);
        btnmayniladback.setFocusPainted(false);
        btnmayniladback.setOpaque(false);
        btnmayniladback.setBounds(178, 624, 166, 40);
        pnllaguna.add(btnmayniladback);

        JButton btnmayniladconfirm = new JButton("Back");
        btnmayniladconfirm.setContentAreaFilled(false);
        btnmayniladconfirm.setFocusPainted(false);
        btnmayniladconfirm.setOpaque(false);
        btnmayniladconfirm.setBounds(727, 482, 111, 27);
        pnllaguna.add(btnmayniladconfirm);


        
    }
}
