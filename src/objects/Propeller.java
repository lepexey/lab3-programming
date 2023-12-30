package objects;

public class Propeller extends PhysicalObject {
    private final float version;

    public Propeller(float version) {
        super("Винт", 10, Color.BLACK);
        this.version = version;
    }

    public float getVersion() {
        return version;
    }
}
