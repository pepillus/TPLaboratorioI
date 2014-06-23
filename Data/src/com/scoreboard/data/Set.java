package com.scoreboard.data;

import com.scoreboard.interfaces.ISavable;
import com.scoreboard.utils.exceptions.ParseFileException;

public class Set extends PartialScore implements ISavable {
	private Boolean isFifth;
	private Game currentGame;

	public Boolean getIsFifth() {
		return isFifth;
	}

	public void setIsFifth(Boolean isFifth) {
		this.isFifth = isFifth;
	}

	public Game getCurrentGame() {
		return currentGame;
	}

	public void setCurrentGame(Game currentGame) {
		this.currentGame = currentGame;
	}

	public Set(Boolean isFifth) {
		this.isFifth = isFifth;
		currentGame = new Game(false);
	}

	public Boolean playerWon(Boolean isPlayerA) {
		if(getScoreByPlayer(isPlayerA) > 6 && !isFifth)
			return true;
		if ((getScoreByPlayer(isPlayerA) > 5)
				&& (getScoreByPlayer(isPlayerA) > (getScoreByPlayer(!isPlayerA) + 1)))
			return true;
		else
			return false;
	}

	public void addPoint(Boolean isPlayerA) {
		super.addPoint(isPlayerA);
		currentGame = new Game(
				(!isFifth)
						& ((getScoreByPlayer(isPlayerA) + getScoreByPlayer(!isPlayerA)) == 12));
	}
	
	@Override
	public String toFile() {
		return String.valueOf(this.getScoreA()) + ";" +
				String.valueOf(this.getScoreB()) + ";" +
				String.valueOf(this.getIsFifth());
	}

	@Override
	public void fromFile(String data) throws ParseFileException {
		String[] str = data.split(";");
		if(str.length == 3)
		{
			try
			{
				setScoreA(Integer.parseInt(str[0]));
				setScoreB(Integer.parseInt(str[1]));
				setIsFifth(Boolean.parseBoolean(str[2]));
			}
			catch(Exception ex)
			{
				ParseFileException pe = new ParseFileException("Error al leer datos del Set", ex);
				throw pe;
			}
		}
		else
		{
			ParseFileException pe = new ParseFileException("Error al leer datos del Set");
			throw pe;
		}
	}
}
