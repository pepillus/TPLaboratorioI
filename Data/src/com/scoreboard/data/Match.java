package com.scoreboard.data;

public class Match extends PartialScore{
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
}
