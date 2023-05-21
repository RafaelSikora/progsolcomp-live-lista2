/*Nome do aluno: Rafael Ferreira Sikora
 * RA: 942312120
 * Nome do Programa 18: Faça um programa que determine o fatorial de um número.
Para este problema, tem-se como entrada o valor do número do
qual se deseja calcular o fatorial. O fatorial de 0 é igual a
1. O fatorial de um número N (N!) é definido conforme a seguir (utilize for):
N! = 1 * 2 * 3 * 4 * ... * (N-1) * N
 * Data: 21/05/2023
 */

 //Nome: Rafael Ferreira Sikora
//RA: 942312120
//Nome do programa: Calculando fatoriais.
//Data: 30/04/2023
//Problema 05: Faça um programa que determine o fatorial de um número. Para este problema, tem-se como entrada
//o valor do número do qual se deseja calcular o fatorial. O fatorial de 0 é igual a 1. O fatorial de um
//número N (N!) é definido conforme a seguir (utilize for):
// i. N! = 1 * 2 * 3 * 4 * ... * (N-1) * N.

import java.util.Scanner;
public class Programa18 {
    public static void main(String[] args) throws Exception {
    
    //Declarando as variaveis.
        int numero;
        int fatorial = 1;
        Scanner teclado = new Scanner(System.in);

    //Entrada de dados.
        System.out.print("Informe um número inteiro para calcular o fatorial: ");
        numero = teclado.nextInt();
        teclado.close();
    
    //Processamento e tomada de decisoes.
        if (numero < 0) {
            System.out.println("Não é possível calcular o fatorial de números negativos.");
        } else if (numero == 0) {
            System.out.println("O fatorial de 0 é 1.");
        } else {
            for (int i = 1; i <= numero; i++) {
                fatorial *= i;
            }
            System.out.println("O fatorial de " + numero + " é " + fatorial + ".");
        }
    }

}