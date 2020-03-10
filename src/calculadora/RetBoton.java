package calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

class RetBoton extends Calculadora implements ActionListener 
{
		public void actionPerformed(ActionEvent e)
		{
			termino1 = Double.parseDouble(display.getText());
			display.setText(display.getText().substring(0,display.getText().length()-1));
		}
}