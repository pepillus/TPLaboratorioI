package com.scoreboard.business.entities;


public abstract class PartialScore {
	private int scoreA;
	private int scoreB;
	
	public int getScoreA() {
		return scoreA;
	}

	public void setScoreA(int scoreA) {
		this.scoreA = scoreA;
	}

	public int getScoreB() {
		return scoreB;
	}

	public void setScoreB(int scoreB) {
		this.scoreB = scoreB;
	}
	
	public abstract Boolean playerWon(Boolean isPlayerA);
	
	public void addPoint(Boolean isPlayerA)
	{
		if(isPlayerA)
			scoreA ++;
		else
			scoreB ++;
	}
	
	protected int getScoreByPlayer(Boolean isPlayerA)
	{
		if(isPlayerA)
			return scoreA;
		else
			return scoreB;
	}
	
	public String[] getScore()
	{
		return new String[] { String.valueOf(scoreA), String.valueOf(scoreB) };
	}
	
}
