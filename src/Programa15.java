/*Nome do aluno: Rafael Ferreira Sikora
 * RA: 942312120
 * Nome do Programa 15: Faça um programa que preencha com zeros todas as posições
de uma matriz com 10 linha e 10 colunas.
 * Data: 21/05/2023
 */
public class Programa15 {
    public static void main(String[] args) throws Exception {
        int[][] matriz = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = 0;
            }
        }
        System.out.println("Matriz preenchida com zeros:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}