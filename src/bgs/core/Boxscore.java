package bgs.core;

//outputs the game's stats to console
public class Boxscore {

	public void pointGuard(String name, int pts, int fgm, int fga, int reb, int ast) {
		System.out.printf("%-30s %-10s %-10s %-10s %-10s %-10s\n", name, pts, fgm, fga, reb, ast);
	}
	public void shootingGuard(String name, int pts, int fgm, int fga, int reb, int ast) {
		System.out.printf("%-30s %-10s %-10s %-10s %-10s %-10s\n", name, pts, fgm, fga, reb, ast);
	}
	public void smallFoward(String name, int pts, int fgm, int fga, int reb, int ast) {
		System.out.printf("%-30s %-10s %-10s %-10s %-10s %-10s\n", name, pts, fgm, fga, reb, ast);
	}
	public void powerFoward(String name, int pts, int fgm, int fga, int reb, int ast) {
		System.out.printf("%-30s %-10s %-10s %-10s %-10s %-10s\n", name, pts, fgm, fga, reb, ast);
	}
	public void center(String name, int pts, int fgm, int fga, int reb, int ast) {
		System.out.printf("%-30s %-10s %-10s %-10s %-10s %-10s\n", name, pts, fgm, fga, reb, ast);
	}
	public void header() {
		System.out.println();
		System.out.println();
		System.out.printf("%-28s %-11s %-10s %-10s %-10s %-10s\n", "Player Name", "Points", "FGM", "FGA", "Reb", "Ast");
		System.out.println("------------------------------------------------------------------------------");
	}
	public void footer(int pts, int fgm, int fga) {
		System.out.println("------------------------------------------------------------------------------");
		System.out.printf("%-30s %-10s %-10s %-10s\n", "Total", pts, fgm, fga);
		System.out.println();
	}
	
	public void results(int home, int away) {
		if (home > away)
			System.out.println("Home team wins " + home + " to " + away);
		else if (away > home)
			System.out.println("Away team wins " + away + " to " + home);
		else
			System.out.println("Overtime! *extra time coming soon*");
		
	}
	
}
