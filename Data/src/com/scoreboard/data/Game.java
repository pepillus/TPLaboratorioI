package com.scoreboard.data;

public class Game extends PartialScore {
	private Boolean isTieBreak;
	
	public Boolean getIsTieBreak() {
		return isTieBreak;
	}

	public void setIsTieBreak(Boolean isTieBreak) {
		this.isTieBreak = isTieBreak;
	}

	public Game(Boolean isTieBreak) {
		this.isTieBreak = isTieBreak;
	}

	public Boolean playerWon(Boolean isPlayerA) {
		if ((getScoreByPlayer(isPlayerA) > (getScoreByPlayer(!isPlayerA) + 1))
				&& (getScoreByPlayer(isPlayerA) > 3)) {
			if (isTieBreak) {
				if (getScoreByPlayer(isPlayerA) > 5)
					return true;
			} else {
				return true;
			}
		}
		return false;
	}

	public void addPoint(Boolean isPlayerA) {
		super.addPoint(isPlayerA);
	}

	@Override
	public String[] getScore()
	{
		if(isTieBreak)
		{
			return new String[] { String.valueOf(getScoreA()), String.valueOf(getScoreB()) };
		}
		else
		{
			String[] ret = new String[2];
			if((getScoreA() + getScoreB()) < 6)
			{
				switch(getScoreA())
				{
					case 3:
						ret[0] = "40";
						break;
					default:
						ret[0] = String.valueOf((getScoreA() * 15));
						break;
				}
				switch(getScoreB())
				{
					case 3:
						ret[1] = "40";
						break;
					default:
						ret[1] = String.valueOf((getScoreB() * 15));
						break;
				}
			}
			else
			{
				if((getScoreA() + getScoreB() % 2) == 0)
				{
					ret[0] = "D";
					ret[1] = "D";
				}
				else
				{
					if(getScoreA() > getScoreB())
					{
						ret[0] = "A";
						ret[1] = "";
					}
					else
					{
						ret[0] = "";
						ret[1] = "A";
					}
				}
			}
			return ret;
		}
	}
}
