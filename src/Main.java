import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Descrição Curso Js");
        curso2.setCargaHoraria(4);

        Curso curso3 = new Curso();
        curso3.setTitulo("Curso WEB");
        curso3.setDescricao("Descrição Curso WEB");
        curso3.setCargaHoraria(24);

        Curso curso4 = new Curso();
        curso4.setTitulo("Curso - Banco de Dados");
        curso4.setDescricao("Descrição Curso - Banco de Dados");
        curso4.setCargaHoraria(10);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(curso3);
        bootcamp.getConteudos().add(curso4);
        bootcamp.getConteudos().add(mentoria);

        Dev devFernanda = new Dev();
        devFernanda.setNome("Fernanda");
        devFernanda.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Fernanda: " + devFernanda.getConteudosInscritos());
        devFernanda.progredir();
        System.out.println("Conteúdos Inscritos Fernanda: " + devFernanda.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Fernanda: " + devFernanda.getConteudosConcluidos());
        System.out.println("XP: " + devFernanda.calcularTotalXp());

        System.out.println("---------------------------");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila: " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila: " + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila: " + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());

        System.out.println("---------------------------");

        Dev devIsabela = new Dev();
        devIsabela.setNome("Camila");
        devIsabela.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Isabela: " + devIsabela.getConteudosInscritos());
        devIsabela.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Isabela: " + devIsabela.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Isabela: " + devIsabela.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());
    }
}