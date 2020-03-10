package calculadora;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Calculadora extends JFrame
{
	
	static JTextField display = new JTextField(40);
	static JTextField displayAux = new JTextField(40);
	//JTextField displayFixed = new JTextField(1);
	
	static double termino1 = 0;
	static double termino2 = 0;
	static double res = 0;
	
	static String op = "";
	String mode = new String("NORMAL");
	

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
		objPaneles.panel2.add(objBoton.fixed);
		
		//objBoton.uno.addActionListener(new fixedBoton());
		
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
		
		objPaneles.panel.setLayout(new GridLayout(7,4));
		
		objPaneles.panel.add(objBoton.uno);
		objPaneles.panel.add(objBoton.dos);
		objPaneles.panel.add(objBoton.tres);
		objPaneles.panel.add(objBoton.cuatro);
		
		objPaneles.panel.add(objBoton.cinco);
		objPaneles.panel.add(objBoton.seis);
		objPaneles.panel.add(objBoton.siete);
		objPaneles.panel.add(objBoton.ocho);
		
		objPaneles.panel.add(objBoton.nueve);
		objPaneles.panel.add(objBoton.cero);
		objPaneles.panel.add(objBoton.c);
		objPaneles.panel.add(objBoton.ac);
		
		objPaneles.panel.add(objBoton.inv);
		objPaneles.panel.add(objBoton.ret);
		objPaneles.panel.add(objBoton.porc);
		objPaneles.panel.add(objBoton.punto);
		
		objPaneles.panel.add(objBoton.cuadrado);
		objPaneles.panel.add(objBoton.raiz);
		objPaneles.panel.add(objBoton.cubo);
		objPaneles.panel.add(objBoton.raizC);
		
		objPaneles.panel.add(objBoton.suma);
		objPaneles.panel.add(objBoton.resta);
		
		objPaneles.panel.add(objBoton.multiplicacion);
		objPaneles.panel.add(objBoton.division);
		objPaneles.panel.add(objBoton.igual);
		
		objPaneles.panel.add(new JLabel(""));
		
		objPaneles.panel.add(new JLabel(""));
		
		frame.add(objPaneles.panel, BorderLayout.CENTER);
		
		frame.setSize(600,300);
		//pack();
		frame.setBackground(Color.BLACK);
		frame.setLocationRelativeTo(null); 				
		frame.setResizable(false); 						
		frame.setVisible(true); 	
		//System.out.println(mode);
		
		//System.out.println(obj.mode);
	}
	
	class fixedBoton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			mode = "fixed";	
		}
	}
}
