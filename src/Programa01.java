/*Nome do aluno: Rafael Ferreira Sikora
 * RA: 942312120
 * Nome do Programa 01: Faça um programa que leia dois números A e B e imprima o maior
deles.
 * Data: 21/05/2023
 */
import java.util.Scanner;
public class Programa01 {
//1. Faça um programa que leia dois números A e B e imprima o maior deles.
    public static void main(String[] args) throws Exception {
    //Declarando as variaveis. 
    double numeroA;
    double numeroB;
    Scanner teclado = new Scanner (System.in);

    //Entrada de dados.
    System.out.println("Digite o primeiro numero: ");
    numeroA = teclado.nextDouble();
    System.out.println("Digite o segundo numero: ");
    numeroB = teclado.nextDouble();
    teclado.close();
    
    //Processamento e tomada de decisão.
    if (numeroA > numeroB) {
    System.out.println("O numero " + numeroA + " é maior que " + numeroB + ".");
    } else {
    System.out.println("O numero " + numeroB + " é maior que " + numeroA + ".");
         }
    
    }
}