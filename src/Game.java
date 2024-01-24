import java.util.Scanner;
public class Game {
    public static void main(String[] args) {
        System.out.println("impar ou par?");
        int numeroAleatorio = (int) (Math.random() * 101); // Multiplica por 101 para obter números de 0 a 100
        System.out.println(numeroAleatorio);

        //Aqui podemos ler a entrada do usuario.
        Scanner scanner = new Scanner(System.in);
        String imparOuPar = scanner.nextLine();

        //Se valor de Número aleatório for divisível por 2 sem deixar um resto então o número é par
        // caso contrário, o número é ímpar.
        if (numeroAleatorio % 2 == 0) {
            System.out.println("O número é par!");
        } else {
            System.out.println("O número é ímpar.");
        }

    }
}



