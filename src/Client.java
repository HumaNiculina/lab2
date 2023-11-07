import javax.swing.table.TableRowSorter;

public class Client {
    private Server server;

    public Client(Server server) {
        this.server = server;
    }

    void addCake(String type) {
        server.addCakes(new Tort(type));
    }

    Comanda addOrder(Iterable<Tort> torturi) {
        return new Comanda(torturi);
    }

    void printAllCakes() {
        for (var cake : this.server.findAllCakes())
            System.out.println(cake.getTip());
    }
}
