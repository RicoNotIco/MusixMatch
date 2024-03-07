package frontend;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.jmusixmatch.MusixMatchException;

import backend.ClientMusixMatch;
import backend.Song;

public class MainFrame extends JFrame implements ActionListener{

    private JTextField txtAutore;
    private JTextField txtTitolo;
    private JTextField txtAlbum;

    private JLabel lblAutore;
    private JLabel lblTitolo;
    private JLabel lblAlbum;

    private JButton btnCerca;

    private Canzone canzone;

    public MainFrame() {
        super("Cerca canzoni");

        setBounds(400, 200, 700, 73);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        initComponents();
    }

    public JTextField getTxtAutore() {
        return txtAutore;
    }

    public JTextField getTxtTitolo() {
        return txtTitolo;
    }

    public JTextField getTxtAlbum() {
        return txtAlbum;
    }

    private void initComponents() {
        setLayout(new BorderLayout());

        JPanel p = new JPanel();
        p.setLayout(new FlowLayout());

        lblAutore = new JLabel("Autore");
        p.add(lblAutore);

        txtAutore = new JTextField(10);
        p.add(txtAutore);

        lblTitolo = new JLabel("Titolo");
        p.add(lblTitolo);

        txtTitolo = new JTextField(10);
        p.add(txtTitolo);

        lblAlbum = new JLabel("Album");
        p.add(lblAlbum);

        txtAlbum = new JTextField(10);
        p.add(txtAlbum);

        btnCerca = new JButton("Cerca");
        btnCerca.addActionListener(this);
        p.add(btnCerca);

        //testoCanzone = new TestoCanzone(null);
        p.setBackground(TestoCanzone.coloreCasuale());

        add(p, BorderLayout.NORTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(btnCerca)) {

            ClientMusixMatch clientMM = new ClientMusixMatch();
            Song song = null;
            try {
                song = clientMM.cercaCanzone(txtAutore.getText(), txtTitolo.getText(), txtAlbum.getText());
            } catch (MusixMatchException e1) {
                e1.printStackTrace();
            }

            canzone = new Canzone(song);
            canzone.setVisible(true);
        }
    }

    public static void main(String[] args) {
        MainFrame m = new MainFrame();
        m.setVisible(true);
    }

}
