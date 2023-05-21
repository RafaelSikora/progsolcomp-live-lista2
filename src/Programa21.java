/*Nome do aluno: Rafael Ferreira Sikora
 * RA: 942312120
 * Nome do Programa 21: Escreva um programa que, dado um número positivo digitado
pelo o usuário mostre a tabuada de todos os números de 1 até o
número digitado. (utilize for).
 * Data: 21/05/2023
 */
import java.util.Scanner;
public class Programa21 {
 public static void main(String[] args) {
    
//Declarando as variaveis.
    int numero;
    int i;
    int j;
    int resultado;
    Scanner teclado = new Scanner(System.in);

//Entrada de dados.
    System.out.print("Digite um número positivo: ");
    numero = teclado.nextInt();
    teclado.close();

//Processamento e tomada de decisoes.
    if (numero <= 0) {
        System.out.println("O número digitado não é válido. Por favor, digite um número positivo.");
        teclado.close();
    return;
    }
    for (i = 1; i <= numero; i++) {
        System.out.println("Tabuada do " + i + ":");
    for (j = 1; j <= 10; j++) {
        resultado = i * j;
        System.out.println(i + " x " + j + " = " + resultado);
        }
        System.out.println();
        }
    }
}