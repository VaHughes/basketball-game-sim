package bgs.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//sets the rebounds for the game
public class Rebounding {
	
	List<Player> team;
	List<String> rebounds = new ArrayList<String>();
	int rebC, rebPF, rebSF, rebSG, rebPG;
	
	public Rebounding (List<Player> team) {
		this.team = team;
		selectRebounder();
		gameRebounds();
	}
	
//sets the rebounding skill of the player
public void selectRebounder() {
		
		for (Player p : team) {
			int x = p.rebound;
			for (int i = 1; i <= x; i++) {
				rebounds.add(p.name);
			}
		}
	}

//creates player rebounds for the game (35 total per team)
public void gameRebounds()  {
	Collections.shuffle(rebounds);
	
	for (int i = 0; i < 35; i++) {
		Collections.shuffle(rebounds);
		
		if(rebounds.get(0) == team.get(0).name) {
			rebC++;
		}
		
		if(rebounds.get(0) == team.get(1).name) {
			rebPF++;
		}
		
		if(rebounds.get(0) == team.get(2).name) {
			rebSF++;
		}
		
		if(rebounds.get(0) == team.get(3).name) {
			rebSG++;
		}
		
		if(rebounds.get(0) == team.get(4).name) {
			rebPG++;
		}
	}
}
}
