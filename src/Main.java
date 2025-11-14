import java.util.List;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner (System.in);
        List<Integer> escolhas = List.of(1, 2, 3, 4, 5, 6, 7);

        System.out.println("🪙 Seja bem-vindo(a) ao Conversor de Moedas 🪙");

        System.out.println();
        System.out.println("--- USD 🔄️ ARS ---");
        System.out.println("1. Dólar Americano para Peso Argentino (USD -> ARS)");
        System.out.println("2. Peso Argentino para Dólar Americano (ARS -> USD)");

        System.out.println();
        System.out.println("--- USD 🔄️ BRL ---");
        System.out.println("3. Dólar Americano para Real Brasileiro (USD -> BRL)");
        System.out.println("4. Real Brasileiro para Dólar Americano (BRL -> USD)");

        System.out.println();
        System.out.println("--- USD 🔄️ COP ---");
        System.out.println("5. Dólar Americano para Peso Colombiano (USD -> COP)");
        System.out.println("6. Peso Colombiano para Dólar Americano (COP -> USD)");

        System.out.println();
        System.out.println("- Deseja sair? 👋🏻 -");
        System.out.println("7. Encerrar programa");

        System.out.println();
        while (true) {
            System.out.print("🔺 Escolha uma das opções acima: ");
            int opcao = 0;
            try {
                opcao = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("❌ Erro! Por favor, escolha uma opção válida (1-7).");
            }
            System.out.println(opcao);
            if (!escolhas.contains(opcao)) {
                System.out.println("❌ Erro! Por favor, escolha uma opção válida (1-7).");
            }
        }
    }
}
