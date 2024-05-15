package aplicacao;

import entidades.Bootcamp;
import entidades.Curso;
import entidades.Dev;
import entidades.Mentorias;

import java.time.LocalDate;

public class Programa {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso 1");
        curso1.setDescricao("Curso 1 descrição");
        curso1.setCargaHoraria(3);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso 2");
        curso2.setDescricao("Curso 2 descrição");
        curso2.setCargaHoraria(2);

        Mentorias mentoria = new Mentorias();
        mentoria.setTitulo("Mentoria");
        mentoria.setDescricao("Mentoria descrição");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição bootcamp java developer");
        bootcamp.getConteudosDoBootcamp().add(curso1);
        bootcamp.getConteudosDoBootcamp().add(curso2);
        bootcamp.getConteudosDoBootcamp().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Leonardo");
        dev1.setConteudosInscritos(bootcamp.getConteudosDoBootcamp());
        System.out.println("Conteudos inscritos: " + dev1.getConteudosInscritos().toString());
        System.out.println("Conteudos concluidos: " + dev1.getConteudosConcluidos().toString());
        System.out.println("XP: " + dev1.calcularXpTotal());

        System.out.println("--------------------------------------------------------------");

        Dev dev2 = new Dev();
        dev2.setNome("Aline");
        dev2.setConteudosInscritos(bootcamp.getConteudosDoBootcamp());
        System.out.println("Conteudos inscritos: " + dev2.getConteudosInscritos().toString());
        dev2.progredir();
        System.out.println("Conteudos concluidos: " + dev2.getConteudosConcluidos().toString());
        System.out.println("Conteudos inscritos: " + dev2.getConteudosInscritos().toString());
        System.out.println("XP: " + dev2.calcularXpTotal());



    }
}
