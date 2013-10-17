package bgs.core;

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
		System.out.printf("%-28s %-11s %-10s %-10s %-10s %-10s\n", "Player Name", "Points", "FGM", "FGA", "Reb", "Ast");
		System.out.println("------------------------------------------------------------------------------");
	}
	public void footer(int pts, int fgm, int fga) {
		System.out.println("------------------------------------------------------------------------------");
		System.out.printf("%-30s %-10s %-10s %-10s\n", "Total", pts, fgm, fga);
	}
	
}
