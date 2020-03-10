package calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

class AcBoton extends Calculadora implements ActionListener 
{
		JTextField display;
		double termino1;
		double termino2;
		public AcBoton() {}
		public AcBoton(JTextField display, double n1, double n2) 
		{
			this.termino1 = n1;
			this.termino2 = n2;
			this.display = display;
		}
		public void actionPerformed(ActionEvent e)
		{
			this.display.setText("0");
			this.termino1 = 0;
			this.termino2 = 0;
		}
}