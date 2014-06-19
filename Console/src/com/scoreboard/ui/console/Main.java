package com.scoreboard.ui.console;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;

import com.scoreboard.managers.*;
import com.scoreboard.utils.*;
import com.scoreboard.ui.console.presenter.*;

public class Main {

	static Displayer d = new Displayer();
	static MatchManager mm = new MatchManager();
	
	private static char leerChar() {
		try {
			return (char) System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return (char) 0;
	}

	public static void main(String[] args) {
		// Board board = new Board();
		System.out.println("test");
		mm.newMatch("asd", 5);
		
		char c = 0; 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		// read characters 
		do { 
			try {
				c = (char) br.read();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			if(c == '1')
			{
				mm.addPoint(true);
				d.printScoreBoard(mm.getCurrentScore());
			}
			if(c == '2')
			{
				mm.addPoint(false);
				d.printScoreBoard(mm.getCurrentScore());
			}
		} while(c != 'q');
		mm.saveMatch();
	}

}
