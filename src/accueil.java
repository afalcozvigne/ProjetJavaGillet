import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Alexandre on 11/01/2017.
 */
public class accueil extends JFrame {
    private JPanel pannelPersonne = new JPanel();
    private JMenuBar menuBar;
    private JMenu menuUn, menuDeux, menuTrois,exit;
    private JMenuItem sirOpen,sirSave,sirType,sirDir;
    private JMenuItem vtcOpen,vtcSave,vtcType,vtcDir;
    public accueil(){
        //On instancie menuBar en JMenuBar
        menuBar =new JMenuBar();
        //Creation du menu
        menuUn = new JMenu("Accueil :");
        menuUn.addMenuListener(new MenuListener() {
            @Override
            public void menuSelected(MenuEvent e) {

            }
            @Override
            public void menuDeselected(MenuEvent e) {

            }
            @Override
            public void menuCanceled(MenuEvent e) {

            }
        });
        menuBar.add(menuUn);

        //Menu Deux
        menuDeux = new JMenu("Deux");
        menuDeux.addMenuListener(new MenuListener() {
            @Override
            public void menuSelected(MenuEvent e) {

            }

            @Override
            public void menuDeselected(MenuEvent e) {

            }

            @Override
            public void menuCanceled(MenuEvent e) {

            }
        });
        menuUn.add(menuDeux);
        //Menu Trois
        menuTrois = new JMenu("Trois");
        menuTrois.addMenuListener(new MenuListener() {
            @Override
            public void menuSelected(MenuEvent e) {

            }
            @Override
            public void menuDeselected(MenuEvent e) {

            }
            @Override
            public void menuCanceled(MenuEvent e) {

            }
        });
        menuUn.add(menuTrois);
        //Creation du menu exit
        exit = new JMenu("Quitter (ALT+X)");
        exit.setMnemonic(KeyEvent.VK_X);
        exit.addMenuListener(new MenuListener() {
            @Override
            public void menuSelected(MenuEvent e) {
                accueil.this.dispose();
            }
            @Override
            public void menuDeselected(MenuEvent e) {

            }
            @Override
            public void menuCanceled(MenuEvent e) {

            }
        });
        menuBar.add(exit);

        //Creation de sous-menu pour le menuDeux
        sirOpen = new JMenuItem("DeuxUn",new ImageIcon());
        sirOpen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        menuDeux.add(sirOpen);
        //Creation de sous-menu pour le menuDeux
        sirSave = new JMenuItem("DeuxDeux",new ImageIcon());
        sirSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        menuDeux.add(sirSave);
        //Creation de sous-menu pour le menuDeux
        sirType = new JMenuItem("DeuxTrois",new ImageIcon());
        sirType.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        menuDeux.add(sirType);
        //Creation de sous-menu pour le menuDeux
        sirDir = new JMenuItem("DeuxQuatre",new ImageIcon());
        sirDir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        menuDeux.add(sirDir);

        //Creation de sous-menu pour le menuTrois
        vtcOpen = new JMenuItem("TroisUn",new ImageIcon());
        vtcOpen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        menuTrois.add(vtcOpen);
        //Creation de sous-menu pour le menuTrois
        vtcSave = new JMenuItem("TroisDeux",new ImageIcon());
        vtcSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        menuTrois.add(vtcSave);
        //Creation de sous-menu pour le menuTrois
        vtcType = new JMenuItem("TroisTrois",new ImageIcon());
        vtcType.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        menuTrois.add(vtcType);
        //Creation de sous-menu pour le menuTrois
        vtcDir = new JMenuItem("TroisQuatre",new ImageIcon());
        vtcDir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        menuTrois.add(vtcDir);

        this.setJMenuBar(menuBar);
        this.setVisible(true);
        this.setTitle("Ma Banque Perso : ACCUEIL");
        this.setSize(600,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }
}
