package calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

class IgualBoton extends Calculadora implements ActionListener 
{
		public void actionPerformed(ActionEvent e)
		{	
			termino1 = Double.parseDouble(displayAux.getText());
			termino2 = Double.parseDouble(display.getText());
			
			//res = 0;
			
			if(op.equals("S"))
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
			else if(op.equals("P"))
			{
				res = termino1 * termino2 / 100;
			}
			display.setText(String.valueOf(res));		
		}
}