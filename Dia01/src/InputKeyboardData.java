import java.util.Scanner;

public class InputKeyboardData {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite seu nome: ");
    String nome = scanner.nextLine();

    System.out.println("Digite sua idade: ");
    int idade = scanner.nextInt();
    
    System.out.println("Digite sua altura: ");
    double altura = scanner.nextDouble();

    System.out.println("Nome: " + nome);
    System.out.println("Idade: " + idade);
    System.out.println("Altura: " + altura);
    scanner.close();
  }
  
}
