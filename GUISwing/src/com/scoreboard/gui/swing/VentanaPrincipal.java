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
import java.util.ArrayList;

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
	MatchManager mma;
	private int sets;
	private JPanel plJugadoresLbl,
					plGamesLbl,
					plMatchLbl,
					plSet1Lbl,
					plSet2Lbl,
					plSet3Lbl,
					plSet4Lbl,
					plSet5Lbl,
					plJugadorUnoLbl,
					plJugadorDosLbl,
					plJugadorUno,
					plGamesJugadorUno,
					plMatchJugadorUno,					
					plSet1JugadorUno,
					plSet2JugadorUno,
					plSet3JugadorUno,
					plSet4JugadorUno,
					plSet5JugadorUno,			
					plJugadorDos,
					plGamesJugadorDos,
					plMatchJugadorDos,					
					plSet1JugadorDos,
					plSet2JugadorDos,
					plSet3JugadorDos,
					plSet4JugadorDos,
					plSet5JugadorDos;
	
	private JLabel lblJugadorUno,
					gamesJugadorUno,
					matchJugadorUno,
					set1JugadorUno,
					set2JugadorUno,
					set3JugadorUno,
					set4JugadorUno,
					set5JugadorUno,
					lblJugadorDos,
					gamesJugadorDos,
					matchJugadorDos,
					set1JugadorDos,
					set2JugadorDos,
					set3JugadorDos,
					set4JugadorDos,
					set5JugadorDos;	
	
	
	public VentanaPrincipal(int sets)//Le pasarias cantidad de sets para settear el layout
	{
		this.sets = sets;	
		mma = new MatchManager();
		mma.newMatch("", sets);
		setSize(783, 223);
		setTitle("Tenis");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		if(sets == 3)
			setLayout(new GridLayout(3,6));
		else
			setLayout(new GridLayout(3,8));
		
		//Primera Fila
		plJugadoresLbl = new JPanel();
		plGamesLbl = new JPanel();
		plMatchLbl = new JPanel();
		plSet1Lbl = new JPanel();
		plSet2Lbl = new JPanel();
		plSet3Lbl = new JPanel();
		if(sets > 3)
		{
			plSet4Lbl = new JPanel();
			plSet5Lbl = new JPanel();
		}
		
		plJugadoresLbl.setBorder(BorderFactory.createLineBorder(Color.black));
		plGamesLbl.setBorder(BorderFactory.createLineBorder(Color.black));
		plMatchLbl.setBorder(BorderFactory.createLineBorder(Color.black));
		plSet1Lbl.setBorder(BorderFactory.createLineBorder(Color.black));
		plSet2Lbl.setBorder(BorderFactory.createLineBorder(Color.black));
		plSet3Lbl.setBorder(BorderFactory.createLineBorder(Color.black));
		if(sets > 3)
		{
			plSet4Lbl.setBorder(BorderFactory.createLineBorder(Color.black));
			plSet5Lbl.setBorder(BorderFactory.createLineBorder(Color.black));
		}
		
		plJugadoresLbl.add(new JLabel("Jugadores"));	
		plGamesLbl.add(new JLabel("Game"));
		plMatchLbl.add(new JLabel("Match"));
		plSet1Lbl.add(new JLabel("Set 1"));
		plSet2Lbl.add(new JLabel("Set 2"));
		plSet3Lbl.add(new JLabel("Set 3"));
		if(sets > 3)
		{
			plSet4Lbl.add(new JLabel("Set 4"));
			plSet5Lbl.add(new JLabel("Set 5"));
		}
	
		add(plJugadoresLbl);		
		add(plGamesLbl);
		add(plMatchLbl);
		add(plSet1Lbl);
		add(plSet2Lbl);
		add(plSet3Lbl);
		if(sets > 3)
		{
			add(plSet4Lbl);
			add(plSet5Lbl);
		}
	
		//Segunda Fila	
		JButton btnJugadorUno = new JButton("Punto");
		plJugadorUno = new JPanel();
		plGamesJugadorUno = new JPanel();
		plMatchJugadorUno = new JPanel();
		plSet1JugadorUno = new JPanel();
		plSet2JugadorUno = new JPanel();
		plSet3JugadorUno = new JPanel();
		if(sets > 3)
		{
			plSet4JugadorUno = new JPanel();
			plSet5JugadorUno = new JPanel();
		}
		
		plJugadorUno.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		plGamesJugadorUno.setBorder(BorderFactory.createLineBorder(Color.black));
		plMatchJugadorUno.setBorder(BorderFactory.createLineBorder(Color.black));
		plSet1JugadorUno.setBorder(BorderFactory.createLineBorder(Color.black));
		plSet2JugadorUno.setBorder(BorderFactory.createLineBorder(Color.black));
		plSet3JugadorUno.setBorder(BorderFactory.createLineBorder(Color.black));
		if(sets > 3)
		{
			plSet4JugadorUno.setBorder(BorderFactory.createLineBorder(Color.black));
			plSet5JugadorUno.setBorder(BorderFactory.createLineBorder(Color.black));
		}
		
		lblJugadorUno = new JLabel("Pepe");
		gamesJugadorUno = new JLabel("0");
		matchJugadorUno = new JLabel("0");
		set1JugadorUno = new JLabel("0");
		set2JugadorUno = new JLabel("0");
		set3JugadorUno = new JLabel("0");
		if(sets > 3)
		{
			set4JugadorUno = new JLabel("0");
			set5JugadorUno = new JLabel("0");
		}
		
		plGamesJugadorUno.add(gamesJugadorUno);	
		plJugadorUno.add(lblJugadorUno);
		plJugadorUno.add(btnJugadorUno);		
		plMatchJugadorUno.add(matchJugadorUno);
		plSet1JugadorUno.add(set1JugadorUno);
		plSet2JugadorUno.add(set2JugadorUno);
		plSet3JugadorUno.add(set3JugadorUno);
		if(sets > 3)
		{
			plSet4JugadorUno.add(set4JugadorUno);
			plSet5JugadorUno.add(set5JugadorUno);
		}
		
		add(plJugadorUno);
		add(plGamesJugadorUno);
		add(plMatchJugadorUno);
		add(plSet1JugadorUno);
		add(plSet2JugadorUno);
		add(plSet3JugadorUno);
		if(sets > 3)
		{
			add(plSet4JugadorUno);
			add(plSet5JugadorUno);
		}
		
		//Tercera Fila
		JButton btnJugadorDos = new JButton("Punto");
		plJugadorDos = new JPanel();
		plGamesJugadorDos = new JPanel();
		plMatchJugadorDos = new JPanel();
		plSet1JugadorDos = new JPanel();
		plSet2JugadorDos = new JPanel();
		plSet3JugadorDos = new JPanel();
		if(sets > 3)
		{
			plSet4JugadorDos = new JPanel();
			plSet5JugadorDos = new JPanel();
		}
		
		plJugadorDos.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		plGamesJugadorDos.setBorder(BorderFactory.createLineBorder(Color.black));
		plMatchJugadorDos.setBorder(BorderFactory.createLineBorder(Color.black));
		plSet1JugadorDos.setBorder(BorderFactory.createLineBorder(Color.black));
		plSet2JugadorDos.setBorder(BorderFactory.createLineBorder(Color.black));
		plSet3JugadorDos.setBorder(BorderFactory.createLineBorder(Color.black));
		if(sets > 3)
		{
			plSet4JugadorDos.setBorder(BorderFactory.createLineBorder(Color.black));
			plSet5JugadorDos.setBorder(BorderFactory.createLineBorder(Color.black));
		}
		
		lblJugadorDos = new JLabel("Coco");
		gamesJugadorDos = new JLabel("0");
		matchJugadorDos = new JLabel("0");
		set1JugadorDos = new JLabel("0");
		set2JugadorDos = new JLabel("0");
		set3JugadorDos = new JLabel("0");
		if(sets > 3)
		{
			set4JugadorDos = new JLabel("0");
			set5JugadorDos = new JLabel("0");
		}
		
		plGamesJugadorDos.add(gamesJugadorDos);
		plJugadorDos.add(lblJugadorDos);
		plJugadorDos.add(btnJugadorDos);
		plMatchJugadorDos.add(matchJugadorDos);
		plSet1JugadorDos.add(set1JugadorDos);
		plSet2JugadorDos.add(set2JugadorDos);
		plSet3JugadorDos.add(set3JugadorDos);
		if(sets > 3)
		{
			plSet4JugadorDos.add(set4JugadorDos);
			plSet5JugadorDos.add(set5JugadorDos);
		}
		
		add(plJugadorDos);
		add(plGamesJugadorDos);
		add(plMatchJugadorDos);
		add(plSet1JugadorDos);
		add(plSet2JugadorDos);
		add(plSet3JugadorDos);
		if(sets > 3)
		{
			add(plSet4JugadorDos);
			add(plSet5JugadorDos);
		}
		
				
		btnJugadorUno.addActionListener(new ActionListener()
		{			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				mma.addPoint(true);
				actualizarPartido(mma.getCurrentScore());
				if(mma.hasWinner())
					System.out.println("GANO "+mma.getWinner().getNombre());
			}
		});
		
		btnJugadorDos.addActionListener(new ActionListener()
		{			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				mma.addPoint(false);
				actualizarPartido(mma.getCurrentScore());
				if(mma.hasWinner())
					System.out.println("GANO "+mma.getWinner().getNombre());
				 
			}
		});	
	}
	
	private void actualizarPartido(ArrayList<String[]> puntajes)
	{	
		if(sets > 3)
		{
			gamesJugadorUno.setText(puntajes.get(6)[0].toString());
			gamesJugadorDos.setText(puntajes.get(6)[1].toString());		
			matchJugadorUno.setText(puntajes.get(0)[0].toString());
			matchJugadorDos.setText(puntajes.get(0)[1].toString());		
			set1JugadorUno.setText(puntajes.get(1)[0].toString());
			set1JugadorDos.setText(puntajes.get(1)[1].toString());		
			set2JugadorUno.setText(puntajes.get(2)[0].toString());
			set2JugadorDos.setText(puntajes.get(2)[1].toString());		
			set3JugadorUno.setText(puntajes.get(3)[0].toString());
			set3JugadorDos.setText(puntajes.get(3)[1].toString());			
			set4JugadorUno.setText(puntajes.get(4)[0].toString());
			set4JugadorDos.setText(puntajes.get(4)[1].toString());		
			set5JugadorUno.setText(puntajes.get(5)[0].toString());
			set5JugadorDos.setText(puntajes.get(5)[1].toString());
		}
		else
		{		
			gamesJugadorUno.setText(puntajes.get(4)[0].toString());
			gamesJugadorDos.setText(puntajes.get(4)[1].toString());		
			matchJugadorUno.setText(puntajes.get(0)[0].toString());
			matchJugadorDos.setText(puntajes.get(0)[1].toString());		
			set1JugadorUno.setText(puntajes.get(1)[0].toString());
			set1JugadorDos.setText(puntajes.get(1)[1].toString());		
			set2JugadorUno.setText(puntajes.get(2)[0].toString());
			set2JugadorDos.setText(puntajes.get(2)[1].toString());		
			set3JugadorUno.setText(puntajes.get(3)[0].toString());
			set3JugadorDos.setText(puntajes.get(3)[1].toString());
		}
		
	}
}
