package calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CuboBoton  extends Calculadora implements ActionListener 
{	
	public void actionPerformed(ActionEvent e) 
	{
		termino1 = Double.parseDouble(display.getText());
		res = termino1 * termino1 * termino1;
		display.setText(String.valueOf(res));
	}
}
