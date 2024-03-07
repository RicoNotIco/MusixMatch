package frontend;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;

import javax.swing.*;

import backend.Song;

public class Canzone extends JFrame implements ActionListener{

    private TestoCanzone testoCanzone;
    private Song song;

    private JLabel lblAutore;
    private JLabel lblTitolo;
    private JLabel lblAlbum;
    private JButton testo;
    
    

    private String strAutore;
    private String strTitolo;
    private String strAlbum;
    private JButton info;
    private InfoCanzone infoCanzone;

    public Canzone(Song song) {
        super("Canzone");
        this.song = song;
        setBounds(400, 280, 700, 150);

        this.strAutore = song.getArtistName();
        this.strTitolo = song.getTrackName();
        this.strAlbum = song.getAlbumName();

        initComponents();
    }

    private void initComponents() {



        setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 4));
        panel.setBackground(Color.BLACK);
        panel.setSize(400, 100);

        JPanel p = new JPanel();
        p.setLayout(new FlowLayout());

        p.setBackground(Color.BLACK);

        ImageIcon iconLogo = new ImageIcon("C:\\Users\\icoco\\Downloads\\GuiForMusixMatchAPIv2\\_ProgettoInfoMusixMatchCristini\\Image\\image.jpg");
        Image image = iconLogo.getImage();
        Image newImage = image.getScaledInstance(30, 30,  Image.SCALE_SMOOTH); // scale it the smooth way
        ImageIcon iconLogoScaled = new ImageIcon(newImage);
        JLabel lblLogo = new JLabel(iconLogo);
        lblLogo.setIcon(iconLogoScaled);
        lblLogo.setBackground(Color.BLACK);
        p.setSize(40,40);
        p.add(lblLogo);
        panel.add(p);

        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(2,1));

        p1.setBackground(Color.BLACK);

        lblTitolo = new JLabel();
        lblTitolo.setText(strTitolo);
        lblTitolo.setFont(new Font("Arial", Font.BOLD, 14));
        lblTitolo.setForeground(Color.WHITE);

        lblAutore = new JLabel();
        lblAutore.setText(strAutore);
        lblAutore.setFont(new Font("Arial", Font.ITALIC, 10));
        lblAutore.setForeground(Color.WHITE);
        p1.setBounds(45, 90, 70, 90);
        p1.add(lblTitolo);
        p1.add(lblAutore);
        panel.add(p1);

        JPanel p2 = new JPanel();
        p2.setLayout(new FlowLayout());

        p2.setBackground(Color.BLACK);

        ImageIcon iconLogo1 = new ImageIcon("C:\\Users\\icoco\\Downloads\\GuiForMusixMatchAPIv2\\_ProgettoInfoMusixMatchCristini\\Image\\img.png");
        Image image1 = iconLogo1.getImage(); // transform it
        Image newImage1 = image1.getScaledInstance(264, 40,  Image.SCALE_SMOOTH);
        ImageIcon iconLogoScaled1 = new ImageIcon(newImage1);
        JLabel lblLogo1 = new JLabel();
        lblLogo1.setIcon(iconLogoScaled1);
        lblLogo1.setHorizontalAlignment(JLabel.CENTER);
        lblLogo1.setBackground(Color.BLACK);
        p2.setSize(150, 45);
        p2.add(lblLogo1);
        panel.add(p2);

        JPanel p3 = new JPanel();
        p3.setLayout(new FlowLayout());

        p3.setBackground(Color.BLACK);

        lblAlbum = new JLabel();
        lblAlbum.setText(strAlbum);
        lblAlbum.setFont(new Font("Arial", Font.BOLD, 14));
        lblAlbum.setVerticalAlignment(JLabel.CENTER);
        lblAlbum.setForeground(Color.WHITE);
        p3.setSize(70,90);
        p3.add(lblAlbum);
        panel.add(p3);

        JPanel p4 = new JPanel();
        p4.setLayout(new FlowLayout());
        p4.setBackground(Color.BLACK);

        testo = new JButton("lyrics");
        testo.addActionListener(this);
        testo.setBackground(Color.BLACK);
        testo.setForeground(Color.WHITE);
        testo.setFont(new Font("Arial", Font.BOLD, 14));
        p4.add(testo);
        panel.add(p4);

        add(panel, BorderLayout.CENTER);


        JPanel p5 = new JPanel();
        p5.setLayout(new FlowLayout());
        info = new JButton("More info");
        info.addActionListener(this);
        info.setBackground(Color.BLACK);
        info.setForeground(Color.WHITE);
        info.setFont(new Font("Arial", Font.BOLD, 14));
        p5.add(info);

        add(p5, BorderLayout.SOUTH);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(testo)) {
            testoCanzone = new TestoCanzone(song);
            testoCanzone.setVisible(true);
        }
        if(e.getSource().equals(info)){
            infoCanzone = new InfoCanzone(song);
            infoCanzone.setVisible(true);
        }

    }

}
