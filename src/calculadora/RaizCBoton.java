package calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RaizCBoton extends Calculadora implements ActionListener 
{	
	public void actionPerformed(ActionEvent e) 
	{
		termino1 = Double.parseDouble(display.getText());
		res = Math.cbrt(termino1);
		display.setText(String.valueOf(res));
	}
}