package vista.subpanels;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Botonera extends JPanel {

	private JPanel contentPane;
	public JButton botones[][];
	int anchoPanel=150,altoPanel=150;
	int ladoBoton=50;	
	
	public Botonera(int x,int y) {
		this.setBounds(x, y, 595, 359);
		iniciarBotonera();
	}
	private void iniciarBotonera(){
		this.botones = new JButton[5][4];
		int x=0,y=0;
		for (int i = 0; i < this.botones.length; i++) {
			for (int j = 0; j < this.botones[i].length; j++) {
				this.botones[i][j] = new JButton();
				this.botones[i][j].setName(String.valueOf(i)+String.valueOf(j));
				this.botones[i][j].setBounds(x, y, this.ladoBoton, this.ladoBoton);				
				contentPane.add(this.botones[i][j]);
				x+=this.ladoBoton;
			}
			x=0;
			y+=this.ladoBoton;
		}
	}

}
