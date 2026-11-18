import java.util.Scanner;
import java.util.Locale;
import java.util.Random;
import java.util.ArrayList;

public class ListaVetoresMatrizes {

    public static void atividadeVetor1() {
        int[] a = {1, 0, 5, -2, -5, 7};
        int soma = a[0] + a[1] + a[5];

        System.out.println("Soma: " + soma);

        a[4] = 100;

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void atividadeVetor2(Scanner scanner) {
        int[] valores = new int[6];

        for (int i = 0; i < valores.length; i++) {
            valores[i] = scanner.nextInt();
        }

        for (int i = 0; i < valores.length; i++) {
            System.out.println(valores[i]);
        }
    }

    public static void atividadeVetor3(Scanner scanner) {
        int[] valores = new int[10];

        for (int i = 0; i < valores.length; i++) {
            valores[i] = scanner.nextInt();
        }

        for (int i = 0; i < valores.length; i++) {
            if (valores[i] % 2 == 0) {
                System.out.println(valores[i]);
            }
        }
    }

    public static void atividadeVetor4(Scanner scanner) {
        String[] nomes = new String[15];

        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = scanner.next();
        }

        for (int i = nomes.length - 1; i >= 0; i--) {
            System.out.println(nomes[i]);
        }
    }

    public static void atividadeVetor5(Scanner scanner) {
        int[] numeros = new int[20];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 != 0) {
                System.out.println(numeros[i]);
            }
        }

        for (int i = 0; i < numeros.length; i++) {
            if (i % 2 == 0) {
                System.out.println(numeros[i]);
            }
        }
    }

    public static double calcularMediaIdades(int[] idades) {
        int soma = 0;

        for (int i = 0; i < idades.length; i++) {
            soma += idades[i];
        }

        return (double) soma / idades.length;
    }

    public static void atividadeVetor6(Scanner scanner) {
        String[] nomes = new String[20];
        int[] idades = new int[20];

        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = scanner.next();
            idades[i] = scanner.nextInt();
        }

        double media = calcularMediaIdades(idades);

        System.out.printf(Locale.US, "Idade média: %.2f%n", media);
        System.out.println("Pessoas com idade acima da média:");

        for (int i = 0; i < nomes.length; i++) {
            if (idades[i] > media) {
                System.out.println(nomes[i]);
            }
        }
    }

    public static void atividadeVetor7(Scanner scanner) {
        int[] primeiro = new int[20];
        int[] segundo = new int[20];
        int[] terceiro = new int[40];

        for (int i = 0; i < 20; i++) {
            primeiro[i] = scanner.nextInt();
        }

        for (int i = 0; i < 20; i++) {
            segundo[i] = scanner.nextInt();
        }

        for (int i = 0; i < 20; i++) {
            terceiro[i * 2] = primeiro[i];
            terceiro[i * 2 + 1] = segundo[i];
        }

        for (int i = 0; i < terceiro.length; i++) {
            System.out.println(terceiro[i]);
        }
    }

    public static void atividadeVetor8(Scanner scanner) {
        int[] primeiro = new int[10];
        int[] segundo = new int[10];
        int[] resultado = new int[20];

        for (int i = 0; i < 10; i++) {
            primeiro[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            segundo[i] = scanner.nextInt();
        }

        for (int i = 0; i < resultado.length; i++) {
            if (i % 2 == 0) {
                resultado[i] = primeiro[i / 2];
            } else {
                resultado[i] = segundo[i / 2];
            }
        }

        for (int i = 0; i < resultado.length; i++) {
            System.out.println(resultado[i]);
        }
    }

    public static boolean atendeCondicaoVetor9(int numero) {
        return numero % 7 != 0 || numero % 10 == 7;
    }

    public static void atividadeVetor9() {
        int[] naturais = new int[100];
        int numero = 0;
        int quantidade = 0;

        while (quantidade < naturais.length) {
            if (atendeCondicaoVetor9(numero)) {
                naturais[quantidade] = numero;
                quantidade++;
            }
            numero++;
        }

        for (int i = 0; i < naturais.length; i++) {
            System.out.println(naturais[i]);
        }
    }

    public static boolean contem(int[] vetor, int tamanho, int valor) {
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == valor) {
                return true;
            }
        }

        return false;
    }

    public static void imprimirVetor(int[] vetor, int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }

    public static void atividadeVetor10(Scanner scanner) {
        int[] x = new int[5];
        int[] y = new int[5];
        int[] soma = new int[5];
        int[] produto = new int[5];
        int[] diferenca = new int[5];
        int[] intersecao = new int[5];
        int[] uniao = new int[10];
        int tamanhoDiferenca = 0;
        int tamanhoIntersecao = 0;
        int tamanhoUniao = 0;

        for (int i = 0; i < 5; i++) {
            x[i] = scanner.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            y[i] = scanner.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            soma[i] = x[i] + y[i];
            produto[i] = x[i] * y[i];

            if (!contem(y, 5, x[i])) {
                diferenca[tamanhoDiferenca] = x[i];
                tamanhoDiferenca++;
            }

            if (contem(y, 5, x[i])) {
                intersecao[tamanhoIntersecao] = x[i];
                tamanhoIntersecao++;
            }

            uniao[tamanhoUniao] = x[i];
            tamanhoUniao++;
        }

        for (int i = 0; i < 5; i++) {
            if (!contem(x, 5, y[i])) {
                uniao[tamanhoUniao] = y[i];
                tamanhoUniao++;
            }
        }

        System.out.print("Soma: ");
        imprimirVetor(soma, 5);

        System.out.print("Produto: ");
        imprimirVetor(produto, 5);

        System.out.print("Diferença: ");
        imprimirVetor(diferenca, tamanhoDiferenca);

        System.out.print("Interseção: ");
        imprimirVetor(intersecao, tamanhoIntersecao);

        System.out.print("União: ");
        imprimirVetor(uniao, tamanhoUniao);
    }

    public static double calcularMediaVetor(double[] vetor) {
        double soma = 0;

        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }

        return soma / vetor.length;
    }

    public static double calcularDesvioPadrao(double[] vetor) {
        double media = calcularMediaVetor(vetor);
        double somaQuadrados = 0;

        for (int i = 0; i < vetor.length; i++) {
            somaQuadrados += Math.pow(vetor[i] - media, 2);
        }

        return Math.sqrt(somaQuadrados / (vetor.length - 1));
    }

    public static void atividadeVetor11(Scanner scanner) {
        double[] valores = new double[10];

        for (int i = 0; i < valores.length; i++) {
            valores[i] = scanner.nextDouble();
        }

        System.out.printf(Locale.US, "Desvio padrão: %.2f%n", calcularDesvioPadrao(valores));
    }

    public static boolean numeroJaExiste(int[] vetor, int quantidade, int numero) {
        for (int i = 0; i < quantidade; i++) {
            if (vetor[i] == numero) {
                return true;
            }
        }

        return false;
    }

    public static void atividadeVetor12(Scanner scanner) {
        int[] numeros = new int[10];
        int quantidade = 0;

        while (quantidade < numeros.length) {
            int numero = scanner.nextInt();

            if (numeroJaExiste(numeros, quantidade, numero)) {
                System.out.println("Número já digitado. Digite outro:");
            } else {
                numeros[quantidade] = numero;
                quantidade++;
            }
        }

        imprimirVetor(numeros, numeros.length);
    }

    public static void atividadeVetor13(Scanner scanner) {
        int linhas = scanner.nextInt();

        if (linhas <= 0) {
            System.out.println("A quantidade de linhas deve ser positiva.");
            return;
        }

        long[] triangulo = new long[linhas];

        for (int i = 0; i < linhas; i++) {
            for (int j = i; j > 0; j--) {
                triangulo[j] = triangulo[j] + triangulo[j - 1];
            }

            triangulo[0] = 1;

            for (int j = 0; j <= i; j++) {
                System.out.print(triangulo[j] + " ");
            }

            System.out.println();
        }
    }

    public static void atividadeMatriz1(Scanner scanner) {
        int[][] matriz = new int[4][4];
        int quantidade = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = scanner.nextInt();

                if (matriz[i][j] > 10) {
                    quantidade++;
                }
            }
        }

        System.out.println("Quantidade de valores maiores que 10: " + quantidade);
    }

    public static void atividadeMatriz2() {
        int[][] matriz = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }

        imprimirMatriz(matriz);
    }

    public static void atividadeMatriz3() {
        int[][] matriz = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = i * j;
            }
        }

        imprimirMatriz(matriz);
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void atividadeMatriz4(Scanner scanner) {
        int[][] matriz = new int[4][4];
        int maior;
        int linhaMaior = 0;
        int colunaMaior = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        maior = matriz[0][0];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                    linhaMaior = i;
                    colunaMaior = j;
                }
            }
        }

        imprimirMatriz(matriz);
        System.out.println("Maior valor: " + maior);
        System.out.println("Linha: " + (linhaMaior + 1));
        System.out.println("Coluna: " + (colunaMaior + 1));
    }

    public static void atividadeMatriz5(Scanner scanner) {
        int[][] matriz = new int[5][5];
        boolean encontrado = false;
        int valor = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        valor = scanner.nextInt();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] == valor) {
                    System.out.println("Encontrado na linha " + (i + 1)
                            + ", coluna " + (j + 1));
                    encontrado = true;
                }
            }
        }

        if (!encontrado) {
            System.out.println("Não encontrado");
        }
    }

    public static void atividadeMatriz6() {
        int[][] matriz = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i < j) {
                    matriz[i][j] = 2 * i + 7 * j - 2;
                } else if (i == j) {
                    matriz[i][j] = 3 * i * i - 1;
                } else {
                    matriz[i][j] = 4 * i * i * i - 5 * j * j + 1;
                }
            }
        }

        imprimirMatriz(matriz);
    }

    public static void atividadeMatriz7(Scanner scanner) {
        int[][] matriz = new int[3][3];
        int acima = 0;
        int abaixo = 0;
        int principal = 0;
        int secundaria = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = scanner.nextInt();

                if (i < j) {
                    acima += matriz[i][j];
                } else if (i > j) {
                    abaixo += matriz[i][j];
                }

                if (i == j) {
                    principal += matriz[i][j];
                }

                if (i + j == 2) {
                    secundaria += matriz[i][j];
                }
            }
        }

        System.out.println("Soma acima da diagonal principal: " + acima);
        System.out.println("Soma abaixo da diagonal principal: " + abaixo);
        System.out.println("Soma da diagonal principal: " + principal);
        System.out.println("Soma da diagonal secundária: " + secundaria);
    }

    public static void atividadeMatriz8() {
        int[][] original = new int[4][4];
        int[][] triangular = new int[4][4];
        Random random = new Random();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                original[i][j] = random.nextInt(20) + 1;

                if (i >= j) {
                    triangular[i][j] = original[i][j];
                } else {
                    triangular[i][j] = 0;
                }
            }
        }

        System.out.println("Matriz original:");
        imprimirMatriz(original);

        System.out.println("Matriz triangular inferior:");
        imprimirMatriz(triangular);
    }

    public static boolean numeroNaCartela(int[][] cartela, int quantidade, int numero) {
        for (int k = 0; k < quantidade; k++) {
            int linha = k / 5;
            int coluna = k % 5;

            if (cartela[linha][coluna] == numero) {
                return true;
            }
        }

        return false;
    }

    public static void atividadeMatriz9() {
        int[][] cartela = new int[5][5];
        Random random = new Random();
        int quantidade = 0;

        while (quantidade < 25) {
            int numero = random.nextInt(100);

            if (!numeroNaCartela(cartela, quantidade, numero)) {
                cartela[quantidade / 5][quantidade % 5] = numero;
                quantidade++;
            }
        }

        imprimirMatriz(cartela);
    }

    public static void atividadeMatriz10(Scanner scanner) {
        int[][] matriz = new int[3][3];
        int[] somas = new int[3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = scanner.nextInt();
                somas[j] += matriz[i][j];
            }
        }

        System.out.println("Soma das colunas:");
        imprimirVetor(somas, somas.length);
    }

    public static void atividadeMatriz11(Scanner scanner) {
        int[][] alunos = new int[5][4];
        int maiorNota = Integer.MIN_VALUE;
        int matriculaMaiorNota = 0;
        int somaNotasFinais = 0;

        for (int i = 0; i < 5; i++) {
            alunos[i][0] = scanner.nextInt();
            alunos[i][1] = scanner.nextInt();
            alunos[i][2] = scanner.nextInt();

            alunos[i][3] = alunos[i][1] + alunos[i][2];
            somaNotasFinais += alunos[i][3];

            if (alunos[i][3] > maiorNota) {
                maiorNota = alunos[i][3];
                matriculaMaiorNota = alunos[i][0];
            }
        }

        System.out.println("Matrícula do aluno com maior nota final: " + matriculaMaiorNota);
        System.out.printf(Locale.US, "Média das notas finais: %.2f%n", somaNotasFinais / 5.0);
    }

    public static void imprimirMatrizReal(double[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf(Locale.US, "%.2f ", matriz[i][j]);
            }
            System.out.println();
        }
    }

    public static void atividadeMatriz12(Scanner scanner) {
        double[][] primeira = new double[2][2];
        double[][] segunda = new double[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                primeira[i][j] = scanner.nextDouble();
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                segunda[i][j] = scanner.nextDouble();
            }
        }

        int opcao = scanner.nextInt();

        if (opcao == 1) {
            double[][] resultado = new double[2][2];

            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    resultado[i][j] = primeira[i][j] + segunda[i][j];
                }
            }

            imprimirMatrizReal(resultado);
        } else if (opcao == 2) {
            double[][] resultado = new double[2][2];

            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    resultado[i][j] = segunda[i][j] - primeira[i][j];
                }
            }

            imprimirMatrizReal(resultado);
        } else if (opcao == 3) {
            double constante = scanner.nextDouble();

            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    primeira[i][j] += constante;
                    segunda[i][j] += constante;
                }
            }

            System.out.println("Primeira matriz:");
            imprimirMatrizReal(primeira);

            System.out.println("Segunda matriz:");
            imprimirMatrizReal(segunda);
        } else if (opcao == 4) {
            System.out.println("Primeira matriz:");
            imprimirMatrizReal(primeira);

            System.out.println("Segunda matriz:");
            imprimirMatrizReal(segunda);
        } else {
            System.out.println("Opção inválida.");
        }
    }

    public static void inicializarTeatro(int[][] lugares) {
        for (int i = 0; i < lugares.length; i++) {
            for (int j = 0; j < lugares[i].length; j++) {
                lugares[i][j] = -1;
            }
        }
    }

    public static void venderPoltrona(int[][] lugares, int linha, int coluna) {
        if (linha < 0 || linha >= lugares.length || coluna < 0 || coluna >= lugares[0].length) {
            System.out.println("Poltrona inválida");
        } else if (lugares[linha][coluna] == -1) {
            lugares[linha][coluna] = 1;
        } else {
            System.out.println("Poltrona já foi vendida");
        }
    }

    public static void atividadeMatriz13(Scanner scanner) {
        int[][] lugares = new int[10][10];
        inicializarTeatro(lugares);

        int quantidadeCompras = scanner.nextInt();

        for (int i = 0; i < quantidadeCompras; i++) {
            int linha = scanner.nextInt();
            int coluna = scanner.nextInt();
            venderPoltrona(lugares, linha - 1, coluna - 1);
        }

        imprimirMatriz(lugares);
    }

    public static void atividadeMatriz14(Scanner scanner) {
        int quantidadeAlunos = scanner.nextInt();

        for (int i = 0; i < quantidadeAlunos; i++) {
            String nome = scanner.next();
            int faltas = 0;
            ArrayList<Integer> diasFaltados = new ArrayList<>();

            for (int dia = 1; dia <= 30; dia++) {
                String presenca = scanner.next();

                if (presenca.equals("F")) {
                    faltas++;
                    diasFaltados.add(dia);
                }
            }

            if (faltas > 10) {
                System.out.print(nome + " - dias:");

                for (int j = 0; j < diasFaltados.size(); j++) {
                    System.out.print(" " + diasFaltados.get(j));
                }

                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Escolha a atividade:");
        System.out.println("Vetores: 1 a 13");
        System.out.println("Matrizes: 14 a 27");

        int atividade = scanner.nextInt();

        switch (atividade) {
            case 1:
                atividadeVetor1();
                break;
            case 2:
                atividadeVetor2(scanner);
                break;
            case 3:
                atividadeVetor3(scanner);
                break;
            case 4:
                atividadeVetor4(scanner);
                break;
            case 5:
                atividadeVetor5(scanner);
                break;
            case 6:
                atividadeVetor6(scanner);
                break;
            case 7:
                atividadeVetor7(scanner);
                break;
            case 8:
                atividadeVetor8(scanner);
                break;
            case 9:
                atividadeVetor9();
                break;
            case 10:
                atividadeVetor10(scanner);
                break;
            case 11:
                atividadeVetor11(scanner);
                break;
            case 12:
                atividadeVetor12(scanner);
                break;
            case 13:
                atividadeVetor13(scanner);
                break;
            case 14:
                atividadeMatriz1(scanner);
                break;
            case 15:
                atividadeMatriz2();
                break;
            case 16:
                atividadeMatriz3();
                break;
            case 17:
                atividadeMatriz4(scanner);
                break;
            case 18:
                atividadeMatriz5(scanner);
                break;
            case 19:
                atividadeMatriz6();
                break;
            case 20:
                atividadeMatriz7(scanner);
                break;
            case 21:
                atividadeMatriz8();
                break;
            case 22:
                atividadeMatriz9();
                break;
            case 23:
                atividadeMatriz10(scanner);
                break;
            case 24:
                atividadeMatriz11(scanner);
                break;
            case 25:
                atividadeMatriz12(scanner);
                break;
            case 26:
                atividadeMatriz13(scanner);
                break;
            case 27:
                atividadeMatriz14(scanner);
                break;
            default:
                System.out.println("Atividade inválida. Escolha de 1 a 27.");
        }

        scanner.close();
    }
}
