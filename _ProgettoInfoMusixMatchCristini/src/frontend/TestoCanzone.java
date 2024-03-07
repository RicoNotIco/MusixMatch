package frontend;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

import backend.Song;

public class TestoCanzone extends JFrame implements ActionListener {

    private JLabel lblTesto;



    private Song song;

    public TestoCanzone(Song song) {
        super("Lyrics");
        this.song = song;
        setBounds(500, 100, 500, 600);
        initComponents();
    }

    private void initComponents() {
        setLayout(new BorderLayout());

        JPanel p = new JPanel();
        p.setLayout(new FlowLayout());

        String testo = song.getLyrics().getLyricsBody();
        lblTesto = new JLabel("<html>" + testo + "</html>");
        lblTesto.setHorizontalAlignment(SwingConstants.LEFT);
        lblTesto.setPreferredSize(new Dimension(450, 600));
        lblTesto.setFont(new Font("Arial", Font.BOLD, 18));
        lblTesto.setForeground(Color.WHITE);
        p.setBackground(coloreCasuale());
        p.add(lblTesto, BorderLayout.CENTER);
        add(p, BorderLayout.CENTER);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static Color coloreCasuale() {
        Random rand = new Random();
        int color = rand.nextInt();
        return new Color(color);
    }

}
