public class Server {
    private ITort cakes;
    private IComanda orders;

    public Server(ITort cakes, IComanda orders) {
        this.cakes = cakes;
        this.orders = orders;
    }

    public Iterable<Tort> findAllCakes() {
        return this.cakes.findAll();
    }

    public Iterable<Comanda> findAllOrders() {
        return this.orders.findAll();
    }

    public void addCakes(Tort cake) {
        cakes.save(cake);
    }
}


