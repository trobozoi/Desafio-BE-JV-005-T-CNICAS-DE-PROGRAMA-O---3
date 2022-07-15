package app;

import model.*;
import service.GeracaoSessaoImpl;

import java.time.*;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Lugar> lugars = List.of(new LugarImpl("São Paulo", ZoneId.of("America/Sao_Paulo")),
                new LugarImpl("Paris", ZoneId.of("Europe/Paris")));
        for (Lugar lugar : lugars) {
            Sessao sessao = new SessaoImpl("2022-07-22T10:00:00", lugar);
            Agenda agenda = new GeracaoSessaoImpl().criarAgenda(sessao, 2, 10);
        }

        for (Lugar lugar : lugars) {
            System.out.println("A agenda das sessões para " + lugar.getNome());
            Agenda agenda = Agenda.getInstance(null);
            List<Sessao> sessaoList = agenda.getSessaos();
            List<Sessao> sessaoList1 = sessaoList.stream().filter(sessao -> sessao.getLugar().getNome().equals(lugar.getNome())).collect(Collectors.toList());
            int count = 0;
            for (Sessao sessao:sessaoList1) {
                count++;
                System.out.printf("%s %03d:\n%s", "Sessao", count, sessao.toString());
            }
        }
        Agenda agenda = Agenda.getInstance(null);
        System.out.printf("Total de Sessões %03d\n", (long) agenda.getSessaos().size());
        for (Lugar lugar : lugars) {
            System.out.printf("Total de Sessões em %s %03d\n", lugar.getNome(), agenda.getSessaos().stream().filter(sessao -> sessao.getLugar().getNome().equals(lugar.getNome())).count());
        }
    }
}
