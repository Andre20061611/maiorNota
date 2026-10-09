import java.util.Scanner;
public class maiorNota {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double maiorNota = 0;
        double menorNota = 0;


        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite a nota do aluno " + i + ": ");
                    double nota = scanner.nextDouble();

               if (i == 1) {
                   maiorNota = nota;
                   menorNota = nota;
               } else {
                   if (nota > maiorNota) {
                       maiorNota = nota;
                   }
                   if (nota < menorNota) {
                       menorNota = nota;
                   }  
               }
        }

        System.out.println("Maior nota: " + maiorNota);
        System.out.println("Menor nota: " + menorNota);

        scanner.close();
    }
}