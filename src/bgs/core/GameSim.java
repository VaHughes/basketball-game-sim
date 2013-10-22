package bgs.core;

import java.util.List;

public class GameSim {
	
	List<Player> homeTeam;
	List<Player> awayTeam;
	Boxscore bs = new Boxscore();
	int homePoints, awayPoints;
	
	public GameSim(List<Player> homeTeam, List<Player> awayTeam) {
		
		//takes in the teams for the game
		this.homeTeam = homeTeam;
		this.awayTeam = awayTeam;
		
		//starts the game
		homeTeamSim();
		awayTeamSim();
		
		//game results
		bs.results(homePoints, awayPoints);
		
	}
	
	public void homeTeamSim() {
		
		//Simulates game stats for home team
		Shooting shooting = new Shooting(homeTeam);
		Rebounding rebounding = new Rebounding(homeTeam);
		Assists assists = new Assists(homeTeam);
		
		//saves home team's total points
		homePoints = shooting.ptsTotal;
		
		//sends output of the game
		bs.header();
		bs.pointGuard(homeTeam.get(4).name, shooting.ptsPG, shooting.fgmPG, shooting.fgaPG, rebounding.rebPG, assists.astPG);
		bs.shootingGuard(homeTeam.get(3).name,  shooting.ptsSG, shooting.fgmSG, shooting.fgaSG, rebounding.rebSG, assists.astSG);
		bs.smallFoward(homeTeam.get(2).name, shooting.ptsSF, shooting.fgmSF, shooting.fgaSF, rebounding.rebSF, assists.astSF);
		bs.powerFoward(homeTeam.get(1).name, shooting.ptsPF, shooting.fgmPF, shooting.fgaPF, rebounding.rebPF, assists.astPF);
		bs.center(homeTeam.get(0).name, shooting.ptsC, shooting.fgmC, shooting.fgaC, rebounding.rebC, assists.astC);
		bs.footer(shooting.ptsTotal, shooting.fgmTotal, shooting.fgaTotal);
	}
	public void awayTeamSim() {
		
		//Simulates game stats for home team
		Shooting shooting = new Shooting(awayTeam);
		Rebounding rebounding = new Rebounding(awayTeam);
		Assists assists = new Assists(awayTeam);
			
		//saves home team's total points
		awayPoints = shooting.ptsTotal;
				
		//sends output of the game
		bs.header();
		bs.pointGuard(awayTeam.get(4).name, shooting.ptsPG, shooting.fgmPG, shooting.fgaPG, rebounding.rebPG, assists.astPG);
		bs.shootingGuard(awayTeam.get(3).name,  shooting.ptsSG, shooting.fgmSG, shooting.fgaSG, rebounding.rebSG, assists.astSG);
		bs.smallFoward(awayTeam.get(2).name, shooting.ptsSF, shooting.fgmSF, shooting.fgaSF, rebounding.rebSF, assists.astSF);
		bs.powerFoward(awayTeam.get(1).name, shooting.ptsPF, shooting.fgmPF, shooting.fgaPF, rebounding.rebPF, assists.astPF);
		bs.center(awayTeam.get(0).name, shooting.ptsC, shooting.fgmC, shooting.fgaC, rebounding.rebC, assists.astC);
		bs.footer(shooting.ptsTotal, shooting.fgmTotal, shooting.fgaTotal);
	}
}
