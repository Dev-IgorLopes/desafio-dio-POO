import java.time.LocalDate;

import br.com.dio.desafio.dominio.BootCamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
      Curso curso = new Curso();
      curso.setTitulo("Java");
      curso.setDescricao("Curso Java");
      curso.setCargaHoraria(120);
      Conteudo conteudo = new Curso();
      

      Mentoria mentoria = new Mentoria();
      mentoria.setTitulo("Aulão Kotlin");
      mentoria.setDescricao("Curso Kotlin");
      mentoria.setData(LocalDate.now());

      BootCamp bootcamp1 = new BootCamp();
      bootcamp1.setNome("BootCamp Kotlin Developer BackEnd");
      bootcamp1.setDescricao("Backend Developer é um programa gratuito para formação de profissionais que estão iniciando sua carreira e buscam mais conhecimento técnico em desenvolvimento back-end. ");
      bootcamp1.getConteudos().add(curso);
      bootcamp1.getConteudos().add(mentoria);

      Dev devs = new Dev();
      devs.setNome("Igor");
      devs.inscreverBootCamp(bootcamp1);
      System.out.println("Conteudos inscritos: " + devs.getConteudosInscritos());
      devs.progredir();
      System.out.println("Conteudos inscritos: " + devs.getConteudosInscritos());
    
      System.out.println("Conteudos Concluidos: " + devs.getConteudosConcluidos());
      System.out.println("XP"+ devs.calcularTotalXp());

    }
}
