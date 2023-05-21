/*Nome do aluno: Rafael Ferreira Sikora
 * RA: 942312120
 * Nome do Programa 16: Faça um programa que solicite ao usuário que digite um
número até que ele digite um número menor que 0 (utilize while).
 * Data: 21/05/2023
 */

import java.util.Scanner;
public class Programa16 {
    public static void main(String[] args) throws Exception {
     
       Integer numero = null;
        Scanner teclado = new Scanner(System.in);
        while (numero == null ||numero >= 0) {
            System.out.print("Digite o número: ");
            numero = teclado.nextInt();
        } 
        teclado.close();
    }
}
