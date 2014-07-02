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
import java.net.URL;
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
	private JPanel plJugadoresLblFoto,
					plJugadoresLblDatos,
					plGamesLbl,
					plMatchLbl,
					plSet1Lbl,
					plSet2Lbl,
					plSet3Lbl,
					plSet4Lbl,
					plSet5Lbl,
					plJugadorUnoFoto,
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
					plJugadorDosFoto,
					plJugadorDos,
					plGamesJugadorDos,
					plMatchJugadorDos,					
					plSet1JugadorDos,
					plSet2JugadorDos,
					plSet3JugadorDos,
					plSet4JugadorDos,
					plSet5JugadorDos;
	
	private JLabel lblJugadorUno,
					lblFotoJugadorUno,
					gamesJugadorUno,
					matchJugadorUno,
					set1JugadorUno,
					set2JugadorUno,
					set3JugadorUno,
					set4JugadorUno,
					set5JugadorUno,
					lblFotoJugadorDos,
					lblJugadorDos,
					gamesJugadorDos,
					matchJugadorDos,
					set1JugadorDos,
					set2JugadorDos,
					set3JugadorDos,
					set4JugadorDos,
					set5JugadorDos,
					saqueJugadorUno,
					saqueJugadorDos;	
	
	
	public VentanaPrincipal(int sets)//Le pasarias cantidad de sets para settear el layout
	{
		ImageIcon paisJugadorUno = new ImageIcon("C:\\Users\\mperez\\Desktop\\famfamfam_flag_icons\\icons\\png\\ar.png");
		ImageIcon paisJugadorDos = new ImageIcon("C:\\Users\\mperez\\Desktop\\famfamfam_flag_icons\\icons\\png\\cl.png");
		ImageIcon saque = new ImageIcon("C:\\Users\\mperez\\Desktop\\famfamfam_flag_icons\\icons\\png\\sport-tennis-icon.png");
		ImageIcon fotoJugadorUno = new ImageIcon("C:\\Users\\mperez\\Desktop\\Person-Male-Light-icon.png");
		ImageIcon fotoJugadorDos = new ImageIcon("C:\\Users\\mperez\\Desktop\\Age-Child-Male-Dark-icon.png");
		
	    JLabel banderaJugadorUno = new JLabel(paisJugadorUno);
	    JLabel banderaJugadorDos = new JLabel(paisJugadorDos);
	    saqueJugadorUno = new JLabel(saque);
	    saqueJugadorDos = new JLabel(saque);
	    
	    this.sets = sets;	
		mma = new MatchManager();
		mma.newMatch("", sets);
		setSize(1327, 223);
		setTitle("Tenis");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		if(sets == 3)
			setLayout(new GridLayout(3,7));
		else
			setLayout(new GridLayout(3,9));
		
		//Primera Fila
		plJugadoresLblFoto = new JPanel();
		plJugadoresLblDatos = new JPanel();
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
		
		plJugadoresLblFoto.add(new JLabel("Jugadores"));		
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
	
		add(plJugadoresLblFoto);
		add(plJugadoresLblDatos);
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
	
		//Segunda Fila(Datos jugador 1)	
		JButton btnJugadorUno = new JButton("Punto");
		plJugadorUnoFoto = new JPanel();
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
		
		plJugadorUnoFoto.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.GRAY),
																	BorderFactory.createEmptyBorder(1, 1, 1, 0)));
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
		
		lblFotoJugadorUno = new JLabel(fotoJugadorUno);
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
		
		plJugadorUnoFoto.add(lblFotoJugadorUno);
		plGamesJugadorUno.add(gamesJugadorUno);	
		plJugadorUno.add(banderaJugadorUno);
		plJugadorUno.add(lblJugadorUno);
		plJugadorUno.add(btnJugadorUno);		
		plJugadorUno.add(saqueJugadorUno);
		saqueJugadorDos.setVisible(false);
		plMatchJugadorUno.add(matchJugadorUno);
		plSet1JugadorUno.add(set1JugadorUno);
		plSet2JugadorUno.add(set2JugadorUno);
		plSet3JugadorUno.add(set3JugadorUno);
		if(sets > 3)
		{
			plSet4JugadorUno.add(set4JugadorUno);
			plSet5JugadorUno.add(set5JugadorUno);
		}
		
		add(plJugadorUnoFoto);
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
		
		//Tercera Fila (datos jugador 2)
		JButton btnJugadorDos = new JButton("Punto");
		plJugadorDosFoto = new JPanel();
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
		
		plJugadorDosFoto.setBorder(BorderFactory.createLineBorder(Color.GRAY));
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
		
		lblFotoJugadorDos = new JLabel(fotoJugadorDos);
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
		
		plJugadorDosFoto.add(lblFotoJugadorDos);
		plGamesJugadorDos.add(gamesJugadorDos);
		plJugadorDos.add(banderaJugadorDos);
		plJugadorDos.add(lblJugadorDos);
		plJugadorDos.add(btnJugadorDos);
		plJugadorDos.add(saqueJugadorDos);
		plMatchJugadorDos.add(matchJugadorDos);
		plSet1JugadorDos.add(set1JugadorDos);
		plSet2JugadorDos.add(set2JugadorDos);
		plSet3JugadorDos.add(set3JugadorDos);
		if(sets > 3)
		{
			plSet4JugadorDos.add(set4JugadorDos);
			plSet5JugadorDos.add(set5JugadorDos);
		}
		
		add(plJugadorDosFoto);
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
//				if(mma.hasWinner())
//					System.out.println("GANO "+mma.getWinner().getNombre());
			}
		});
		
		btnJugadorDos.addActionListener(new ActionListener()
		{			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				mma.addPoint(false);
				actualizarPartido(mma.getCurrentScore());
//				if(mma.hasWinner())
//					System.out.println("GANO "+mma.getWinner().getNombre());
				 
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
		
		if(gamesJugadorUno.getText().equals("0") && gamesJugadorDos.getText().equals("0"))
		{			
			if(saqueJugadorUno.isVisible())
			{
				saqueJugadorUno.setVisible(false);
				saqueJugadorDos.setVisible(true);
			}
			else
			{
				saqueJugadorUno.setVisible(true);
				saqueJugadorDos.setVisible(false);
			}
		}
	}
}
