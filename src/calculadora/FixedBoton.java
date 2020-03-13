package calculadora;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public  class FixedBoton extends Calculadora implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
		mode = "F";
		Botones objBoton2 = new Botones();
		panelFixed.removeAll();
		panelFixed.setLayout(new GridLayout(7,4));
		
		panelFixed.add(objBoton2.uno);
		panelFixed.add(objBoton2.dos);
		panelFixed.add(objBoton2.tres);
		panelFixed.add(objBoton2.cuatro);
		
		panelFixed.add(objBoton2.cinco);
		panelFixed.add(objBoton2.seis);
		panelFixed.add(objBoton2.siete);
		panelFixed.add(objBoton2.ocho);
		
		panelFixed.add(objBoton2.nueve);
		panelFixed.add(objBoton2.cero);
		panelFixed.add(objBoton2.c);
		panelFixed.add(objBoton2.ac);
		
		panelFixed.add(objBoton2.inv);
		panelFixed.add(objBoton2.ret);
		panelFixed.add(objBoton2.porc);
		panelFixed.add(objBoton2.punto);
		
		panelFixed.add(objBoton2.cuadrado);
		panelFixed.add(objBoton2.raiz);
		panelFixed.add(objBoton2.cubo);
		panelFixed.add(objBoton2.raizC);
		
		panelFixed.add(objBoton2.suma);
		panelFixed.add(objBoton2.resta);
		
		panelFixed.add(objBoton2.multiplicacion);
		panelFixed.add(objBoton2.division);
		panelFixed.add(objBoton2.igual);
		
		panelFixed.add(new JLabel(""));
		panelFixed.add(displayFixed);
		
		panel.setVisible(false);
		panelFixed.setVisible(true);
		
		frame.add(panelFixed, BorderLayout.CENTER);
	}
}
