/*Nome do aluno: Rafael Ferreira Sikora
 * RA: 942312120
 * Nome do Programa 07: Faça um programa calcula o total de uma hospedagem em um
hotel. Ele cobra R$ 60.00 a diária e mais uma taxa de serviço:
R$ 5.50 por diária, se o número de diárias for maior que 15;
R$ 6.00 por diária, se o número de diárias for igual a 15;
R$ 8.00 por diária, se o número de diárias for menor que 15
 * Data: 21/05/2023
 */
import java.util.Scanner;
public class Programa07{
public static void main(String[] args) {
//Declarando as variaveis.
    double diarias;
    double preco1;
    double preco2;
    double preco3;
Scanner teclado = new Scanner(System.in);

    //Entrada de dados
    System.out.print("Quantos dias você ficará hospedado(a)?: ");
    diarias = teclado.nextDouble();
teclado.close();
    //Processamento e tomada de decisoes.   
    if (diarias > 15) {
        preco1 = (diarias * 5.50) + (diarias * 60);
        System.out.printf("A sua estádia ficou em: %.2f", preco1);
    } else if (diarias == 15) {
        preco2 = (diarias * 6) + (diarias * 60);
        System.out.printf("A sua estádia ficou em: %.2f", preco2);
    } else if (diarias < 15) {
        preco3 = (diarias * 8) + (diarias * 60);
        System.out.printf("A sua estádia ficou em: %.2f", preco3);
        }
    }
}
