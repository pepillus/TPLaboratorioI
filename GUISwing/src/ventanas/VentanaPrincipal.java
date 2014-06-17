package ventanas;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VentanaPrincipal extends JFrame 
{
	private JLabel lblPuntos,
					lblGames,
					lblSet1,
					lblSet2,
					lblSet3,
					lblSet4,
					lblSet5,
					lblJugadorUno,
					lblJugadorDos;
					
	
	private JPanel plJugadorUno,
					plPuntosJugadorUno,
					plGameJugadorUno,					
					plSet1JugadorUno,
					plSet2JugadorUno,
					plSet3JugadorUno,
					plSet4JugadorUno,
					plSet5JugadorUno,			
					plJugadorDos,
					plPuntosJugadorDos,
					plGameJugadorDos,					
					plSet1JugadorDos,
					plSet2JugadorDos,
					plSet3JugadorDos,
					plSet4JugadorDos,
					plSet5JugadorDos;
	
	public VentanaPrincipal()//Le pasarias cantidad de sets para settear el layout
	{
		setSize(783, 223);
		setTitle("Tenis");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(3,6));
		add(new JLabel("Jugadores"));
		lblPuntos = new JLabel("Puntos");
		add(lblPuntos);
		lblGames = new JLabel("Games");
		add(lblGames);
		lblSet1 = new JLabel("Set 1");
		add(lblSet1);
		lblSet2 = new JLabel("Set 2");
		add(lblSet2);
		lblSet3 = new JLabel("Set 3");
		add(lblSet3);
		
		plJugadorUno = new JPanel();
		lblJugadorUno = new JLabel("Pepe");
		plJugadorUno.add(lblJugadorUno);
		add(plJugadorUno);
		plPuntosJugadorUno = new JPanel();
		plPuntosJugadorUno.add(new JLabel("0"));	
		add(plPuntosJugadorUno);
		plGameJugadorUno = new JPanel();
		plGameJugadorUno.add(new JLabel("0"));
		add(plGameJugadorUno);
		plSet1JugadorUno = new JPanel();
		plSet1JugadorUno.add(new JLabel("0"));
		add(plSet1JugadorUno);
		plSet2JugadorUno = new JPanel();
		plSet2JugadorUno.add(new JLabel("0"));
		add(plSet2JugadorUno);
		plSet3JugadorUno = new JPanel();
		plSet3JugadorUno.add(new JLabel("0"));
		add(plSet3JugadorUno);
		
		plJugadorDos = new JPanel();
		lblJugadorDos = new JLabel("Coco");
		plJugadorDos.add(lblJugadorDos);
		add(plJugadorDos);
		plPuntosJugadorDos = new JPanel();
		plPuntosJugadorDos.add(new JLabel("0"));	
		add(plPuntosJugadorDos);
		plGameJugadorDos = new JPanel();
		plGameJugadorDos.add(new JLabel("0"));
		add(plGameJugadorDos);
		plSet1JugadorDos = new JPanel();
		plSet1JugadorDos.add(new JLabel("0"));
		add(plSet1JugadorDos);
		plSet2JugadorDos = new JPanel();
		plSet2JugadorDos.add(new JLabel("0"));
		add(plSet2JugadorDos);
		plSet3JugadorDos = new JPanel();
		plSet3JugadorDos.add(new JLabel("0"));
		add(plSet3JugadorDos);
		
//		lblPuntos = new JLabel("0 - 0");
//		add(lblPuntos);
//		lblSet1 = new JLabel("Set 1");
//		add(lblSet1);
//		lblSet2 = new JLabel("Set 2");
//		add(lblSet2);
//		lblSet3 = new JLabel("Set 3");
//		add(lblSet3);
//		lblJugadorUno = new JLabel("Coco");
//		add(lblJugadorUno);
//		lblJugadorDos = new JLabel("Pepe");
//		add(lblJugadorDos);
//		lblGame1 = new JLabel("Game 1");
//		add(lblGame1);
		
				
//		JButton btnJugadorUno = new JButton("Coco");
//		add(btnJugadorUno);
//		JButton btnJugadorDos = new JButton("Pepe");
//		add(btnJugadorDos);
		
//		btnJugadorUno.addActionListener(new ActionListener()
//		{			
//			@Override
//			public void actionPerformed(ActionEvent arg0) {
//				anotarPuntoJugadorUno();
//			}
//		});
	}
	
	private void anotarPuntoJugadorUno()
	{		
		lblPuntos.setText("1 - 0");
	}

}
