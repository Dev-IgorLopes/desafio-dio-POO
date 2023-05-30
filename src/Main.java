import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
      Curso curso = new Curso("Java", "Curso Java", 120);
      


      Mentoria mentoria = new Mentoria("Aulão Kotlin", "Curso Kotlin", LocalDate.now());


      System.out.println(curso);
      System.out.println(mentoria);
    }
}
