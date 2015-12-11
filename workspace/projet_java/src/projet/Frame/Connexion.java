package projet.Frame;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class Connexion {
	JFrame fenetre;
	PanelSaisie pseudo;
	PanelSaisie mdp;
	JComboBox<String> comboboxUtilisateur;
	JButton boutonConnexion;
	JPanel panelPage;
	
	
	public Connexion(){
		fenetre = new JFrame();
		fenetre.setTitle("Formulaire Connexion");
		fenetre.setSize(500, 500);
		fenetre.setLocationRelativeTo(null);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panelPage = new JPanel();
		//panelPage.setLayout(new GridLayout(3,1));
		boutonConnexion = new JButton("Connexion");
		pseudo = new PanelSaisie("pseudo : ", false);
		mdp = new PanelSaisie("mot de passe : ", true);
		comboboxUtilisateur =new JComboBox<String>();
		comboboxUtilisateur.addItem("Etudiant");
		comboboxUtilisateur.addItem("Responsable de Stage");
		comboboxUtilisateur.addItem("Responsable d'ann�e");
		comboboxUtilisateur.addItem("Tuteur");
		
		panelPage.add(comboboxUtilisateur);
		panelPage.add(pseudo);
		panelPage.add(mdp);
		panelPage.add(boutonConnexion);
		
		fenetre.setContentPane(panelPage);
		fenetre.setVisible(true);
	}
	
	public static void main(String[] args){
		Connexion pageConnexion = new Connexion();
	}
}
