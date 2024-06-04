package Repositories;

public abstract class Jornalist {
    protected NewsMediator mediator;
    protected String name;

    public Jornalist(NewsMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void send(String message);
    public abstract void receive(String message);
}
