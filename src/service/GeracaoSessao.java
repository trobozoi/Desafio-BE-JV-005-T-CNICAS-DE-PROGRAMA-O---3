package service;

import model.Agenda;
import model.Lugar;
import model.Sessao;

public interface GeracaoSessao {
    Sessao mudarDeLocal(Sessao sessao, Lugar novoLugar);

    Agenda criarAgenda(Sessao sessaoInicial, int intervaloHoras, int intervaloDias);
}
