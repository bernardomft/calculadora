package calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

class NueveBoton extends Calculadora implements ActionListener 
{
		JTextField display;
		public NueveBoton() {}
		public NueveBoton(JTextField display) 
		{
			this.display = display;
		}
		public void actionPerformed(ActionEvent e)
		{
			if(this.display.getText().equals("0"))
				this.display.setText("9");
			else
				this.display.setText(display.getText() + "9");
		}
}