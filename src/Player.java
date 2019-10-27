public class Player {
    private String name;
    private int dynasty;
    private int maxDyn;

    public Player(String name) {
        this.name = name;
        maxDyn = 0;
        dynasty = 0;
    }

    public void addDynasty() {
        dynasty++;
    }

    public int dynasty() {
        return maxDyn;
    }

    public void reset() {
        if (dynasty > maxDyn) maxDyn = dynasty;
        dynasty = 0;
    }
}
