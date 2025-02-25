package Homeworks11Composition;

public class Team {
    private Person leader;
    private Person player;

    public Team(Person leader, Person player) {
        this.leader = leader;
        this.player = player;
    }

    public Person getLeader() {
        return leader;
    }

    public void setLeader(Person leader) {
        this.leader = leader;
    }

    public Person getPlayer() {
        return player;
    }

    public void setPlayer(Person player) {
        this.player = player;
    }

    @Override
    public String toString() {
        return "Team{" +
                "leader=" + leader +
                ", player=" + player +
                '}';
    }
}
