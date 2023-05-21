/*Nome do aluno: Rafael Ferreira Sikora
 * RA: 942312120
 * Nome do Programa 12:Faça um programa que exiba todos os números pares a
partir de 0 até que encontre um múltiplo de 7 (utilize
do/while)

 * Data: 21/05/2023
 */
public class Programa12 {
public static void main(String[] args) {
    int numero = 0;
    
    do {
        if (numero % 2 == 0) {
            System.out.println(numero);
        }
        numero += 2;
    } while (numero % 7 != 0);
   }
}