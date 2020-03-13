package calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

class InvBoton extends Calculadora implements ActionListener 
{
		public void actionPerformed(ActionEvent e)
		{
			termino1 =  Double.parseDouble(display.getText());
			res =(1 / termino1) ;
			display.setText(String.valueOf(this.res));
		}
}