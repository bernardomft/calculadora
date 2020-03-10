package calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

class PorcBoton extends Calculadora implements ActionListener 
{
		JTextField display;
		double termino1;
		double termino2;
		double res;
		public PorcBoton() {}
		public PorcBoton(JTextField display, double n1, Calculadora obj) 
		{
			this.display = display;
			//System.out.println(this.display.getText());
			obj.termino1 = this.termino1;
			//System.out.println(obj.termino1);
			obj.op="P";
		}
		public void actionPerformed(ActionEvent e)
		{
			this.termino1 = Double.parseDouble(display.getText());
			display.setText("");
		}
}