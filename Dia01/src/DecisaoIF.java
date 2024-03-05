import java.util.Scanner;

public class DecisaoIF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a nota do aluno: ");
        int nota = scanner.nextInt();
        
        if (nota >= 90 && nota <= 100) {
            System.out.println("Nota A");
        } else if (nota >= 80 && nota < 90) {
            System.out.println("Nota B");
        } else if (nota >= 70 && nota < 80) {
            System.out.println("Nota C");
        } else if (nota >= 60 && nota < 70) {
            System.out.println("Nota D");
        } else if (nota >= 0 && nota < 60) {
            System.out.println("Nota F");
        } else {
            System.out.println("Nota inválida");
        }
        
        scanner.close();
    }
}