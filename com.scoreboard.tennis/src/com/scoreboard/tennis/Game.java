package com.scoreboard.tennis;

public class Game {
	private int scoreA;
	private int scoreB;
	
	private Boolean isTieBreak;
	
	private void setPlayerScore(Boolean isPlayerA)
	{
		if(isPlayerA)
			scoreA++;
		else
			scoreB++;
	}
	
	private int getPlayerScore(Boolean isPlayerA)
	{
		if(isPlayerA)
			return scoreA;
		else
			return scoreB;
	}
	
	protected Boolean addPoint(Boolean isPlayerA)
	{
		setPlayerScore(isPlayerA);
		
		if(isTieBreak)
		{
			if((getPlayerScore(isPlayerA) > 6) && (getPlayerScore(isPlayerA) > getPlayerScore(!isPlayerA) + 1))
				return true;
			else
				return false;
		}
		else
		{
			if((getPlayerScore(isPlayerA) > 4) && (getPlayerScore(isPlayerA) > getPlayerScore(!isPlayerA) + 1))
				return true;
			else
				return false;
		}
	}
	
	protected int[] getScore(){
		return new int[] { scoreA, scoreB };
	}
}
