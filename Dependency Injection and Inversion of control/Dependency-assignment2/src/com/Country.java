package com;

import java.util.*;

public class Country {
String countryId;
String countryName;
List<Player> playerslist;
public String getCountryName() {
	return countryName;
}
public void setCountryName(String countryName) {
	this.countryName = countryName;
}

public String getCountryId() {
	return countryId;
}
public void setCountryId(String countryId) {
	this.countryId = countryId;
}
public List<Player> getPlayerslist() {
	return playerslist;
}
public void setPlayerslist(List<Player> playerslist) {
	this.playerslist = playerslist;
}

@Override
public String toString() {
	return "countryId=" + countryId + ", countryName=" + countryName + ", playerslist=" + playerslist;
}

}
