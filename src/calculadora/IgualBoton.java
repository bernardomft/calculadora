package calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

class IgualBoton extends Calculadora implements ActionListener 
{
		JTextField display;
		double termino1;
		double termino2;
		double res;
		String op;
		public IgualBoton() {}
		public IgualBoton(JTextField display, Calculadora obj) 
		{
			this.termino1 = obj.termino1;
			//this.termino2 = obj.termino2;
			this.display = display;
			this.op = obj.op;
			
		}
		public void actionPerformed(ActionEvent e)
		{	
			termino2 = Double.parseDouble(display.getText());
			/*if(op.equals("S"))
			{
				res = termino1 + termino2;
			}
			else if(op.equals("R"))
			{
				res = termino1 - termino2;
			}
			else if(op.equals("M"))
			{
				res = termino1 * termino2;
			}
			else if(op.equals("D"))
			{
				res = termino1 / termino2;
			}
			else*/ if(op.equals("P"))
			{
				res = termino1 * termino2 / 100;
			}
			//if(res == 0.00)
				//display.setText("0");
			System.out.println(termino1);
			System.out.println(termino2);
			System.out.println(res);
			System.out.println(op);
			display.setText(String.valueOf(res));		
		}
}