package calculadora;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Calculadora extends JFrame
{
	
	static JTextField display = new JTextField(40);
	static JTextField displayAux = new JTextField(40);
	
	static double termino1 = 0;
	static double termino2 = 0;
	static double res = 0;
	
	static String op = "";
	String mode = new String("NORMAL");
	static JPanel panel = new JPanel();
	

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
		Calculadora obj = new Calculadora();
		JFrame frame = new JFrame("ULTIMATE CALCULATOR");
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
		obj.display.setText("0");
		
		objPaneles.panel3.add(obj.display);
		frame.add(objPaneles.panel3, BorderLayout.NORTH);
		
		objBoton.uno.addActionListener(new UnoBoton());
		objBoton.dos.addActionListener(new DosBoton());
		objBoton.tres.addActionListener(new TresBoton());
		objBoton.cuatro.addActionListener(new CuatroBoton());
		
		objBoton.cinco.addActionListener(new CincoBoton());
		objBoton.seis.addActionListener(new SeisBoton());
		objBoton.siete.addActionListener(new SieteBoton());
		objBoton.ocho.addActionListener(new OchoBoton());
		
		objBoton.nueve.addActionListener(new NueveBoton());
		objBoton.cero.addActionListener(new CeroBoton());
		objBoton.c.addActionListener(new CBoton());
		objBoton.ac.addActionListener(new AcBoton());
		
		objBoton.inv.addActionListener(new InvBoton());
		objBoton.ret.addActionListener(new RetBoton());
		objBoton.porc.addActionListener(new PorcBoton());
		objBoton.punto.addActionListener(new PuntoBoton());
		
		objBoton.cuadrado.addActionListener(new CuadradoBoton());
		objBoton.raiz.addActionListener(new RaizBoton());
		objBoton.cubo.addActionListener(new CuboBoton());
		objBoton.raizC.addActionListener(new RaizCBoton());
		
		objBoton.suma.addActionListener(new SumaBoton());
		objBoton.resta.addActionListener(new RestaBoton());
		objBoton.multiplicacion.addActionListener(new MultiplicacionBoton());
		objBoton.division.addActionListener(new DivisionBoton());
		
		objBoton.igual.addActionListener(new IgualBoton());
		
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
		
		panel.add(new JLabel(""));
		
		panel.add(new JLabel(""));
		
		frame.add(panel, BorderLayout.CENTER);
		
		//Ahora tengo que cerrar el panel y colocar el panel fixed.
		
		frame.setSize(600,300);
		//pack();
		frame.setBackground(Color.BLACK);
		frame.setLocationRelativeTo(null); 				
		frame.setResizable(false); 						
		frame.setVisible(true); 	
		//System.out.println(mode);
		
		//System.out.println(obj.mode);
	}
	
	
}
