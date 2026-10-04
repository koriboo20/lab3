public class ClubManagingSystemTest {
    public static void main(String[] args) {
        Club[] clubs = new Club[4];

        // Index 0: Club, "Student", numMember 200, minNumMember 10
        Club student = new Club("Student", 10);
        student.addMember(190); // 10 -> 200
        clubs[0] = student;

        // Index 1: SportsClub, "Football", numMember 40, minNumMember 22
        SportsClub football = new SportsClub("Football", 22);
        football.addMember(18); // 22 -> 40
        clubs[1] = football;

        // Index 2: ESportsClub, "RoV", numMember 5 (minNumMember forced to 1)
        clubs[2] = new ESportsClub("RoV", 5);

        // Index 3: MarketingClub, "Advertising", numMember 10, minNumMember 2, budget 100
        MarketingClub advertising = new MarketingClub("Advertising", 2, 100);
        advertising.addMember(8); // 2 -> 10
        clubs[3] = advertising;

        ClubManagingSystem system = new ClubManagingSystem(clubs);

        System.out.println("Highest member club: " + system.getHighestMemberClub().getName());
        System.out.println("Total budget: " + system.determineAllBudget());
        System.out.println("Total members: " + system.getAllMembers());

        System.out.println("\nExpected: highest = Student (200), total budget = 257200, total members = 255");
        System.out.println("Every loop in ClubManagingSystem is typed as Club, but each");
        System.out.println("call to determineBudget()/getNumMember() runs the ACTUAL object's");
        System.out.println("version (Club, SportsClub, or MarketingClub) - that's subtype polymorphism.");
    }
}
