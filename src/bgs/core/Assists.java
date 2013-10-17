package bgs.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assists {
	
	List<Player> team;
	List<String> assists = new ArrayList<String>();
	int astC, astPF, astSF, astSG, astPG;
	
	public Assists (List<Player> team) {
		this.team = team;
		selectAssist();
		gameAssists();
	}
	
public void selectAssist() {
		
		for (Player p : team) {
			int x = p.assist;
			for (int i = 1; i <= x; i++) {
				assists.add(p.name);
			}
		}
	}

public void gameAssists()  {
	Collections.shuffle(assists);
	
	for (int i = 0; i < 17; i++) {
		Collections.shuffle(assists);
		
		if(assists.get(0) == team.get(0).name) {
			astC++;
		}
		
		if(assists.get(0) == team.get(1).name) {
			astPF++;
		}
		
		if(assists.get(0) == team.get(2).name) {
			astSF++;
		}
		
		if(assists.get(0) == team.get(3).name) {
			astSG++;
		}
		
		if(assists.get(0) == team.get(4).name) {
			astPG++;
		}
	}
}
}
