import java.util.ArrayList;

public class Comanda extends Entity<Long> {
    private Iterable<Tort> torturi;

    public Comanda() {
        this.torturi = new ArrayList<>();
    }

    public Comanda(Iterable<Tort> torturi) {
        this.torturi = torturi;
    }

    public Iterable<Tort> getTorturi() {
        return this.torturi;
    }

    public void setTorturi(Iterable<Tort> torturi) {
        this.torturi = torturi;
    }
}
