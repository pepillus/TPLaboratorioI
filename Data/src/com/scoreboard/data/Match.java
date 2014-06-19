package com.scoreboard.data;

import com.scoreboard.interfaces.ISavable;
import com.scoreboard.utils.exceptions.ParseFileException;

public class Match extends PartialScore implements ISavable {
	private int gameLength;
	private Boolean isFinished;
	private Set[] sets;
	private Set currentSet;
	
	public int getGameLength() {
		return gameLength;
	}

	public void setGameLength(int gameLength) {
		this.gameLength = gameLength;
	}

	public Boolean getIsFinished() {
		return isFinished;
	}

	public void setIsFinished(Boolean isFinished) {
		this.isFinished = isFinished;
	}

	public Set[] getSets() {
		return sets;
	}

	public void setSets(Set[] sets) {
		this.sets = sets;
	}

	public Set getCurrentSet() {
		return currentSet;
	}

	public void setCurrentSet(Set currentSet) {
		this.currentSet = currentSet;
	}

	public Match(int gameLength)
	{
		this.gameLength = gameLength;
		sets = new Set[gameLength];
		for(int i = 0; i < gameLength; i++)
			sets[i] = new Set(false);
		if(gameLength == 5)
			sets[4] = new Set(true);
		currentSet = sets[0];
	}
	
	public Boolean playerWon(Boolean isPlayerA)
	{
		if(getScoreByPlayer(isPlayerA) > (gameLength - getScoreByPlayer(isPlayerA)))
			return true;
		else
			return false;
	}
	
	public void addPoint(Boolean isPlayerA)
	{
		super.addPoint(isPlayerA);
		if((getScoreByPlayer(isPlayerA) + getScoreByPlayer(!isPlayerA)) == gameLength)
			isFinished = true;
		else
			currentSet = sets[getScoreByPlayer(isPlayerA) + getScoreByPlayer(!isPlayerA)];
	}
	
	@Override
	public String toFile() {
		return String.valueOf(this.getScoreA()) + ";" +
				String.valueOf(this.getScoreB()) + ";" +
				String.valueOf(this.getGameLength());
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
				setGameLength(Integer.parseInt(str[2]));
			}
			catch(Exception ex)
			{
				ParseFileException pe = new ParseFileException("Error al leer datos del Match", ex);
				throw pe;
			}
		}
		else
		{
			ParseFileException pe = new ParseFileException("Error al leer datos del Match");
			throw pe;
		}
	}
}
