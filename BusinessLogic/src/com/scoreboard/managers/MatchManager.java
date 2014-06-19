package com.scoreboard.managers;

import java.util.ArrayList;

import com.scoreboard.data.*;
import com.scoreboard.persistence.MatchHelper;

public class MatchManager {
	private Match match;
	private Player playerA;
	private Player playerB;

	public Match getMatch() {
		return match;
	}

	public void setMatch(Match match) {
		this.match = match;
	}

	public Player getPlayerA() {
		return playerA;
	}

	public void setPlayerA(Player playerA) {
		this.playerA = playerA;
	}

	public Player getPlayerB() {
		return playerB;
	}

	public void setPlayerB(Player playerB) {
		this.playerB = playerB;
	}

	public MatchManager() {
	}

	public void loadMatch() {
		// match = try FileLoader.getMatch();
		// throw error message to GUI
	}

	public void newMatch(String playersFile, int gameLength) {
		// try FileLoader.getPlayer(playersFile);
		match = new Match(gameLength);
	}

	public void addPoint(Boolean isPlayerA) {
		updateGame(isPlayerA);
	}

	public Boolean hasWinner() {
		return match.getIsFinished();
	}

	public Player getWinner() {
		if (!match.getIsFinished())
			return null;
		if (match.getScoreA() > match.getScoreB())
			return playerA;
		else
			return playerB;
	}

	public ArrayList<String[]> getCurrentScore() {
		ArrayList<String[]> scores = new ArrayList<String[]>();
		scores.add(match.getScore());
		for (Set s : match.getSets())
			scores.add(s.getScore());
		scores.add(match.getCurrentSet().getCurrentGame().getScore());
		return scores;
	}

	private void updateGame(Boolean isPlayerA) {
		match.getCurrentSet().getCurrentGame().addPoint(isPlayerA);
		if (match.getCurrentSet().getCurrentGame().playerWon(isPlayerA))
			updateSet(isPlayerA);
	}

	private void updateSet(Boolean isPlayerA) {
		match.getCurrentSet().addPoint(isPlayerA);
		if (match.getCurrentSet().playerWon(isPlayerA))
			updateMatch(isPlayerA);
	}

	private void updateMatch(Boolean isPlayerA) {
		match.addPoint(isPlayerA);
	}

	public void saveMatch()
	{
		try {
			MatchHelper.write(match, "foo.xml");
			Match m2 = MatchHelper.read("foo.xml");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// the output : Foobar
	}
}
