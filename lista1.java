import java.util.Scanner;
import java.util.Locale;
import java.util.ArrayList;

public class ListaFuncoesJava {

    public static double fahrenheit(double c) {
        return c * 1.8 + 32;
    }

    public static double kelvin(double c) {
        return c + 273.15;
    }

    public static double reaumur(double c) {
        return c * 0.8;
    }

    public static double rankine(double c) {
        return c * 1.8 + 491.67;
    }

    public static void exercicio1(Scanner scanner) {
        double celsius = scanner.nextDouble();

        System.out.printf(Locale.US, "Fahrenheit: %.3f%n", fahrenheit(celsius));
        System.out.printf(Locale.US, "Kelvin: %.2f%n", kelvin(celsius));
        System.out.printf(Locale.US, "Réaumur: %.3f%n", reaumur(celsius));
        System.out.printf(Locale.US, "Rankine: %.3f%n", rankine(celsius));
    }

    public static double maiorAltura(double[] alturas) {
        double maior = alturas[0];

        for (int i = 1; i < alturas.length; i++) {
            if (alturas[i] > maior) {
                maior = alturas[i];
            }
        }

        return maior;
    }

    public static double menorAltura(double[] alturas) {
        double menor = alturas[0];

        for (int i = 1; i < alturas.length; i++) {
            if (alturas[i] < menor) {
                menor = alturas[i];
            }
        }

        return menor;
    }

    public static double mediaHomens(double[] alturas, int[] sexos) {
        double soma = 0;
        int quantidade = 0;

        for (int i = 0; i < sexos.length; i++) {
            if (sexos[i] == 2) {
                soma += alturas[i];
                quantidade++;
            }
        }

        if (quantidade == 0) {
            return 0;
        }

        return soma / quantidade;
    }

    public static int quantidadeMulheres(int[] sexos) {
        int quantidade = 0;

        for (int i = 0; i < sexos.length; i++) {
            if (sexos[i] == 1) {
                quantidade++;
            }
        }

        return quantidade;
    }

    public static void exercicio2(Scanner scanner) {
        double[] alturas = new double[10];
        int[] sexos = new int[10];

        for (int i = 0; i < 10; i++) {
            sexos[i] = scanner.nextInt();
            alturas[i] = scanner.nextDouble();
        }

        System.out.printf(Locale.US, "Maior altura: %.2f m%n", maiorAltura(alturas));
        System.out.printf(Locale.US, "Menor altura: %.2f m%n", menorAltura(alturas));
        System.out.printf(Locale.US, "Média de altura dos homens: %.2f m%n", mediaHomens(alturas, sexos));
        System.out.println("Número de mulheres: " + quantidadeMulheres(sexos));
    }

    public static double calcularMediaSalarial(double[] salarios) {
        double soma = 0;

        for (int i = 0; i < salarios.length; i++) {
            soma += salarios[i];
        }

        return soma / salarios.length;
    }

    public static void exercicio3(Scanner scanner) {
        int quantidade = scanner.nextInt();

        if (quantidade <= 0) {
            System.out.println("A quantidade de funcionários deve ser maior que zero.");
            return;
        }

        double[] salarios = new double[quantidade];

        for (int i = 0; i < quantidade; i++) {
            salarios[i] = scanner.nextDouble();
        }

        System.out.printf(Locale.US, "Média salarial: %.2f%n", calcularMediaSalarial(salarios));
    }

    public static int calcularAzulejos(double alturaParede, double larguraParede,
                                       double alturaAzulejo, double larguraAzulejo) {
        double areaParede = alturaParede * larguraParede;
        double areaAzulejo = alturaAzulejo * larguraAzulejo;

        return (int) Math.ceil(areaParede / areaAzulejo);
    }

    public static void exercicio4(Scanner scanner) {
        double alturaParede = scanner.nextDouble();
        double larguraParede = scanner.nextDouble();
        double alturaAzulejo = scanner.nextDouble();
        double larguraAzulejo = scanner.nextDouble();

        if (alturaAzulejo <= 0 || larguraAzulejo <= 0) {
            System.out.println("As dimensões do azulejo devem ser maiores que zero.");
            return;
        }

        System.out.println("Quantidade de azulejos necessários: "
                + calcularAzulejos(alturaParede, larguraParede, alturaAzulejo, larguraAzulejo));
    }

    public static double calcularVolume(double raio, double altura) {
        return Math.PI * raio * raio * altura;
    }

    public static void exercicio5(Scanner scanner) {
        double raio = scanner.nextDouble();
        double altura = scanner.nextDouble();

        System.out.printf(Locale.US, "Volume da lata de óleo: %.2f m³%n",
                calcularVolume(raio, altura));
    }

    public static double calcularPotencia(double massa, double altura, double tempo) {
        double gravidade = 9.81;
        double potenciaWatts = (massa * gravidade * altura) / tempo;

        return potenciaWatts / 745.6999;
    }

    public static void exercicio6(Scanner scanner) {
        double massa = scanner.nextDouble();
        double altura = scanner.nextDouble();
        double tempo = scanner.nextDouble();

        if (tempo <= 0) {
            System.out.println("O tempo deve ser maior que zero.");
            return;
        }

        System.out.printf(Locale.US, "Potência necessária: %.3f hp%n",
                calcularPotencia(massa, altura, tempo));
    }

    public static long calcularFatorial(int numero) {
        long fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        return fatorial;
    }

    public static void exercicio7(Scanner scanner) {
        int numero = scanner.nextInt();

        if (numero < 0 || numero > 20) {
            System.out.println("Digite um número entre 0 e 20.");
            return;
        }

        System.out.println("Fatorial: " + calcularFatorial(numero));
    }

    public static int calcularHoras(int segundos) {
        return segundos / 3600;
    }

    public static int calcularMinutos(int segundos) {
        return (segundos % 3600) / 60;
    }

    public static int calcularSegundosRestantes(int segundos) {
        return segundos % 60;
    }

    public static void exercicio8(Scanner scanner) {
        int segundos = scanner.nextInt();

        System.out.println(calcularHoras(segundos) + " hora(s)");
        System.out.println(calcularMinutos(segundos) + " minuto(s)");
        System.out.println(calcularSegundosRestantes(segundos) + " segundo(s)");
    }

    public static double calcularMediaAluno(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }

    public static String verificarSituacao(double media) {
        if (media >= 7) {
            return "Aprovado";
        } else if (media >= 5) {
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }

    public static double calcularMediaGeral(double[] medias) {
        double soma = 0;

        for (int i = 0; i < medias.length; i++) {
            soma += medias[i];
        }

        return soma / medias.length;
    }

    public static void exercicio9(Scanner scanner) {
        int quantidade = scanner.nextInt();

        if (quantidade <= 0) {
            System.out.println("A quantidade de alunos deve ser maior que zero.");
            return;
        }

        double[] medias = new double[quantidade];

        for (int i = 0; i < quantidade; i++) {
            double nota1 = scanner.nextDouble();
            double nota2 = scanner.nextDouble();
            double nota3 = scanner.nextDouble();

            medias[i] = calcularMediaAluno(nota1, nota2, nota3);

            System.out.printf(Locale.US, "Aluno %d - Média: %.1f - %s%n",
                    i + 1, medias[i], verificarSituacao(medias[i]));
        }

        System.out.printf(Locale.US, "Média geral da turma: %.1f%n",
                calcularMediaGeral(medias));
    }

    public static double calcularTotal(ArrayList<Double> precos) {
        double total = 0;

        for (int i = 0; i < precos.size(); i++) {
            total += precos.get(i);
        }

        return total;
    }

    public static double calcularDesconto(double total) {
        if (total > 500) {
            return total * 0.15;
        } else if (total > 200) {
            return total * 0.10;
        } else {
            return 0;
        }
    }

    public static double calcularValorFinal(double total, double desconto) {
        return total - desconto;
    }

    public static void exercicio10(Scanner scanner) {
        ArrayList<Double> precos = new ArrayList<>();

        double preco = scanner.nextDouble();

        while (preco != 0) {
            precos.add(preco);
            preco = scanner.nextDouble();
        }

        double total = calcularTotal(precos);
        double desconto = calcularDesconto(total);
        double valorFinal = calcularValorFinal(total, desconto);

        System.out.printf(Locale.US, "Total da compra: %.2f%n", total);
        System.out.printf(Locale.US, "Desconto: %.2f%n", desconto);
        System.out.printf(Locale.US, "Valor final: %.2f%n", valorFinal);
    }

    public static int maiorNumero(int[] numeros) {
        int maior = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        return maior;
    }

    public static int menorNumero(int[] numeros) {
        int menor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        return menor;
    }

    public static int contarPares(int[] numeros) {
        int quantidade = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                quantidade++;
            }
        }

        return quantidade;
    }

    public static double calcularMediaNumeros(int[] numeros) {
        double soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }

        return soma / numeros.length;
    }

    public static void exercicio11(Scanner scanner) {
        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Maior número: " + maiorNumero(numeros));
        System.out.println("Menor número: " + menorNumero(numeros));
        System.out.println("Quantidade de pares: " + contarPares(numeros));
        System.out.printf(Locale.US, "Média: %.1f%n", calcularMediaNumeros(numeros));
    }

    public static int contarNumeros(int[] numeros) {
        return numeros.length;
    }

    public static int calcularSoma(int[] numeros) {
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }

        return soma;
    }

    public static double calcularMediaEstatistica(int[] numeros) {
        return (double) calcularSoma(numeros) / contarNumeros(numeros);
    }

    public static int contarImpares(int[] numeros) {
        int quantidade = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 != 0) {
                quantidade++;
            }
        }

        return quantidade;
    }

    public static void exercicio12(Scanner scanner) {
        ArrayList<Integer> lista = new ArrayList<>();

        int numero = scanner.nextInt();

        while (numero != -1) {
            if (numero > 0) {
                lista.add(numero);
            }
            numero = scanner.nextInt();
        }

        if (lista.isEmpty()) {
            System.out.println("Nenhum número válido foi informado.");
            return;
        }

        int[] numeros = new int[lista.size()];

        for (int i = 0; i < lista.size(); i++) {
            numeros[i] = lista.get(i);
        }

        System.out.println("Quantidade de números: " + contarNumeros(numeros));
        System.out.println("Soma: " + calcularSoma(numeros));
        System.out.printf(Locale.US, "Média: %.1f%n", calcularMediaEstatistica(numeros));
        System.out.println("Maior número: " + maiorNumero(numeros));
        System.out.println("Menor número: " + menorNumero(numeros));
        System.out.println("Quantidade de pares: " + contarPares(numeros));
        System.out.println("Quantidade de ímpares: " + contarImpares(numeros));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Escolha a atividade de 1 a 12:");
        int atividade = scanner.nextInt();

        switch (atividade) {
            case 1:
                exercicio1(scanner);
                break;
            case 2:
                exercicio2(scanner);
                break;
            case 3:
                exercicio3(scanner);
                break;
            case 4:
                exercicio4(scanner);
                break;
            case 5:
                exercicio5(scanner);
                break;
            case 6:
                exercicio6(scanner);
                break;
            case 7:
                exercicio7(scanner);
                break;
            case 8:
                exercicio8(scanner);
                break;
            case 9:
                exercicio9(scanner);
                break;
            case 10:
                exercicio10(scanner);
                break;
            case 11:
                exercicio11(scanner);
                break;
            case 12:
                exercicio12(scanner);
                break;
            default:
                System.out.println("Atividade inválida. Escolha um número de 1 a 12.");
        }

        scanner.close();
    }
}
