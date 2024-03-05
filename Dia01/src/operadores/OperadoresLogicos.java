package operadores;
public class OperadoresLogicos {
  public static void main(String[] args) {
      boolean x = true;
      boolean y = false;

      System.out.println("x E y: " + (x && y));
      System.out.println("x OU y: " + (x || y));
      System.out.println("NÃO x: " + (!x));
      System.out.println("x XOR y: " + (x ^ y));
  }
}