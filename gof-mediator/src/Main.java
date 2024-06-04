import Models.JornalistImpl;
import Models.NewsMediatorImpl;
import Repositories.Jornalist;
import Repositories.NewsMediator;

public class Main {

    public static void main(String[] args) {
        NewsMediator mediator = new NewsMediatorImpl();

        Jornalist jornalist1 = new JornalistImpl(mediator, "Jornalist1");
        Jornalist jornalist2 = new JornalistImpl(mediator, "Jornalist2");
        Jornalist jornalist3 = new JornalistImpl(mediator, "Jornalist3");
        Jornalist jornalist4 = new JornalistImpl(mediator, "Jornalist4");

        mediator.addJornalist(jornalist1);
        mediator.addJornalist(jornalist2);
        mediator.addJornalist(jornalist3);
        mediator.addJornalist(jornalist4);

        jornalist1.send("O governo perde popularidade!");
        System.out.println("\n========================\n");
        jornalist2.send("O governo ganha popularidade!");
    }

}
