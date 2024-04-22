import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numerosVoo = new int[12];
        int[] lugaresDisponiveis = new int[12];

        for (int i = 0; i < 12; i++) {
            numerosVoo[i] = i + 1;
            lugaresDisponiveis[i] = 10;
        }

        int opcao;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Consultar");
            System.out.println("2. Efetuar reserva");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    consultar(scanner, numerosVoo, lugaresDisponiveis);
                    break;
                case 2:
                    efetuarReserva(scanner, numerosVoo, lugaresDisponiveis);
                    break;
                case 3:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 3);

        scanner.close();
    }

    public static void consultar(Scanner scanner, int[] numerosVoo, int[] lugaresDisponiveis) {
        System.out.println("\n===== MENU CONSULTA =====");
        System.out.println("1. Por número do voo");
        System.out.println("2. Sair");
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("Digite o número do voo: ");
                int numeroVooConsulta = scanner.nextInt();
                int index = -1;
                for (int i = 0; i < numerosVoo.length; i++) {
                    if (numerosVoo[i] == numeroVooConsulta) {
                        index = i;
                        break;
                    }
                }
                if (index != -1) {
                    System.out.println("Número do voo: " + numerosVoo[index]);
                    System.out.println("Lugares disponíveis: " + lugaresDisponiveis[index]);
                } else {
                    System.out.println("Voo não encontrado.");
                }
                break;
            case 2:
                System.out.println("Voltando ao menu principal...");
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }

    public static void efetuarReserva(Scanner scanner, int[] numerosVoo, int[] lugaresDisponiveis) {
        System.out.print("Digite o número do voo: ");
        int numeroVooReserva = scanner.nextInt();
        int index = -1;
        for (int i = 0; i < numerosVoo.length; i++) {
            if (numerosVoo[i] == numeroVooReserva) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            if (lugaresDisponiveis[index] > 0) {
                lugaresDisponiveis[index]--;
                System.out.println("Reserva confirmada. Lugares restantes: " + lugaresDisponiveis[index]);
            } else {
                System.out.println("Voo lotado.");
            }
        } else {
            System.out.println("Voo inexistente.");
        }
    }
}