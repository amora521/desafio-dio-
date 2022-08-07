import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devPaloma = new Dev();
        devPaloma.setNome("Paloma");
        devPaloma.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Paloma: " + devPaloma.getConteudosInscritos());
        devPaloma.progredir();
        devPaloma.progredir();
        System.out.println("Conteúdos Inscritos Paloma: " + devPaloma.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Paloma: " + devPaloma.getConteudosConcluidos());
        System.out.println("XP: " + devPaloma.caucularTotalXp());

        Dev devRafael = new Dev();
        devRafael.setNome("Rafael");
        devRafael.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Rafael: " + devRafael.getConteudosInscritos());
        devRafael.progredir();
        devRafael.progredir();
        devRafael.progredir();
        System.out.println("Conteúdos Inscritos Rafael: " + devRafael.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Rafael: " + devRafael.getConteudosConcluidos());
        System.out.println("XP: " + devRafael.caucularTotalXp());


    }
}
