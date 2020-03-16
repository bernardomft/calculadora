package calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IgualBotonFixed	extends Calculadora implements ActionListener 
	{
		public void actionPerformed(ActionEvent e)
		{	
			termino1 = Double.parseDouble(displayAux.getText());
			termino2 = Double.parseDouble(display.getText());
			
			resFixed = 0;
			double fix = Math.pow(10,Integer.parseInt(displayFixed.getText()));
			if(op.equals("S"))
			{
				resFixed = termino1 + termino2;
				//System.out.println(res);
			}
			else if(op.equals("R"))
			{
				resFixed = termino1 - termino2;
			}
			else if(op.equals("M"))
			{		
				resFixed = termino1 * termino2;
			}
			else if(op.equals("D"))
			{
				resFixed = termino1 / termino2;
			}
			else if(op.equals("P"))
			{
				resFixed = termino1 * termino2 / 100;
			}
			System.out.println("termino1: " + termino1);
			System.out.println("termino2: " + termino2);
			System.out.println("Fix: " + fix);
			System.out.println("Resultado antes de formatear: " + resFixed);
			res = Math.round(resFixed * fix)/fix;
			System.out.println("Resultado despues de formatear: " + resFixed);
			System.out.println("res String;" + Double.toString(resFixed));
			display.setText(String.valueOf(resFixed));	
		}
}

