package calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

class SieteBoton extends Calculadora implements ActionListener 
{
		JTextField display;
		public SieteBoton() {}
		public SieteBoton(JTextField display) 
		{
			this.display = display;
		}
		public void actionPerformed(ActionEvent e)
		{
			if(this.display.getText().equals("0"))
				this.display.setText("7");
			else
				this.display.setText(display.getText() + "7");
		}
}