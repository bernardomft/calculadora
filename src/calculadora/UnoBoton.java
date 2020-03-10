package calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

class UnoBoton extends Calculadora implements ActionListener 
	{
		JTextField display;
		public UnoBoton() {}
		public UnoBoton(JTextField display) 
		{
			this.display = display;
		}
		public void actionPerformed(ActionEvent e)
		{
			if(this.display.getText().equals("0"))
				this.display.setText("1");
			else
				this.display.setText(display.getText() + "1");
		}
	}

