package abstraction;

public enum Moves {
    GOODBYE("прощаться"),
    LIE("лежать"),
    COME("пришел"),
    COMEALL("пришли"),
    WISH_SWEET_DREAMS("пожелать спокойной ночи"),
    OVERCOME("одолел"),
    SLEEP("спал"),
    DO("делает"),
    TINKER("мастерит"),
    BECAME("стал"),
    THINK("думал"),
    LOCATED("стояла");

    private final String move;
    Moves(String move) {
        this.move = move;
    }

    public String getAction() {
        return move;
    }
}
