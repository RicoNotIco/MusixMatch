package frontend;


import java.awt.*;
import java.util.Random;

import javax.swing.*;

import backend.Song;
import org.jmusixmatch.entity.track.PrimaryGenres;

public class InfoCanzone extends JFrame{

    private JLabel lblTrackRating;
    private JLabel lblTrackLenght;
    private JLabel lblTrackPrimaryGenres;

    private Integer intTrackRating;
    private Integer intTrackLength;
    private PrimaryGenres primaryGenres;

    private Song song;

    public InfoCanzone(Song song) {
        super("Informazioni sulla Canzone");
        this.song = song;

        setBounds(500, 100, 500, 300);

        this.intTrackRating = song.getTrackRating();
        this.intTrackLength = song.getTrackLength();
        this.primaryGenres = song.getPrimaryGenres();

        initComponents();
    }

    private void initComponents() {
        setLayout(new BorderLayout());

        JPanel p = new JPanel();
        p.setLayout(new GridLayout(5,1));

        lblTrackRating = new JLabel();
        lblTrackRating.setText("Valutazione da 0 a 100 del brano: "+intTrackRating);
        lblTrackRating.setFont(new Font("Arial", Font.BOLD, 18));
        lblTrackRating.setForeground(Color.WHITE);
        p.add(lblTrackRating);
/*
        lblTrackLenght = new JLabel();
        lblTrackLenght.setText("Durata del brano: "+intTrackLength);
        lblTrackLenght.setFont(new Font("Arial", Font.BOLD, 18));
        lblTrackLenght.setForeground(Color.WHITE);
        p.add(lblTrackLenght);*/

        lblTrackPrimaryGenres = new JLabel();
        lblTrackPrimaryGenres.setText("Genere del brano: "+primaryGenres);
        lblTrackPrimaryGenres.setFont(new Font("Arial", Font.BOLD, 18));
        lblTrackPrimaryGenres.setForeground(Color.WHITE);
        p.add(lblTrackPrimaryGenres);

        p.setBackground(Color.black);

        add(p, BorderLayout.CENTER);
    }



}
