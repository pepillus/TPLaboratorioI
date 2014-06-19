package com.scoreboard.data;

public class Set extends PartialScore {
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

	public Set(Boolean isFifth)
	{
		this.isFifth = isFifth;
		currentGame = new Game(false);
	}
	
	public Boolean playerWon(Boolean isPlayerA)
	{
		if((getScoreByPlayer(isPlayerA) > 5) && (getScoreByPlayer(isPlayerA) > (getScoreByPlayer(!isPlayerA) + 1)))
			return true;
		else
			return false;
	}
	
	public void addPoint(Boolean isPlayerA)
	{
		super.addPoint(isPlayerA);
		currentGame = new Game((!isFifth) & ((getScoreByPlayer(isPlayerA) + getScoreByPlayer(!isPlayerA)) == 12));
	}
}
