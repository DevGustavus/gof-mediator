package Models;

import Repositories.Jornalist;
import Repositories.NewsMediator;
import java.util.ArrayList;
import java.util.List;

public class NewsMediatorImpl implements NewsMediator {
    private List<Jornalist> jornalists;

    public NewsMediatorImpl() {
        this.jornalists = new ArrayList<>();
    }

    @Override
    public void sendNews(String message, Jornalist jornalist) {
        for (Jornalist j : this.jornalists) {
            // Não envia a mensagem para o próprio usuário que a enviou
            if (j != jornalist) {
                if(message.contains("perde")){
                    message = "CENSURADO";
                }
                j.receive(message);
            }
        }
    }

    @Override
    public void addJornalist(Jornalist jornalist) {
        this.jornalists.add(jornalist);
    }
}
