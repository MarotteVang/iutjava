package projet.Frame;
import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class PanelSaisie extends JPanel{
	JLabel l ;
	JTextField p;
	JPasswordField m;
	
	PanelSaisie(String s, boolean mdp){
		if(mdp){
			l = new JLabel (s);
			m = new JPasswordField (30);
		
			this.add(l);
			this.add(m);
		}
		else{
			l = new JLabel (s);
			p = new JTextField (30);
		
			this.add(l);
			this.add(p);
		}
	}

	public JTextField getP() {
		return p;
	}

	public void setP(JTextField p) {
		this.p = p;
	}

	
}
