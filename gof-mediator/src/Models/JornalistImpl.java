package Models;

import Repositories.Jornalist;
import Repositories.NewsMediator;

public class JornalistImpl extends Jornalist {

    public JornalistImpl(NewsMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String message) {
        System.out.println(this.name + ": Enviando mensagem = " + message);
        mediator.sendNews(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println(this.name + ": Recebendo mensagem = " + message);
    }
}
