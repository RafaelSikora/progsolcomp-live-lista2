/*Nome do aluno: Rafael Ferreira Sikora
 * RA: 942312120
 * Nome do Programa 03: Elabore um programa que lê dois valores A e B e os escreve com
a mensagem: “São múltiplos” ou “Não são múltiplos”.
 * Data: 21/05/2023
 */
import java.util.Scanner;

public class Programa03 {
    public static void main(String[] args) throws Exception {
    
        //Declarando as variaveis.
        int a;
        int b;
        Scanner teclado = new Scanner(System.in);
        
        //Entrada dos dados.
        System.out.print("Digite o valor de A: ");
        a = teclado.nextInt();
        System.out.print("Digite o valor de B: ");
        b = teclado.nextInt();
        teclado.close();
        
        //Processamento e tomada de decisoes.
        if (a % b == 0 || b % a == 0) {
            System.out.println("São múltiplos");
        } else {
            System.out.println("Não são múltiplos");
        }
        
    }

}