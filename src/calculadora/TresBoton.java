package calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

class TresBoton extends Calculadora implements ActionListener 
{
	public void actionPerformed(ActionEvent e)
		{
			if(display.getText().equals("0"))
				display.setText("3");
			else
				display.setText(display.getText() + "3");
		}
}