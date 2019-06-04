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
		
		JLabel lblDiagnosticoFinal = new JLabel("Diagnostico final");
		lblDiagnosticoFinal.setFont(new Font("Tahoma", Font.BOLD, 25));
		
		JLabel lblNewLabel = new JLabel("Observaciones");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		textObservaciones = new JTextField();
		textObservaciones.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Mensaje");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		txtError = new JTextField();
		txtError.setEditable(false);
		txtError.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Tratamientos");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JButton btnAplicarResultado = new JButton("Aplicar");
		
		JLabel lblDosis = new JLabel("Dosis");
		lblDosis.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		txtDosis = new JTextField();
		txtDosis.setColumns(10);
		
		JLabel lblDuracion = new JLabel("Duracion");
		lblDuracion.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		txtDuracion = new JTextField();
		txtDuracion.setColumns(10);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(textObservaciones, GroupLayout.PREFERRED_SIZE, 334, GroupLayout.PREFERRED_SIZE)
					.addGap(91)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 308, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(lblDuracion)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(txtDuracion, GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE))
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(lblDosis)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(txtDosis, 256, 256, 256))))
					.addGap(94))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(86)
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED, 277, Short.MAX_VALUE)
					.addComponent(lblNewLabel_2)
					.addGap(194))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtError, GroupLayout.PREFERRED_SIZE, 508, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnAplicarResultado, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(137, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(334, Short.MAX_VALUE)
					.addComponent(lblDiagnosticoFinal)
					.addGap(291))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblDiagnosticoFinal)
					.addGap(83)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(lblNewLabel_2))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblDosis)
								.addComponent(txtDosis, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(30)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblDuracion)
								.addComponent(txtDuracion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED, 26, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textObservaciones, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(txtError, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnAplicarResultado))
					.addGap(23))
		);
		contentPane.setLayout(gl_contentPane);
	}

}