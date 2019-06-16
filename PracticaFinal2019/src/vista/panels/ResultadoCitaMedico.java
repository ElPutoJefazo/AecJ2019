package vista.panels;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.GridLayout;

public class ResultadoCitaMedico extends JPanel {

	private JPanel contentPane;
	private JTextField textObservaciones;
	private JTextField txtError;
	private JTextField textField;
	private JTextField txtDosis;
	private JTextField txtDuracion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ResultadoCitaMedico frame = new ResultadoCitaMedico();
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
	public ResultadoCitaMedico() {
		setBounds(100, 100, 863, 585);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		JLabel lblNewLabel = new JLabel("Observaciones");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JLabel lblNewLabel_1 = new JLabel("Mensaje");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		txtError = new JTextField();
		txtError.setEditable(false);
		txtError.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Tratamientos");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblDiagnosticoFinal = new JLabel("Diagnostico final");
		lblDiagnosticoFinal.setFont(new Font("Tahoma", Font.BOLD, 25));
		contentPane.add(lblDiagnosticoFinal);
		
		JLabel lblNewLabel_3 = new JLabel("");
		contentPane.add(lblNewLabel_3);
		contentPane.add(lblNewLabel);
		contentPane.add(lblNewLabel_2);
		
		textObservaciones = new JTextField();
		textObservaciones.setColumns(10);
		contentPane.add(textObservaciones);
		
		textField = new JTextField();
		textField.setColumns(10);
		contentPane.add(textField);
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		
		JLabel lblDosis = new JLabel("Dosis");
		panel.add(lblDosis);
		lblDosis.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		txtDosis = new JTextField();
		panel.add(txtDosis);
		txtDosis.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		
		JLabel lblDuracion = new JLabel("Duracion");
		panel_1.add(lblDuracion);
		lblDuracion.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		txtDuracion = new JTextField();
		panel_1.add(txtDuracion);
		txtDuracion.setColumns(10);
		contentPane.add(lblNewLabel_1);
		contentPane.add(txtError);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		
		JButton btnAplicarResultado = new JButton("Aplicar");
		panel_2.add(btnAplicarResultado);
	}

}