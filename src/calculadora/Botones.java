package calculadora;

import javax.swing.JButton;

public class Botones 
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
	
	
	static JButton	normal = new JButton("NORMAL MODE");
	static JButton	fixed = new JButton("FIXED MODE");
	static JButton	sci = new JButton("SCI MODE");
	
	public Botones()
	{
		uno.addActionListener(new UnoBoton());
		dos.addActionListener(new DosBoton());
		tres.addActionListener(new TresBoton());
		cuatro.addActionListener(new CuatroBoton());
		
		cinco.addActionListener(new CincoBoton());
		seis.addActionListener(new SeisBoton());
		siete.addActionListener(new SieteBoton());
		ocho.addActionListener(new OchoBoton());
		
		nueve.addActionListener(new NueveBoton());
		cero.addActionListener(new CeroBoton());
		c.addActionListener(new CBoton());
		ac.addActionListener(new AcBoton());
		
		inv.addActionListener(new InvBoton());
		ret.addActionListener(new RetBoton());
		porc.addActionListener(new PorcBoton());
		punto.addActionListener(new PuntoBoton());
		
		cuadrado.addActionListener(new CuadradoBoton());
		raiz.addActionListener(new RaizBoton());
		cubo.addActionListener(new CuboBoton());
		raizC.addActionListener(new RaizCBoton());
		
		suma.addActionListener(new SumaBoton());
		resta.addActionListener(new RestaBoton());
		multiplicacion.addActionListener(new MultiplicacionBoton());
		division.addActionListener(new DivisionBoton());
		
		igual.addActionListener(new IgualBoton());
		normal.addActionListener(new NormalBoton());
	}
	public static void main(String[] args)
	{
		
	}
}
