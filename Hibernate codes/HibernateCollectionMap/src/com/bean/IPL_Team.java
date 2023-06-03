package com.bean;

import java.util.Map;

public class IPL_Team {

	private int team_id;
	private String teamName,ownerName;
	private Map<String,Player>player;
	public int getTeam_id() {
		return team_id;
	}
	public void setTeam_id(int team_id) {
		this.team_id = team_id;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public Map<String, Player> getPlayer() {
		return player;
	}
	public void setPlayer(Map<String, Player> player) {
		this.player = player;
	}
	
	
}
