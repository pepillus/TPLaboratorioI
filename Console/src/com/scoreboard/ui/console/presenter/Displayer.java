package com.scoreboard.ui.console.presenter;

import java.util.ArrayList;

public class Displayer {
	private String format;
	private String serveFormat;
	private String playerFormat;
	private String matchFormat;
	private String setFormat;
	private String gameFormat;
	private String specialPointFormat;
	
	public Displayer()
	{
		format = "%3s%-30s%3s%5s%3s%5s%3s%5s%3s%5s%3s%5s%3s%5s%3s%5s%1s%n";
		serveFormat = "%1s%1s%1s";
		playerFormat = "%-30s%3s";
		matchFormat = "%5s%3s";
		setFormat = "%5s%3s";
		gameFormat = "%5s%3s";
		specialPointFormat = "%-10s%3s%n";
		format = "%1s%1s%1s%-30s%3s%5s%3s%5s%3s%5s%3s%5s%3s%5s%3s%5s%3s%5s%3s%-10s%3s%n";
	}
	
	private void printHeader()
	{
		System.out.format(format,
				"", "", "",
				"Jugadores", "|",
				"Game", "|",
				"Match", "|",
				"Set 1", "|",
				"Set 2", "|",
				"Set 3", "|",
				"Set 4", "|",
				"Set 5", "|",
				"", "");
				
	}
	public void printScoreBoard(ArrayList<String[]> score) {
		printHeader();
		String[] line_a = new String[score.size()];
		String[] line_b = new String[score.size()];
		
		if(score.size() == 7)
		{
			System.out.format(serveFormat, "", "", "");
			System.out.format(playerFormat, "Jug 1", "|");
			System.out.format(gameFormat, score.get(6)[0], "|");
			System.out.format(matchFormat, score.get(0)[0], "|");
			for(int i = 1; i < 6; i++)
			{
				System.out.format(setFormat, score.get(i)[0], "|");
			}
			System.out.format(specialPointFormat, "", "");
			
			System.out.format(serveFormat, "", "*", "");
			System.out.format(playerFormat, "Otro player", "|");
			System.out.format(gameFormat, score.get(6)[1], "|");
			System.out.format(matchFormat, score.get(0)[1], "|");
			for(int i = 1; i < 6; i++)
			{
				System.out.format(setFormat, score.get(i)[1], "|");
			}
			System.out.format(specialPointFormat, "", "");
		}
	}
}
