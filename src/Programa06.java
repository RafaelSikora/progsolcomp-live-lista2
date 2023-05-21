/*Nome do aluno: Rafael Ferreira Sikora
 * RA: 942312120
 * Nome do Programa 06: Faça um programa para imprimir o conceito de um aluno. O
conceito é calculado em função da nota do aluno que varia de 0
a 100. As faixas da correlação são mostradas abaixo:
Nota Conceito
0 a 49 Insuficiente.
50 a 64 Regular.
65 a 84 Bom.
85 100 Ótimo.
 * Data: 21/05/2023
 */
import java.util.Scanner;
public class Programa06 {
public static void main(String[] args) throws Exception {
      
//Declarando as variaveis.
int nota;
Scanner teclado = new Scanner (System.in);
//Fazendo a entrada dos dados.
    System.out.println("Digite a sua nota:" );
    nota = teclado.nextInt();
teclado.close();
//Processamento e tomada de decisões.
if (nota <= 49){
    System.out.println("Insuficiente.");
}
else if (nota <= 64){
    System.out.println("Regular.");
}
else if (nota <= 84){
    System.out.println("Bom.");
}
else if (nota <= 100){
    System.out.println("Ótimo.");
        }
    }   
}
