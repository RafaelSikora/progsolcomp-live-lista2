/*Nome do aluno: Rafael Ferreira Sikora
 * RA: 942312120
 * Nome do Programa 20: Escreva um programa que, dada a carga máxima de um
elevador e a quantidade máxima de pessoas digitadas pelo
usuário, leia o peso de cada pessoa, também digitada pelo
usuário, que entra no elevador até que a carga máxima seja
atingida ou o número máximo de pessoas seja atingido (utilize
do /while).
 * Data: 21/05/2023
 */

 import java.util.Scanner;
public class Programa20 {
    public static void main(String[] args) throws Exception {

//Declarando as variaveis. 
double cargaMaxima;
int limitePessoas;
double cargaAtual = 0;
int pessoasAtuais = 0;
double peso;
Scanner teclado = new Scanner (System.in);

//Entrada de dados.
    System.out.print("Digite a carga máxima do elevador em kg: ");
    cargaMaxima = teclado.nextDouble();
    System.out.print("Digite a quantidade máxima de pessoas no elevador: ");
    limitePessoas = teclado.nextInt();
    teclado.close();
//Processamento e tomada de decisões.
    do {
        System.out.print("Digite o peso da pessoa em kg: ");
        peso = teclado.nextDouble();
    if (cargaAtual + peso > cargaMaxima) {
        System.out.println("Carga máxima atingida. Elevador cheio.");
    break;
    } else if (pessoasAtuais + 1 > limitePessoas) {
        System.out.println("Número máximo de pessoas atingido. Elevador cheio.");
    break;
    } else {
        cargaAtual += peso;
        pessoasAtuais++;
            }
        } while (true);

//Exibindo o resultado pro usuário.
        System.out.printf("O elevador está com %d pessoas, pesando %.2f kg no total.", pessoasAtuais, cargaAtual);
    }
}