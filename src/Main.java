import Desafio.Dominio.BootCamp;
import Desafio.Dominio.Curso;
import Desafio.Dominio.Devs;
import Desafio.Dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);
        System.out.println(curso1);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java.");
        mentoria.setDescricao("Descrição mentoria Java.");
        mentoria.setData(LocalDate.now());
        System.out.println(mentoria);

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("BootCamp Java Developer");
        bootCamp.setDescricao("Descrição BootCamp Java Developer");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(mentoria);

        Devs dev = new Devs();
        dev.setNome("Marcelo");
        dev.inscreverBootCamp(bootCamp);
        System.out.println("Devs " + dev.getNome() + " está inscrito: " + dev.getConteudosInscritos());
        dev.progredir();
        System.out.println("Devs " + dev.getNome() + " concluiu: " + dev.getConteudosConcluidos());
        System.out.println("XP conquistado: " + dev.calcularXpTotal());
        System.out.println();

        Devs dev1 = new Devs();
        dev1.setNome("João");
        dev1.inscreverBootCamp(bootCamp);
        System.out.println("Devs " + dev1.getNome() + " está inscrito: " + dev1.getConteudosInscritos());
        dev1.progredir();
        System.out.println("Devs " + dev1.getNome() + " concluiu : " + dev1.getConteudosConcluidos());
        System.out.println("XP conquistado: " + dev1.calcularXpTotal());

    }
}
