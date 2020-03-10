package calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

class InvBoton extends Calculadora implements ActionListener 
{
		JTextField display;
		double termino1;
		double termino2;
		double res;
		public InvBoton() {}
		public InvBoton(JTextField display, double n1, double n2) 
		{
			this.termino1 = n1;
			this.termino2 = n2;
			this.display = display;
		}
		public void actionPerformed(ActionEvent e)
		{
			this.termino1 =  Double.parseDouble(display.getText());
			this.res =(1 / termino1) ;
			this.display.setText(String.valueOf(this.res));
		}
}