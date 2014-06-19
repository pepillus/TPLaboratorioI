package com.scoreboard.gui.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

import com.scoreboard.managers.MatchManager;

public class VentanaPrincipal extends JFrame 
{	
	private JPanel plJugadoresLbl,
					plPuntosLbl,
					plGamesLbl,
					plSet1Lbl,
					plSet2Lbl,
					plSet3Lbl,
					plSet4Lbl,
					plSet5Lbl,
					plJugadorUnoLbl,
					plJugadorDosLbl,
					plJugadorUno,
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
		
		//Primera Fila
		plJugadoresLbl = new JPanel();
		plPuntosLbl = new JPanel();
		plGamesLbl = new JPanel();
		plSet1Lbl = new JPanel();
		plSet2Lbl = new JPanel();
		plSet3Lbl = new JPanel();
		//plSet4Lbl = new JPanel();
		//plSet5Lbl = new JPanel();
		
		plJugadoresLbl.setBorder(BorderFactory.createLineBorder(Color.black));
		plPuntosLbl.setBorder(BorderFactory.createLineBorder(Color.black));
		plGamesLbl.setBorder(BorderFactory.createLineBorder(Color.black));
		plSet1Lbl.setBorder(BorderFactory.createLineBorder(Color.black));
		plSet2Lbl.setBorder(BorderFactory.createLineBorder(Color.black));
		plSet3Lbl.setBorder(BorderFactory.createLineBorder(Color.black));
		//plSet4Lbl.setBorder(BorderFactory.createLineBorder(Color.black));
		//plSet5Lbl.setBorder(BorderFactory.createLineBorder(Color.black));
		
		plJugadoresLbl.add(new JLabel("Jugadores"));	
		plPuntosLbl.add(new JLabel("Puntos"));
		plGamesLbl.add(new JLabel("Games"));
		plSet1Lbl.add(new JLabel("Set 1"));
		plSet2Lbl.add(new JLabel("Set 2"));
		plSet3Lbl.add(new JLabel("Set 3"));
		//plSet4Lbl.add(new JLabel("Set 4"));
		//plSet5Lbl.add(new JLabel("Set 5"));
	
		add(plJugadoresLbl);		
		add(plPuntosLbl);
		add(plGamesLbl);
		add(plSet1Lbl);
		add(plSet2Lbl);
		add(plSet3Lbl);
		//add(plSet4Lbl);
		//add(plSet5Lbl);
	
		//Segunda Fila	
		JButton btnJugadorUno = new JButton("Punto");
		plJugadorUno = new JPanel();
		plPuntosJugadorUno = new JPanel();
		plGameJugadorUno = new JPanel();
		plSet1JugadorUno = new JPanel();
		plSet2JugadorUno = new JPanel();
		plSet3JugadorUno = new JPanel();
		//plSet4JugadorUno = new JPanel();
		//plSet5JugadorUno = new JPanel();
		
		plJugadorUno.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		plPuntosJugadorUno.setBorder(BorderFactory.createLineBorder(Color.black));
		plGameJugadorUno.setBorder(BorderFactory.createLineBorder(Color.black));
		plSet1JugadorUno.setBorder(BorderFactory.createLineBorder(Color.black));
		plSet2JugadorUno.setBorder(BorderFactory.createLineBorder(Color.black));
		plSet3JugadorUno.setBorder(BorderFactory.createLineBorder(Color.black));
		//plSet4JugadorUno.setBorder(BorderFactory.createLineBorder(Color.black));
		//plSet5JugadorUno.setBorder(BorderFactory.createLineBorder(Color.black));
		
		JLabel lblJugadorUno = new JLabel("Pepe");
		JLabel puntosJugadorUno = new JLabel("0");
		JLabel gamesJugadorUno = new JLabel("0");
		JLabel set1JugadorUno = new JLabel("0");
		JLabel set2JugadorUno = new JLabel("0");
		JLabel set3JugadorUno = new JLabel("0");
		//JLabel set4JugadorUno = new JLabel("0");
		//JLabel set5JugadorUno = new JLabel("0");		
		
		plPuntosJugadorUno.add(puntosJugadorUno);	
		plJugadorUno.add(lblJugadorUno);
		plJugadorUno.add(btnJugadorUno);		
		plGameJugadorUno.add(gamesJugadorUno);
		plSet1JugadorUno.add(set1JugadorUno);
		plSet2JugadorUno.add(set2JugadorUno);
		plSet3JugadorUno.add(set3JugadorUno);
		//plSet4JugadorUno.add(set4JugadorUno);
		//plSet5JugadorUno.add(set5JugadorUno);		
		
		add(plJugadorUno);
		add(plPuntosJugadorUno);
		add(plGameJugadorUno);
		add(plSet1JugadorUno);
		add(plSet2JugadorUno);
		add(plSet3JugadorUno);
		//add(plSet4JugadorUno);
		//add(plSet5JugadorUno);
		
		//Tercera Fila
		JButton btnJugadorDos = new JButton("Punto");
		plJugadorDos = new JPanel();
		plPuntosJugadorDos = new JPanel();
		plGameJugadorDos = new JPanel();
		plSet1JugadorDos = new JPanel();
		plSet2JugadorDos = new JPanel();
		plSet3JugadorDos = new JPanel();
		//plSet4JugadorDos = new JPanel();
		//plSet5JugadorDos = new JPanel();
		
		plJugadorDos.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		plPuntosJugadorDos.setBorder(BorderFactory.createLineBorder(Color.black));
		plGameJugadorDos.setBorder(BorderFactory.createLineBorder(Color.black));
		plSet1JugadorDos.setBorder(BorderFactory.createLineBorder(Color.black));
		plSet2JugadorDos.setBorder(BorderFactory.createLineBorder(Color.black));
		plSet3JugadorDos.setBorder(BorderFactory.createLineBorder(Color.black));
		//plSet4JugadorDos.setBorder(BorderFactory.createLineBorder(Color.black));
		//plSet5JugadorDos.setBorder(BorderFactory.createLineBorder(Color.black));
		
		JLabel lblJugadorDos = new JLabel("Coco");
		JLabel puntosJugadorDos = new JLabel("0");
		JLabel gamesJugadorDos = new JLabel("0");
		JLabel set1JugadorDos = new JLabel("0");
		JLabel set2JugadorDos = new JLabel("0");
		JLabel set3JugadorDos = new JLabel("0");
		//JLabel set4JugadorDos = new JLabel("0");
		//JLabel set5JugadorDos = new JLabel("0");		
		
		plPuntosJugadorDos.add(puntosJugadorDos);
		plJugadorDos.add(lblJugadorDos);
		plJugadorDos.add(btnJugadorDos);
		plGameJugadorDos.add(gamesJugadorDos);
		plSet1JugadorDos.add(set1JugadorDos);
		plSet2JugadorDos.add(set2JugadorDos);
		plSet3JugadorDos.add(set3JugadorDos);
		//plSet4JugadorUno.add(set4JugadorDos);
		//plSet5JugadorUno.add(set5JugadorDos);		
		
		add(plJugadorDos);
		add(plPuntosJugadorDos);
		add(plGameJugadorDos);
		add(plSet1JugadorDos);
		add(plSet2JugadorDos);
		add(plSet3JugadorDos);
		//add(plSet4JugadorDos);
		//add(plSet5JugadorDos);
		
				
		btnJugadorUno.addActionListener(new ActionListener()
		{			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				MatchManager mm = new MatchManager();
				mm.addPoint(true);
				actualizarPartido();
			}
		});
		
		btnJugadorDos.addActionListener(new ActionListener()
		{			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				MatchManager mm = new MatchManager();
				mm.newMatch("C:\\", 3);
				mm.addPoint(false);
				actualizarPartido();
			}
		});	
	}
	
	private void actualizarPartido()
	{		
		
	}

}
