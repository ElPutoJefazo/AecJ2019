package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JToolBar;
import javax.swing.JDesktopPane;
import javax.swing.JToggleButton;
import javax.swing.JList;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Try1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Try1 frame = new Try1();
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
	public Try1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 749, 606);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBienvenidosAlHospital = new JLabel("Bienvenidos al Hospital Mala Fe");
		lblBienvenidosAlHospital.setBounds(120, 235, 521, 69);
		contentPane.add(lblBienvenidosAlHospital);
		lblBienvenidosAlHospital.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		JToggleButton Pacientebtn = new JToggleButton("Paciente");
		Pacientebtn.setBounds(12, 89, 137, 25);
		contentPane.add(Pacientebtn);
		
		JToggleButton Medicobtn = new JToggleButton("Medico");
		Medicobtn.setBounds(129, 70, 137, 25);
		contentPane.add(Medicobtn);
		
		JToggleButton operacionbtn = new JToggleButton("Operaciones");
		operacionbtn.setBounds(278, 70, 137, 25);
		contentPane.add(operacionbtn);
		
		JMenu mnHola = new JMenu("hola");
		mnHola.setBounds(0, 0, 123, 24);
		contentPane.add(mnHola);
		
		JMenuItem mntmMainYuumi = new JMenuItem("Main Yuumi");
		mnHola.add(mntmMainYuumi);
	}
}
