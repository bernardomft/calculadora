package calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

class PorcBoton extends Calculadora implements ActionListener 
{
		public void actionPerformed(ActionEvent e)
		{
			displayAux.setText(display.getText());;
			display.setText("");
			op = "P";
		}
}