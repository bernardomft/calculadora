package calculadora;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Calculadora extends JFrame
{
	
	static JTextField display = new JTextField(40);
	JTextField displayFixed = new JTextField(1);
	
	double termino1 = 0;
	double termino2 = 0;
	double res = 0;
	
	String op;
	String mode = new String("NORMAL");
	

	public Calculadora() {}
	
	public static void main(String[] args)
	{
		Calculadora obj = new Calculadora();
		JFrame frame = new JFrame("ULTIMATE CALCULATOR");
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		
		Botones objBoton = new Botones();
		Paneles objPaneles = new Paneles();
		
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
		
		objBoton.uno.addActionListener(new UnoBoton(display));
		objBoton.dos.addActionListener(new DosBoton(display));
		objBoton.tres.addActionListener(new TresBoton(display));
		objBoton.cuatro.addActionListener(new CuatroBoton(display));
		
		objBoton.cinco.addActionListener(new CincoBoton(display));
		objBoton.seis.addActionListener(new SeisBoton(display));
		objBoton.siete.addActionListener(new SieteBoton(display));
		objBoton.ocho.addActionListener(new OchoBoton(display));
		
		objBoton.nueve.addActionListener(new NueveBoton(display));
		objBoton.cero.addActionListener(new CeroBoton(display));
		objBoton.c.addActionListener(new CBoton(display));
		objBoton.ac.addActionListener(new AcBoton(display,obj.termino1,obj.termino2));
		
		objBoton.inv.addActionListener(new InvBoton(display,obj.termino1,obj.termino2));
		objBoton.ret.addActionListener(new RetBoton(display,obj.termino1));
		objBoton.porc.addActionListener(new PorcBoton(display, obj.termino1,obj));
		/*objBoton.punto.addActionListener(new puntoBoton());
		
		objBoton.cuadrado.addActionListener(new cuadradoBoton());
		objBoton.raiz.addActionListener(new raizBoton());
		objBoton.cubo.addActionListener(new cuboBoton());
		objBoton.raizC.addActionListener(new raizCBoton());
		
		objBoton.suma.addActionListener(new suma());
		objBoton.resta.addActionListener(new resta());
		objBoton.multiplicacion.addActionListener(new multiplicacion());
		objBoton.division.addActionListener(new division());
		*/
		objBoton.igual.addActionListener(new IgualBoton(display,obj));
		
		
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
	
	
	class puntoBoton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			display.setText(display.getText() + ".");
		}
	}
	
	class cuadradoBoton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			termino1 = Double.parseDouble(display.getText());
			res = termino1 * termino1;
			display.setText(String.valueOf(res));
		}
	}
	
	class raizBoton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			termino1 = Double.parseDouble(display.getText());
			res = Math.sqrt(termino1);
			display.setText(String.valueOf(res));
		}
	}
	
	class cuboBoton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			termino1 = Double.parseDouble(display.getText());
			res = termino1 * termino1 * termino1;
			display.setText(String.valueOf(res));
		}
	}
	
	class raizCBoton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			termino1 = Double.parseDouble(display.getText());
			res = Math.cbrt(termino1);
			display.setText(String.valueOf(res));
		}
	}
	
	class suma implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			termino1 = Math.round( Double.parseDouble(display.getText())*100)/100;
			display.setText("");
			op = "S";
		}
	}
	
	class resta implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			termino1 = Math.round( Double.parseDouble(display.getText())*100)/100;
			display.setText("");
			op = "R";
		}
	}
	
	class multiplicacion implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			termino1 = Math.round( Double.parseDouble(display.getText())*100)/100;
			display.setText("");
			op = "M";
		}
	}
	
	class division implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			termino1 = Math.round( Double.parseDouble(display.getText())*100)/100;
			display.setText("");
			op = "D";
		}
	}
	
	class igual implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			termino2 = Double.parseDouble(display.getText());
			if(op.equals("S"))
			{
				res = termino1 + termino2;
			}
			else if(op.equals("R"))
			{
				res = termino1 - termino2;
			}
			else if(op.equals("M"))
			{
				res = termino1 * termino2;
			}
			else if(op.equals("D"))
			{
				res = termino1 / termino2;
			}
			else if(op.equals("%"))
			{
				res = termino1 * termino2 / 100;
			}
			//if(res == 0.00)
				//display.setText("0");
			display.setText(String.valueOf(res));
		}
	}
	
	class fixedBoton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			mode = "fixed";	
		}
	}
}
