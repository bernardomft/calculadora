package calculadora;

import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingUtilities;

public  class FixedBoton extends Calculadora implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
		panel.setVisible(false);
	}
}
