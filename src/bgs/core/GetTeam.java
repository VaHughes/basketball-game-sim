package bgs.core;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class GetTeam {
	
	public void ReadTeam() {
		
		try {
			
			File file = new File("teams/heat.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Players.class);
			
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Players players = (Players) jaxbUnmarshaller.unmarshal(file);	
			
			@SuppressWarnings("unused")
			GameSim gs = new GameSim(players.getPlayerList());
			
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}
