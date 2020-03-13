package calculadora;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class NormalBoton extends Calculadora implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
		//Botones objBoton3 = new Botones();
		
		panelFixed.setVisible(false);
		panel.setVisible(true);
		
	}
}
