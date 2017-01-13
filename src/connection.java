import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.event.KeyEvent;

/**
 * Created by Alexandre on 11/01/2017.
 */
public class connection extends JFrame {
    private JPanel pannelConnection = new JPanel();
    private JLabel labelIdentifiant = new JLabel("Identifiant :");
    private JLabel labelMdp = new JLabel("Mot de passe :");
    private JTextField textFieldIdentifiant = new JTextField("********************");
    private JTextField textFieldMdp = new JTextField("********************");
    private JButton boutonConnection = new JButton("Connection");

    public connection(){
        //Titre du JFrame
        this.setTitle("Ma Banque Perso");
        //fenetre redimesionnable
        this.setResizable(false);
        //Taille du JFrame
        this.setSize(300,200);
        //Rends le JFrame visible
        this.setVisible(true);
        //Ferme l'application lorsqu'on ferme la fenetre
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Cette méthode permet de positionner la fenêtre par rapport à un composant. En indiquant un composant null, elle va se placer automatiquement au milieu de l'écran.
        this.setLocationRelativeTo(null);
        this.setContentPane(pannelConnection);
        //On rajoute au panel tout les composants
        pannelConnection.add(labelIdentifiant);
        pannelConnection.add(textFieldIdentifiant);
        pannelConnection.add(labelMdp);
        pannelConnection.add(textFieldMdp);
        pannelConnection.add(boutonConnection);
        //Enregistrez une instance de la classe du gestionnaire d'événements en tant que Listener sur un ou plusieurs composants
        boutonConnection.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                accueil accueil= new accueil();
                connection.this.dispose();
            }
        });
    }
}
