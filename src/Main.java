import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    static void main() throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        List<Integer> escolhas = new ArrayList<>();

        List<String> moedas = new ArrayList<>(List.of(
                "Dólar Americano (USD)", "Euro (EUR)", "Libra Esterlina (GBP)",
                "Iene Japonês (JPY)", "Dólar Australiano (AUD)", "Franco Suíço (CHF)",
                "Dólar Canadense (CAD)", "Yuan Chinês (CNY)", "Real Brasileiro (BRL)")
        );

        List<String> codigoMoeda = new ArrayList<>();

        Collections.sort(moedas);

        System.out.println("💱 Seja bem-vindo(a) ao Conversor de Moedas! 💱");
        Thread.sleep(1000);
        System.out.println("ℹ️ Primeiro escolha a Moeda Base e em seguida escolha a Moeda a Converter.");
        Thread.sleep(3000);

        System.out.println();
        System.out.println("==== 🪙 Moeda Base 🪙 ====");
        int i = 1;
        int inicio = 0;
        int fim = 0;
        for (String moeda : moedas) {
            escolhas.add(i);

            inicio = moeda.indexOf('(') + 1;
            fim = moeda.indexOf(')');
            String codigo = moeda.substring(inicio, fim);
            codigoMoeda.add(codigo);

            Thread.sleep(400);
            System.out.println(i + ". " + moeda);
            i++;
        }

        String opcao;
        int erros = 0;
        while (true) {
            System.out.print("🔸 Escolha uma das opções: ");
            opcao = sc.nextLine().trim().toUpperCase();
            int indexCodigo = 0;
            if (!codigoMoeda.contains(opcao)) {
                try {
                    int opcaoNumerica = Integer.parseInt(opcao);
                    if (!escolhas.contains(opcaoNumerica)) {
                        System.out.println("❌ Erro! Digite uma opção válida.");
                        Thread.sleep(800);
                        if (erros >= 1) {
                            System.out.println("ℹ️ Você pode optar em digitar o valor equivalente à moeda no menu" +
                                    " ou o próprio código da moeda! ");
                            Thread.sleep(3000);
                        }
                        erros++;
                        continue;
                    }
                    System.out.println("🪙 Moeda Base escolhida: " + moedas.get(opcaoNumerica-1));
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("❌ Erro! Digite uma opção válida.");
                    Thread.sleep(800);
                    if (erros >= 1) {
                        System.out.println("ℹ️ Você pode optar em digitar o valor equivalente à moeda no menu" +
                                " ou o próprio código da moeda! ");
                        Thread.sleep(3000);
                    }
                    erros++;
                }
            } else {
                i = 0;
                indexCodigo = 0;
                for (String c : codigoMoeda) {
                    if (c.equals(opcao)) {
                        indexCodigo = i;
                        break;
                    } else {
                        i++;
                    }
                }
                System.out.println(" 🪙 Moeda Base escolhida: " + moedas.get(indexCodigo));
                break;
            }
        }
    }
}
