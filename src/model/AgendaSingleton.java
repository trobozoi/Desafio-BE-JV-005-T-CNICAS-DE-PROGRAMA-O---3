package model;

import java.util.List;

public final class AgendaSingleton implements Agenda {
    protected static Agenda instance;
    private List<Sessao> sessaos;

    @Override
    public List<Sessao> getSessaos() {
        return sessaos;
    }

    @Override
    public void setSessaos(List<Sessao> sessaos) {
        this.sessaos = sessaos;
    }

    @Override
    public void setSessao(Sessao sessao) {
        this.sessaos.add(sessao);
    }

    protected AgendaSingleton(List<Sessao> sessaos){
        this.sessaos = sessaos;
    }

}
