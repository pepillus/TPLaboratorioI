package com.scoreboard.utils.events;

import java.util.EventObject;

public class PartialEvent extends EventObject {
	  private boolean risen;
	  
	  public PartialEvent(Object source, boolean risen) {
	    super(source);
	    this.risen = risen;
	  }
}