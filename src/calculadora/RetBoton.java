package calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

class RetBoton extends Calculadora implements ActionListener 
{
		JTextField display;
		double termino1;
		double termino2;
		double res;
		public RetBoton() {}
		public RetBoton(JTextField display, double n1) 
		{
			this.termino1 = n1;
			this.display = display;
		}
		public void actionPerformed(ActionEvent e)
		{
			termino1 = Double.parseDouble(display.getText());
			display.setText(display.getText().substring(0,display.getText().length()-1));
		}
}