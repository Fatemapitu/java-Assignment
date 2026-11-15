public class LocalInstance {

    String club, tournament;

    void setDetails(String clubName, String tournamentName) {
        club = clubName;
        tournament = tournamentName;
    }

    void display() {
        System.out.println("Choosing Team through Instance variable : \nLeague Name = " + tournament + "\n" + "Team Name = " + club + "\n");
    }

    public static void main(String[] args) {
        LocalInstance teamObj = new LocalInstance();

        teamObj.setDetails("Real Madrid", "La Liga");
        teamObj.display();

        String secondClub = "Liverpool";
        String secondTournament = "Premier League";

        System.out.println("Choosing Team through Local variable : \nLeague Name = " + secondTournament + "\n" + "Team Name = " + secondClub + "\n");
    }
}
