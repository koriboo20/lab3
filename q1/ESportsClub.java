// "final" on the class means no other class can extend ESportsClub.
public final class ESportsClub extends SportsClub {

    public ESportsClub(String c, int m) {
        super(c, m);       // sets clubName = c, minNumMember = m, numMember = m
        minNumMember = 1;  // then override minNumMember to always be 1
    }

    // "final" on the method means even if this class COULD be extended,
    // no subclass could override advertise() again. Combined with the
    // final class above, this is actually two separate guarantees.
    @Override
    public final void advertise() {
        System.out.println("No need to advertise");
    }
}
