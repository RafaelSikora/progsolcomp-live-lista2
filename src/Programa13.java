/*Nome do aluno: Rafael Ferreira Sikora
 * RA: 942312120
 * Nome do Programa 13: Faça um programa que some os números de 1 a 100 e imprima
somente o valor total da soma (utilize while).
 * Data: 21/05/2023
 */

 public class Programa13 {
    public static void main(String[] args) throws Exception {
          int soma = 0;
        for (int numero = 1; numero <= 100; numero++) {
            soma += numero;
        }
        System.out.println("A soma dos números de 1 a 100 é: " + soma);
    }
 }