package calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

class DosBoton extends Calculadora implements ActionListener 
{
		JTextField display;
		public DosBoton() {}
		public DosBoton(JTextField display) 
		{
			this.display = display;
		}
		public void actionPerformed(ActionEvent e)
		{
			if(this.display.getText().equals("0"))
				this.display.setText("2");
			else
				this.display.setText(display.getText() + "2");
		}
}

