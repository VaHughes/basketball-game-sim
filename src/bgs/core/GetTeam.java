package bgs.core;

import java.io.File;
import java.util.List;
import java.util.Scanner;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class GetTeam {
	
	Scanner stdIn = new Scanner(System.in);
	List<Player> homeTeam;
	List<Player> awayTeam;
	
	public void readTeams() {
		File folder = new File("teams/");
		File[] listOfFiles = folder.listFiles();
		
		for (File file : listOfFiles) {
			if (file.isFile()) {
				String fileName = file.getName();
				fileName = fileName.substring(0, fileName.lastIndexOf("."));
				System.out.println(fileName);
			}
		}
		System.out.println();
		getHomeTeam();
		getAwayTeam();
		startGame();
	}
	
	public void getHomeTeam() {
		try {
			System.out.print("Select home team: ");
			String homeTeamName = stdIn.nextLine();
			selectedTeam(homeTeamName, "home");
			
		} catch(Exception e) {
			 e.printStackTrace();
		}
		
	}
	
	public void getAwayTeam() {
		try {
			System.out.print("Select away team: ");
			String awayTeamName = stdIn.nextLine();
			selectedTeam(awayTeamName, "away");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void selectedTeam(String team, String homeOrAway) {
		
		try {
			//load xml file to get team
			File file = new File("teams/" + team + ".xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Players.class);
			
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Players players = (Players) jaxbUnmarshaller.unmarshal(file);	
			
			if (homeOrAway == "home")
				homeTeam = players.getPlayerList();
			if (homeOrAway == "away")
				awayTeam = players.getPlayerList();
			
			
		} catch (JAXBException e) {
			System.out.println("Incorrect teams selected.");
			if (homeOrAway == "home")
				getHomeTeam();
			if (homeOrAway == "away")
				getAwayTeam();
		}
	}
	
	public void startGame() {
		
		@SuppressWarnings("unused")
		GameSim gs = new GameSim(homeTeam, awayTeam);
		afterGame();
		
	}
	
	public void afterGame() {
		
		System.out.print("Enter a to restart game or q exit: ");
		String in = stdIn.nextLine();
		
		if (in.equals("q")) {
			System.exit(0);
		} else if (in.equals("a")) {
			startGame();
		} else {
			System.out.println("Incorrect input.");
			afterGame();
		}
			
	}
}
