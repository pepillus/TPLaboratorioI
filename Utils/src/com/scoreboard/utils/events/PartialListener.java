package com.scoreboard.utils.events;

import java.util.EventListener;

public interface PartialListener extends EventListener {
	  public void partialChanged(PartialEvent e);
}
