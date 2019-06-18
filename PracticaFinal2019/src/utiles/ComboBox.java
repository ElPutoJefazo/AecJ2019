package utiles;

import javax.swing.JComboBox;

import modelo.Especialidad;

public class ComboBox {
	public void rellenarComboBox(JComboBox comboEspecialidad) {
		Especialidad[] values = Especialidad.values();
		for (int i = 0; i < values.length; i++) {
			comboEspecialidad.addItem(values[i]);
		}
	}
}
