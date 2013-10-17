package bgs.core;

import java.util.List;

public class GameSim {
	
	List<Player> team;
	
	public GameSim(List<Player> team) {
		
		this.team = team;
		Shooting shooting = new Shooting(this.team);
		Rebounding rebounding = new Rebounding(this.team);
		Assists assists = new Assists(this.team);
		
		
		Boxscore bs = new Boxscore();
		bs.header();
		bs.pointGuard(team.get(4).name, shooting.ptsPG, shooting.fgmPG, shooting.fgaPG, rebounding.rebPG, assists.astPG);
		bs.shootingGuard(team.get(3).name,  shooting.ptsSG, shooting.fgmSG, shooting.fgaSG, rebounding.rebSG, assists.astSG);
		bs.smallFoward(team.get(2).name, shooting.ptsSF, shooting.fgmSF, shooting.fgaSF, rebounding.rebSF, assists.astSF);
		bs.powerFoward(team.get(1).name, shooting.ptsPF, shooting.fgmPF, shooting.fgaPF, rebounding.rebPF, assists.astPF);
		bs.center(team.get(0).name, shooting.ptsC, shooting.fgmC, shooting.fgaC, rebounding.rebC, assists.astC);
		
		
		
		
		
		
		bs.footer(shooting.ptsTotal, shooting.fgmTotal, shooting.fgaTotal);
	}
}
