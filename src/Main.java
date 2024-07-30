import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> masculino = new ArrayList<>();
        List<String> feminino = new ArrayList<>();

        String continuar;

        do {
            System.out.print("Digite o nome: ");
            String nome = scanner.nextLine();

            System.out.print("Digite o sexo (M/F): ");
            String sexo = scanner.nextLine().toUpperCase();

            if (sexo.equals("M")) {
                masculino.add(nome);
            } else if (sexo.equals("F")) {
                feminino.add(nome);
            } else {
                System.out.println("Sexo inválido! Digite 'M' para masculino ou 'F' para feminino.");
            }

            System.out.print("Deseja continuar? (S/N): ");
            continuar = scanner.nextLine().toUpperCase();

        } while (continuar.equals("S"));


        Collections.sort(masculino);
        Collections.sort(feminino);


        System.out.println("\nGrupo Masculino:");
        for (String nome : masculino) {
            System.out.println(nome);
        }

        System.out.println("\nGrupo Feminino:");
        for (String nome : feminino) {
            System.out.println(nome);
        }
    }
}
