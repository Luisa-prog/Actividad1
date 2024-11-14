

public class Main {
  public static void main(String[] args) {
   var resultado = 6/2 *(1+2);
    //cambia las prioridades
   var resultadoErroneo = 6/(2*(1+2));
    System.out.println(resultado);
    System.out.println(resultadoErroneo);
  }

}