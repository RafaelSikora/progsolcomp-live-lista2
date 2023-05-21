/*Nome do aluno: Rafael Ferreira Sikora
 * RA: 942312120
 * Nome do Programa 17: Faça um programa que imprima os múltiplos negativos de 7,
superiores a -1000. (utilize do / while)
 * Data: 21/05/2023
 */

public class Programa17{
 public static void main(String[] args) {
    int numero = -7;

    do {
        System.out.println(numero);
        numero -= 7;
    } while (numero >= -1000);
  }
}