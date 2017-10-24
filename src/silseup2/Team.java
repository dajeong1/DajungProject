package silseup2;

public class Team {
	public String teamName;
	private int score;

	public Team(String newTeamName, int newScore) {
		teamName = newTeamName;
		score = newScore;
	}

	public String getTeam() {
		return teamName;
	}

	public int getScore() {
		return score;
	}

	public void setTeam(String name) {
		teamName = name;
	}

	public void setScore(int points) {
		score = points;
	}

	
	public static void main(String argv[]) {
		Team home = new Team("", 0);
		Team visitor = new Team("", 0);
		Team a, b;

		home.setTeam("∑‘µ•");
		visitor.setTeam("NC");

		home.setScore(5);
		visitor.setScore(7);

		if (home.getScore() > visitor.getScore())
			System.out.println(home.getTeam() + "∆¿¿Ã ¿Ã±‰¥Ÿ.");
		else
			System.out.println(visitor.getTeam() + "∆¿¿Ã ¿Ã±‰¥Ÿ.");

		
		home.setScore(9);
		visitor.setScore(3);

		if (home.getScore() > visitor.getScore())
			System.out.println(home.getTeam() + "∆¿¿Ã ¿Ã±‰¥Ÿ.");
		else
			System.out.println(visitor.getTeam() + "∆¿¿Ã ¿Ã±‰¥Ÿ.");
	}
}
