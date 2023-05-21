/*Nome do aluno: Rafael Ferreira Sikora
 * RA: 942312120
 * Nome do Programa 19: Um determinado gás duplica seu volume a cada segundo.
Dada um volume inicial, em centímetros cúbicos, digitado pelo
usuário faça um programa que determine o tempo necessário para
que esse volume se torne maior que 1000 centímetros cúbicos.
(utilize while).
 * Data: 21/05/2023
 */

import java.util.Scanner;
public class Programa19 {
    public static void main(String[] args) throws Exception {
//Declarando as variaveis. 
    double volumeGas;
    double limite = 1000.0;
    int segundos = 0;
    Scanner teclado = new Scanner (System.in);
    
//Entrada de dados.
    System.out.print("Digite o volume inicial do gás em cm³: ");
    volumeGas = teclado.nextDouble();
    teclado.close();

//Processamente e tomada de decisões.
    while (volumeGas < limite) {
    volumeGas *= 2.0;
    segundos++;
}

//Exibindo o resultado pro usuário.
    System.out.println("O volume do gás ultrapassou 1000 cm³ em " + segundos + " segundos.");
    }
}
