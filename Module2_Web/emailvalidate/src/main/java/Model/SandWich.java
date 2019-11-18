package Model;

public class SandWich {
    private String[] checksandwich;

    public SandWich(String[] checksandwich) {
        this.checksandwich = checksandwich;
    }

    public SandWich() {
    }

    public String[] getChecksandwich() {
        return checksandwich;
    }

    public void setChecksandwich(String[] checksandwich) {
        this.checksandwich = checksandwich;
    }
}
