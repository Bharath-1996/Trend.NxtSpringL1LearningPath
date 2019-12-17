package com;

public class Player {
String playerId;
String playerName;

public String getPlayerId() {
	return playerId;
}
public void setPlayerId(String playerId) {
	this.playerId = playerId;
}

public String getPlayerName() {
	return playerName;
}
public void setPlayerName(String playerName) {
	this.playerName = playerName;
}
@Override
public String toString() {
	return "playerId=" + playerId + " playerName=" + playerName;
}


}
