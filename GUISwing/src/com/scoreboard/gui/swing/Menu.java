package com.scoreboard.gui.swing;

import java.awt.ComponentOrientation;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Menu extends JFrame 
{
	JButton btnStart = new JButton("Comenzar Partido");
	JButton btnExit = new JButton("Salir");
	
	public Menu()
	{
		setSize(199, 141);
		setTitle("Tenis");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new GridLayout(2,1));	
		JButton btnEmpezar = new JButton("Empezar partido");
		JButton btnSalir = new JButton("Salir");
		add(btnEmpezar);
		add(btnSalir);
		
		btnEmpezar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {				 
				 FileChooser fc = new FileChooser();
			}
		});
	}
}
