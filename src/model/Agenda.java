package model;

import java.util.List;

public interface Agenda {
    static Agenda getInstance(List<Sessao> sessaos) {
        if (AgendaSingleton.instance == null) {
            AgendaSingleton.instance = new AgendaSingleton(sessaos);
        }
        return AgendaSingleton.instance;
    }

    List<Sessao> getSessaos();

    void setSessaos(List<Sessao> sessaos);

    void setSessao(Sessao sessao);
}
