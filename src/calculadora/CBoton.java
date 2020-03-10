package calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

class CBoton extends Calculadora implements ActionListener 
{
		JTextField display;
		public CBoton() {}
		public CBoton(JTextField display) 
		{
			this.display = display;
		}
		public void actionPerformed(ActionEvent e)
		{
			this.display.setText("0");
		}
}