package operadores;
public class OperadoresRelacionais {
  public static void main(String[] args) {
      int primeiroNumero = 10;
      int segundoNumero = 5;

      System.out.println("O Primeiro número é igual ao Segundo número? " + (primeiroNumero == segundoNumero));
      System.out.println("O Primeiro número é diferente do Segundo número? " + (primeiroNumero != segundoNumero));
      System.out.println("O Primeiro número é maior que o Segundo número? " + (primeiroNumero > segundoNumero));
      System.out.println("O Primeiro número é menor que o Segundo número? " + (primeiroNumero < segundoNumero));
      System.out.println("O Primeiro número é maior ou igual que o Segundo número? " + (primeiroNumero >= segundoNumero));
      System.out.println("O Primeiro número é menor ou igual que o Segundo número? " + (primeiroNumero <= segundoNumero));
  }
}