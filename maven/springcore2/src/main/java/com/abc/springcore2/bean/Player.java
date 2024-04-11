package com.abc.springcore2.bean;

import java.util.Map;

public class Player {
	private int playerId;
	private String playerName;
	private Map<String,Integer> scores;
	
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public Map<String, Integer> getScores() {
		return scores;
	}
	public void setScores(Map<String, Integer> scores) {
		this.scores = scores;
	}
	
	
}
