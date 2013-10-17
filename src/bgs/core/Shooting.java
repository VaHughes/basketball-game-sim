package bgs.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Shooting {
	
	List<Player> team;
	List<String> shooter = new ArrayList<String>();
	int ptsC, ptsPF, ptsSF, ptsSG, ptsPG;
	int ptsTotal, fgmTotal, fgaTotal;
	int fgmC, fgmPF, fgmSF, fgmSG, fgmPG;
	int fgaC, fgaPF, fgaSF, fgaSG, fgaPG;
	Random rnd = new Random();
	
	public Shooting(List<Player> team) {
		this.team = team;
		selectShooter();
		gameShooter();
		ptsTotal = ptsC+ptsPF+ptsSF+ptsSG+ptsPG;
		fgmTotal = fgmC+fgmPF+fgmSF+fgmSG+fgmPG;
		fgaTotal = fgaC+fgaPF+fgaSF+fgaSG+fgaPG;
	}
	
	public void selectShooter() {
		
		for (Player p : team) {
			int x = p.shoot;
			for (int i = 1; i <= x; i++) {
				shooter.add(p.name);
			}
		}
	}
	
	public void gameShooter()  {
		Collections.shuffle(shooter);
		
		for (int i = 0; i < 100; i++) {
			Collections.shuffle(shooter);
			
			if(shooter.get(0) == team.get(0).name) {
				ShootPct(team.get(0).name);
			}
			
			if(shooter.get(0) == team.get(1).name) {
				ShootPct(team.get(1).name);
			}
			
			if(shooter.get(0) == team.get(2).name) {
				ShootPct(team.get(2).name);
			}
			
			if(shooter.get(0) == team.get(3).name) {
				ShootPct(team.get(3).name);
			}
			
			if(shooter.get(0) == team.get(4).name) {
				ShootPct(team.get(4).name);
			}
		}
	}

	public void ShootPct(String n) {
		
		if(n == team.get(0).name) {
			int x = rnd.nextInt(100);
			if (x <= team.get(0).accuracy) {
				ptsC +=2;
				fgmC++;
				fgaC++;				
			}
			else { fgaC++; }
		}
		
		if(n == team.get(1).name) {
			int x = rnd.nextInt(100);
			if (x <= team.get(1).accuracy) {
				ptsPF +=2;
				fgmPF++;
				fgaPF++;				
			}
			else { fgaPF++; }
		}
		
		if(n == team.get(2).name) {
			int x = rnd.nextInt(100);
			if (x <= team.get(2).accuracy) {
				ptsSF +=2;
				fgmSF++;
				fgaSF++;				
			}
			else { fgaSF++; }
		}
		
		if(n == team.get(3).name) {
			int x = rnd.nextInt(100);
			if (x <= team.get(3).accuracy) {
				ptsSG +=2;
				fgmSG++;
				fgaSG++;				
			}
			else { fgaSG++; }
		}
		
		if(n == team.get(4).name) {
			int x = rnd.nextInt(100);
			if (x <= team.get(0).accuracy) {
				ptsPG +=2;
				fgmPG++;
				fgaPG++;				
			}
			else { fgaPG++; }
		}
	}
	

}
