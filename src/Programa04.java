/*Nome do aluno: Rafael Ferreira Sikora
 * RA: 942312120
 * Nome do Programa 04: Faça um programa que leia um número inteiro e mostre uma
mensagem indicando se este número é par ou ímpar e se é
positivo ou negativo.
 * Data: 21/05/2023
 */
import java.util.Scanner;
public class Programa04 {
    public static void main(String[] args) throws Exception {

//Declarando as variaveis. 
    int numero;
    Scanner teclado = new Scanner (System.in);

//Entrada dos dados. 
    System.out.println("Digite um numero inteiro: ");
    numero = teclado.nextInt();
    teclado.close();

//Processamento e tomada de decisões.
if (numero % 2 == 0){
    System.out.println(numero + " é par.");
} else {
    System.out.println(numero + " é impar.");
}
if (numero >=0) {
    System.out.println(numero + " é positivo.");
} else {
    System.out.println(numero + " é negativo.");
        }
    }
}
