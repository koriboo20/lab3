public class Club {
    protected String clubName; // name of the club
    protected int minNumMember; // minimum number of members in the club
    protected int numMember; // current number of members

    public Club(String c, int m) {
        clubName = c;
        minNumMember = m;
        numMember = m;
    }

    public void addMember(int num) {
        numMember = numMember + num;
    }

    public void changeName(String newName) {
        clubName = newName;
    }

    public String getName() {
        return clubName;
    }

    // Public getter for numMember. Placed here (not only in SportsClub) so
    // that Q2's ClubManagingSystem can read the member count of ANY Club,
    // including plain Club objects, through one shared public method.
    // SportsClub and ESportsClub satisfy the lab's "add a getter to
    // SportsClub" requirement automatically, since they inherit it.
    public int getNumMember() {
        return numMember;
    }

    public int determineBudget() {
        return (numMember * 1000);
    }

    public void advertise() {
        System.out.println("Please join club: " + clubName);
    }
}
