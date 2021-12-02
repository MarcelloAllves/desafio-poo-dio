import Desafio.Dominio.Curso;
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
    }
}
