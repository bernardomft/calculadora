package calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

class CuatroBoton extends Calculadora implements ActionListener 
{
		JTextField display;
		public CuatroBoton() {}
		public CuatroBoton(JTextField display) 
		{
			this.display = display;
		}
		public void actionPerformed(ActionEvent e)
		{
			if(this.display.getText().equals("0"))
				this.display.setText("4");
			else
				this.display.setText(display.getText() + "4");
		}
}