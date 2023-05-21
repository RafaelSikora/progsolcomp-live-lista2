/*Nome do aluno: Rafael Ferreira Sikora
 * RA: 942312120
 * Nome do Programa 14: Faça um programa que preencha com zeros todas as posições
de um vetor de tamanho 50.
 * Data: 21/05/2023
 */
public class Programa14 {
    public static void main(String[] args) throws Exception {
    int[] vetor = new int[50];
        for(int i = 0; i < vetor.length; i++) {
            vetor[i] = 0;
        }
        System.out.println("Vetor preenchido com zeros:");
        for(int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}