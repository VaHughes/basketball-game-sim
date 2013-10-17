package bgs.core;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Players {
	
	public Players() {}
	
	public Players(List<Player> playerList) {
		this.playerList = playerList;
	}
	
	List<Player> playerList;
	
	@XmlElement(name="player")
	public List<Player> getPlayerList() {
		return playerList;
	}
	
	public void setPlayerList(List<Player> playerList) {
		this.playerList = playerList;
	}
}
