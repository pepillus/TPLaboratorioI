package com.scoreboard.business.entities;

import com.scoreboard.interfaces.ISavable;
import com.scoreboard.utils.exceptions.*;

public class Game extends PartialScore implements ISavable {
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
	public String[] getScore() {
		if (isTieBreak) {
			return new String[] { String.valueOf(getScoreA()),
					String.valueOf(getScoreB()) };
		} else {
			String[] ret = new String[2];
			if ((getScoreA() + getScoreB()) < 6) {
				switch (getScoreA()) {
				case 3:
					ret[0] = "40";
					break;
				default:
					ret[0] = String.valueOf((getScoreA() * 15));
					break;
				}
				switch (getScoreB()) {
				case 3:
					ret[1] = "40";
					break;
				default:
					ret[1] = String.valueOf((getScoreB() * 15));
					break;
				}
			} else {
				if (((getScoreA() + getScoreB()) % 2) == 0) {
					ret[0] = "D";
					ret[1] = "D";
				} else {
					if (getScoreA() > getScoreB()) {
						ret[0] = "A";
						ret[1] = "";
					} else {
						ret[0] = "";
						ret[1] = "A";
					}
				}
			}
			return ret;
		}
	}

	@Override
	public String toFile() {
		return String.valueOf(this.getScoreA()) + ";" +
				String.valueOf(this.getScoreB()) + ";" +
				String.valueOf(this.getIsTieBreak());
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
				setIsTieBreak(Boolean.parseBoolean(str[2]));
			}
			catch(Exception ex)
			{
				ParseFileException pe = new ParseFileException("Error al leer datos del Game", ex);
				throw pe;
			}
		}
		else
		{
			ParseFileException pe = new ParseFileException("Error al leer datos del Game");
			throw pe;
		}
	}
}
