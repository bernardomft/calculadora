package calculadora;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Calculadora extends JFrame
{
	
	static JTextField display = new JTextField(40);
	static JTextField displayAux = new JTextField(40);
	static JTextField displayFixed = new JTextField(40);
	
	static double termino1 = 0;
	static double termino2 = 0;
	static double res = 0;
	
	static String op = "";
	String mode = new String("NORMAL");
	static JPanel panel = new JPanel();
	static JPanel panelFixed = new JPanel();
	
	static JFrame frame = new JFrame("ULTIMATE CALCULATOR");
	public Calculadora() 
	{
		 	this.termino1 = 0;
			this.termino2 = 0;
			this.res = 0;
			
			this.op = "";
			this.mode = new String("NORMAL");
	}
	
	public static void main(String[] args)
	{
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		
		Botones objBoton = new Botones();
		Paneles objPaneles = new Paneles();
		double aux = 0;
		
		//Panel izqd
		objPaneles.panel2.setLayout(new GridLayout(3,1));
		
		objPaneles.panel2.add(objBoton.normal);
		objPaneles.panel2.add(objBoton.sci);
		
		
		objBoton.fixed.addActionListener(new FixedBoton());
		objPaneles.panel2.add(objBoton.fixed);
		
		frame.add(objPaneles.panel2, BorderLayout.WEST);
		
		//Panel central y botones en modo normal
		display.setText("0");
		
		objPaneles.panel3.add(display);
		frame.add(objPaneles.panel3, BorderLayout.NORTH);
		
		
		panel.setLayout(new GridLayout(7,4));
		
		panel.add(objBoton.uno);
		panel.add(objBoton.dos);
		panel.add(objBoton.tres);
		panel.add(objBoton.cuatro);
		
		panel.add(objBoton.cinco);
		panel.add(objBoton.seis);
		panel.add(objBoton.siete);
		panel.add(objBoton.ocho);
		
		panel.add(objBoton.nueve);
		panel.add(objBoton.cero);
		panel.add(objBoton.c);
		panel.add(objBoton.ac);
		
		panel.add(objBoton.inv);
		panel.add(objBoton.ret);
		panel.add(objBoton.porc);
		panel.add(objBoton.punto);
		
		panel.add(objBoton.cuadrado);
		panel.add(objBoton.raiz);
		panel.add(objBoton.cubo);
		panel.add(objBoton.raizC);
		
		panel.add(objBoton.suma);
		panel.add(objBoton.resta);
		
		panel.add(objBoton.multiplicacion);
		panel.add(objBoton.division);
		panel.add(objBoton.igual);
		
		
		
		/*panelFixed.setLayout(new GridLayout(7,4));
		
		panelFixed.add(objBoton.uno);
		panelFixed.add(objBoton.dos);
		panelFixed.add(objBoton.tres);
		panelFixed.add(objBoton.cuatro);
		
		panelFixed.add(objBoton.cinco);
		panelFixed.add(objBoton.seis);
		panelFixed.add(objBoton.siete);
		panelFixed.add(objBoton.ocho);
		
		panelFixed.add(objBoton.nueve);
		panelFixed.add(objBoton.cero);
		panelFixed.add(objBoton.c);
		panelFixed.add(objBoton.ac);
		
		panelFixed.add(objBoton.inv);
		panelFixed.add(objBoton.ret);
		panelFixed.add(objBoton.porc);
		panelFixed.add(objBoton.punto);
		
		panelFixed.add(objBoton.cuadrado);
		panelFixed.add(objBoton.raiz);
		panelFixed.add(objBoton.cubo);
		panelFixed.add(objBoton.raizC);
		
		panelFixed.add(objBoton.suma);
		panelFixed.add(objBoton.resta);
		
		panelFixed.add(objBoton.multiplicacion);
		panelFixed.add(objBoton.division);
		panelFixed.add(objBoton.igual);
		
		panelFixed.add(new JLabel(""));
		panelFixed.add(displayFixed);
		
		
		panelFixed.setVisible(false);
		*/
		frame.add(panel, BorderLayout.CENTER);
		//frame.add(panelFixed, BorderLayout.CENTER);
		
		
	
		frame.setSize(600,300);
		//frame.pack();
		frame.setBackground(Color.BLACK);
		frame.setLocationRelativeTo(null); 				
		frame.setResizable(false); 						
		frame.setVisible(true); 	
		//System.out.println(mode);
		
		//System.out.println(obj.mode);
	}
	
	
}
