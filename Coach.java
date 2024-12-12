package gittest;

public class Coach implements CoachingBehaviour {
    private String name;
    private String club;

    public Coach(String name, String club) {
        this.name = name;
        this.club = club;
    }

    @Override
    public String toString() {
        return "Coach's name=" + name + '\'' +
                ", club='" + club + '\'' +
                '}';
    }

    @Override
    public void pickTeam() {
        System.out.println("Picking the starting 11...");
    }

    @Override
    public void chooseTactics() {
        System.out.println("Choosing a formation...");

    }

    @Override
    public void buyPlayer() {
        System.out.println("Buying new player...");

    }
}
