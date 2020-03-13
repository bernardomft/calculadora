package calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RaizBoton  extends Calculadora implements ActionListener 
{

	public void actionPerformed(ActionEvent e) 
	{
		termino1 = Double.parseDouble(display.getText());
		res = Math.sqrt(termino1);
		display.setText(String.valueOf(res));
	}
}
