package Repositories;

public interface NewsMediator {

    void sendNews(String message, Jornalist jornalist);
    void addJornalist(Jornalist jornalist);

}
