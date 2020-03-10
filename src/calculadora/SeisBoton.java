package calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

class SeisBoton extends Calculadora implements ActionListener 
{
		JTextField display;
		public SeisBoton() {}
		public SeisBoton(JTextField display) 
		{
			this.display = display;
		}
		public void actionPerformed(ActionEvent e)
		{
			if(this.display.getText().equals("0"))
				this.display.setText("6");
			else
				this.display.setText(display.getText() + "6");
		}
}