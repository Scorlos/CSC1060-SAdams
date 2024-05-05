public class Player {
    private String name;
    private Die die;

    public Player(String name, Die die) {
        this.name = name;
        this.die = die;
    }

    public String getName() {
        return this.name;
    }

    public Die getDie() {
        return this.die;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDie(Die die) {
        this.die = die;
    }
}
