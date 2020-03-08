package calculadora;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Calculadora extends JFrame
{
	JButton	uno = new JButton("1");	
	JButton	dos = new JButton("2");
	JButton	tres = new JButton("3");
	JButton	cuatro = new JButton("4");
	JButton	cinco = new JButton("5");
	JButton	seis = new JButton("6");
	JButton	siete = new JButton("7");
	JButton	ocho = new JButton("8");
	
	JButton	nueve = new JButton("9");
	JButton	cero = new JButton("0");
	JButton	c = new JButton("C");
	JButton	ac = new JButton("AC");
	
	JButton	inv = new JButton("1/x");
	JButton	ret = new JButton("R");
	JButton	porc = new JButton("%");
	JButton	punto = new JButton(".");
	
	JButton	cuadrado = new JButton("X^2");
	JButton	raiz = new JButton("raiz^2");
	JButton	cubo = new JButton("X^3");
	JButton	raizC = new JButton("raiz^3");
	
	JButton	suma = new JButton("+");
	JButton	resta = new JButton("-");
	JButton	multiplicacion = new JButton("x");
	JButton	division = new JButton("/");
	JButton	igual = new JButton("=");
	
	
	JButton	normal = new JButton("NORMAL MODE");
	JButton	sci = new JButton("SCI MODE");
	
	JTextField display = new JTextField(40);
	
	JPanel panel = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	
	double termino1 = 0;
	double termino2 = 0;
	double res = 0;
	
	String op;
	

	public Calculadora()
	{
		super("ULTIMATE CALCULATOR");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		panel2.setLayout(new GridLayout(2,1));
		
		panel2.add(normal);
		panel2.add(sci);
		
		add(panel2, BorderLayout.WEST);
		
		display.setText("0");
		
		panel3.add(display);
		add(panel3, BorderLayout.NORTH);
		
		uno.addActionListener(new unoBoton());
		dos.addActionListener(new dosBoton());
		tres.addActionListener(new tresBoton());
		cuatro.addActionListener(new cuatroBoton());
		
		cinco.addActionListener(new cincoBoton());
		seis.addActionListener(new seisBoton());
		siete.addActionListener(new sieteBoton());
		ocho.addActionListener(new ochoBoton());
		
		nueve.addActionListener(new nueveBoton());
		cero.addActionListener(new ceroBoton());
		c.addActionListener(new cBoton());
		ac.addActionListener(new acBoton());
		
		inv.addActionListener(new invBoton());
		ret.addActionListener(new retBoton());
		porc.addActionListener(new porcBoton());
		punto.addActionListener(new puntoBoton());
		
		cuadrado.addActionListener(new cuadradoBoton());
		raiz.addActionListener(new raizBoton());
		cubo.addActionListener(new cuboBoton());
		raizC.addActionListener(new raizCBoton());
		
		suma.addActionListener(new suma());
		resta.addActionListener(new resta());
		multiplicacion.addActionListener(new multiplicacion());
		division.addActionListener(new division());
		igual.addActionListener(new igual());
		
		
		panel.setLayout(new GridLayout(7,4));
		
		panel.add(uno);
		panel.add(dos);
		panel.add(tres);
		panel.add(cuatro);
		
		panel.add(cinco);
		panel.add(seis);
		panel.add(siete);
		panel.add(ocho);
		
		panel.add(nueve);
		panel.add(cero);
		panel.add(c);
		panel.add(ac);
		
		panel.add(inv);
		panel.add(ret);
		panel.add(porc);
		panel.add(punto);
		
		panel.add(cuadrado);
		panel.add(raiz);
		panel.add(cubo);
		panel.add(raizC);
		
		panel.add(suma);
		panel.add(resta);
		
		panel.add(multiplicacion);
		panel.add(division);
		panel.add(igual);
		
		panel.add(new JLabel(""));
		
		panel.add(new JLabel(""));
		
		add(panel, BorderLayout.CENTER);
		setSize(600,300);
		//pack();
		setBackground(Color.BLACK);
		setLocationRelativeTo(null); 				
		setResizable(false); 						
		setVisible(true); 	
	}
	
	public static void main(String[] args)
	{
		Calculadora obj = new Calculadora();
		
	}

	class unoBoton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(display.getText().equals("0"))
				display.setText("1");
			else
				display.setText(display.getText() + "1");
		}
	}
	
	class dosBoton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(display.getText().equals("0"))
				display.setText("2");
			else
				display.setText(display.getText() + "2");
		}
	}
	
	class tresBoton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(display.getText().equals("0"))
				display.setText("3");
			else
				display.setText(display.getText() + "3");
		}
	}
	
	class cuatroBoton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(display.getText().equals("0"))
				display.setText("4");
			else
				display.setText(display.getText() + "4");
		}
	}
	
	class cincoBoton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(display.getText().equals("0"))
				display.setText("5");
			else
				display.setText(display.getText() + "5");
		}
	}
	
	class seisBoton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(display.getText().equals("0"))
				display.setText("6");
			else
				display.setText(display.getText() + "6");
		}
	}
	
	class sieteBoton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(display.getText().equals("0"))
				display.setText("7");
			else
				display.setText(display.getText() + "7");
		}
	}
	
	class ochoBoton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(display.getText().equals("0"))
				display.setText("8");
			else
				display.setText(display.getText() + "8");
		}
	}
	
	class nueveBoton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(display.getText().equals("0"))
				display.setText("9");
			else
				display.setText(display.getText() + "9");
		}
	}
	
	class ceroBoton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(display.getText().equals("0"))
				display.setText("0");
			else
				display.setText(display.getText() + "0");
		}
	}
	
	class cBoton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			display.setText("0");
		}
	}
	
	class acBoton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			display.setText("0");
			termino1 = 0;
			termino2 = 0;
		}
	}
	
	class invBoton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			termino1 =  Double.parseDouble(display.getText());
			res =(1 / termino1) ;
			display.setText(String.valueOf(res));
		}
	}
	
	class retBoton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			termino1 = Double.parseDouble(display.getText());
			display.setText(display.getText().substring(0,display.getText().length()-1));
		}
	}
	
	class porcBoton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			termino1 = Double.parseDouble(display.getText());
			display.setText("");
			op = "%";
		}
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
}
