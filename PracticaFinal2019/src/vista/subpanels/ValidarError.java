package vista.subpanels;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;

public class ValidarError extends JPanel {
	JPanel panelValidarError = new JPanel();
	JLabel lblErrorAlIntentar = new JLabel();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ValidarError frame = new ValidarError();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ValidarError() {
		panelValidarError.setLayout(new BorderLayout(0, 0));
		lblErrorAlIntentar = new JLabel("Error al intentar validar porque algun valor esta mal puesto");
		lblErrorAlIntentar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panelValidarError.add(lblErrorAlIntentar);
	}

	public JLabel getLblErrorAlIntentar() {
		return lblErrorAlIntentar;
	}

	public void setLblErrorAlIntentar(JLabel lblErrorAlIntentar) {
		this.lblErrorAlIntentar = lblErrorAlIntentar;
	}

	public JPanel getPanelValidarError() {
		return panelValidarError;
	}
}
