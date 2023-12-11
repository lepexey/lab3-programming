package abstraction;

public enum TimeOperands {
    AN_HOUR_AHEAD("час спустя"),
    LATER("потом"),
    ALREADY("уже"),
    NOW("сейчас"),
    YET("ещё");

    private final String time;
    TimeOperands(String time) {
        this.time = time;
    }

    public String getTime(){
        return time;
    }
}
