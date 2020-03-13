package calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

class SieteBoton extends Calculadora implements ActionListener 
{
	public void actionPerformed(ActionEvent e)
	{
			if(display.getText().equals("0"))
				display.setText("7");
			else
				display.setText(display.getText() + "7");
	}
}