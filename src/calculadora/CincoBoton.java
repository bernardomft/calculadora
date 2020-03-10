package calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

class CincoBoton extends Calculadora implements ActionListener 
{
		JTextField display;
		public CincoBoton() {}
		public CincoBoton(JTextField display) 
		{
			this.display = display;
		}
		public void actionPerformed(ActionEvent e)
		{
			if(this.display.getText().equals("0"))
				this.display.setText("5");
			else
				this.display.setText(display.getText() + "5");
		}
}