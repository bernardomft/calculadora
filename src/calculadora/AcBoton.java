package calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

class AcBoton extends Calculadora implements ActionListener 
{
	public void actionPerformed(ActionEvent e)
	{
			display.setText("0");
			termino1 = 0;
			termino2 = 0;
	}
}