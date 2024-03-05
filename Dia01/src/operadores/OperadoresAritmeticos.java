package operadores;
public class OperadoresAritmeticos {
  
  public static void main(String[] args) {
      int primeiroNumero = 10;
      int segundoNumero = 3;

      int soma = primeiroNumero + segundoNumero;
      int subtracao = primeiroNumero - segundoNumero;
      int multiplicacao = primeiroNumero * segundoNumero;
      double divisao = (double) primeiroNumero / segundoNumero; // Convertendo para double para obter um resultado com casas decimais
      int modulo = primeiroNumero % segundoNumero;

      System.out.println("Soma: " + soma);
      System.out.println("Subtração: " + subtracao);
      System.out.println("Multiplicação: " + multiplicacao);
      System.out.println("Divisão: " + divisao);
      System.out.println("Módulo: " + modulo);
  }
}