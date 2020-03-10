package calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

class CBoton extends Calculadora implements ActionListener 
{
	public void actionPerformed(ActionEvent e)
		{
			display.setText("0");
		}
}