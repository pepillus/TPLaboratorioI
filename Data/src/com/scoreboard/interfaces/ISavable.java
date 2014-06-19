package com.scoreboard.interfaces;

import com.scoreboard.utils.exceptions.ParseFileException;

public interface ISavable {
	public String toFile();
	public void fromFile(String data) throws ParseFileException;
}
