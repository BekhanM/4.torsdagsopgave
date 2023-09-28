public class Main {

	public static void main (String[] args) {
	
	Team team1 = new Team("Ingen Sympati");
	Team team2 = new Team("Mande Lotion");
	Team team3 = new Team("MagIskole");
	Team team4 = new Team("Bing Bong");
	Team team5 = new Team("De Tre Måske Fire");

	team1.setRank(1);
	team2.setRank(2);
	team3.setRank(3);
	team4.setRank(4);
	team5.setRank(5);

	System.out.println(team1.toString());
	System.out.println(team2.toString());
	System.out.println(team3.toString());
	System.out.println(team4.toString());
	System.out.println(team5.toString());
   }
}